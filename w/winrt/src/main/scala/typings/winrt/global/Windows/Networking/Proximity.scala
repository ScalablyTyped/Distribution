package typings.winrt.global.Windows.Networking

import typings.winrt.Windows.Foundation.Collections.IMap
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes
import typings.winrt.Windows.Networking.Proximity.TriggeredConnectState
import typings.winrt.Windows.Networking.Sockets.StreamSocket
import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Proximity")
@js.native
object Proximity extends js.Object {
  @js.native
  class ConnectionRequestedEventArgs ()
    extends typings.winrt.Windows.Networking.Proximity.ConnectionRequestedEventArgs {
    /* CompleteClass */
    override var peerInformation: typings.winrt.Windows.Networking.Proximity.PeerInformation = js.native
  }
  
  @js.native
  class PeerFinder ()
    extends typings.winrt.Windows.Networking.Proximity.PeerFinder
  
  @js.native
  class PeerInformation ()
    extends typings.winrt.Windows.Networking.Proximity.PeerInformation {
    /* CompleteClass */
    override var displayName: String = js.native
  }
  
  @js.native
  class ProximityDevice ()
    extends typings.winrt.Windows.Networking.Proximity.ProximityDevice
  
  @js.native
  class ProximityMessage ()
    extends typings.winrt.Windows.Networking.Proximity.ProximityMessage {
    /* CompleteClass */
    override var data: IBuffer = js.native
    /* CompleteClass */
    override var dataAsString: String = js.native
    /* CompleteClass */
    override var messageType: String = js.native
    /* CompleteClass */
    override var subscriptionId: Double = js.native
  }
  
  @js.native
  class TriggeredConnectionStateChangedEventArgs ()
    extends typings.winrt.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs {
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var socket: StreamSocket = js.native
    /* CompleteClass */
    override var state: TriggeredConnectState = js.native
  }
  
  @js.native
  object PeerDiscoveryTypes extends js.Object {
    /* 1 */ val browse: typings.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.browse with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.none with Double = js.native
    /* 2 */ val triggered: typings.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.triggered with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes with Double] = js.native
  }
  
  /* static members */
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
    def connectAsync(peerInformation: typings.winrt.Windows.Networking.Proximity.PeerInformation): IAsyncOperation[StreamSocket] = js.native
    def findAllPeersAsync(): IAsyncOperation[IVectorView[typings.winrt.Windows.Networking.Proximity.PeerInformation]] = js.native
    def start(): Unit = js.native
    def start(peerMessage: String): Unit = js.native
    def stop(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ProximityDevice extends js.Object {
    def fromId(deviceInterfaceId: String): typings.winrt.Windows.Networking.Proximity.ProximityDevice = js.native
    def getDefault(): typings.winrt.Windows.Networking.Proximity.ProximityDevice = js.native
    def getDeviceSelector(): String = js.native
  }
  
  @js.native
  object TriggeredConnectState extends js.Object {
    /* 4 */ val canceled: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.canceled with Double = js.native
    /* 3 */ val completed: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.completed with Double = js.native
    /* 2 */ val connecting: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.connecting with Double = js.native
    /* 5 */ val failed: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.failed with Double = js.native
    /* 1 */ val listening: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.listening with Double = js.native
    /* 0 */ val peerFound: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.peerFound with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Proximity.TriggeredConnectState with Double] = js.native
  }
  
}

