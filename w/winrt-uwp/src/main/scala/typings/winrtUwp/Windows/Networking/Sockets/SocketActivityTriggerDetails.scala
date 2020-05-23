package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A object instantiated by the background broker infrastructure and used by an app to retrieve details when a SocketActivityTrigger occurs. */
trait SocketActivityTriggerDetails extends js.Object {
  /** Get the reason the SocketActivityTrigger occurred. */
  var reason: SocketActivityTriggerReason
  /** Get the SocketActivityInformation object for socket that caused the SocketActivityTrigger to occur. */
  var socketInformation: SocketActivityInformation
}

object SocketActivityTriggerDetails {
  @scala.inline
  def apply(reason: SocketActivityTriggerReason, socketInformation: SocketActivityInformation): SocketActivityTriggerDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], socketInformation = socketInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketActivityTriggerDetails]
  }
}

