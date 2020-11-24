package typings.vsoNodeApi.formInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputFilterCondition extends js.Object {
  
  /**
    * Whether or not to do a case sensitive match
    */
  var caseSensitive: Boolean = js.native
  
  /**
    * The Id of the input to filter on
    */
  var inputId: String = js.native
  
  /**
    * The "expected" input value to compare with the actual input value
    */
  var inputValue: String = js.native
  
  /**
    * The operator applied between the expected and actual input value
    */
  var operator: InputFilterOperator = js.native
}
object InputFilterCondition {
  
  @scala.inline
  def apply(caseSensitive: Boolean, inputId: String, inputValue: String, operator: InputFilterOperator): InputFilterCondition = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], inputId = inputId.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputFilterCondition]
  }
  
  @scala.inline
  implicit class InputFilterConditionOps[Self <: InputFilterCondition] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: InputFilterOperator): Self = this.set("operator", value.asInstanceOf[js.Any])
  }
}
