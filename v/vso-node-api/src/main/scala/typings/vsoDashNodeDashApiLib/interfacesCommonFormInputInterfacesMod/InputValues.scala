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

