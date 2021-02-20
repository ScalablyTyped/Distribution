package typings.toastr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastMap extends StObject {
  
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
  implicit class ToastMapMutableBuilder[Self <: ToastMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsOverride(value: ToastrOptions): Self = StObject.set(x, "optionsOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsOverrideUndefined: Self = StObject.set(x, "optionsOverride", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: ToastrType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
