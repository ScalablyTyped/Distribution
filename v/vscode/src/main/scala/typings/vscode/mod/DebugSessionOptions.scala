package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugSessionOptions extends js.Object {
  /**
    * Controls whether this session should have a separate debug console or share it
    * with the parent session. Has no effect for sessions which do not have a parent session.
    * Defaults to Separate.
    */
  var consoleMode: js.UndefOr[DebugConsoleMode] = js.undefined
  /**
    * When specified the newly created debug session is registered as a "child" session of this
    * "parent" debug session.
    */
  var parentSession: js.UndefOr[DebugSession] = js.undefined
}

object DebugSessionOptions {
  @scala.inline
  def apply(consoleMode: DebugConsoleMode = null, parentSession: DebugSession = null): DebugSessionOptions = {
    val __obj = js.Dynamic.literal()
    if (consoleMode != null) __obj.updateDynamic("consoleMode")(consoleMode.asInstanceOf[js.Any])
    if (parentSession != null) __obj.updateDynamic("parentSession")(parentSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugSessionOptions]
  }
}

