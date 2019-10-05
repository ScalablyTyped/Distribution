package typings.winrtDashUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A object instantiated by the background broker infrastructure and used by an app to retrieve details when a SocketActivityTrigger occurs. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityTriggerDetails")
@js.native
abstract class SocketActivityTriggerDetails () extends js.Object {
  /** Get the reason the SocketActivityTrigger occurred. */
  var reason: SocketActivityTriggerReason = js.native
  /** Get the SocketActivityInformation object for socket that caused the SocketActivityTrigger to occur. */
  var socketInformation: SocketActivityInformation = js.native
}

