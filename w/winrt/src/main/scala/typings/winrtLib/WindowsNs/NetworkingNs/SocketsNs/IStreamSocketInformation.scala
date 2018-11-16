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

