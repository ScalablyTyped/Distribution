package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkAdapter extends js.Object {
  var ianaInterfaceType: scala.Double
  var inboundMaxBitsPerSecond: scala.Double
  var networkAdapterId: java.lang.String
  var networkItem: NetworkItem
  var outboundMaxBitsPerSecond: scala.Double
  def getConnectedProfileAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ConnectionProfile]
}

