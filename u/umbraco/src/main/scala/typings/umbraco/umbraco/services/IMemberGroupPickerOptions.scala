package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Member group picker dialog options object
  */
trait IMemberGroupPickerOptions extends StObject {
  
  /*callback function*/
  var callback: js.Function
  
  /*should the tree pick one or multiple members before returning*/
  var multiPicker: Boolean
}
object IMemberGroupPickerOptions {
  
  inline def apply(callback: js.Function, multiPicker: Boolean): IMemberGroupPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], multiPicker = multiPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMemberGroupPickerOptions]
  }
  
  extension [Self <: IMemberGroupPickerOptions](x: Self) {
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setMultiPicker(value: Boolean): Self = StObject.set(x, "multiPicker", value.asInstanceOf[js.Any])
  }
}
