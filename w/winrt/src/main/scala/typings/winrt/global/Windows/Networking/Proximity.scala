package typings.winrt.global.Windows.Networking

import typings.winrt.Windows.Foundation.Collections.IMap
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes
import typings.winrt.Windows.Networking.Proximity.TriggeredConnectState
import typings.winrt.Windows.Networking.Sockets.StreamSocket
import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Proximity {
  
  @JSGlobal("Windows.Networking.Proximity.ConnectionRequestedEventArgs")
  @js.native
  class ConnectionRequestedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Networking.Proximity.ConnectionRequestedEventArgs {
    
    /* CompleteClass */
    var peerInformation: typings.winrt.Windows.Networking.Proximity.PeerInformation = js.native
  }
  
  @JSGlobal("Windows.Networking.Proximity.PeerDiscoveryTypes")
  @js.native
  object PeerDiscoveryTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes & Double] = js.native
    
    /* 1 */ val browse: typings.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.browse & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.none & Double = js.native
    
    /* 2 */ val triggered: typings.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.triggered & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Proximity.PeerFinder")
  @js.native
  class PeerFinder ()
    extends StObject
       with typings.winrt.Windows.Networking.Proximity.PeerFinder
  /* static members */
  object PeerFinder {
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.allowBluetooth")
    @js.native
    def allowBluetooth: Boolean = js.native
    @scala.inline
    def allowBluetooth_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowBluetooth")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.allowInfrastructure")
    @js.native
    def allowInfrastructure: Boolean = js.native
    @scala.inline
    def allowInfrastructure_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowInfrastructure")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.allowWiFiDirect")
    @js.native
    def allowWiFiDirect: Boolean = js.native
    @scala.inline
    def allowWiFiDirect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowWiFiDirect")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.alternateIdentities")
    @js.native
    def alternateIdentities: IMap[String, String] = js.native
    @scala.inline
    def alternateIdentities_=(x: IMap[String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alternateIdentities")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def connectAsync(peerInformation: typings.winrt.Windows.Networking.Proximity.PeerInformation): IAsyncOperation[StreamSocket] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectAsync")(peerInformation.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[StreamSocket]]
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def findAllPeersAsync(): IAsyncOperation[IVectorView[typings.winrt.Windows.Networking.Proximity.PeerInformation]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllPeersAsync")().asInstanceOf[IAsyncOperation[IVectorView[typings.winrt.Windows.Networking.Proximity.PeerInformation]]]
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.onconnectionrequested")
    @js.native
    def onconnectionrequested: js.Any = js.native
    @scala.inline
    def onconnectionrequested_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onconnectionrequested")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.ontriggeredconnectionstatechanged")
    @js.native
    def ontriggeredconnectionstatechanged: js.Any = js.native
    @scala.inline
    def ontriggeredconnectionstatechanged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ontriggeredconnectionstatechanged")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
    @scala.inline
    def start(peerMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(peerMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.supportedDiscoveryTypes")
    @js.native
    def supportedDiscoveryTypes: PeerDiscoveryTypes = js.native
    @scala.inline
    def supportedDiscoveryTypes_=(x: PeerDiscoveryTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedDiscoveryTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Networking.Proximity.PeerInformation")
  @js.native
  class PeerInformation ()
    extends StObject
       with typings.winrt.Windows.Networking.Proximity.PeerInformation {
    
    /* CompleteClass */
    var displayName: String = js.native
  }
  
  @JSGlobal("Windows.Networking.Proximity.ProximityDevice")
  @js.native
  class ProximityDevice ()
    extends StObject
       with typings.winrt.Windows.Networking.Proximity.ProximityDevice
  /* static members */
  object ProximityDevice {
    
    @JSGlobal("Windows.Networking.Proximity.ProximityDevice")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromId(deviceInterfaceId: String): typings.winrt.Windows.Networking.Proximity.ProximityDevice = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(deviceInterfaceId.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Networking.Proximity.ProximityDevice]
    
    @scala.inline
    def getDefault(): typings.winrt.Windows.Networking.Proximity.ProximityDevice = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrt.Windows.Networking.Proximity.ProximityDevice]
    
    @scala.inline
    def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  }
  
  @JSGlobal("Windows.Networking.Proximity.ProximityMessage")
  @js.native
  class ProximityMessage ()
    extends StObject
       with typings.winrt.Windows.Networking.Proximity.ProximityMessage {
    
    /* CompleteClass */
    var data: IBuffer = js.native
    
    /* CompleteClass */
    var dataAsString: String = js.native
    
    /* CompleteClass */
    var messageType: String = js.native
    
    /* CompleteClass */
    var subscriptionId: Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Proximity.TriggeredConnectState")
  @js.native
  object TriggeredConnectState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Proximity.TriggeredConnectState & Double] = js.native
    
    /* 4 */ val canceled: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.canceled & Double = js.native
    
    /* 3 */ val completed: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.completed & Double = js.native
    
    /* 2 */ val connecting: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.connecting & Double = js.native
    
    /* 5 */ val failed: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.failed & Double = js.native
    
    /* 1 */ val listening: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.listening & Double = js.native
    
    /* 0 */ val peerFound: typings.winrt.Windows.Networking.Proximity.TriggeredConnectState.peerFound & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs")
  @js.native
  class TriggeredConnectionStateChangedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs {
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var socket: StreamSocket = js.native
    
    /* CompleteClass */
    var state: TriggeredConnectState = js.native
  }
}
