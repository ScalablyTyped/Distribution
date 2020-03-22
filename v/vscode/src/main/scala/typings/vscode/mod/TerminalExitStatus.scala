package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminalExitStatus extends js.Object {
  /**
  		 * The exit code that a terminal exited with, it can have the following values:
  		 * - Zero: the terminal process or custom execution succeeded.
  		 * - Non-zero: the terminal process or custom execution failed.
  		 * - `undefined`: the user forcibly closed the terminal or a custom execution exited
  		 *   without providing an exit code.
  		 */
  val code: js.UndefOr[Double] = js.undefined
}

object TerminalExitStatus {
  @scala.inline
  def apply(code: Int | Double = null): TerminalExitStatus = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalExitStatus]
  }
}

