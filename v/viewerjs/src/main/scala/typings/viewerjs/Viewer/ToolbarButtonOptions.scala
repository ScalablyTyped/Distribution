package typings.viewerjs.Viewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarButtonOptions extends js.Object {
  
  var click: js.UndefOr[js.Function] = js.native
  
  var show: js.UndefOr[Boolean | Visibility] = js.native
  
  var size: js.UndefOr[ToolbarButtonSize] = js.native
}
object ToolbarButtonOptions {
  
  @scala.inline
  def apply(): ToolbarButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarButtonOptions]
  }
  
  @scala.inline
  implicit class ToolbarButtonOptionsOps[Self <: ToolbarButtonOptions] (val x: Self) extends AnyVal {
    
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
    def setClick(value: js.Function): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean | Visibility): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSize(value: ToolbarButtonSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
