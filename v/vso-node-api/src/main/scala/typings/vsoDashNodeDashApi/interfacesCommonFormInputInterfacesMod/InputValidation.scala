package typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod

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
    val __obj = js.Dynamic.literal(dataType = dataType, isRequired = isRequired, maxLength = maxLength, maxValue = maxValue, minLength = minLength, minValue = minValue, pattern = pattern, patternMismatchErrorMessage = patternMismatchErrorMessage)
  
    __obj.asInstanceOf[InputValidation]
  }
}

