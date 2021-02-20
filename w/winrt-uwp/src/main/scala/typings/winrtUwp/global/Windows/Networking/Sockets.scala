package typings.winrtUwp.global.Windows.Networking

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Web.WebErrorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides sockets and WebSockets classes to use for network communications and classes for real-time network notifications received in the background for Windows Store apps. */
object Sockets {
  
  /** Supports network communication using a UDP datagram socket. */
  @JSGlobal("Windows.Networking.Sockets.DatagramSocket")
  @js.native
  /** Creates a new DatagramSocket object. */
  class DatagramSocket ()
    extends typings.winrtUwp.Windows.Networking.Sockets.DatagramSocket
  object DatagramSocket {
    
    /**
      * Gets a list of EndpointPair objects based on a remote hostname and remote service name that can be used to send datagrams to a remote network destination.
      * @param remoteHostName The remote hostname or IP address.
      * @param remoteServiceName The remote service name or UDP port.
      * @return A list of EndpointPair objects.
      */
    /* static member */
    @JSGlobal("Windows.Networking.Sockets.DatagramSocket.getEndpointPairsAsync")
    @js.native
    def getEndpointPairsAsync(remoteHostName: typings.winrtUwp.Windows.Networking.HostName, remoteServiceName: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Gets a list of EndpointPair objects based on a remote hostname and remote service name and the sort order to be used.
      * @param remoteHostName The remote hostname or IP address.
      * @param remoteServiceName The remote service name or UDP port.
      * @param sortOptions The sort order to use when returning the list.
      * @return A list of EndpointPair objects.
      */
    /* static member */
    @JSGlobal("Windows.Networking.Sockets.DatagramSocket.getEndpointPairsAsync")
    @js.native
    def getEndpointPairsAsync(
      remoteHostName: typings.winrtUwp.Windows.Networking.HostName,
      remoteServiceName: String,
      sortOptions: typings.winrtUwp.Windows.Networking.HostNameSortOptions
    ): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  }
  
  /** Provides socket control data on a DatagramSocket object. */
  @JSGlobal("Windows.Networking.Sockets.DatagramSocketControl")
  @js.native
  abstract class DatagramSocketControl ()
    extends typings.winrtUwp.Windows.Networking.Sockets.DatagramSocketControl
  
  /** Provides socket information on a DatagramSocket object. */
  @JSGlobal("Windows.Networking.Sockets.DatagramSocketInformation")
  @js.native
  abstract class DatagramSocketInformation ()
    extends typings.winrtUwp.Windows.Networking.Sockets.DatagramSocketInformation
  
  /** Provides data for a MessageReceived event on a DatagramSocket . */
  @JSGlobal("Windows.Networking.Sockets.DatagramSocketMessageReceivedEventArgs")
  @js.native
  abstract class DatagramSocketMessageReceivedEventArgs ()
    extends typings.winrtUwp.Windows.Networking.Sockets.DatagramSocketMessageReceivedEventArgs
  
  /** Supports network communication that allows reading and writing whole messages using a WebSocket. */
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocket")
  @js.native
  /** Creates a new MessageWebSocket object. */
  class MessageWebSocket ()
    extends typings.winrtUwp.Windows.Networking.Sockets.MessageWebSocket
  
  /** Provides socket control data on a MessageWebSocket . */
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocketControl")
  @js.native
  abstract class MessageWebSocketControl ()
    extends typings.winrtUwp.Windows.Networking.Sockets.MessageWebSocketControl
  
  /** Provides socket information on a MessageWebSocket . */
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocketInformation")
  @js.native
  abstract class MessageWebSocketInformation ()
    extends typings.winrtUwp.Windows.Networking.Sockets.MessageWebSocketInformation
  
  /** Provides data for a message received event on a MessageWebSocket . */
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs")
  @js.native
  abstract class MessageWebSocketMessageReceivedEventArgs ()
    extends typings.winrtUwp.Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs
  
  /** Indicates whether an app that uses the socket brokering service can receive packets when the system goes to connected stand by. */
  @JSGlobal("Windows.Networking.Sockets.SocketActivityConnectedStandbyAction")
  @js.native
  object SocketActivityConnectedStandbyAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Sockets.SocketActivityConnectedStandbyAction with Double
      ] = js.native
    
    /* 0 */ val doNotWake: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityConnectedStandbyAction.doNotWake with Double = js.native
    
    /* 1 */ val wake: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityConnectedStandbyAction.wake with Double = js.native
  }
  
  /** The context associated with a socket while transferring ownership of the socket between an app and the socket brokering service. */
  @JSGlobal("Windows.Networking.Sockets.SocketActivityContext")
  @js.native
  class SocketActivityContext protected ()
    extends typings.winrtUwp.Windows.Networking.Sockets.SocketActivityContext {
    /**
      * Constructs a new SocketActivityContext object with given context data.
      * @param data Context data to be used when the socket broker notifies the app of socket activity.
      */
    def this(data: IBuffer) = this()
  }
  
  /** Provides information on the transferred socket from the Socket Broker. */
  @JSGlobal("Windows.Networking.Sockets.SocketActivityInformation")
  @js.native
  abstract class SocketActivityInformation ()
    extends typings.winrtUwp.Windows.Networking.Sockets.SocketActivityInformation
  object SocketActivityInformation {
    
    @JSGlobal("Windows.Networking.Sockets.SocketActivityInformation")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets a list of all the sockets transferred to the socket brokering service by this app. */
    /* static member */
    @JSGlobal("Windows.Networking.Sockets.SocketActivityInformation.allSockets")
    @js.native
    def allSockets: IMapView[String, typings.winrtUwp.Windows.Networking.Sockets.SocketActivityInformation] = js.native
    @scala.inline
    def allSockets_=(x: IMapView[String, typings.winrtUwp.Windows.Networking.Sockets.SocketActivityInformation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allSockets")(x.asInstanceOf[js.Any])
  }
  
  /** Describes the kind of socket object being transferred to or from the socket broker. */
  @JSGlobal("Windows.Networking.Sockets.SocketActivityKind")
  @js.native
  object SocketActivityKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind with Double] = js.native
    
    /* 2 */ val datagramSocket: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind.datagramSocket with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind.none with Double = js.native
    
    /* 3 */ val streamSocket: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind.streamSocket with Double = js.native
    
    /* 1 */ val streamSocketListener: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind.streamSocketListener with Double = js.native
  }
  
  /** A object instantiated by the background broker infrastructure and used by an app to retrieve details when a SocketActivityTrigger occurs. */
  @JSGlobal("Windows.Networking.Sockets.SocketActivityTriggerDetails")
  @js.native
  abstract class SocketActivityTriggerDetails ()
    extends typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerDetails
  
  /** The reason why a SocketActivityTrigger occurred. */
  @JSGlobal("Windows.Networking.Sockets.SocketActivityTriggerReason")
  @js.native
  object SocketActivityTriggerReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason with Double
      ] = js.native
    
    /* 2 */ val connectionAccepted: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.connectionAccepted with Double = js.native
    
    /* 3 */ val keepAliveTimerExpired: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.keepAliveTimerExpired with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.none with Double = js.native
    
    /* 1 */ val socketActivity: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.socketActivity with Double = js.native
    
    /* 4 */ val socketClosed: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.socketClosed with Double = js.native
  }
  
  /** Provides socket error status for operations on a DatagramSocket , StreamSocket , or StreamSocketListener . */
  @JSGlobal("Windows.Networking.Sockets.SocketError")
  @js.native
  abstract class SocketError ()
    extends typings.winrtUwp.Windows.Networking.Sockets.SocketError
  object SocketError {
    
    /**
      * Gets a SocketErrorStatus value based on an error encountered by a socket operation.
      * @param hresult The error encountered by a socket operation represented as an HRESULT.
      * @return The socket error status value for a socket operation.
      */
    /* static member */
    @JSGlobal("Windows.Networking.Sockets.SocketError.getStatus")
    @js.native
    def getStatus(hresult: Double): SocketErrorStatus = js.native
  }
  
  /** Specifies status values for a socket operation. */
  @JSGlobal("Windows.Networking.Sockets.SocketErrorStatus")
  @js.native
  object SocketErrorStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus with Double] = js.native
    
    /* 10 */ val addressAlreadyInUse: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.addressAlreadyInUse with Double = js.native
    
    /* 4 */ val addressFamilyNotSupported: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.addressFamilyNotSupported with Double = js.native
    
    /* 11 */ val cannotAssignRequestedAddress: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.cannotAssignRequestedAddress with Double = js.native
    
    /* 25 */ val certificateCommonNameIsIncorrect: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateCommonNameIsIncorrect with Double = js.native
    
    /* 23 */ val certificateExpired: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateExpired with Double = js.native
    
    /* 30 */ val certificateIsInvalid: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateIsInvalid with Double = js.native
    
    /* 28 */ val certificateNoRevocationCheck: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateNoRevocationCheck with Double = js.native
    
    /* 29 */ val certificateRevocationServerOffline: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateRevocationServerOffline with Double = js.native
    
    /* 27 */ val certificateRevoked: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateRevoked with Double = js.native
    
    /* 24 */ val certificateUntrustedRoot: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateUntrustedRoot with Double = js.native
    
    /* 26 */ val certificateWrongUsage: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateWrongUsage with Double = js.native
    
    /* 9 */ val classTypeNotFound: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.classTypeNotFound with Double = js.native
    
    /* 12 */ val connectionRefused: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.connectionRefused with Double = js.native
    
    /* 18 */ val connectionResetByPeer: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.connectionResetByPeer with Double = js.native
    
    /* 3 */ val connectionTimedOut: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.connectionTimedOut with Double = js.native
    
    /* 19 */ val hostIsDown: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.hostIsDown with Double = js.native
    
    /* 6 */ val hostNotFound: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.hostNotFound with Double = js.native
    
    /* 2 */ val httpInvalidServerResponse: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.httpInvalidServerResponse with Double = js.native
    
    /* 22 */ val messageTooLong: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.messageTooLong with Double = js.native
    
    /* 16 */ val networkDroppedConnectionOnReset: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.networkDroppedConnectionOnReset with Double = js.native
    
    /* 15 */ val networkIsDown: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.networkIsDown with Double = js.native
    
    /* 13 */ val networkIsUnreachable: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.networkIsUnreachable with Double = js.native
    
    /* 20 */ val noAddressesFound: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.noAddressesFound with Double = js.native
    
    /* 7 */ val noDataRecordOfRequestedType: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.noDataRecordOfRequestedType with Double = js.native
    
    /* 8 */ val nonAuthoritativeHostNotFound: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.nonAuthoritativeHostNotFound with Double = js.native
    
    /* 1 */ val operationAborted: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.operationAborted with Double = js.native
    
    /* 5 */ val socketTypeNotSupported: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.socketTypeNotSupported with Double = js.native
    
    /* 17 */ val softwareCausedConnectionAbort: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.softwareCausedConnectionAbort with Double = js.native
    
    /* 21 */ val tooManyOpenFiles: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.tooManyOpenFiles with Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.unknown with Double = js.native
    
    /* 14 */ val unreachableHost: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.unreachableHost with Double = js.native
  }
  
  /** Specifies the type of a message for a MessageWebSocket object. */
  @JSGlobal("Windows.Networking.Sockets.SocketMessageType")
  @js.native
  object SocketMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketMessageType with Double] = js.native
    
    /* 0 */ val binary: typings.winrtUwp.Windows.Networking.Sockets.SocketMessageType.binary with Double = js.native
    
    /* 1 */ val utf8: typings.winrtUwp.Windows.Networking.Sockets.SocketMessageType.utf8 with Double = js.native
  }
  
  /** Specifies the level of encryption to use on a StreamSocket object. */
  @JSGlobal("Windows.Networking.Sockets.SocketProtectionLevel")
  @js.native
  object SocketProtectionLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel with Double] = js.native
    
    /* 3 */ val bluetoothEncryptionAllowNullAuthentication: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.bluetoothEncryptionAllowNullAuthentication with Double = js.native
    
    /* 4 */ val bluetoothEncryptionWithAuthentication: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.bluetoothEncryptionWithAuthentication with Double = js.native
    
    /* 0 */ val plainSocket: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.plainSocket with Double = js.native
    
    /* 1 */ val ssl: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.ssl with Double = js.native
    
    /* 5 */ val ssl3AllowWeakEncryption: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.ssl3AllowWeakEncryption with Double = js.native
    
    /* 2 */ val sslAllowNullEncryption: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.sslAllowNullEncryption with Double = js.native
    
    /* 6 */ val tls10: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.tls10 with Double = js.native
    
    /* 7 */ val tls11: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.tls11 with Double = js.native
    
    /* 8 */ val tls12: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.tls12 with Double = js.native
  }
  
  /** Specifies the quality of service for a DatagramSocket or StreamSocket object. */
  @JSGlobal("Windows.Networking.Sockets.SocketQualityOfService")
  @js.native
  object SocketQualityOfService extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketQualityOfService with Double] = js.native
    
    /* 1 */ val lowLatency: typings.winrtUwp.Windows.Networking.Sockets.SocketQualityOfService.lowLatency with Double = js.native
    
    /* 0 */ val normal: typings.winrtUwp.Windows.Networking.Sockets.SocketQualityOfService.normal with Double = js.native
  }
  
  /** The category of error that occurs on an SSL connection. */
  @JSGlobal("Windows.Networking.Sockets.SocketSslErrorSeverity")
  @js.native
  object SocketSslErrorSeverity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity with Double] = js.native
    
    /* 2 */ val fatal: typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity.fatal with Double = js.native
    
    /* 1 */ val ignorable: typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity.ignorable with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity.none with Double = js.native
  }
  
  /** Supports network communication using a stream socket over TCP or Bluetooth RFCOMM in Windows Store apps. */
  @JSGlobal("Windows.Networking.Sockets.StreamSocket")
  @js.native
  /** Creates a new StreamSocket object. */
  class StreamSocket ()
    extends typings.winrtUwp.Windows.Networking.Sockets.StreamSocket
  
  /** Provides socket control data on a StreamSocket object. */
  @JSGlobal("Windows.Networking.Sockets.StreamSocketControl")
  @js.native
  abstract class StreamSocketControl ()
    extends typings.winrtUwp.Windows.Networking.Sockets.StreamSocketControl
  
  /** Provides socket information on a StreamSocket object. */
  @JSGlobal("Windows.Networking.Sockets.StreamSocketInformation")
  @js.native
  abstract class StreamSocketInformation ()
    extends typings.winrtUwp.Windows.Networking.Sockets.StreamSocketInformation
  
  /** Supports listening for an incoming network connection using a TCP stream socket or Bluetooth RFCOMM. */
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListener")
  @js.native
  /** Creates a new StreamSocketListener object. */
  class StreamSocketListener ()
    extends typings.winrtUwp.Windows.Networking.Sockets.StreamSocketListener
  
  /** Provides data for a ConnectionReceived event on a StreamSocketListener object. */
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListenerConnectionReceivedEventArgs")
  @js.native
  abstract class StreamSocketListenerConnectionReceivedEventArgs ()
    extends typings.winrtUwp.Windows.Networking.Sockets.StreamSocketListenerConnectionReceivedEventArgs
  
  /** Provides socket control data on a StreamSocketListener object. */
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListenerControl")
  @js.native
  abstract class StreamSocketListenerControl ()
    extends typings.winrtUwp.Windows.Networking.Sockets.StreamSocketListenerControl
  
  /** Provides socket information on a StreamSocketListener object. */
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListenerInformation")
  @js.native
  abstract class StreamSocketListenerInformation ()
    extends typings.winrtUwp.Windows.Networking.Sockets.StreamSocketListenerInformation
  
  /** Supports network communication that allows reading and writing streams using a WebSocket. */
  @JSGlobal("Windows.Networking.Sockets.StreamWebSocket")
  @js.native
  /** Creates a new StreamWebSocket object. */
  class StreamWebSocket ()
    extends typings.winrtUwp.Windows.Networking.Sockets.StreamWebSocket
  
  /** Provides socket control data on a StreamWebSocket object. */
  @JSGlobal("Windows.Networking.Sockets.StreamWebSocketControl")
  @js.native
  abstract class StreamWebSocketControl ()
    extends typings.winrtUwp.Windows.Networking.Sockets.StreamWebSocketControl
  
  /** Provides socket information on a StreamWebSocket object. */
  @JSGlobal("Windows.Networking.Sockets.StreamWebSocketInformation")
  @js.native
  abstract class StreamWebSocketInformation ()
    extends typings.winrtUwp.Windows.Networking.Sockets.StreamWebSocketInformation
  
  /** Provides data for a closed event on a MessageWebSocket , StreamWebSocket , or IWebSocket object. */
  @JSGlobal("Windows.Networking.Sockets.WebSocketClosedEventArgs")
  @js.native
  abstract class WebSocketClosedEventArgs ()
    extends typings.winrtUwp.Windows.Networking.Sockets.WebSocketClosedEventArgs
  
  /** Provides socket error status on a MessageWebSocket or StreamWebSocket object. */
  @JSGlobal("Windows.Networking.Sockets.WebSocketError")
  @js.native
  abstract class WebSocketError ()
    extends typings.winrtUwp.Windows.Networking.Sockets.WebSocketError
  object WebSocketError {
    
    /**
      * Gets a WebErrorStatus value based on an error encountered by a WebSocket operation.
      * @param hresult The error encountered by a WebSocket operation represented as an HRESULT.
      * @return The socket error status value for a WebSocket operation.
      */
    /* static member */
    @JSGlobal("Windows.Networking.Sockets.WebSocketError.getStatus")
    @js.native
    def getStatus(hresult: Double): WebErrorStatus = js.native
  }
}
