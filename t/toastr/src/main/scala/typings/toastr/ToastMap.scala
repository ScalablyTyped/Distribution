package typings.toastr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastMap extends StObject {
  
  /**
    * The toast icon class.
    */
  var iconClass: String
  
  /**
    * The toast message.
    */
  var message: String
  
  /**
    * Any override options specified when the toast was created.
    */
  var optionsOverride: js.UndefOr[ToastrOptions] = js.undefined
  
  /**
    * The toast title.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The toast type.
    */
  var `type`: ToastrType
}
object ToastMap {
  
  inline def apply(iconClass: String, message: String, `type`: ToastrType): ToastMap = {
    val __obj = js.Dynamic.literal(iconClass = iconClass.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastMap]
  }
  
  extension [Self <: ToastMap](x: Self) {
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOptionsOverride(value: ToastrOptions): Self = StObject.set(x, "optionsOverride", value.asInstanceOf[js.Any])
    
    inline def setOptionsOverrideUndefined: Self = StObject.set(x, "optionsOverride", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: ToastrType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
