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

object INetworkAdapter {
  @scala.inline
  def apply(
    getConnectedProfileAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ConnectionProfile]],
    ianaInterfaceType: scala.Double,
    inboundMaxBitsPerSecond: scala.Double,
    networkAdapterId: java.lang.String,
    networkItem: NetworkItem,
    outboundMaxBitsPerSecond: scala.Double
  ): INetworkAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getConnectedProfileAsync")(getConnectedProfileAsync)
    __obj.updateDynamic("ianaInterfaceType")(ianaInterfaceType)
    __obj.updateDynamic("inboundMaxBitsPerSecond")(inboundMaxBitsPerSecond)
    __obj.updateDynamic("networkAdapterId")(networkAdapterId)
    __obj.updateDynamic("networkItem")(networkItem)
    __obj.updateDynamic("outboundMaxBitsPerSecond")(outboundMaxBitsPerSecond)
    __obj.asInstanceOf[INetworkAdapter]
  }
}

