package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property dialog options object
  */
trait IPropertyDialogOptions extends StObject {
  
  /*callback function*/
  var callback: js.Function
  
  /*editor to use to edit a given value and return on callback*/
  var editor: String
  
  /*value sent to the property editor*/
  var value: js.Object
}
object IPropertyDialogOptions {
  
  inline def apply(callback: js.Function, editor: String, value: js.Object): IPropertyDialogOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDialogOptions]
  }
  
  extension [Self <: IPropertyDialogOptions](x: Self) {
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
