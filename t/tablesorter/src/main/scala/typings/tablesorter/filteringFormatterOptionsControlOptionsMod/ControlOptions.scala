package typings.tablesorter.filteringFormatterOptionsControlOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlOptions extends js.Object {
  /**
    * The label of the control.
    */
  var cellText: js.UndefOr[String] = js.undefined
}

object ControlOptions {
  @scala.inline
  def apply(cellText: String = null): ControlOptions = {
    val __obj = js.Dynamic.literal()
    if (cellText != null) __obj.updateDynamic("cellText")(cellText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlOptions]
  }
}

