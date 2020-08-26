package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Networking.HostName
import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamSocketInformation extends js.Object {
  var bandwidthStatistics: BandwidthStatistics = js.native
  var localAddress: HostName = js.native
  var localPort: String = js.native
  var protectionLevel: SocketProtectionLevel = js.native
  var remoteAddress: HostName = js.native
  var remoteHostName: HostName = js.native
  var remotePort: String = js.native
  var remoteServiceName: String = js.native
  var roundTripTimeStatistics: RoundTripTimeStatistics = js.native
  var sessionKey: IBuffer = js.native
}

object IStreamSocketInformation {
  @scala.inline
  def apply(
    bandwidthStatistics: BandwidthStatistics,
    localAddress: HostName,
    localPort: String,
    protectionLevel: SocketProtectionLevel,
    remoteAddress: HostName,
    remoteHostName: HostName,
    remotePort: String,
    remoteServiceName: String,
    roundTripTimeStatistics: RoundTripTimeStatistics,
    sessionKey: IBuffer
  ): IStreamSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], remoteServiceName = remoteServiceName.asInstanceOf[js.Any], roundTripTimeStatistics = roundTripTimeStatistics.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamSocketInformation]
  }
  @scala.inline
  implicit class IStreamSocketInformationOps[Self <: IStreamSocketInformation] (val x: Self) extends AnyVal {
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
    def setBandwidthStatistics(value: BandwidthStatistics): Self = this.set("bandwidthStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalAddress(value: HostName): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalPort(value: String): Self = this.set("localPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtectionLevel(value: SocketProtectionLevel): Self = this.set("protectionLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteAddress(value: HostName): Self = this.set("remoteAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteHostName(value: HostName): Self = this.set("remoteHostName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemotePort(value: String): Self = this.set("remotePort", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteServiceName(value: String): Self = this.set("remoteServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoundTripTimeStatistics(value: RoundTripTimeStatistics): Self = this.set("roundTripTimeStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionKey(value: IBuffer): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
  }
  
}

