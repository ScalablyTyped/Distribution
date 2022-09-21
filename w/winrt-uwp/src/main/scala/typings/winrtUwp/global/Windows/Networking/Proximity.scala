package typings.winrtUwp.global.Windows.Networking

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Networking.Proximity.PeerDiscoveryTypes
import typings.winrtUwp.Windows.Networking.Proximity.PeerRole
import typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState
import typings.winrtUwp.Windows.Networking.Sockets.StreamSocket
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.winrtUwpStrings.connectionrequested
import typings.winrtUwp.winrtUwpStrings.triggeredconnectionstatechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes that support connections between devices that are within close range. */
object Proximity {
  
  /** Contains properties that are passed to an application with the ConnectionRequested event. */
  @JSGlobal("Windows.Networking.Proximity.ConnectionRequestedEventArgs")
  @js.native
  abstract class ConnectionRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs {
    
    /** Gets the information for a peer that's requesting a connection. */
    /* CompleteClass */
    var peerInformation: typings.winrtUwp.Windows.Networking.Proximity.PeerInformation = js.native
  }
  
  /** Indicates which discovery options are available to use with the PeerFinder class. */
  @JSGlobal("Windows.Networking.Proximity.PeerDiscoveryTypes")
  @js.native
  object PeerDiscoveryTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Proximity.PeerDiscoveryTypes & Double] = js.native
    
    /* 1 */ val browse: typings.winrtUwp.Windows.Networking.Proximity.PeerDiscoveryTypes.browse & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Proximity.PeerDiscoveryTypes.none & Double = js.native
    
    /* 2 */ val triggered: typings.winrtUwp.Windows.Networking.Proximity.PeerDiscoveryTypes.triggered & Double = js.native
  }
  
  /** Enables you to discover other instances of your app on nearby devices and create a socket connection between the peer apps by using a tap gesture or by browsing. For creating Bluetooth socket connections on Windows 8.1 and later, use Windows.Devices.Bluetooth.Rfcomm instead. */
  @JSGlobal("Windows.Networking.Proximity.PeerFinder")
  @js.native
  abstract class PeerFinder ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Proximity.PeerFinder
  object PeerFinder {
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_connectionrequested(
      `type`: connectionrequested,
      listener: TypedEventHandler[Any, typings.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_triggeredconnectionstatechanged(
      `type`: triggeredconnectionstatechanged,
      listener: TypedEventHandler[
          Any, 
          typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Specifies whether the PeerFinder class may connect a StreamSocket object by using Bluetooth. */
    /* static member */
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.allowBluetooth")
    @js.native
    def allowBluetooth: Boolean = js.native
    inline def allowBluetooth_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowBluetooth")(x.asInstanceOf[js.Any])
    
    /** Specifies whether the PeerFinder class may connect to a StreamSocket object using TCP/IP. */
    /* static member */
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.allowInfrastructure")
    @js.native
    def allowInfrastructure: Boolean = js.native
    inline def allowInfrastructure_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowInfrastructure")(x.asInstanceOf[js.Any])
    
    /** Specifies whether the PeerFinder class may connect a StreamSocket object by using Wi-Fi Direct. */
    /* static member */
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.allowWiFiDirect")
    @js.native
    def allowWiFiDirect: Boolean = js.native
    inline def allowWiFiDirect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowWiFiDirect")(x.asInstanceOf[js.Any])
    
    /** Gets a list of alternate appId values to match with peer applications on other platforms. */
    /* static member */
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.alternateIdentities")
    @js.native
    def alternateIdentities: IMap[String, String] = js.native
    inline def alternateIdentities_=(x: IMap[String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alternateIdentities")(x.asInstanceOf[js.Any])
    
    /**
      * Connects to a peer discovered by a call to the FindAllPeersAsync method.
      * @param peerInformation A peer information object representing the peer to connect to.
      * @return An asynchronous operation for connecting to a remote peer using the supplied StreamSocket object.
      */
    /* static member */
    inline def connectAsync(peerInformation: typings.winrtUwp.Windows.Networking.Proximity.PeerInformation): IPromiseWithIAsyncOperation[StreamSocket] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectAsync")(peerInformation.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[StreamSocket]]
    
    /**
      * Creates a new instance of a PeerWatcher object for dynamic discovery of peer apps.
      * @return An instance of a PeerWatcher object for dynamic discovery of peer apps.
      */
    /* static member */
    inline def createWatcher(): typings.winrtUwp.Windows.Networking.Proximity.PeerWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")().asInstanceOf[typings.winrtUwp.Windows.Networking.Proximity.PeerWatcher]
    
    /** Gets or sets user or device data to include during device discovery. */
    /* static member */
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.discoveryData")
    @js.native
    def discoveryData: IBuffer = js.native
    inline def discoveryData_=(x: IBuffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("discoveryData")(x.asInstanceOf[js.Any])
    
    /** Gets or sets the name that identifies your computer to remote peers. */
    /* static member */
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /**
      * Asynchronously browses for peer devices that are running the same app within wireless range.
      * @return The asynchronous operation for browsing for peer devices that are running your app.
      */
    /* static member */
    inline def findAllPeersAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllPeersAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
    
    /** Occurs when a remote peer requests a connection using the ConnectAsync method. */
    /* static member */
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.onconnectionrequested")
    @js.native
    def onconnectionrequested: TypedEventHandler[Any, typings.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs] = js.native
    inline def onconnectionrequested_=(
      x: TypedEventHandler[Any, typings.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onconnectionrequested")(x.asInstanceOf[js.Any])
    
    /** Occurs during a tap gesture from a remote peer. */
    /* static member */
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.ontriggeredconnectionstatechanged")
    @js.native
    def ontriggeredconnectionstatechanged: TypedEventHandler[
        Any, 
        typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs
      ] = js.native
    inline def ontriggeredconnectionstatechanged_=(
      x: TypedEventHandler[
          Any, 
          typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ontriggeredconnectionstatechanged")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_connectionrequested(
      `type`: connectionrequested,
      listener: TypedEventHandler[Any, typings.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_triggeredconnectionstatechanged(
      `type`: triggeredconnectionstatechanged,
      listener: TypedEventHandler[
          Any, 
          typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Gets or sets the role of the app in peer-to-peer connections. */
    /* static member */
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.role")
    @js.native
    def role: PeerRole = js.native
    inline def role_=(x: PeerRole): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    /** Makes an app discoverable to remote peers. */
    /* static member */
    inline def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
    /**
      * Makes an app discoverable to remote peers.
      * @param peerMessage The message to deliver to the proximate device.
      */
    /* static member */
    inline def start(peerMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(peerMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Stops advertising for a peer connection. */
    /* static member */
    inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
    
    /** Gets a value that indicates which discovery options are available to use with the PeerFinder class. */
    /* static member */
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.supportedDiscoveryTypes")
    @js.native
    def supportedDiscoveryTypes: PeerDiscoveryTypes = js.native
    inline def supportedDiscoveryTypes_=(x: PeerDiscoveryTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedDiscoveryTypes")(x.asInstanceOf[js.Any])
  }
  
  /** Contains information that identifies a peer. */
  @JSGlobal("Windows.Networking.Proximity.PeerInformation")
  @js.native
  abstract class PeerInformation ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Proximity.PeerInformation {
    
    /** Gets the device data included during device discovery. */
    /* CompleteClass */
    var discoveryData: IBuffer = js.native
    
    /** Gets the display name of the peer. */
    /* CompleteClass */
    var displayName: String = js.native
    
    /** Gets the hostname or IP address of the peer. */
    /* CompleteClass */
    var hostName: typings.winrtUwp.Windows.Networking.HostName = js.native
    
    /** Gets the app id for the peer app. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Gets the service name or TCP port number of the peer. */
    /* CompleteClass */
    var serviceName: String = js.native
  }
  
  /** Describes the role of the peer app when connected to multiple peers. */
  @JSGlobal("Windows.Networking.Proximity.PeerRole")
  @js.native
  object PeerRole extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Proximity.PeerRole & Double] = js.native
    
    /* 2 */ val client: typings.winrtUwp.Windows.Networking.Proximity.PeerRole.client & Double = js.native
    
    /* 1 */ val host: typings.winrtUwp.Windows.Networking.Proximity.PeerRole.host & Double = js.native
    
    /* 0 */ val peer: typings.winrtUwp.Windows.Networking.Proximity.PeerRole.peer & Double = js.native
  }
  
  /** Dynamically discovers peer apps within wireless range. */
  @JSGlobal("Windows.Networking.Proximity.PeerWatcher")
  @js.native
  abstract class PeerWatcher ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Proximity.PeerWatcher
  
  /** Describes the status of a PeerWatcher object. */
  @JSGlobal("Windows.Networking.Proximity.PeerWatcherStatus")
  @js.native
  object PeerWatcherStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus & Double] = js.native
    
    /* 5 */ val aborted: typings.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.aborted & Double = js.native
    
    /* 0 */ val created: typings.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.created & Double = js.native
    
    /* 2 */ val enumerationCompleted: typings.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.enumerationCompleted & Double = js.native
    
    /* 1 */ val started: typings.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.started & Double = js.native
    
    /* 4 */ val stopped: typings.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.stopped & Double = js.native
    
    /* 3 */ val stopping: typings.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.stopping & Double = js.native
  }
  
  /** Enables you to publish messages to proximate devices or subscribe to messages from proximate devices. */
  @JSGlobal("Windows.Networking.Proximity.ProximityDevice")
  @js.native
  abstract class ProximityDevice ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Proximity.ProximityDevice
  object ProximityDevice {
    
    @JSGlobal("Windows.Networking.Proximity.ProximityDevice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of a ProximityDevice class and activates the specified proximity device interface.
      * @param deviceId The DeviceInformation Id of a proximity device.
      * @return A new ProximityDevice that uses the specified proximity device interface. Throws a System.IO.FileNotFoundException exception if the specified proximity device interface isunavailable.
      */
    /* static member */
    inline def fromId(deviceId: String): typings.winrtUwp.Windows.Networking.Proximity.ProximityDevice = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(deviceId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Networking.Proximity.ProximityDevice]
    
    /**
      * Creates an instance of a ProximityDevice class and activates the default proximity provider.
      * @return A new proximity device that uses the default proximity provider. Returns NULL if no proximity devices are installed.
      */
    /* static member */
    inline def getDefault(): typings.winrtUwp.Windows.Networking.Proximity.ProximityDevice = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.winrtUwp.Windows.Networking.Proximity.ProximityDevice]
    
    /**
      * Returns the class selection string that you can use to enumerate proximity devices.
      * @return The class selection string for proximity devices.
      */
    /* static member */
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  }
  
  /** Represents a message that's received from a subscription. */
  @JSGlobal("Windows.Networking.Proximity.ProximityMessage")
  @js.native
  abstract class ProximityMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Proximity.ProximityMessage {
    
    /** Gets the binary data of the message. */
    /* CompleteClass */
    var data: IBuffer = js.native
    
    /** Gets the message data as text. */
    /* CompleteClass */
    var dataAsString: String = js.native
    
    /** Gets the type of the message. */
    /* CompleteClass */
    var messageType: String = js.native
    
    /** Gets the subscription ID of the message. */
    /* CompleteClass */
    var subscriptionId: Double = js.native
  }
  
  /** Indicates the current state of a connection to a peer application. */
  @JSGlobal("Windows.Networking.Proximity.TriggeredConnectState")
  @js.native
  object TriggeredConnectState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState & Double] = js.native
    
    /* 4 */ val canceled: typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.canceled & Double = js.native
    
    /* 3 */ val completed: typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.completed & Double = js.native
    
    /* 2 */ val connecting: typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.connecting & Double = js.native
    
    /* 5 */ val failed: typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.failed & Double = js.native
    
    /* 1 */ val listening: typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.listening & Double = js.native
    
    /* 0 */ val peerFound: typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.peerFound & Double = js.native
  }
  
  /** Contains properties that the TriggeredConnectionStateChanged event passes to an application. */
  @JSGlobal("Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs")
  @js.native
  abstract class TriggeredConnectionStateChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs {
    
    /** Gets the unique identifier for the connection in progress. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Gets the StreamSocket instance for the connection. */
    /* CompleteClass */
    var socket: StreamSocket = js.native
    
    /** Gets the state of the connection in progress. */
    /* CompleteClass */
    var state: TriggeredConnectState = js.native
  }
}
