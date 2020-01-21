package typings.vsoNodeApi.formInputInterfacesMod

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
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], inputId = inputId.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isLimitedToPossibleValues = isLimitedToPossibleValues.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], possibleValues = possibleValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputValues]
  }
}

