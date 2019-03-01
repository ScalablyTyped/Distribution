package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for showAutoComplete argument
  */
trait AutoCompleteResultSet extends js.Object {
  /**
    * Command to show/execute at the bottom of the results displayed
    */
  var commands: js.UndefOr[AutoCompleteCommand] = js.undefined
  /**
    * Results to show
    */
  var results: js.Array[AutoCompleteResult]
}

object AutoCompleteResultSet {
  @scala.inline
  def apply(results: js.Array[AutoCompleteResult], commands: AutoCompleteCommand = null): AutoCompleteResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("results")(results)
    if (commands != null) __obj.updateDynamic("commands")(commands)
    __obj.asInstanceOf[AutoCompleteResultSet]
  }
}

