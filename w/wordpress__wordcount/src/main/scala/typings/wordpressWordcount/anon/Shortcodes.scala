package typings.wordpressWordcount.anon

import typings.wordpressWordcount.mod.CountType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shortcodes extends js.Object {
  
  /** Array of known shortcode names */
  var shortcodes: js.UndefOr[js.Array[String]] = js.native
  
  var `type`: js.UndefOr[CountType] = js.native
}
object Shortcodes {
  
  @scala.inline
  def apply(): Shortcodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shortcodes]
  }
  
  @scala.inline
  implicit class ShortcodesOps[Self <: Shortcodes] (val x: Self) extends AnyVal {
    
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
    def setShortcodesVarargs(value: String*): Self = this.set("shortcodes", js.Array(value :_*))
    
    @scala.inline
    def setShortcodes(value: js.Array[String]): Self = this.set("shortcodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcodes: Self = this.set("shortcodes", js.undefined)
    
    @scala.inline
    def setType(value: CountType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
