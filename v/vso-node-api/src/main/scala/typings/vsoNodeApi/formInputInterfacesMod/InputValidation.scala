package typings.vsoNodeApi.formInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValidation extends js.Object {
  var dataType: InputDataType
  var isRequired: Boolean
  var maxLength: Double
  var maxValue: Double
  var minLength: Double
  var minValue: Double
  var pattern: String
  var patternMismatchErrorMessage: String
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
}

