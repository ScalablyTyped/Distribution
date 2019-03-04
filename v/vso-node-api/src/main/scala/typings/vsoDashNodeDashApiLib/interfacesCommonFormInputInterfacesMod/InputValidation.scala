package typings
package vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValidation extends js.Object {
  var dataType: InputDataType
  var isRequired: scala.Boolean
  var maxLength: scala.Double
  var maxValue: scala.Double
  var minLength: scala.Double
  var minValue: scala.Double
  var pattern: java.lang.String
  var patternMismatchErrorMessage: java.lang.String
}

object InputValidation {
  @scala.inline
  def apply(
    dataType: InputDataType,
    isRequired: scala.Boolean,
    maxLength: scala.Double,
    maxValue: scala.Double,
    minLength: scala.Double,
    minValue: scala.Double,
    pattern: java.lang.String,
    patternMismatchErrorMessage: java.lang.String
  ): InputValidation = {
    val __obj = js.Dynamic.literal(dataType = dataType, isRequired = isRequired, maxLength = maxLength, maxValue = maxValue, minLength = minLength, minValue = minValue, pattern = pattern, patternMismatchErrorMessage = patternMismatchErrorMessage)
  
    __obj.asInstanceOf[InputValidation]
  }
}

