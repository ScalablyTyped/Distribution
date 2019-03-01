package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for command of AutoCompleteResultSet.  This is displayed at the bottom of the auto complete view
  */
trait AutoCompleteCommand extends js.Object {
  /**
    * Url of the icon to display
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Identifier
    */
  var id: java.lang.String
  /**
    * Label to display at the bottom of the auto complete view
    */
  var label: java.lang.String
  /**
    * Action to perform when user clicks on label
    */
  def action(): scala.Unit
}

object AutoCompleteCommand {
  @scala.inline
  def apply(
    action: js.Function0[scala.Unit],
    id: java.lang.String,
    label: java.lang.String,
    icon: java.lang.String = null
  ): AutoCompleteCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("label")(label)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    __obj.asInstanceOf[AutoCompleteCommand]
  }
}

