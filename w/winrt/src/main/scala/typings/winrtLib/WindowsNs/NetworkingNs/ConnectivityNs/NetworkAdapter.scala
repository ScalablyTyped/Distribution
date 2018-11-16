package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Connectivity.NetworkAdapter")
@js.native
class NetworkAdapter () extends INetworkAdapter {
  /* CompleteClass */
  override var ianaInterfaceType: scala.Double = js.native
  /* CompleteClass */
  override var inboundMaxBitsPerSecond: scala.Double = js.native
  /* CompleteClass */
  override var networkAdapterId: java.lang.String = js.native
  /* CompleteClass */
  override var networkItem: NetworkItem = js.native
  /* CompleteClass */
  override var outboundMaxBitsPerSecond: scala.Double = js.native
  /* CompleteClass */
  override def getConnectedProfileAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ConnectionProfile] = js.native
}

