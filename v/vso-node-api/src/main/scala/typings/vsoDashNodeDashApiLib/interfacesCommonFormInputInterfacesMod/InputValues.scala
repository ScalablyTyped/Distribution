package typings
package vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValues extends js.Object {
  /**
    * The default value to use for this input
    */
  var defaultValue: java.lang.String
  /**
    * Errors encountered while computing dynamic values.
    */
  var error: InputValuesError
  /**
    * The id of the input
    */
  var inputId: java.lang.String
  /**
    * Should this input be disabled
    */
  var isDisabled: scala.Boolean
  /**
    * Should the value be restricted to one of the values in the PossibleValues (True) or are the values in PossibleValues just a suggestion (False)
    */
  var isLimitedToPossibleValues: scala.Boolean
  /**
    * Should this input be made read-only
    */
  var isReadOnly: scala.Boolean
  /**
    * Possible values that this input can take
    */
  var possibleValues: js.Array[InputValue]
}

object InputValues {
  @scala.inline
  def apply(
    defaultValue: java.lang.String,
    error: InputValuesError,
    inputId: java.lang.String,
    isDisabled: scala.Boolean,
    isLimitedToPossibleValues: scala.Boolean,
    isReadOnly: scala.Boolean,
    possibleValues: js.Array[InputValue]
  ): InputValues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("inputId")(inputId)
    __obj.updateDynamic("isDisabled")(isDisabled)
    __obj.updateDynamic("isLimitedToPossibleValues")(isLimitedToPossibleValues)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("possibleValues")(possibleValues)
    __obj.asInstanceOf[InputValues]
  }
}

