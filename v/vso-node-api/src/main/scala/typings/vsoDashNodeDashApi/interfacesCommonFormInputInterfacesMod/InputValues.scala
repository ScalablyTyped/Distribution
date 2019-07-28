package typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValues extends js.Object {
  /**
    * The default value to use for this input
    */
  var defaultValue: String
  /**
    * Errors encountered while computing dynamic values.
    */
  var error: InputValuesError
  /**
    * The id of the input
    */
  var inputId: String
  /**
    * Should this input be disabled
    */
  var isDisabled: Boolean
  /**
    * Should the value be restricted to one of the values in the PossibleValues (True) or are the values in PossibleValues just a suggestion (False)
    */
  var isLimitedToPossibleValues: Boolean
  /**
    * Should this input be made read-only
    */
  var isReadOnly: Boolean
  /**
    * Possible values that this input can take
    */
  var possibleValues: js.Array[InputValue]
}

object InputValues {
  @scala.inline
  def apply(
    defaultValue: String,
    error: InputValuesError,
    inputId: String,
    isDisabled: Boolean,
    isLimitedToPossibleValues: Boolean,
    isReadOnly: Boolean,
    possibleValues: js.Array[InputValue]
  ): InputValues = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, error = error, inputId = inputId, isDisabled = isDisabled, isLimitedToPossibleValues = isLimitedToPossibleValues, isReadOnly = isReadOnly, possibleValues = possibleValues)
  
    __obj.asInstanceOf[InputValues]
  }
}

