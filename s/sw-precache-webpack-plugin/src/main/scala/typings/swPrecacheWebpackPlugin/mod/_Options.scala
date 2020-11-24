package typings.swPrecacheWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// workaround to override parent types
@js.native
trait _Options
  extends typings.swPrecache.mod.Options {
  
  @JSName("importScripts")
  var importScripts__Options: js.UndefOr[js.Any] = js.native
}
object _Options {
  
  @scala.inline
  def apply(): _Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Options]
  }
  
  @scala.inline
  implicit class _OptionsOps[Self <: _Options] (val x: Self) extends AnyVal {
    
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
    def setImportScripts(value: js.Any): Self = this.set("importScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportScripts: Self = this.set("importScripts", js.undefined)
  }
}
