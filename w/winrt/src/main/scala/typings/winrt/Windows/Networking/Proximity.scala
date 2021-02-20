package typings.winrt.Windows.Networking

import typings.winrt.Windows.Foundation.Collections.IMap
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Networking.Sockets.StreamSocket
import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Proximity {
  
  @js.native
  sealed trait PeerDiscoveryTypes extends StObject
  @JSGlobal("Windows.Networking.Proximity.PeerDiscoveryTypes")
  @js.native
  object PeerDiscoveryTypes extends StObject {
    
    @js.native
    sealed trait browse extends PeerDiscoveryTypes
    
    @js.native
    sealed trait none extends PeerDiscoveryTypes
    
    @js.native
    sealed trait triggered extends PeerDiscoveryTypes
  }
  
  @js.native
  sealed trait TriggeredConnectState extends StObject
  @JSGlobal("Windows.Networking.Proximity.TriggeredConnectState")
  @js.native
  object TriggeredConnectState extends StObject {
    
    @js.native
    sealed trait canceled extends TriggeredConnectState
    
    @js.native
    sealed trait completed extends TriggeredConnectState
    
    @js.native
    sealed trait connecting extends TriggeredConnectState
    
    @js.native
    sealed trait failed extends TriggeredConnectState
    
    @js.native
    sealed trait listening extends TriggeredConnectState
    
    @js.native
    sealed trait peerFound extends TriggeredConnectState
  }
  
  @js.native
  trait ConnectionRequestedEventArgs extends IConnectionRequestedEventArgs
  object ConnectionRequestedEventArgs {
    
    @scala.inline
    def apply(peerInformation: PeerInformation): ConnectionRequestedEventArgs = {
      val __obj = js.Dynamic.literal(peerInformation = peerInformation.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionRequestedEventArgs]
    }
  }
  
  type DeviceArrivedEventHandler = js.Function1[/* sender */ ProximityDevice, Unit]
  
  type DeviceDepartedEventHandler = js.Function1[/* sender */ ProximityDevice, Unit]
  
  @js.native
  trait IConnectionRequestedEventArgs extends StObject {
    
    var peerInformation: PeerInformation = js.native
  }
  object IConnectionRequestedEventArgs {
    
    @scala.inline
    def apply(peerInformation: PeerInformation): IConnectionRequestedEventArgs = {
      val __obj = js.Dynamic.literal(peerInformation = peerInformation.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConnectionRequestedEventArgs]
    }
    
    @scala.inline
    implicit class IConnectionRequestedEventArgsMutableBuilder[Self <: IConnectionRequestedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPeerInformation(value: PeerInformation): Self = StObject.set(x, "peerInformation", value.asInstanceOf[js.Any])
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
    
    var onconnectionrequested: js.Any = js.native
    
    var ontriggeredconnectionstatechanged: js.Any = js.native
    
    def start(): Unit = js.native
    def start(peerMessage: String): Unit = js.native
    
    def stop(): Unit = js.native
    
    var supportedDiscoveryTypes: PeerDiscoveryTypes = js.native
  }
  
  @js.native
  trait IPeerInformation extends StObject {
    
    var displayName: String = js.native
  }
  object IPeerInformation {
    
    @scala.inline
    def apply(displayName: String): IPeerInformation = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPeerInformation]
    }
    
    @scala.inline
    implicit class IPeerInformationMutableBuilder[Self <: IPeerInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IProximityDevice extends StObject {
    
    var bitsPerSecond: Double = js.native
    
    var deviceId: String = js.native
    
    var maxMessageBytes: Double = js.native
    
    var ondevicearrived: js.Any = js.native
    
    var ondevicedeparted: js.Any = js.native
    
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
  
  @js.native
  trait IProximityDeviceStatics extends StObject {
    
    def fromId(deviceInterfaceId: String): ProximityDevice = js.native
    
    def getDefault(): ProximityDevice = js.native
    
    def getDeviceSelector(): String = js.native
  }
  object IProximityDeviceStatics {
    
    @scala.inline
    def apply(
      fromId: String => ProximityDevice,
      getDefault: () => ProximityDevice,
      getDeviceSelector: () => String
    ): IProximityDeviceStatics = {
      val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDefault = js.Any.fromFunction0(getDefault), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
      __obj.asInstanceOf[IProximityDeviceStatics]
    }
    
    @scala.inline
    implicit class IProximityDeviceStaticsMutableBuilder[Self <: IProximityDeviceStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromId(value: String => ProximityDevice): Self = StObject.set(x, "fromId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDefault(value: () => ProximityDevice): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDeviceSelector(value: () => String): Self = StObject.set(x, "getDeviceSelector", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IProximityMessage extends StObject {
    
    var data: IBuffer = js.native
    
    var dataAsString: String = js.native
    
    var messageType: String = js.native
    
    var subscriptionId: Double = js.native
  }
  object IProximityMessage {
    
    @scala.inline
    def apply(data: IBuffer, dataAsString: String, messageType: String, subscriptionId: Double): IProximityMessage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataAsString = dataAsString.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProximityMessage]
    }
    
    @scala.inline
    implicit class IProximityMessageMutableBuilder[Self <: IProximityMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataAsString(value: String): Self = StObject.set(x, "dataAsString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionId(value: Double): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITriggeredConnectionStateChangedEventArgs extends StObject {
    
    var id: Double = js.native
    
    var socket: StreamSocket = js.native
    
    var state: TriggeredConnectState = js.native
  }
  object ITriggeredConnectionStateChangedEventArgs {
    
    @scala.inline
    def apply(id: Double, socket: StreamSocket, state: TriggeredConnectState): ITriggeredConnectionStateChangedEventArgs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITriggeredConnectionStateChangedEventArgs]
    }
    
    @scala.inline
    implicit class ITriggeredConnectionStateChangedEventArgsMutableBuilder[Self <: ITriggeredConnectionStateChangedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocket(value: StreamSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: TriggeredConnectState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageReceivedHandler = js.Function2[/* sender */ ProximityDevice, /* message */ ProximityMessage, Unit]
  
  type MessageTransmittedHandler = js.Function2[/* sender */ ProximityDevice, /* messageId */ Double, Unit]
  
  @js.native
  trait PeerFinder extends StObject
  
  @js.native
  trait PeerInformation extends IPeerInformation
  object PeerInformation {
    
    @scala.inline
    def apply(displayName: String): PeerInformation = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerInformation]
    }
  }
  
  @js.native
  trait ProximityDevice extends IProximityDevice
  
  @js.native
  trait ProximityMessage extends IProximityMessage
  object ProximityMessage {
    
    @scala.inline
    def apply(data: IBuffer, dataAsString: String, messageType: String, subscriptionId: Double): ProximityMessage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataAsString = dataAsString.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProximityMessage]
    }
  }
  
  @js.native
  trait TriggeredConnectionStateChangedEventArgs extends ITriggeredConnectionStateChangedEventArgs
  object TriggeredConnectionStateChangedEventArgs {
    
    @scala.inline
    def apply(id: Double, socket: StreamSocket, state: TriggeredConnectState): TriggeredConnectionStateChangedEventArgs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggeredConnectionStateChangedEventArgs]
    }
  }
}
