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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("inputId")(inputId)
    __obj.updateDynamic("isDisabled")(isDisabled)
    __obj.updateDynamic("isLimitedToPossibleValues")(isLimitedToPossibleValues)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("operators")(operators)
    __obj.updateDynamic("possibleValues")(possibleValues)
    __obj.asInstanceOf[FieldInputValues]
  }
}

