package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamSocketInformation extends js.Object {
  var bandwidthStatistics: BandwidthStatistics
  var localAddress: winrtLib.WindowsNs.NetworkingNs.HostName
  var localPort: java.lang.String
  var protectionLevel: SocketProtectionLevel
  var remoteAddress: winrtLib.WindowsNs.NetworkingNs.HostName
  var remoteHostName: winrtLib.WindowsNs.NetworkingNs.HostName
  var remotePort: java.lang.String
  var remoteServiceName: java.lang.String
  var roundTripTimeStatistics: RoundTripTimeStatistics
  var sessionKey: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
}

object IStreamSocketInformation {
  @scala.inline
  def apply(
    bandwidthStatistics: BandwidthStatistics,
    localAddress: winrtLib.WindowsNs.NetworkingNs.HostName,
    localPort: java.lang.String,
    protectionLevel: SocketProtectionLevel,
    remoteAddress: winrtLib.WindowsNs.NetworkingNs.HostName,
    remoteHostName: winrtLib.WindowsNs.NetworkingNs.HostName,
    remotePort: java.lang.String,
    remoteServiceName: java.lang.String,
    roundTripTimeStatistics: RoundTripTimeStatistics,
    sessionKey: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): IStreamSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics, localAddress = localAddress, localPort = localPort, protectionLevel = protectionLevel, remoteAddress = remoteAddress, remoteHostName = remoteHostName, remotePort = remotePort, remoteServiceName = remoteServiceName, roundTripTimeStatistics = roundTripTimeStatistics, sessionKey = sessionKey)
  
    __obj.asInstanceOf[IStreamSocketInformation]
  }
}

