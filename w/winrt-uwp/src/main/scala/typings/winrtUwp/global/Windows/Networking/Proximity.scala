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
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.connectionrequested
import typings.winrtUwp.winrtUwpStrings.triggeredconnectionstatechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains classes that support connections between devices that are within close range. */
@JSGlobal("Windows.Networking.Proximity")
@js.native
object Proximity extends js.Object {
  /** Contains properties that are passed to an application with the ConnectionRequested event. */
  @js.native
  abstract class ConnectionRequestedEventArgs ()
    extends typings.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs {
    /** Gets the information for a peer that's requesting a connection. */
    /* CompleteClass */
    override var peerInformation: typings.winrtUwp.Windows.Networking.Proximity.PeerInformation = js.native
  }
  
  /** Enables you to discover other instances of your app on nearby devices and create a socket connection between the peer apps by using a tap gesture or by browsing. For creating Bluetooth socket connections on Windows 8.1 and later, use Windows.Devices.Bluetooth.Rfcomm instead. */
  @js.native
  abstract class PeerFinder ()
    extends typings.winrtUwp.Windows.Networking.Proximity.PeerFinder
  
  /** Contains information that identifies a peer. */
  @js.native
  abstract class PeerInformation ()
    extends typings.winrtUwp.Windows.Networking.Proximity.PeerInformation {
    /** Gets the device data included during device discovery. */
    /* CompleteClass */
    override var discoveryData: IBuffer = js.native
    /** Gets the display name of the peer. */
    /* CompleteClass */
    override var displayName: String = js.native
    /** Gets the hostname or IP address of the peer. */
    /* CompleteClass */
    override var hostName: typings.winrtUwp.Windows.Networking.HostName = js.native
    /** Gets the app id for the peer app. */
    /* CompleteClass */
    override var id: String = js.native
    /** Gets the service name or TCP port number of the peer. */
    /* CompleteClass */
    override var serviceName: String = js.native
  }
  
  /** Dynamically discovers peer apps within wireless range. */
  @js.native
  abstract class PeerWatcher ()
    extends typings.winrtUwp.Windows.Networking.Proximity.PeerWatcher
  
  /** Enables you to publish messages to proximate devices or subscribe to messages from proximate devices. */
  @js.native
  abstract class ProximityDevice ()
    extends typings.winrtUwp.Windows.Networking.Proximity.ProximityDevice
  
  /** Represents a message that's received from a subscription. */
  @js.native
  abstract class ProximityMessage ()
    extends typings.winrtUwp.Windows.Networking.Proximity.ProximityMessage {
    /** Gets the binary data of the message. */
    /* CompleteClass */
    override var data: IBuffer = js.native
    /** Gets the message data as text. */
    /* CompleteClass */
    override var dataAsString: String = js.native
    /** Gets the type of the message. */
    /* CompleteClass */
    override var messageType: String = js.native
    /** Gets the subscription ID of the message. */
    /* CompleteClass */
    override var subscriptionId: Double = js.native
  }
  
  /** Contains properties that the TriggeredConnectionStateChanged event passes to an application. */
  @js.native
  abstract class TriggeredConnectionStateChangedEventArgs ()
    extends typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs {
    /** Gets the unique identifier for the connection in progress. */
    /* CompleteClass */
    override var id: Double = js.native
    /** Gets the StreamSocket instance for the connection. */
    /* CompleteClass */
    override var socket: StreamSocket = js.native
    /** Gets the state of the connection in progress. */
    /* CompleteClass */
    override var state: TriggeredConnectState = js.native
  }
  
  /** Indicates which discovery options are available to use with the PeerFinder class. */
  @js.native
  object PeerDiscoveryTypes extends js.Object {
    /* 1 */ val browse: typings.winrtUwp.Windows.Networking.Proximity.PeerDiscoveryTypes.browse with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Proximity.PeerDiscoveryTypes.none with Double = js.native
    /* 2 */ val triggered: typings.winrtUwp.Windows.Networking.Proximity.PeerDiscoveryTypes.triggered with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Proximity.PeerDiscoveryTypes with Double] = js.native
  }
  
  /* static members */
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
    var onconnectionrequested_Original: TypedEventHandler[_, typings.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs] = js.native
    /** Occurs during a tap gesture from a remote peer. */
    @JSName("ontriggeredconnectionstatechanged")
    var ontriggeredconnectionstatechanged_Original: TypedEventHandler[
        _, 
        typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs
      ] = js.native
    /** Gets or sets the role of the app in peer-to-peer connections. */
    var role: PeerRole = js.native
    /** Gets a value that indicates which discovery options are available to use with the PeerFinder class. */
    var supportedDiscoveryTypes: PeerDiscoveryTypes = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_connectionrequested(
      `type`: connectionrequested,
      listener: TypedEventHandler[_, typings.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_triggeredconnectionstatechanged(
      `type`: triggeredconnectionstatechanged,
      listener: TypedEventHandler[
          _, 
          typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs
        ]
    ): Unit = js.native
    /**
      * Connects to a peer discovered by a call to the FindAllPeersAsync method.
      * @param peerInformation A peer information object representing the peer to connect to.
      * @return An asynchronous operation for connecting to a remote peer using the supplied StreamSocket object.
      */
    def connectAsync(peerInformation: typings.winrtUwp.Windows.Networking.Proximity.PeerInformation): IPromiseWithIAsyncOperation[StreamSocket] = js.native
    /**
      * Creates a new instance of a PeerWatcher object for dynamic discovery of peer apps.
      * @return An instance of a PeerWatcher object for dynamic discovery of peer apps.
      */
    def createWatcher(): typings.winrtUwp.Windows.Networking.Proximity.PeerWatcher = js.native
    /**
      * Asynchronously browses for peer devices that are running the same app within wireless range.
      * @return The asynchronous operation for browsing for peer devices that are running your app.
      */
    def findAllPeersAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /** Occurs when a remote peer requests a connection using the ConnectAsync method. */
    def onconnectionrequested(ev: typings.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs with WinRTEvent[_]): Unit = js.native
    /** Occurs during a tap gesture from a remote peer. */
    def ontriggeredconnectionstatechanged(
      ev: typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs with WinRTEvent[_]
    ): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_connectionrequested(
      `type`: connectionrequested,
      listener: TypedEventHandler[_, typings.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_triggeredconnectionstatechanged(
      `type`: triggeredconnectionstatechanged,
      listener: TypedEventHandler[
          _, 
          typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs
        ]
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
  
  /** Describes the role of the peer app when connected to multiple peers. */
  @js.native
  object PeerRole extends js.Object {
    /* 2 */ val client: typings.winrtUwp.Windows.Networking.Proximity.PeerRole.client with Double = js.native
    /* 1 */ val host: typings.winrtUwp.Windows.Networking.Proximity.PeerRole.host with Double = js.native
    /* 0 */ val peer: typings.winrtUwp.Windows.Networking.Proximity.PeerRole.peer with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Proximity.PeerRole with Double] = js.native
  }
  
  /** Describes the status of a PeerWatcher object. */
  @js.native
  object PeerWatcherStatus extends js.Object {
    /* 5 */ val aborted: typings.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.aborted with Double = js.native
    /* 0 */ val created: typings.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.created with Double = js.native
    /* 2 */ val enumerationCompleted: typings.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.enumerationCompleted with Double = js.native
    /* 1 */ val started: typings.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.started with Double = js.native
    /* 4 */ val stopped: typings.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.stopped with Double = js.native
    /* 3 */ val stopping: typings.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.stopping with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus with Double] = js.native
  }
  
  /* static members */
  @js.native
  object ProximityDevice extends js.Object {
    /**
      * Creates an instance of a ProximityDevice class and activates the specified proximity device interface.
      * @param deviceId The DeviceInformation Id of a proximity device.
      * @return A new ProximityDevice that uses the specified proximity device interface. Throws a System.IO.FileNotFoundException exception if the specified proximity device interface isunavailable.
      */
    def fromId(deviceId: String): typings.winrtUwp.Windows.Networking.Proximity.ProximityDevice = js.native
    /**
      * Creates an instance of a ProximityDevice class and activates the default proximity provider.
      * @return A new proximity device that uses the default proximity provider. Returns NULL if no proximity devices are installed.
      */
    def getDefault(): typings.winrtUwp.Windows.Networking.Proximity.ProximityDevice = js.native
    /**
      * Returns the class selection string that you can use to enumerate proximity devices.
      * @return The class selection string for proximity devices.
      */
    def getDeviceSelector(): String = js.native
  }
  
  /** Indicates the current state of a connection to a peer application. */
  @js.native
  object TriggeredConnectState extends js.Object {
    /* 4 */ val canceled: typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.canceled with Double = js.native
    /* 3 */ val completed: typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.completed with Double = js.native
    /* 2 */ val connecting: typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.connecting with Double = js.native
    /* 5 */ val failed: typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.failed with Double = js.native
    /* 1 */ val listening: typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.listening with Double = js.native
    /* 0 */ val peerFound: typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.peerFound with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState with Double] = js.native
  }
  
}

