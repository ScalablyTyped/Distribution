package typings.winrtDashUwp.Windows.Networking.Proximity

import typings.winrtDashUwp.Windows.Foundation.Collections.IMap
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Networking.Sockets.StreamSocket
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.connectionrequested
import typings.winrtDashUwp.winrtDashUwpStrings.triggeredconnectionstatechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables you to discover other instances of your app on nearby devices and create a socket connection between the peer apps by using a tap gesture or by browsing. For creating Bluetooth socket connections on Windows 8.1 and later, use Windows.Devices.Bluetooth.Rfcomm instead. */
@JSGlobal("Windows.Networking.Proximity.PeerFinder")
@js.native
abstract class PeerFinder () extends js.Object

/* static members */
@JSGlobal("Windows.Networking.Proximity.PeerFinder")
@js.native
object PeerFinder extends js.Object {
  /** Specifies whether the PeerFinder class may connect a StreamSocket object by using Bluetooth. */
  var allowBluetooth: Boolean = js.native
  /** Specifies whether the PeerFinder class may connect to a StreamSocket object using TCP/IP. */
  var allowInfrastructure: Boolean = js.native
  /** Specifies whether the PeerFinder class may connect a StreamSocket object by using Wi-Fi Direct. */
  var allowWiFiDirect: Boolean = js.native
  /** Gets a list of alternate appId values to match with peer applications on other platforms. */
  var alternateIdentities: IMap[String, String] = js.native
  /** Gets or sets user or device data to include during device discovery. */
  var discoveryData: IBuffer = js.native
  /** Gets or sets the name that identifies your computer to remote peers. */
  var displayName: String = js.native
  /** Occurs when a remote peer requests a connection using the ConnectAsync method. */
  @JSName("onconnectionrequested")
  var onconnectionrequested_Original: TypedEventHandler[_, ConnectionRequestedEventArgs] = js.native
  /** Occurs during a tap gesture from a remote peer. */
  @JSName("ontriggeredconnectionstatechanged")
  var ontriggeredconnectionstatechanged_Original: TypedEventHandler[_, TriggeredConnectionStateChangedEventArgs] = js.native
  /** Gets or sets the role of the app in peer-to-peer connections. */
  var role: PeerRole = js.native
  /** Gets a value that indicates which discovery options are available to use with the PeerFinder class. */
  var supportedDiscoveryTypes: PeerDiscoveryTypes = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionrequested(`type`: connectionrequested, listener: TypedEventHandler[_, ConnectionRequestedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_triggeredconnectionstatechanged(
    `type`: triggeredconnectionstatechanged,
    listener: TypedEventHandler[_, TriggeredConnectionStateChangedEventArgs]
  ): Unit = js.native
  /**
    * Connects to a peer discovered by a call to the FindAllPeersAsync method.
    * @param peerInformation A peer information object representing the peer to connect to.
    * @return An asynchronous operation for connecting to a remote peer using the supplied StreamSocket object.
    */
  def connectAsync(peerInformation: PeerInformation): IPromiseWithIAsyncOperation[StreamSocket] = js.native
  /**
    * Creates a new instance of a PeerWatcher object for dynamic discovery of peer apps.
    * @return An instance of a PeerWatcher object for dynamic discovery of peer apps.
    */
  def createWatcher(): PeerWatcher = js.native
  /**
    * Asynchronously browses for peer devices that are running the same app within wireless range.
    * @return The asynchronous operation for browsing for peer devices that are running your app.
    */
  def findAllPeersAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /** Occurs when a remote peer requests a connection using the ConnectAsync method. */
  def onconnectionrequested(ev: ConnectionRequestedEventArgs with WinRTEvent[_]): Unit = js.native
  /** Occurs during a tap gesture from a remote peer. */
  def ontriggeredconnectionstatechanged(ev: TriggeredConnectionStateChangedEventArgs with WinRTEvent[_]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionrequested(`type`: connectionrequested, listener: TypedEventHandler[_, ConnectionRequestedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_triggeredconnectionstatechanged(
    `type`: triggeredconnectionstatechanged,
    listener: TypedEventHandler[_, TriggeredConnectionStateChangedEventArgs]
  ): Unit = js.native
  /** Makes an app discoverable to remote peers. */
  def start(): Unit = js.native
  /**
    * Makes an app discoverable to remote peers.
    * @param peerMessage The message to deliver to the proximate device.
    */
  def start(peerMessage: String): Unit = js.native
  /** Stops advertising for a peer connection. */
  def stop(): Unit = js.native
}

