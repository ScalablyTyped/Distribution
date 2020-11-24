package typings.subleveldown.mod

import org.scalablytyped.runtime.StringDictionary
import typings.abstractLeveldown.mod.ErrorCallback
import typings.levelCodec.mod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Any other options are passed along to the underlying `levelup` and `encoding-down` constructors.
  * {@link https://github.com/Level/subleveldown#api See their documentation for further details}.
  */
@js.native
trait SubDownOptions
  extends CodecOptions
     with // TODO: Remove and inherit from constructor options from levelup package
/* key */ StringDictionary[js.Any] {
  
  /**
    * Optional open hook called when the underlying `levelup` instance has been opened.
    * The hook receives a callback which must be called to finish opening.
    */
  var open: js.UndefOr[SubDownOpenHook] = js.native
  
  /**
    * Character for separating sublevel prefixes from user keys and each other. Should be outside the character (or byte) range of user keys.
    * @default '!'
    */
  var separator: js.UndefOr[String] = js.native
}
object SubDownOptions {
  
  @scala.inline
  def apply(): SubDownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubDownOptions]
  }
  
  @scala.inline
  implicit class SubDownOptionsOps[Self <: SubDownOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOpen(value: /* callback */ ErrorCallback => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
}
