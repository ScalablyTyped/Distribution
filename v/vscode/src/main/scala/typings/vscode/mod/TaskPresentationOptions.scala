package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskPresentationOptions extends js.Object {
  /**
    * Controls whether the terminal is cleared before executing the task.
    */
  var clear: js.UndefOr[Boolean] = js.native
  /**
    * Controls whether the command associated with the task is echoed
    * in the user interface.
    */
  var echo: js.UndefOr[Boolean] = js.native
  /**
    * Controls whether the panel showing the task output is taking focus.
    */
  var focus: js.UndefOr[Boolean] = js.native
  /**
    * Controls if the task panel is used for this task only (dedicated),
    * shared between tasks (shared) or if a new panel is created on
    * every task execution (new). Defaults to `TaskInstanceKind.Shared`
    */
  var panel: js.UndefOr[TaskPanelKind] = js.native
  /**
    * Controls whether the task output is reveal in the user interface.
    * Defaults to `RevealKind.Always`.
    */
  var reveal: js.UndefOr[TaskRevealKind] = js.native
  /**
    * Controls whether to show the "Terminal will be reused by tasks, press any key to close it" message.
    */
  var showReuseMessage: js.UndefOr[Boolean] = js.native
}

object TaskPresentationOptions {
  @scala.inline
  def apply(): TaskPresentationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskPresentationOptions]
  }
  @scala.inline
  implicit class TaskPresentationOptionsOps[Self <: TaskPresentationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear(value: Boolean): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setEcho(value: Boolean): Self = this.set("echo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcho: Self = this.set("echo", js.undefined)
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setPanel(value: TaskPanelKind): Self = this.set("panel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    @scala.inline
    def setReveal(value: TaskRevealKind): Self = this.set("reveal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReveal: Self = this.set("reveal", js.undefined)
    @scala.inline
    def setShowReuseMessage(value: Boolean): Self = this.set("showReuseMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowReuseMessage: Self = this.set("showReuseMessage", js.undefined)
  }
  
}

