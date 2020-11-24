package typings.toastr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastMap extends js.Object {
  
  /**
    * The toast icon class.
    */
  var iconClass: String = js.native
  
  /**
    * The toast message.
    */
  var message: String = js.native
  
  /**
    * Any override options specified when the toast was created.
    */
  var optionsOverride: js.UndefOr[ToastrOptions] = js.native
  
  /**
    * The toast title.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The toast type.
    */
  var `type`: ToastrType = js.native
}
object ToastMap {
  
  @scala.inline
  def apply(iconClass: String, message: String, `type`: ToastrType): ToastMap = {
    val __obj = js.Dynamic.literal(iconClass = iconClass.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastMap]
  }
  
  @scala.inline
  implicit class ToastMapOps[Self <: ToastMap] (val x: Self) extends AnyVal {
    
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
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ToastrType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsOverride(value: ToastrOptions): Self = this.set("optionsOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionsOverride: Self = this.set("optionsOverride", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
