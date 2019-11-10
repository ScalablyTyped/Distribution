package typings.winrtDashUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets information about an **ErrorOccurred** event, namely the **RemoteSystemWatcherError** value describing the error. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemWatcherErrorOccurredEventArgs")
@js.native
abstract class RemoteSystemWatcherErrorOccurredEventArgs () extends js.Object {
  /** The **RemoteSystemWatcherError** value representing the error that occurred during discovery, causing the containing **ErrorOccurred** event to be raised. */
  var error: RemoteSystemWatcherError = js.native
}

