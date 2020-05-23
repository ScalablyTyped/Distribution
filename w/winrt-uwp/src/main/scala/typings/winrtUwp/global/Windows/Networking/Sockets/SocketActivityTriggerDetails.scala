package typings.winrtUwp.global.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A object instantiated by the background broker infrastructure and used by an app to retrieve details when a SocketActivityTrigger occurs. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityTriggerDetails")
@js.native
abstract class SocketActivityTriggerDetails ()
  extends typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerDetails {
  /** Get the reason the SocketActivityTrigger occurred. */
  /* CompleteClass */
  override var reason: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason = js.native
  /** Get the SocketActivityInformation object for socket that caused the SocketActivityTrigger to occur. */
  /* CompleteClass */
  override var socketInformation: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityInformation = js.native
}

