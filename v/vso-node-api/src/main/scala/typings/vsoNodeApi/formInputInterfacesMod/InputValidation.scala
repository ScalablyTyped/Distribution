package typings.vsoNodeApi.formInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputValidation extends js.Object {
  
  var dataType: InputDataType = js.native
  
  var isRequired: Boolean = js.native
  
  var maxLength: Double = js.native
  
  var maxValue: Double = js.native
  
  var minLength: Double = js.native
  
  var minValue: Double = js.native
  
  var pattern: String = js.native
  
  var patternMismatchErrorMessage: String = js.native
}
object InputValidation {
  
  @scala.inline
  def apply(
    dataType: InputDataType,
    isRequired: Boolean,
    maxLength: Double,
    maxValue: Double,
    minLength: Double,
    minValue: Double,
    pattern: String,
    patternMismatchErrorMessage: String
  ): InputValidation = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternMismatchErrorMessage = patternMismatchErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValidation]
  }
  
  @scala.inline
  implicit class InputValidationOps[Self <: InputValidation] (val x: Self) extends AnyVal {
    
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
    def setDataType(value: InputDataType): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternMismatchErrorMessage(value: String): Self = this.set("patternMismatchErrorMessage", value.asInstanceOf[js.Any])
  }
}
