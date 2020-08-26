package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebSocketInformation extends js.Object {
  var bandwidthStatistics: BandwidthStatistics = js.native
  var localAddress: HostName = js.native
  var protocol: String = js.native
}

object IWebSocketInformation {
  @scala.inline
  def apply(bandwidthStatistics: BandwidthStatistics, localAddress: HostName, protocol: String): IWebSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebSocketInformation]
  }
  @scala.inline
  implicit class IWebSocketInformationOps[Self <: IWebSocketInformation] (val x: Self) extends AnyVal {
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
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
  }
  
}

