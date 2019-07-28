package typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkAdapter extends js.Object {
  var ianaInterfaceType: Double
  var inboundMaxBitsPerSecond: Double
  var networkAdapterId: String
  var networkItem: NetworkItem
  var outboundMaxBitsPerSecond: Double
  def getConnectedProfileAsync(): IAsyncOperation[ConnectionProfile]
}

object INetworkAdapter {
  @scala.inline
  def apply(
    getConnectedProfileAsync: () => IAsyncOperation[ConnectionProfile],
    ianaInterfaceType: Double,
    inboundMaxBitsPerSecond: Double,
    networkAdapterId: String,
    networkItem: NetworkItem,
    outboundMaxBitsPerSecond: Double
  ): INetworkAdapter = {
    val __obj = js.Dynamic.literal(getConnectedProfileAsync = js.Any.fromFunction0(getConnectedProfileAsync), ianaInterfaceType = ianaInterfaceType, inboundMaxBitsPerSecond = inboundMaxBitsPerSecond, networkAdapterId = networkAdapterId, networkItem = networkItem, outboundMaxBitsPerSecond = outboundMaxBitsPerSecond)
  
    __obj.asInstanceOf[INetworkAdapter]
  }
}

