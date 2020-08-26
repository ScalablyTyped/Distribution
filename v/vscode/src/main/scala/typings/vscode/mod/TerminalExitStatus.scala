package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminalExitStatus extends js.Object {
  /**
    * The exit code that a terminal exited with, it can have the following values:
    * - Zero: the terminal process or custom execution succeeded.
    * - Non-zero: the terminal process or custom execution failed.
    * - `undefined`: the user forcibly closed the terminal or a custom execution exited
    *   without providing an exit code.
    */
  val code: js.UndefOr[Double] = js.native
}

object TerminalExitStatus {
  @scala.inline
  def apply(): TerminalExitStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalExitStatus]
  }
  @scala.inline
  implicit class TerminalExitStatusOps[Self <: TerminalExitStatus] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
  }
  
}

