package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import typings.winrt.WindowsNs.NetworkingNs.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebSocketInformation extends js.Object {
  var bandwidthStatistics: BandwidthStatistics
  var localAddress: HostName
  var protocol: String
}

object IWebSocketInformation {
  @scala.inline
  def apply(bandwidthStatistics: BandwidthStatistics, localAddress: HostName, protocol: String): IWebSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics, localAddress = localAddress, protocol = protocol)
  
    __obj.asInstanceOf[IWebSocketInformation]
  }
}

