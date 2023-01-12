package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Content picker dialog options object
  */
trait IContentPickerOptions extends StObject {
  
  /*callback function*/
  var callback: js.Function
  
  /*should the picker return one or multiple items*/
  var multipicker: Boolean
}
object IContentPickerOptions {
  
  inline def apply(callback: js.Function, multipicker: Boolean): IContentPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], multipicker = multipicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentPickerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IContentPickerOptions] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setMultipicker(value: Boolean): Self = StObject.set(x, "multipicker", value.asInstanceOf[js.Any])
  }
}
