package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets information about an **ErrorOccurred** event, namely the **RemoteSystemWatcherError** value describing the error. */
trait RemoteSystemWatcherErrorOccurredEventArgs extends js.Object {
  /** The **RemoteSystemWatcherError** value representing the error that occurred during discovery, causing the containing **ErrorOccurred** event to be raised. */
  var error: RemoteSystemWatcherError
}

object RemoteSystemWatcherErrorOccurredEventArgs {
  @scala.inline
  def apply(error: RemoteSystemWatcherError): RemoteSystemWatcherErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemWatcherErrorOccurredEventArgs]
  }
}

