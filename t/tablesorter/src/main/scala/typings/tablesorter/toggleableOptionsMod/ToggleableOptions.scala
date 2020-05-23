package typings.tablesorter.toggleableOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleableOptions extends js.Object {
  /**
    * A value indicating whether to add a box for enabling/disabling the control.
    */
  var addToggle: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether the control is initially disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
}

object ToggleableOptions {
  @scala.inline
  def apply(addToggle: js.UndefOr[Boolean] = js.undefined, disabled: js.UndefOr[Boolean] = js.undefined): ToggleableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addToggle)) __obj.updateDynamic("addToggle")(addToggle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleableOptions]
  }
}

