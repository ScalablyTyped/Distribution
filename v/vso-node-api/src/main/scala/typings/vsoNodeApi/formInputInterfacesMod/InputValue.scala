package typings.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputValue extends StObject {
  
  /**
    * Any other data about this input
    */
  var data: StringDictionary[js.Any]
  
  /**
    * The text to show for the display of this value
    */
  var displayValue: String
  
  /**
    * The value to store for this input
    */
  var value: String
}
object InputValue {
  
  @scala.inline
  def apply(data: StringDictionary[js.Any], displayValue: String, value: String): InputValue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], displayValue = displayValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValue]
  }
  
  @scala.inline
  implicit class InputValueMutableBuilder[Self <: InputValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
