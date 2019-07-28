package typings.winrt.WindowsNs.NetworkingNs.ProximityNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.NetworkingNs.SocketsNs.StreamSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Proximity.PeerFinder")
@js.native
class PeerFinder () extends js.Object

/* static members */
@JSGlobal("Windows.Networking.Proximity.PeerFinder")
@js.native
object PeerFinder extends js.Object {
  var allowBluetooth: Boolean = js.native
  var allowInfrastructure: Boolean = js.native
  var allowWiFiDirect: Boolean = js.native
  var alternateIdentities: IMap[String, String] = js.native
  var displayName: String = js.native
  var onconnectionrequested: js.Any = js.native
  var ontriggeredconnectionstatechanged: js.Any = js.native
  var supportedDiscoveryTypes: PeerDiscoveryTypes = js.native
  def connectAsync(peerInformation: PeerInformation): IAsyncOperation[StreamSocket] = js.native
  def findAllPeersAsync(): IAsyncOperation[IVectorView[PeerInformation]] = js.native
  def start(): Unit = js.native
  def start(peerMessage: String): Unit = js.native
  def stop(): Unit = js.native
}

