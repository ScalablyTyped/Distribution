package typings
package winrtLib.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeerFinderStatics extends js.Object {
  var allowBluetooth: scala.Boolean = js.native
  var allowInfrastructure: scala.Boolean = js.native
  var allowWiFiDirect: scala.Boolean = js.native
  var alternateIdentities: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, java.lang.String] = js.native
  var displayName: java.lang.String = js.native
  var onconnectionrequested: js.Any = js.native
  var ontriggeredconnectionstatechanged: js.Any = js.native
  var supportedDiscoveryTypes: PeerDiscoveryTypes = js.native
  def connectAsync(peerInformation: PeerInformation): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.NetworkingNs.SocketsNs.StreamSocket] = js.native
  def findAllPeersAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PeerInformation]] = js.native
  def start(): scala.Unit = js.native
  def start(peerMessage: java.lang.String): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

