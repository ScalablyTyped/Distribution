package typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Connectivity.NetworkAdapter")
@js.native
class NetworkAdapter () extends INetworkAdapter {
  /* CompleteClass */
  override var ianaInterfaceType: Double = js.native
  /* CompleteClass */
  override var inboundMaxBitsPerSecond: Double = js.native
  /* CompleteClass */
  override var networkAdapterId: String = js.native
  /* CompleteClass */
  override var networkItem: NetworkItem = js.native
  /* CompleteClass */
  override var outboundMaxBitsPerSecond: Double = js.native
  /* CompleteClass */
  override def getConnectedProfileAsync(): IAsyncOperation[ConnectionProfile] = js.native
}

