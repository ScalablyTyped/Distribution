package typings.winrt.Windows.Networking

import typings.winrt.Windows.Foundation.Collections.IMap
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Networking.Sockets.StreamSocket
import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Proximity {
  
  @js.native
  sealed trait PeerDiscoveryTypes extends StObject
  @JSGlobal("Windows.Networking.Proximity.PeerDiscoveryTypes")
  @js.native
  object PeerDiscoveryTypes extends StObject {
    
    @js.native
    sealed trait browse
      extends StObject
         with PeerDiscoveryTypes
    
    @js.native
    sealed trait none
      extends StObject
         with PeerDiscoveryTypes
    
    @js.native
    sealed trait triggered
      extends StObject
         with PeerDiscoveryTypes
  }
  
  @js.native
  sealed trait TriggeredConnectState extends StObject
  @JSGlobal("Windows.Networking.Proximity.TriggeredConnectState")
  @js.native
  object TriggeredConnectState extends StObject {
    
    @js.native
    sealed trait canceled
      extends StObject
         with TriggeredConnectState
    
    @js.native
    sealed trait completed
      extends StObject
         with TriggeredConnectState
    
    @js.native
    sealed trait connecting
      extends StObject
         with TriggeredConnectState
    
    @js.native
    sealed trait failed
      extends StObject
         with TriggeredConnectState
    
    @js.native
    sealed trait listening
      extends StObject
         with TriggeredConnectState
    
    @js.native
    sealed trait peerFound
      extends StObject
         with TriggeredConnectState
  }
  
  trait ConnectionRequestedEventArgs
    extends StObject
       with IConnectionRequestedEventArgs
  object ConnectionRequestedEventArgs {
    
    inline def apply(peerInformation: PeerInformation): ConnectionRequestedEventArgs = {
      val __obj = js.Dynamic.literal(peerInformation = peerInformation.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionRequestedEventArgs]
    }
  }
  
  type DeviceArrivedEventHandler = js.Function1[/* sender */ ProximityDevice, Unit]
  
  type DeviceDepartedEventHandler = js.Function1[/* sender */ ProximityDevice, Unit]
  
  trait IConnectionRequestedEventArgs extends StObject {
    
    var peerInformation: PeerInformation
  }
  object IConnectionRequestedEventArgs {
    
    inline def apply(peerInformation: PeerInformation): IConnectionRequestedEventArgs = {
      val __obj = js.Dynamic.literal(peerInformation = peerInformation.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConnectionRequestedEventArgs]
    }
    
    extension [Self <: IConnectionRequestedEventArgs](x: Self) {
      
      inline def setPeerInformation(value: PeerInformation): Self = StObject.set(x, "peerInformation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPeerFinderStatics extends StObject {
    
    var allowBluetooth: Boolean = js.native
    
    var allowInfrastructure: Boolean = js.native
    
    var allowWiFiDirect: Boolean = js.native
    
    var alternateIdentities: IMap[String, String] = js.native
    
    def connectAsync(peerInformation: PeerInformation): IAsyncOperation[StreamSocket] = js.native
    
    var displayName: String = js.native
    
    def findAllPeersAsync(): IAsyncOperation[IVectorView[PeerInformation]] = js.native
    
    var onconnectionrequested: Any = js.native
    
    var ontriggeredconnectionstatechanged: Any = js.native
    
    def start(): Unit = js.native
    def start(peerMessage: String): Unit = js.native
    
    def stop(): Unit = js.native
    
    var supportedDiscoveryTypes: PeerDiscoveryTypes = js.native
  }
  
  trait IPeerInformation extends StObject {
    
    var displayName: String
  }
  object IPeerInformation {
    
    inline def apply(displayName: String): IPeerInformation = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPeerInformation]
    }
    
    extension [Self <: IPeerInformation](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IProximityDevice extends StObject {
    
    var bitsPerSecond: Double = js.native
    
    var deviceId: String = js.native
    
    var maxMessageBytes: Double = js.native
    
    var ondevicearrived: Any = js.native
    
    var ondevicedeparted: Any = js.native
    
    def publishBinaryMessage(messageType: String, message: IBuffer): Double = js.native
    def publishBinaryMessage(messageType: String, message: IBuffer, messageTransmittedHandler: MessageTransmittedHandler): Double = js.native
    
    def publishMessage(messageType: String, message: String): Double = js.native
    def publishMessage(messageType: String, message: String, messageTransmittedHandler: MessageTransmittedHandler): Double = js.native
    
    def publishUriMessage(message: Uri): Double = js.native
    def publishUriMessage(message: Uri, messageTransmittedHandler: MessageTransmittedHandler): Double = js.native
    
    def stopPublishingMessage(messageId: Double): Unit = js.native
    
    def stopSubscribingForMessage(subscriptionId: Double): Unit = js.native
    
    def subscribeForMessage(messageType: String, messageReceivedHandler: MessageReceivedHandler): Double = js.native
  }
  
  trait IProximityDeviceStatics extends StObject {
    
    def fromId(deviceInterfaceId: String): ProximityDevice
    
    def getDefault(): ProximityDevice
    
    def getDeviceSelector(): String
  }
  object IProximityDeviceStatics {
    
    inline def apply(
      fromId: String => ProximityDevice,
      getDefault: () => ProximityDevice,
      getDeviceSelector: () => String
    ): IProximityDeviceStatics = {
      val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDefault = js.Any.fromFunction0(getDefault), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
      __obj.asInstanceOf[IProximityDeviceStatics]
    }
    
    extension [Self <: IProximityDeviceStatics](x: Self) {
      
      inline def setFromId(value: String => ProximityDevice): Self = StObject.set(x, "fromId", js.Any.fromFunction1(value))
      
      inline def setGetDefault(value: () => ProximityDevice): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
      
      inline def setGetDeviceSelector(value: () => String): Self = StObject.set(x, "getDeviceSelector", js.Any.fromFunction0(value))
    }
  }
  
  trait IProximityMessage extends StObject {
    
    var data: IBuffer
    
    var dataAsString: String
    
    var messageType: String
    
    var subscriptionId: Double
  }
  object IProximityMessage {
    
    inline def apply(data: IBuffer, dataAsString: String, messageType: String, subscriptionId: Double): IProximityMessage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataAsString = dataAsString.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProximityMessage]
    }
    
    extension [Self <: IProximityMessage](x: Self) {
      
      inline def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataAsString(value: String): Self = StObject.set(x, "dataAsString", value.asInstanceOf[js.Any])
      
      inline def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionId(value: Double): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITriggeredConnectionStateChangedEventArgs extends StObject {
    
    var id: Double
    
    var socket: StreamSocket
    
    var state: TriggeredConnectState
  }
  object ITriggeredConnectionStateChangedEventArgs {
    
    inline def apply(id: Double, socket: StreamSocket, state: TriggeredConnectState): ITriggeredConnectionStateChangedEventArgs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITriggeredConnectionStateChangedEventArgs]
    }
    
    extension [Self <: ITriggeredConnectionStateChangedEventArgs](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSocket(value: StreamSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setState(value: TriggeredConnectState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageReceivedHandler = js.Function2[/* sender */ ProximityDevice, /* message */ ProximityMessage, Unit]
  
  type MessageTransmittedHandler = js.Function2[/* sender */ ProximityDevice, /* messageId */ Double, Unit]
  
  trait PeerFinder extends StObject
  
  trait PeerInformation
    extends StObject
       with IPeerInformation
  object PeerInformation {
    
    inline def apply(displayName: String): PeerInformation = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerInformation]
    }
  }
  
  @js.native
  trait ProximityDevice
    extends StObject
       with IProximityDevice
  
  trait ProximityMessage
    extends StObject
       with IProximityMessage
  object ProximityMessage {
    
    inline def apply(data: IBuffer, dataAsString: String, messageType: String, subscriptionId: Double): ProximityMessage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataAsString = dataAsString.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProximityMessage]
    }
  }
  
  trait TriggeredConnectionStateChangedEventArgs
    extends StObject
       with ITriggeredConnectionStateChangedEventArgs
  object TriggeredConnectionStateChangedEventArgs {
    
    inline def apply(id: Double, socket: StreamSocket, state: TriggeredConnectState): TriggeredConnectionStateChangedEventArgs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggeredConnectionStateChangedEventArgs]
    }
  }
}
