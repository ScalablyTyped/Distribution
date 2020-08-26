package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommInboundConnectionInformation
import typings.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommOutboundConnectionInformation
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that launches a background task when an RFCOMM inbound or outbound connections are established. */
@js.native
trait RfcommConnectionTrigger extends js.Object {
  /** Gets or sets whether the app wants to handle multiple connections at a time. */
  var allowMultipleConnections: Boolean = js.native
  /** Gets or sets the RfcommInboundConnectionInformation object that describes how the system will advertise and listen for inbound connections on behalf of the app. */
  var inboundConnection: RfcommInboundConnectionInformation = js.native
  /** Gets or sets the RfcommOutboundConnectionInformation object that describes how the system will create outgoing connections on behalf of the app. */
  var outboundConnection: RfcommOutboundConnectionInformation = js.native
  /** Gets or sets the minimum protection level required for connections that are created or accepted on behalf of the app. */
  var protectionLevel: SocketProtectionLevel = js.native
  /** Gets or sets specific remote Bluetooth device the system will connect to, or accept connections from, on behalf of the app. */
  var remoteHostName: HostName = js.native
}

object RfcommConnectionTrigger {
  @scala.inline
  def apply(
    allowMultipleConnections: Boolean,
    inboundConnection: RfcommInboundConnectionInformation,
    outboundConnection: RfcommOutboundConnectionInformation,
    protectionLevel: SocketProtectionLevel,
    remoteHostName: HostName
  ): RfcommConnectionTrigger = {
    val __obj = js.Dynamic.literal(allowMultipleConnections = allowMultipleConnections.asInstanceOf[js.Any], inboundConnection = inboundConnection.asInstanceOf[js.Any], outboundConnection = outboundConnection.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RfcommConnectionTrigger]
  }
  @scala.inline
  implicit class RfcommConnectionTriggerOps[Self <: RfcommConnectionTrigger] (val x: Self) extends AnyVal {
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
    def setAllowMultipleConnections(value: Boolean): Self = this.set("allowMultipleConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def setInboundConnection(value: RfcommInboundConnectionInformation): Self = this.set("inboundConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutboundConnection(value: RfcommOutboundConnectionInformation): Self = this.set("outboundConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtectionLevel(value: SocketProtectionLevel): Self = this.set("protectionLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteHostName(value: HostName): Self = this.set("remoteHostName", value.asInstanceOf[js.Any])
  }
  
}

