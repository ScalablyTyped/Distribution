package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import typings.winrt.WindowsNs.NetworkingNs.HostName
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamSocketInformation extends js.Object {
  var bandwidthStatistics: BandwidthStatistics
  var localAddress: HostName
  var localPort: String
  var protectionLevel: SocketProtectionLevel
  var remoteAddress: HostName
  var remoteHostName: HostName
  var remotePort: String
  var remoteServiceName: String
  var roundTripTimeStatistics: RoundTripTimeStatistics
  var sessionKey: IBuffer
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
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics, localAddress = localAddress, localPort = localPort, protectionLevel = protectionLevel, remoteAddress = remoteAddress, remoteHostName = remoteHostName, remotePort = remotePort, remoteServiceName = remoteServiceName, roundTripTimeStatistics = roundTripTimeStatistics, sessionKey = sessionKey)
  
    __obj.asInstanceOf[IStreamSocketInformation]
  }
}

