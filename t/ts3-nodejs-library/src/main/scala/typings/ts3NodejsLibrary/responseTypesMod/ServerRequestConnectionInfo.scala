package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerRequestConnectionInfo extends ResponseEntry {
  var connectionBandwidthReceivedLastMinuteTotal: Double = js.native
  var connectionBandwidthReceivedLastSecondTotal: Double = js.native
  var connectionBandwidthSentLastMinuteTotal: Double = js.native
  var connectionBandwidthSentLastSecondTotal: Double = js.native
  var connectionBytesReceivedTotal: Double = js.native
  var connectionBytesSentTotal: Double = js.native
  var connectionConnectedTime: Double = js.native
  var connectionFiletransferBandwidthReceived: Double = js.native
  var connectionFiletransferBandwidthSent: Double = js.native
  var connectionFiletransferBytesReceivedTotal: Double = js.native
  var connectionFiletransferBytesSentTotal: Double = js.native
  var connectionPacketlossTotal: Double = js.native
  var connectionPacketsReceivedTotal: Double = js.native
  var connectionPacketsSentTotal: Double = js.native
  var connectionPing: Double = js.native
}

object ServerRequestConnectionInfo {
  @scala.inline
  def apply(
    connectionBandwidthReceivedLastMinuteTotal: Double,
    connectionBandwidthReceivedLastSecondTotal: Double,
    connectionBandwidthSentLastMinuteTotal: Double,
    connectionBandwidthSentLastSecondTotal: Double,
    connectionBytesReceivedTotal: Double,
    connectionBytesSentTotal: Double,
    connectionConnectedTime: Double,
    connectionFiletransferBandwidthReceived: Double,
    connectionFiletransferBandwidthSent: Double,
    connectionFiletransferBytesReceivedTotal: Double,
    connectionFiletransferBytesSentTotal: Double,
    connectionPacketlossTotal: Double,
    connectionPacketsReceivedTotal: Double,
    connectionPacketsSentTotal: Double,
    connectionPing: Double
  ): ServerRequestConnectionInfo = {
    val __obj = js.Dynamic.literal(connectionBandwidthReceivedLastMinuteTotal = connectionBandwidthReceivedLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthReceivedLastSecondTotal = connectionBandwidthReceivedLastSecondTotal.asInstanceOf[js.Any], connectionBandwidthSentLastMinuteTotal = connectionBandwidthSentLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthSentLastSecondTotal = connectionBandwidthSentLastSecondTotal.asInstanceOf[js.Any], connectionBytesReceivedTotal = connectionBytesReceivedTotal.asInstanceOf[js.Any], connectionBytesSentTotal = connectionBytesSentTotal.asInstanceOf[js.Any], connectionConnectedTime = connectionConnectedTime.asInstanceOf[js.Any], connectionFiletransferBandwidthReceived = connectionFiletransferBandwidthReceived.asInstanceOf[js.Any], connectionFiletransferBandwidthSent = connectionFiletransferBandwidthSent.asInstanceOf[js.Any], connectionFiletransferBytesReceivedTotal = connectionFiletransferBytesReceivedTotal.asInstanceOf[js.Any], connectionFiletransferBytesSentTotal = connectionFiletransferBytesSentTotal.asInstanceOf[js.Any], connectionPacketlossTotal = connectionPacketlossTotal.asInstanceOf[js.Any], connectionPacketsReceivedTotal = connectionPacketsReceivedTotal.asInstanceOf[js.Any], connectionPacketsSentTotal = connectionPacketsSentTotal.asInstanceOf[js.Any], connectionPing = connectionPing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRequestConnectionInfo]
  }
  @scala.inline
  implicit class ServerRequestConnectionInfoOps[Self <: ServerRequestConnectionInfo] (val x: Self) extends AnyVal {
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
    def setConnectionBandwidthReceivedLastMinuteTotal(value: Double): Self = this.set("connectionBandwidthReceivedLastMinuteTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBandwidthReceivedLastSecondTotal(value: Double): Self = this.set("connectionBandwidthReceivedLastSecondTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBandwidthSentLastMinuteTotal(value: Double): Self = this.set("connectionBandwidthSentLastMinuteTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBandwidthSentLastSecondTotal(value: Double): Self = this.set("connectionBandwidthSentLastSecondTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBytesReceivedTotal(value: Double): Self = this.set("connectionBytesReceivedTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBytesSentTotal(value: Double): Self = this.set("connectionBytesSentTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionConnectedTime(value: Double): Self = this.set("connectionConnectedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionFiletransferBandwidthReceived(value: Double): Self = this.set("connectionFiletransferBandwidthReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionFiletransferBandwidthSent(value: Double): Self = this.set("connectionFiletransferBandwidthSent", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionFiletransferBytesReceivedTotal(value: Double): Self = this.set("connectionFiletransferBytesReceivedTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionFiletransferBytesSentTotal(value: Double): Self = this.set("connectionFiletransferBytesSentTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPacketlossTotal(value: Double): Self = this.set("connectionPacketlossTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPacketsReceivedTotal(value: Double): Self = this.set("connectionPacketsReceivedTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPacketsSentTotal(value: Double): Self = this.set("connectionPacketsSentTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPing(value: Double): Self = this.set("connectionPing", value.asInstanceOf[js.Any])
  }
  
}

