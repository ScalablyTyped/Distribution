package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputValue
import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputValues
import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputValuesError
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
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, error = error, inputId = inputId, isDisabled = isDisabled, isLimitedToPossibleValues = isLimitedToPossibleValues, isReadOnly = isReadOnly, operators = operators, possibleValues = possibleValues)
  
    __obj.asInstanceOf[FieldInputValues]
  }
}

