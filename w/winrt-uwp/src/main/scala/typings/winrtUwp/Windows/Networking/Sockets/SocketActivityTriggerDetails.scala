package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A object instantiated by the background broker infrastructure and used by an app to retrieve details when a SocketActivityTrigger occurs. */
@js.native
trait SocketActivityTriggerDetails extends js.Object {
  /** Get the reason the SocketActivityTrigger occurred. */
  var reason: SocketActivityTriggerReason = js.native
  /** Get the SocketActivityInformation object for socket that caused the SocketActivityTrigger to occur. */
  var socketInformation: SocketActivityInformation = js.native
}

object SocketActivityTriggerDetails {
  @scala.inline
  def apply(reason: SocketActivityTriggerReason, socketInformation: SocketActivityInformation): SocketActivityTriggerDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], socketInformation = socketInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketActivityTriggerDetails]
  }
  @scala.inline
  implicit class SocketActivityTriggerDetailsOps[Self <: SocketActivityTriggerDetails] (val x: Self) extends AnyVal {
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
    def setReason(value: SocketActivityTriggerReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocketInformation(value: SocketActivityInformation): Self = this.set("socketInformation", value.asInstanceOf[js.Any])
  }
  
}

