package typings.vsoNodeApi.notificationInterfacesMod

import typings.vsoNodeApi.formInputInterfacesMod.InputValue
import typings.vsoNodeApi.formInputInterfacesMod.InputValues
import typings.vsoNodeApi.formInputInterfacesMod.InputValuesError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInputValues extends InputValues {
  var operators: js.Array[Double]
}

object FieldInputValues {
  @scala.inline
  def apply(
    defaultValue: String,
    error: InputValuesError,
    inputId: String,
    isDisabled: Boolean,
    isLimitedToPossibleValues: Boolean,
    isReadOnly: Boolean,
    operators: js.Array[Double],
    possibleValues: js.Array[InputValue]
  ): FieldInputValues = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], inputId = inputId.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isLimitedToPossibleValues = isLimitedToPossibleValues.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], operators = operators.asInstanceOf[js.Any], possibleValues = possibleValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldInputValues]
  }
}

