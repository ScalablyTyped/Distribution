package typings.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputFilterCondition extends StObject {
  
  /**
    * Whether or not to do a case sensitive match
    */
  var caseSensitive: Boolean
  
  /**
    * The Id of the input to filter on
    */
  var inputId: String
  
  /**
    * The "expected" input value to compare with the actual input value
    */
  var inputValue: String
  
  /**
    * The operator applied between the expected and actual input value
    */
  var operator: InputFilterOperator
}
object InputFilterCondition {
  
  @scala.inline
  def apply(caseSensitive: Boolean, inputId: String, inputValue: String, operator: InputFilterOperator): InputFilterCondition = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], inputId = inputId.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputFilterCondition]
  }
  
  @scala.inline
  implicit class InputFilterConditionMutableBuilder[Self <: InputFilterCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: InputFilterOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
