package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInputValues
  extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputValues {
  var operators: js.Array[scala.Double]
}

object FieldInputValues {
  @scala.inline
  def apply(
    defaultValue: java.lang.String,
    error: vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputValuesError,
    inputId: java.lang.String,
    isDisabled: scala.Boolean,
    isLimitedToPossibleValues: scala.Boolean,
    isReadOnly: scala.Boolean,
    operators: js.Array[scala.Double],
    possibleValues: js.Array[vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputValue]
  ): FieldInputValues = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, error = error, inputId = inputId, isDisabled = isDisabled, isLimitedToPossibleValues = isLimitedToPossibleValues, isReadOnly = isReadOnly, operators = operators, possibleValues = possibleValues)
  
    __obj.asInstanceOf[FieldInputValues]
  }
}

