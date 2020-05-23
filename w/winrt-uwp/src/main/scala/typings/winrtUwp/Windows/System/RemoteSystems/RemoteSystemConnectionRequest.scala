package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an intent to communicate with a specific remote system (device). */
trait RemoteSystemConnectionRequest extends js.Object {
  /** Represents the remote system (device) that the app intends to communicate with. */
  var remoteSystem: RemoteSystem
  /** Represents the remote application that the app intends to communicate with. */
  var remoteSystemApp: RemoteSystemApp
}

object RemoteSystemConnectionRequest {
  @scala.inline
  def apply(remoteSystem: RemoteSystem, remoteSystemApp: RemoteSystemApp): RemoteSystemConnectionRequest = {
    val __obj = js.Dynamic.literal(remoteSystem = remoteSystem.asInstanceOf[js.Any], remoteSystemApp = remoteSystemApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemConnectionRequest]
  }
}

