package typings.vscode.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugAdapterTracker extends js.Object {
  /**
    * The debug adapter has sent a Debug Adapter Protocol message to VS Code.
    */
  var onDidSendMessage: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.native
  /**
    * An error with the debug adapter has occurred.
    */
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  /**
    * The debug adapter has exited with the given exit code or signal.
    */
  var onExit: js.UndefOr[
    js.Function2[/* code */ js.UndefOr[Double], /* signal */ js.UndefOr[String], Unit]
  ] = js.native
  /**
    * The debug adapter is about to receive a Debug Adapter Protocol message from VS Code.
    */
  var onWillReceiveMessage: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.native
  /**
    * A session with the debug adapter is about to be started.
    */
  var onWillStartSession: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The debug adapter session is about to be stopped.
    */
  var onWillStopSession: js.UndefOr[js.Function0[Unit]] = js.native
}

object DebugAdapterTracker {
  @scala.inline
  def apply(): DebugAdapterTracker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugAdapterTracker]
  }
  @scala.inline
  implicit class DebugAdapterTrackerOps[Self <: DebugAdapterTracker] (val x: Self) extends AnyVal {
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
    def setOnDidSendMessage(value: /* message */ js.Any => Unit): Self = this.set("onDidSendMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDidSendMessage: Self = this.set("onDidSendMessage", js.undefined)
    @scala.inline
    def setOnError(value: /* error */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnExit(value: (/* code */ js.UndefOr[Double], /* signal */ js.UndefOr[String]) => Unit): Self = this.set("onExit", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    @scala.inline
    def setOnWillReceiveMessage(value: /* message */ js.Any => Unit): Self = this.set("onWillReceiveMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWillReceiveMessage: Self = this.set("onWillReceiveMessage", js.undefined)
    @scala.inline
    def setOnWillStartSession(value: () => Unit): Self = this.set("onWillStartSession", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnWillStartSession: Self = this.set("onWillStartSession", js.undefined)
    @scala.inline
    def setOnWillStopSession(value: () => Unit): Self = this.set("onWillStopSession", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnWillStopSession: Self = this.set("onWillStopSession", js.undefined)
  }
  
}

