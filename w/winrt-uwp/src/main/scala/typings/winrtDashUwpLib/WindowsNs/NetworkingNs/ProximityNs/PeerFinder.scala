package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables you to discover other instances of your app on nearby devices and create a socket connection between the peer apps by using a tap gesture or by browsing. For creating Bluetooth socket connections on Windows 8.1 and later, use Windows.Devices.Bluetooth.Rfcomm instead. */
@JSGlobal("Windows.Networking.Proximity.PeerFinder")
@js.native
abstract class PeerFinder () extends js.Object

/** Enables you to discover other instances of your app on nearby devices and create a socket connection between the peer apps by using a tap gesture or by browsing. For creating Bluetooth socket connections on Windows 8.1 and later, use Windows.Devices.Bluetooth.Rfcomm instead. */
@JSGlobal("Windows.Networking.Proximity.PeerFinder")
@js.native
object PeerFinder extends js.Object {
  /** Specifies whether the PeerFinder class may connect a StreamSocket object by using Bluetooth. */
  var allowBluetooth: scala.Boolean = js.native
  /** Specifies whether the PeerFinder class may connect to a StreamSocket object using TCP/IP. */
  var allowInfrastructure: scala.Boolean = js.native
  /** Specifies whether the PeerFinder class may connect a StreamSocket object by using Wi-Fi Direct. */
  var allowWiFiDirect: scala.Boolean = js.native
  /** Gets a list of alternate appId values to match with peer applications on other platforms. */
  var alternateIdentities: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, java.lang.String] = js.native
  /** Gets or sets user or device data to include during device discovery. */
  var discoveryData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets or sets the name that identifies your computer to remote peers. */
  var displayName: java.lang.String = js.native
  /** Occurs when a remote peer requests a connection using the ConnectAsync method. */
  @JSName("onconnectionrequested")
  var onconnectionrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[_, winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.ConnectionRequestedEventArgs] = js.native
  /** Occurs during a tap gesture from a remote peer. */
  @JSName("ontriggeredconnectionstatechanged")
  var ontriggeredconnectionstatechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
    _, 
    winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectionStateChangedEventArgs
  ] = js.native
  /** Gets or sets the role of the app in peer-to-peer connections. */
  var role: winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerRole = js.native
  /** Gets a value that indicates which discovery options are available to use with the PeerFinder class. */
  var supportedDiscoveryTypes: winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerDiscoveryTypes = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.connectionrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[_, winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.ConnectionRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_triggeredconnectionstatechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.triggeredconnectionstatechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      _, 
      winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectionStateChangedEventArgs
    ]
  ): scala.Unit = js.native
  /**
                   * Connects to a peer discovered by a call to the FindAllPeersAsync method.
                   * @param peerInformation A peer information object representing the peer to connect to.
                   * @return An asynchronous operation for connecting to a remote peer using the supplied StreamSocket object.
                   */
  def connectAsync(peerInformation: winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerInformation): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.StreamSocket] = js.native
  /**
                   * Creates a new instance of a PeerWatcher object for dynamic discovery of peer apps.
                   * @return An instance of a PeerWatcher object for dynamic discovery of peer apps.
                   */
  def createWatcher(): winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerWatcher = js.native
  /**
                   * Asynchronously browses for peer devices that are running the same app within wireless range.
                   * @return The asynchronous operation for browsing for peer devices that are running your app.
                   */
  def findAllPeersAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /** Occurs when a remote peer requests a connection using the ConnectAsync method. */
  def onconnectionrequested(
    ev: winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.ConnectionRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[_]
  ): scala.Unit = js.native
  /** Occurs during a tap gesture from a remote peer. */
  def ontriggeredconnectionstatechanged(
    ev: winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectionStateChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[_]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.connectionrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[_, winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.ConnectionRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_triggeredconnectionstatechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.triggeredconnectionstatechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      _, 
      winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectionStateChangedEventArgs
    ]
  ): scala.Unit = js.native
  /** Makes an app discoverable to remote peers. */
  def start(): scala.Unit = js.native
  /**
                   * Makes an app discoverable to remote peers.
                   * @param peerMessage The message to deliver to the proximate device.
                   */
  def start(peerMessage: java.lang.String): scala.Unit = js.native
  /** Stops advertising for a peer connection. */
  def stop(): scala.Unit = js.native
}

