package typings.vscode.vscodeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugAdapterTracker extends js.Object {
  /**
  		 * The debug adapter has sent a Debug Adapter Protocol message to VS Code.
  		 */
  var onDidSendMessage: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.undefined
  /**
  		 * An error with the debug adapter has occurred.
  		 */
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  /**
  		 * The debug adapter has exited with the given exit code or signal.
  		 */
  var onExit: js.UndefOr[
    js.Function2[/* code */ js.UndefOr[Double], /* signal */ js.UndefOr[String], Unit]
  ] = js.undefined
  /**
  		 * The debug adapter is about to receive a Debug Adapter Protocol message from VS Code.
  		 */
  var onWillReceiveMessage: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.undefined
  /**
  		 * A session with the debug adapter is about to be started.
  		 */
  var onWillStartSession: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * The debug adapter session is about to be stopped.
  		 */
  var onWillStopSession: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object DebugAdapterTracker {
  @scala.inline
  def apply(
    onDidSendMessage: /* message */ js.Any => Unit = null,
    onError: /* error */ Error => Unit = null,
    onExit: (/* code */ js.UndefOr[Double], /* signal */ js.UndefOr[String]) => Unit = null,
    onWillReceiveMessage: /* message */ js.Any => Unit = null,
    onWillStartSession: () => Unit = null,
    onWillStopSession: () => Unit = null
  ): DebugAdapterTracker = {
    val __obj = js.Dynamic.literal()
    if (onDidSendMessage != null) __obj.updateDynamic("onDidSendMessage")(js.Any.fromFunction1(onDidSendMessage))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction2(onExit))
    if (onWillReceiveMessage != null) __obj.updateDynamic("onWillReceiveMessage")(js.Any.fromFunction1(onWillReceiveMessage))
    if (onWillStartSession != null) __obj.updateDynamic("onWillStartSession")(js.Any.fromFunction0(onWillStartSession))
    if (onWillStopSession != null) __obj.updateDynamic("onWillStopSession")(js.Any.fromFunction0(onWillStopSession))
    __obj.asInstanceOf[DebugAdapterTracker]
  }
}

