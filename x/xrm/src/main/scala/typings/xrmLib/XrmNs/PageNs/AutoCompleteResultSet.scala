package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for showAutoComplete argument
  * @deprecated Use {@link Xrm.Controls.AutoCompleteResultSet} instead.
  */
trait AutoCompleteResultSet
  extends xrmLib.XrmNs.ControlsNs.AutoCompleteResultSet

object AutoCompleteResultSet {
  @scala.inline
  def apply(
    results: js.Array[xrmLib.XrmNs.ControlsNs.AutoCompleteResult],
    commands: xrmLib.XrmNs.ControlsNs.AutoCompleteCommand = null
  ): AutoCompleteResultSet = {
    val __obj = js.Dynamic.literal(results = results)
    if (commands != null) __obj.updateDynamic("commands")(commands)
    __obj.asInstanceOf[AutoCompleteResultSet]
  }
}

