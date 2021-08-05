package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Linkpicker dialog options object
  */
trait ILinkPickerOptions extends StObject {
  
  /*callback function*/
  var callback: js.Function
}
object ILinkPickerOptions {
  
  inline def apply(callback: js.Function): ILinkPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkPickerOptions]
  }
  
  extension [Self <: ILinkPickerOptions](x: Self) {
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
  }
}
