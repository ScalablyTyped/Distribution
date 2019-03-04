package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebSocketInformation extends js.Object {
  var bandwidthStatistics: BandwidthStatistics
  var localAddress: winrtLib.WindowsNs.NetworkingNs.HostName
  var protocol: java.lang.String
}

object IWebSocketInformation {
  @scala.inline
  def apply(
    bandwidthStatistics: BandwidthStatistics,
    localAddress: winrtLib.WindowsNs.NetworkingNs.HostName,
    protocol: java.lang.String
  ): IWebSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics, localAddress = localAddress, protocol = protocol)
  
    __obj.asInstanceOf[IWebSocketInformation]
  }
}

