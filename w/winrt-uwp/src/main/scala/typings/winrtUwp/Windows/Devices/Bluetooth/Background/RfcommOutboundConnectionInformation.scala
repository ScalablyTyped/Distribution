package typings.winrtUwp.Windows.Devices.Bluetooth.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for RFCOMM outbound connections. If an app wants the system to create outbound connections on its behalf, the app must create this object and attach it to the RfcommConnectionTrigger . */
trait RfcommOutboundConnectionInformation extends js.Object {
  /** Gets or sets the service UUID of the remote service to which the system will connect on behalf of the app. */
  var remoteServiceId: RfcommServiceId
}

object RfcommOutboundConnectionInformation {
  @scala.inline
  def apply(remoteServiceId: RfcommServiceId): RfcommOutboundConnectionInformation = {
    val __obj = js.Dynamic.literal(remoteServiceId = remoteServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RfcommOutboundConnectionInformation]
  }
}

