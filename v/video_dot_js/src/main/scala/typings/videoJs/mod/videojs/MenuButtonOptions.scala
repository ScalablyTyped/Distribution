package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuButtonOptions extends ComponentOptions {
  
  var iniChildren: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object MenuButtonOptions {
  
  @scala.inline
  def apply(): MenuButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuButtonOptions]
  }
  
  @scala.inline
  implicit class MenuButtonOptionsOps[Self <: MenuButtonOptions] (val x: Self) extends AnyVal {
    
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
    def setIniChildren(value: Boolean): Self = this.set("iniChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIniChildren: Self = this.set("iniChildren", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
