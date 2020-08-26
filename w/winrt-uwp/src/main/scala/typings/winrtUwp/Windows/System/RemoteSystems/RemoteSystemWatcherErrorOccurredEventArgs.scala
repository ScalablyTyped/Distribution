package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets information about an **ErrorOccurred** event, namely the **RemoteSystemWatcherError** value describing the error. */
@js.native
trait RemoteSystemWatcherErrorOccurredEventArgs extends js.Object {
  /** The **RemoteSystemWatcherError** value representing the error that occurred during discovery, causing the containing **ErrorOccurred** event to be raised. */
  var error: RemoteSystemWatcherError = js.native
}

object RemoteSystemWatcherErrorOccurredEventArgs {
  @scala.inline
  def apply(error: RemoteSystemWatcherError): RemoteSystemWatcherErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemWatcherErrorOccurredEventArgs]
  }
  @scala.inline
  implicit class RemoteSystemWatcherErrorOccurredEventArgsOps[Self <: RemoteSystemWatcherErrorOccurredEventArgs] (val x: Self) extends AnyVal {
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
    def setError(value: RemoteSystemWatcherError): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

