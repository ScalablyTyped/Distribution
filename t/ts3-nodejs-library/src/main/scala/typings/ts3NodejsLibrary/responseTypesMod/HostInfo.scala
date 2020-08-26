package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostInfo extends ResponseEntry {
  var connectionBandwidthReceivedLastMinuteTotal: Double = js.native
  var connectionBandwidthReceivedLastSecondTotal: Double = js.native
  var connectionBandwidthSentLastMinuteTotal: Double = js.native
  var connectionBandwidthSentLastSecondTotal: Double = js.native
  var connectionBytesReceivedTotal: Double = js.native
  var connectionBytesSentTotal: Double = js.native
  var connectionFiletransferBandwidthReceived: Double = js.native
  var connectionFiletransferBandwidthSent: Double = js.native
  var connectionFiletransferBytesReceivedTotal: Double = js.native
  var connectionFiletransferBytesSentTotal: Double = js.native
  var connectionPacketsReceivedTotal: Double = js.native
  var connectionPacketsSentTotal: Double = js.native
  var hostTimestampUtc: Double = js.native
  var instanceUptime: Double = js.native
  var virtualserversRunningTotal: Double = js.native
  var virtualserversTotalChannelsOnline: Double = js.native
  var virtualserversTotalClientsOnline: Double = js.native
  var virtualserversTotalMaxclients: Double = js.native
}

object HostInfo {
  @scala.inline
  def apply(
    connectionBandwidthReceivedLastMinuteTotal: Double,
    connectionBandwidthReceivedLastSecondTotal: Double,
    connectionBandwidthSentLastMinuteTotal: Double,
    connectionBandwidthSentLastSecondTotal: Double,
    connectionBytesReceivedTotal: Double,
    connectionBytesSentTotal: Double,
    connectionFiletransferBandwidthReceived: Double,
    connectionFiletransferBandwidthSent: Double,
    connectionFiletransferBytesReceivedTotal: Double,
    connectionFiletransferBytesSentTotal: Double,
    connectionPacketsReceivedTotal: Double,
    connectionPacketsSentTotal: Double,
    hostTimestampUtc: Double,
    instanceUptime: Double,
    virtualserversRunningTotal: Double,
    virtualserversTotalChannelsOnline: Double,
    virtualserversTotalClientsOnline: Double,
    virtualserversTotalMaxclients: Double
  ): HostInfo = {
    val __obj = js.Dynamic.literal(connectionBandwidthReceivedLastMinuteTotal = connectionBandwidthReceivedLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthReceivedLastSecondTotal = connectionBandwidthReceivedLastSecondTotal.asInstanceOf[js.Any], connectionBandwidthSentLastMinuteTotal = connectionBandwidthSentLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthSentLastSecondTotal = connectionBandwidthSentLastSecondTotal.asInstanceOf[js.Any], connectionBytesReceivedTotal = connectionBytesReceivedTotal.asInstanceOf[js.Any], connectionBytesSentTotal = connectionBytesSentTotal.asInstanceOf[js.Any], connectionFiletransferBandwidthReceived = connectionFiletransferBandwidthReceived.asInstanceOf[js.Any], connectionFiletransferBandwidthSent = connectionFiletransferBandwidthSent.asInstanceOf[js.Any], connectionFiletransferBytesReceivedTotal = connectionFiletransferBytesReceivedTotal.asInstanceOf[js.Any], connectionFiletransferBytesSentTotal = connectionFiletransferBytesSentTotal.asInstanceOf[js.Any], connectionPacketsReceivedTotal = connectionPacketsReceivedTotal.asInstanceOf[js.Any], connectionPacketsSentTotal = connectionPacketsSentTotal.asInstanceOf[js.Any], hostTimestampUtc = hostTimestampUtc.asInstanceOf[js.Any], instanceUptime = instanceUptime.asInstanceOf[js.Any], virtualserversRunningTotal = virtualserversRunningTotal.asInstanceOf[js.Any], virtualserversTotalChannelsOnline = virtualserversTotalChannelsOnline.asInstanceOf[js.Any], virtualserversTotalClientsOnline = virtualserversTotalClientsOnline.asInstanceOf[js.Any], virtualserversTotalMaxclients = virtualserversTotalMaxclients.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostInfo]
  }
  @scala.inline
  implicit class HostInfoOps[Self <: HostInfo] (val x: Self) extends AnyVal {
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
    def setConnectionFiletransferBandwidthReceived(value: Double): Self = this.set("connectionFiletransferBandwidthReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionFiletransferBandwidthSent(value: Double): Self = this.set("connectionFiletransferBandwidthSent", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionFiletransferBytesReceivedTotal(value: Double): Self = this.set("connectionFiletransferBytesReceivedTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionFiletransferBytesSentTotal(value: Double): Self = this.set("connectionFiletransferBytesSentTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPacketsReceivedTotal(value: Double): Self = this.set("connectionPacketsReceivedTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPacketsSentTotal(value: Double): Self = this.set("connectionPacketsSentTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostTimestampUtc(value: Double): Self = this.set("hostTimestampUtc", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceUptime(value: Double): Self = this.set("instanceUptime", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserversRunningTotal(value: Double): Self = this.set("virtualserversRunningTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserversTotalChannelsOnline(value: Double): Self = this.set("virtualserversTotalChannelsOnline", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserversTotalClientsOnline(value: Double): Self = this.set("virtualserversTotalClientsOnline", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserversTotalMaxclients(value: Double): Self = this.set("virtualserversTotalMaxclients", value.asInstanceOf[js.Any])
  }
  
}

