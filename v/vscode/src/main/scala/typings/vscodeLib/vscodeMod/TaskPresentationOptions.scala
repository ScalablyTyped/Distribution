package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskPresentationOptions extends js.Object {
  /**
  		 * Controls whether the terminal is cleared before executing the task.
  		 */
  var clear: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Controls whether the command associated with the task is echoed
  		 * in the user interface.
  		 */
  var echo: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Controls whether the panel showing the task output is taking focus.
  		 */
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Controls if the task panel is used for this task only (dedicated),
  		 * shared between tasks (shared) or if a new panel is created on
  		 * every task execution (new). Defaults to `TaskInstanceKind.Shared`
  		 */
  var panel: js.UndefOr[TaskPanelKind] = js.undefined
  /**
  		 * Controls whether the task output is reveal in the user interface.
  		 * Defaults to `RevealKind.Always`.
  		 */
  var reveal: js.UndefOr[TaskRevealKind] = js.undefined
  /**
  		 * Controls whether to show the "Terminal will be reused by tasks, press any key to close it" message.
  		 */
  var showReuseMessage: js.UndefOr[scala.Boolean] = js.undefined
}

object TaskPresentationOptions {
  @scala.inline
  def apply(
    clear: js.UndefOr[scala.Boolean] = js.undefined,
    echo: js.UndefOr[scala.Boolean] = js.undefined,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    panel: TaskPanelKind = null,
    reveal: TaskRevealKind = null,
    showReuseMessage: js.UndefOr[scala.Boolean] = js.undefined
  ): TaskPresentationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear)
    if (!js.isUndefined(echo)) __obj.updateDynamic("echo")(echo)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (panel != null) __obj.updateDynamic("panel")(panel)
    if (reveal != null) __obj.updateDynamic("reveal")(reveal)
    if (!js.isUndefined(showReuseMessage)) __obj.updateDynamic("showReuseMessage")(showReuseMessage)
    __obj.asInstanceOf[TaskPresentationOptions]
  }
}

