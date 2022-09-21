package typings.winrtUwp.global.Windows.Networking

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.Sockets.BandwidthStatistics
import typings.winrtUwp.Windows.Networking.Sockets.RoundTripTimeStatistics
import typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind
import typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason
import typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus
import typings.winrtUwp.Windows.Networking.Sockets.SocketMessageType
import typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel
import typings.winrtUwp.Windows.Networking.Sockets.SocketQualityOfService
import typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import typings.winrtUwp.Windows.Storage.Streams.DataReader
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Web.WebErrorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides sockets and WebSockets classes to use for network communications and classes for real-time network notifications received in the background for Windows Store apps. */
object Sockets {
  
  /** Supports network communication using a UDP datagram socket. */
  @JSGlobal("Windows.Networking.Sockets.DatagramSocket")
  @js.native
  /** Creates a new DatagramSocket object. */
  open class DatagramSocket ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.DatagramSocket
  object DatagramSocket {
    
    @JSGlobal("Windows.Networking.Sockets.DatagramSocket")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a list of EndpointPair objects based on a remote hostname and remote service name that can be used to send datagrams to a remote network destination.
      * @param remoteHostName The remote hostname or IP address.
      * @param remoteServiceName The remote service name or UDP port.
      * @return A list of EndpointPair objects.
      */
    /* static member */
    inline def getEndpointPairsAsync(remoteHostName: typings.winrtUwp.Windows.Networking.HostName, remoteServiceName: String): IPromiseWithIAsyncOperation[IVectorView[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointPairsAsync")(remoteHostName.asInstanceOf[js.Any], remoteServiceName.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
    /**
      * Gets a list of EndpointPair objects based on a remote hostname and remote service name and the sort order to be used.
      * @param remoteHostName The remote hostname or IP address.
      * @param remoteServiceName The remote service name or UDP port.
      * @param sortOptions The sort order to use when returning the list.
      * @return A list of EndpointPair objects.
      */
    /* static member */
    inline def getEndpointPairsAsync(
      remoteHostName: typings.winrtUwp.Windows.Networking.HostName,
      remoteServiceName: String,
      sortOptions: typings.winrtUwp.Windows.Networking.HostNameSortOptions
    ): IPromiseWithIAsyncOperation[IVectorView[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointPairsAsync")(remoteHostName.asInstanceOf[js.Any], remoteServiceName.asInstanceOf[js.Any], sortOptions.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  }
  
  /** Provides socket control data on a DatagramSocket object. */
  @JSGlobal("Windows.Networking.Sockets.DatagramSocketControl")
  @js.native
  abstract class DatagramSocketControl ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.DatagramSocketControl {
    
    /** Gets or sets a Boolean value that specifies whether the DatagramSocket allows IP datagrams for UDP to be fragmented. */
    /* CompleteClass */
    var dontFragment: Boolean = js.native
    
    /** Gets or sets the size, in bytes, of the buffer used for receiving data on the DatagramSocket object. */
    /* CompleteClass */
    var inboundBufferSizeInBytes: Double = js.native
    
    /** Gets or sets a Boolean value that specifies whether the DatagramSocket is able to coexist with other Win32 or WinRT multicast sockets bound to the same address/port. */
    /* CompleteClass */
    var multicastOnly: Boolean = js.native
    
    /** Gets or sets the hop limit on an outbound packet sent to a unicast IP address by the DatagramSocket object. */
    /* CompleteClass */
    var outboundUnicastHopLimit: Double = js.native
    
    /** Gets or sets the quality of service on a DatagramSocket object. */
    /* CompleteClass */
    var qualityOfService: SocketQualityOfService = js.native
  }
  
  /** Provides socket information on a DatagramSocket object. */
  @JSGlobal("Windows.Networking.Sockets.DatagramSocketInformation")
  @js.native
  abstract class DatagramSocketInformation ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.DatagramSocketInformation {
    
    /** The local IP address associated with a DatagramSocket object. */
    /* CompleteClass */
    var localAddress: typings.winrtUwp.Windows.Networking.HostName = js.native
    
    /** The local service name or UDP port number associated with a DatagramSocket . */
    /* CompleteClass */
    var localPort: String = js.native
    
    /** The IP address of the remote network destination associated with a DatagramSocket object. */
    /* CompleteClass */
    var remoteAddress: typings.winrtUwp.Windows.Networking.HostName = js.native
    
    /** The UDP port number of the remote network destination associated with a DatagramSocket object. */
    /* CompleteClass */
    var remotePort: String = js.native
  }
  
  /** Provides data for a MessageReceived event on a DatagramSocket . */
  @JSGlobal("Windows.Networking.Sockets.DatagramSocketMessageReceivedEventArgs")
  @js.native
  abstract class DatagramSocketMessageReceivedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.DatagramSocketMessageReceivedEventArgs {
    
    /**
      * Gets a DataReader object to read incoming data received from the remote network destination on a DatagramSocket object.
      * @return A DataReader object to read incoming data received from the remote network destination on a DatagramSocket object.
      */
    /* CompleteClass */
    override def getDataReader(): DataReader = js.native
    
    /**
      * Gets an IInputStream object that represents a sequential stream of bytes to be read as a message from the remote network destination on a DatagramSocket object.
      * @return An IInputStream object that represents a sequential stream of bytes to be read as a message.
      */
    /* CompleteClass */
    override def getDataStream(): IInputStream = js.native
    
    /** Gets the local IP address associated with a DatagramSocket when a message was received. */
    /* CompleteClass */
    var localAddress: typings.winrtUwp.Windows.Networking.HostName = js.native
    
    /** Gets the IP address of the remote sender of the datagram on the DatagramSocket when a message is received. */
    /* CompleteClass */
    var remoteAddress: typings.winrtUwp.Windows.Networking.HostName = js.native
    
    /** Gets the UDP port number of the remote sender of the datagram received on the DatagramSocket . */
    /* CompleteClass */
    var remotePort: String = js.native
  }
  
  /** Supports network communication that allows reading and writing whole messages using a WebSocket. */
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocket")
  @js.native
  /** Creates a new MessageWebSocket object. */
  open class MessageWebSocket ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.MessageWebSocket
  
  /** Provides socket control data on a MessageWebSocket . */
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocketControl")
  @js.native
  abstract class MessageWebSocketControl ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.MessageWebSocketControl {
    
    /** The maximum message size, in bytes, for a WebSocket message to be configured on the MessageWebSocket object. */
    /* CompleteClass */
    var maxMessageSize: Double = js.native
    
    /** The WebSocket message type to be configured on a MessageWebSocket object for write operations. */
    /* CompleteClass */
    var messageType: SocketMessageType = js.native
    
    /** The size, in bytes, of the send buffer to be used for sending data on a MessageWebSocket object. */
    /* CompleteClass */
    var outboundBufferSizeInBytes: Double = js.native
    
    /** The credential to use to authenticate to the proxy server through HTTP header authentication using a MessageWebSocket object. */
    /* CompleteClass */
    var proxyCredential: PasswordCredential = js.native
    
    /** The credential to use to authenticate to the WebSocket server through HTTP header authentication using a MessageWebSocket object. */
    /* CompleteClass */
    var serverCredential: PasswordCredential = js.native
    
    /** Gets a collection that can be used to add a list of supported sub-protocols that will be advertised to the server during the connect handshake. */
    /* CompleteClass */
    var supportedProtocols: IVector[String] = js.native
  }
  
  /** Provides socket information on a MessageWebSocket . */
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocketInformation")
  @js.native
  abstract class MessageWebSocketInformation ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.MessageWebSocketInformation {
    
    /** Gets bandwidth information for network data transfer on a MessageWebSocket object. */
    /* CompleteClass */
    var bandwidthStatistics: BandwidthStatistics = js.native
    
    /** Gets the IP address associated with a MessageWebSocket object. */
    /* CompleteClass */
    var localAddress: typings.winrtUwp.Windows.Networking.HostName = js.native
    
    /** Gets the WebSocket sub-protocol negotiated with the server during WebSocket handshake on a MessageWebSocket object. */
    /* CompleteClass */
    var protocol: String = js.native
  }
  
  /** Provides data for a message received event on a MessageWebSocket . */
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs")
  @js.native
  abstract class MessageWebSocketMessageReceivedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs {
    
    /**
      * Gets a DataReader object to read incoming data received from the remote network destination on a MessageWebSocket .
      * @return A DataReader object to read incoming data received from the remote network destination on a MessageWebSocket .
      */
    /* CompleteClass */
    override def getDataReader(): DataReader = js.native
    
    /**
      * Gets an IInputStream object (a message represented as a sequential stream of bytes) from the remote network destination on a MessageWebSocket object.
      * @return A message represented as a sequential stream of bytes.
      */
    /* CompleteClass */
    override def getDataStream(): IInputStream = js.native
    
    /** Gets the type of the message received by a MessageWebSocket object. */
    /* CompleteClass */
    var messageType: SocketMessageType = js.native
  }
  
  /** Indicates whether an app that uses the socket brokering service can receive packets when the system goes to connected stand by. */
  @JSGlobal("Windows.Networking.Sockets.SocketActivityConnectedStandbyAction")
  @js.native
  object SocketActivityConnectedStandbyAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Sockets.SocketActivityConnectedStandbyAction & Double
      ] = js.native
    
    /* 0 */ val doNotWake: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityConnectedStandbyAction.doNotWake & Double = js.native
    
    /* 1 */ val wake: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityConnectedStandbyAction.wake & Double = js.native
  }
  
  /** The context associated with a socket while transferring ownership of the socket between an app and the socket brokering service. */
  @JSGlobal("Windows.Networking.Sockets.SocketActivityContext")
  @js.native
  open class SocketActivityContext protected ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.SocketActivityContext {
    /**
      * Constructs a new SocketActivityContext object with given context data.
      * @param data Context data to be used when the socket broker notifies the app of socket activity.
      */
    def this(data: IBuffer) = this()
    
    /** Get the serialized data to associate the app context to a transferred socket. */
    /* CompleteClass */
    var data: IBuffer = js.native
  }
  
  /** Provides information on the transferred socket from the Socket Broker. */
  @JSGlobal("Windows.Networking.Sockets.SocketActivityInformation")
  @js.native
  abstract class SocketActivityInformation ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.SocketActivityInformation {
    
    /** Get the context associated while transferring ownership of the socket. */
    /* CompleteClass */
    var context: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityContext = js.native
    
    /** Based on the socket type, the app can reclaim the ownership of the appropriate DatagramSocket . */
    /* CompleteClass */
    var datagramSocket: typings.winrtUwp.Windows.Networking.Sockets.DatagramSocket = js.native
    
    /** A unique string for this app used to identify the transferred socket. This is passed by the app while transferring the socket ownership to the service. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Gets a SocketActivityKind enumeration value that identifies socket kind. */
    /* CompleteClass */
    var socketKind: SocketActivityKind = js.native
    
    /** Based on the socket type, the app can reclaim the ownership of the appropriate StreamSocket . */
    /* CompleteClass */
    var streamSocket: typings.winrtUwp.Windows.Networking.Sockets.StreamSocket = js.native
    
    /** Based on the socket type, the app can reclaim the ownership of the appropriate StreamSocketListener . */
    /* CompleteClass */
    var streamSocketListener: typings.winrtUwp.Windows.Networking.Sockets.StreamSocketListener = js.native
    
    /** The background task ID used while transferring ownership of the socket. */
    /* CompleteClass */
    var taskId: String = js.native
  }
  object SocketActivityInformation {
    
    @JSGlobal("Windows.Networking.Sockets.SocketActivityInformation")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets a list of all the sockets transferred to the socket brokering service by this app. */
    /* static member */
    @JSGlobal("Windows.Networking.Sockets.SocketActivityInformation.allSockets")
    @js.native
    def allSockets: IMapView[String, typings.winrtUwp.Windows.Networking.Sockets.SocketActivityInformation] = js.native
    inline def allSockets_=(x: IMapView[String, typings.winrtUwp.Windows.Networking.Sockets.SocketActivityInformation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allSockets")(x.asInstanceOf[js.Any])
  }
  
  /** Describes the kind of socket object being transferred to or from the socket broker. */
  @JSGlobal("Windows.Networking.Sockets.SocketActivityKind")
  @js.native
  object SocketActivityKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind & Double] = js.native
    
    /* 2 */ val datagramSocket: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind.datagramSocket & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind.none & Double = js.native
    
    /* 3 */ val streamSocket: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind.streamSocket & Double = js.native
    
    /* 1 */ val streamSocketListener: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind.streamSocketListener & Double = js.native
  }
  
  /** A object instantiated by the background broker infrastructure and used by an app to retrieve details when a SocketActivityTrigger occurs. */
  @JSGlobal("Windows.Networking.Sockets.SocketActivityTriggerDetails")
  @js.native
  abstract class SocketActivityTriggerDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerDetails {
    
    /** Get the reason the SocketActivityTrigger occurred. */
    /* CompleteClass */
    var reason: SocketActivityTriggerReason = js.native
    
    /** Get the SocketActivityInformation object for socket that caused the SocketActivityTrigger to occur. */
    /* CompleteClass */
    var socketInformation: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityInformation = js.native
  }
  
  /** The reason why a SocketActivityTrigger occurred. */
  @JSGlobal("Windows.Networking.Sockets.SocketActivityTriggerReason")
  @js.native
  object SocketActivityTriggerReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason & Double] = js.native
    
    /* 2 */ val connectionAccepted: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.connectionAccepted & Double = js.native
    
    /* 3 */ val keepAliveTimerExpired: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.keepAliveTimerExpired & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.none & Double = js.native
    
    /* 1 */ val socketActivity: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.socketActivity & Double = js.native
    
    /* 4 */ val socketClosed: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.socketClosed & Double = js.native
  }
  
  /** Provides socket error status for operations on a DatagramSocket , StreamSocket , or StreamSocketListener . */
  @JSGlobal("Windows.Networking.Sockets.SocketError")
  @js.native
  abstract class SocketError ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.SocketError
  object SocketError {
    
    @JSGlobal("Windows.Networking.Sockets.SocketError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a SocketErrorStatus value based on an error encountered by a socket operation.
      * @param hresult The error encountered by a socket operation represented as an HRESULT.
      * @return The socket error status value for a socket operation.
      */
    /* static member */
    inline def getStatus(hresult: Double): SocketErrorStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(hresult.asInstanceOf[js.Any]).asInstanceOf[SocketErrorStatus]
  }
  
  /** Specifies status values for a socket operation. */
  @JSGlobal("Windows.Networking.Sockets.SocketErrorStatus")
  @js.native
  object SocketErrorStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus & Double] = js.native
    
    /* 10 */ val addressAlreadyInUse: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.addressAlreadyInUse & Double = js.native
    
    /* 4 */ val addressFamilyNotSupported: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.addressFamilyNotSupported & Double = js.native
    
    /* 11 */ val cannotAssignRequestedAddress: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.cannotAssignRequestedAddress & Double = js.native
    
    /* 25 */ val certificateCommonNameIsIncorrect: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateCommonNameIsIncorrect & Double = js.native
    
    /* 23 */ val certificateExpired: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateExpired & Double = js.native
    
    /* 30 */ val certificateIsInvalid: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateIsInvalid & Double = js.native
    
    /* 28 */ val certificateNoRevocationCheck: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateNoRevocationCheck & Double = js.native
    
    /* 29 */ val certificateRevocationServerOffline: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateRevocationServerOffline & Double = js.native
    
    /* 27 */ val certificateRevoked: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateRevoked & Double = js.native
    
    /* 24 */ val certificateUntrustedRoot: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateUntrustedRoot & Double = js.native
    
    /* 26 */ val certificateWrongUsage: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.certificateWrongUsage & Double = js.native
    
    /* 9 */ val classTypeNotFound: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.classTypeNotFound & Double = js.native
    
    /* 12 */ val connectionRefused: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.connectionRefused & Double = js.native
    
    /* 18 */ val connectionResetByPeer: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.connectionResetByPeer & Double = js.native
    
    /* 3 */ val connectionTimedOut: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.connectionTimedOut & Double = js.native
    
    /* 19 */ val hostIsDown: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.hostIsDown & Double = js.native
    
    /* 6 */ val hostNotFound: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.hostNotFound & Double = js.native
    
    /* 2 */ val httpInvalidServerResponse: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.httpInvalidServerResponse & Double = js.native
    
    /* 22 */ val messageTooLong: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.messageTooLong & Double = js.native
    
    /* 16 */ val networkDroppedConnectionOnReset: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.networkDroppedConnectionOnReset & Double = js.native
    
    /* 15 */ val networkIsDown: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.networkIsDown & Double = js.native
    
    /* 13 */ val networkIsUnreachable: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.networkIsUnreachable & Double = js.native
    
    /* 20 */ val noAddressesFound: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.noAddressesFound & Double = js.native
    
    /* 7 */ val noDataRecordOfRequestedType: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.noDataRecordOfRequestedType & Double = js.native
    
    /* 8 */ val nonAuthoritativeHostNotFound: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.nonAuthoritativeHostNotFound & Double = js.native
    
    /* 1 */ val operationAborted: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.operationAborted & Double = js.native
    
    /* 5 */ val socketTypeNotSupported: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.socketTypeNotSupported & Double = js.native
    
    /* 17 */ val softwareCausedConnectionAbort: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.softwareCausedConnectionAbort & Double = js.native
    
    /* 21 */ val tooManyOpenFiles: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.tooManyOpenFiles & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.unknown & Double = js.native
    
    /* 14 */ val unreachableHost: typings.winrtUwp.Windows.Networking.Sockets.SocketErrorStatus.unreachableHost & Double = js.native
  }
  
  /** Specifies the type of a message for a MessageWebSocket object. */
  @JSGlobal("Windows.Networking.Sockets.SocketMessageType")
  @js.native
  object SocketMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketMessageType & Double] = js.native
    
    /* 0 */ val binary: typings.winrtUwp.Windows.Networking.Sockets.SocketMessageType.binary & Double = js.native
    
    /* 1 */ val utf8: typings.winrtUwp.Windows.Networking.Sockets.SocketMessageType.utf8 & Double = js.native
  }
  
  /** Specifies the level of encryption to use on a StreamSocket object. */
  @JSGlobal("Windows.Networking.Sockets.SocketProtectionLevel")
  @js.native
  object SocketProtectionLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel & Double] = js.native
    
    /* 3 */ val bluetoothEncryptionAllowNullAuthentication: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.bluetoothEncryptionAllowNullAuthentication & Double = js.native
    
    /* 4 */ val bluetoothEncryptionWithAuthentication: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.bluetoothEncryptionWithAuthentication & Double = js.native
    
    /* 0 */ val plainSocket: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.plainSocket & Double = js.native
    
    /* 1 */ val ssl: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.ssl & Double = js.native
    
    /* 5 */ val ssl3AllowWeakEncryption: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.ssl3AllowWeakEncryption & Double = js.native
    
    /* 2 */ val sslAllowNullEncryption: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.sslAllowNullEncryption & Double = js.native
    
    /* 6 */ val tls10: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.tls10 & Double = js.native
    
    /* 7 */ val tls11: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.tls11 & Double = js.native
    
    /* 8 */ val tls12: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel.tls12 & Double = js.native
  }
  
  /** Specifies the quality of service for a DatagramSocket or StreamSocket object. */
  @JSGlobal("Windows.Networking.Sockets.SocketQualityOfService")
  @js.native
  object SocketQualityOfService extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketQualityOfService & Double] = js.native
    
    /* 1 */ val lowLatency: typings.winrtUwp.Windows.Networking.Sockets.SocketQualityOfService.lowLatency & Double = js.native
    
    /* 0 */ val normal: typings.winrtUwp.Windows.Networking.Sockets.SocketQualityOfService.normal & Double = js.native
  }
  
  /** The category of error that occurs on an SSL connection. */
  @JSGlobal("Windows.Networking.Sockets.SocketSslErrorSeverity")
  @js.native
  object SocketSslErrorSeverity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity & Double] = js.native
    
    /* 2 */ val fatal: typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity.fatal & Double = js.native
    
    /* 1 */ val ignorable: typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity.ignorable & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity.none & Double = js.native
  }
  
  /** Supports network communication using a stream socket over TCP or Bluetooth RFCOMM in Windows Store apps. */
  @JSGlobal("Windows.Networking.Sockets.StreamSocket")
  @js.native
  /** Creates a new StreamSocket object. */
  open class StreamSocket ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.StreamSocket
  
  /** Provides socket control data on a StreamSocket object. */
  @JSGlobal("Windows.Networking.Sockets.StreamSocketControl")
  @js.native
  abstract class StreamSocketControl ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.StreamSocketControl {
    
    /** Gets or sets the client SSL/TLS certificate that will be sent to the server if the server requests a client certificate. */
    /* CompleteClass */
    var clientCertificate: Certificate = js.native
    
    /** Get a vector of SSL server errors to ignore when making an SSL connection with a StreamSocket . */
    /* CompleteClass */
    var ignorableServerCertificateErrors: IVector[ChainValidationResult] = js.native
    
    /** A value that indicates whether keep-alive packets are sent to the remote destination on a StreamSocket object. */
    /* CompleteClass */
    var keepAlive: Boolean = js.native
    
    /** A value that indicates whether the Nagle algorithm is used on a StreamSocket object. */
    /* CompleteClass */
    var noDelay: Boolean = js.native
    
    /** The size, in bytes, of the send buffer to be used for sending data on a StreamSocket object. */
    /* CompleteClass */
    var outboundBufferSizeInBytes: Double = js.native
    
    /** The hop limit on an outbound packet sent to a unicast IP address by the StreamSocket object. */
    /* CompleteClass */
    var outboundUnicastHopLimit: Double = js.native
    
    /** The quality of service on a StreamSocket object. */
    /* CompleteClass */
    var qualityOfService: SocketQualityOfService = js.native
    
    /** A value that indicates whether, when multiple connection attempts are being made, the attempts are made in parallel or serially. */
    /* CompleteClass */
    var serializeConnectionAttempts: Boolean = js.native
  }
  
  /** Provides socket information on a StreamSocket object. */
  @JSGlobal("Windows.Networking.Sockets.StreamSocketInformation")
  @js.native
  abstract class StreamSocketInformation ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.StreamSocketInformation {
    
    /** Gets bandwidth information for network data transfer on a StreamSocket object. */
    /* CompleteClass */
    var bandwidthStatistics: BandwidthStatistics = js.native
    
    /** Gets the local IP address associated with a StreamSocket object. */
    /* CompleteClass */
    var localAddress: typings.winrtUwp.Windows.Networking.HostName = js.native
    
    /** Get the TCP port number associated with a StreamSocket . */
    /* CompleteClass */
    var localPort: String = js.native
    
    /** Gets the protection level that represents the integrity and encryption set on a StreamSocket object. */
    /* CompleteClass */
    var protectionLevel: SocketProtectionLevel = js.native
    
    /** Get the IP address or hostname of the remote network destination associated with a StreamSocket object. */
    /* CompleteClass */
    var remoteAddress: typings.winrtUwp.Windows.Networking.HostName = js.native
    
    /** Get the hostname or IP address of the remote network destination associated with a StreamSocket object. */
    /* CompleteClass */
    var remoteHostName: typings.winrtUwp.Windows.Networking.HostName = js.native
    
    /** Get the TCP port number or service name of the remote network destination associated with a StreamSocket object. */
    /* CompleteClass */
    var remotePort: String = js.native
    
    /** Get the service name or TCP port number of the remote network destination associated with a StreamSocket object. */
    /* CompleteClass */
    var remoteServiceName: String = js.native
    
    /** Gets round trip time information for a StreamSocket object. */
    /* CompleteClass */
    var roundTripTimeStatistics: RoundTripTimeStatistics = js.native
    
    /** Gets the certificate from the server when making an SSL connection with a StreamSocket . */
    /* CompleteClass */
    var serverCertificate: Certificate = js.native
    
    /** Gets the category of an error that occurred making an SSL connection with a StreamSocket . */
    /* CompleteClass */
    var serverCertificateErrorSeverity: SocketSslErrorSeverity = js.native
    
    /** Gets the list of errors that occurred making an SSL connection with a StreamSocket . */
    /* CompleteClass */
    var serverCertificateErrors: IVectorView[ChainValidationResult] = js.native
    
    /** Gets the intermediate certificates sent by the server during SSL negotiation when making an SSL connection with a StreamSocket . */
    /* CompleteClass */
    var serverIntermediateCertificates: IVectorView[Certificate] = js.native
    
    /** Get a byte array that represents the private shared secret exchanged by proximity devices. */
    /* CompleteClass */
    var sessionKey: IBuffer = js.native
  }
  
  /** Supports listening for an incoming network connection using a TCP stream socket or Bluetooth RFCOMM. */
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListener")
  @js.native
  /** Creates a new StreamSocketListener object. */
  open class StreamSocketListener ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.StreamSocketListener
  
  /** Provides data for a ConnectionReceived event on a StreamSocketListener object. */
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListenerConnectionReceivedEventArgs")
  @js.native
  abstract class StreamSocketListenerConnectionReceivedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.StreamSocketListenerConnectionReceivedEventArgs {
    
    /** The StreamSocket object created when a connection is received by the StreamSocketListener object. */
    /* CompleteClass */
    var socket: typings.winrtUwp.Windows.Networking.Sockets.StreamSocket = js.native
  }
  
  /** Provides socket control data on a StreamSocketListener object. */
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListenerControl")
  @js.native
  abstract class StreamSocketListenerControl ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.StreamSocketListenerControl {
    
    /** A value that indicates whether keep-alive packets should be sent on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
    /* CompleteClass */
    var keepAlive: Boolean = js.native
    
    /** A value that indicates whether the Nagle algorithm is used on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
    /* CompleteClass */
    var noDelay: Boolean = js.native
    
    /** The size, in bytes, of the send buffer to be used for sending data on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
    /* CompleteClass */
    var outboundBufferSizeInBytes: Double = js.native
    
    /** The hop limit on an outbound packet sent to a unicast IP address by the StreamSocket object created when a connection is received by the StreamSocketListener object. */
    /* CompleteClass */
    var outboundUnicastHopLimit: Double = js.native
    
    /** The quality of service to be set on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
    /* CompleteClass */
    var qualityOfService: SocketQualityOfService = js.native
  }
  
  /** Provides socket information on a StreamSocketListener object. */
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListenerInformation")
  @js.native
  abstract class StreamSocketListenerInformation ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.StreamSocketListenerInformation {
    
    /** Get the local TCP port number associated with a StreamSocketListener object. */
    /* CompleteClass */
    var localPort: String = js.native
  }
  
  /** Supports network communication that allows reading and writing streams using a WebSocket. */
  @JSGlobal("Windows.Networking.Sockets.StreamWebSocket")
  @js.native
  /** Creates a new StreamWebSocket object. */
  open class StreamWebSocket ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.StreamWebSocket
  
  /** Provides socket control data on a StreamWebSocket object. */
  @JSGlobal("Windows.Networking.Sockets.StreamWebSocketControl")
  @js.native
  abstract class StreamWebSocketControl ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.StreamWebSocketControl {
    
    /** A value that indicates whether the Nagle algorithm is used on a StreamWebSocket object. */
    /* CompleteClass */
    var noDelay: Boolean = js.native
    
    /** The size, in bytes, of the send buffer to be used for sending data on a StreamWebSocket object. */
    /* CompleteClass */
    var outboundBufferSizeInBytes: Double = js.native
    
    /** The credential to use to authenticate to the proxy server through HTTP header authentication using a StreamWebSocket object. */
    /* CompleteClass */
    var proxyCredential: PasswordCredential = js.native
    
    /** The credential to use to authenticate to the WebSocket server through HTTP header authentication using a StreamWebSocket object. */
    /* CompleteClass */
    var serverCredential: PasswordCredential = js.native
    
    /** Gets a collection that can be used to add a list of supported sub-protocols that will be advertised to the server during the connect handshake. */
    /* CompleteClass */
    var supportedProtocols: IVector[String] = js.native
  }
  
  /** Provides socket information on a StreamWebSocket object. */
  @JSGlobal("Windows.Networking.Sockets.StreamWebSocketInformation")
  @js.native
  abstract class StreamWebSocketInformation ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.StreamWebSocketInformation {
    
    /** Gets bandwidth information for network data transfer on a StreamWebSocket object. */
    /* CompleteClass */
    var bandwidthStatistics: BandwidthStatistics = js.native
    
    /** Gets the IP address associated with a StreamWebSocket object. */
    /* CompleteClass */
    var localAddress: typings.winrtUwp.Windows.Networking.HostName = js.native
    
    /** Gets the WebSocket sub-protocol negotiated with the server during WebSocket handshake on a StreamWebSocket object. */
    /* CompleteClass */
    var protocol: String = js.native
  }
  
  /** Provides data for a closed event on a MessageWebSocket , StreamWebSocket , or IWebSocket object. */
  @JSGlobal("Windows.Networking.Sockets.WebSocketClosedEventArgs")
  @js.native
  abstract class WebSocketClosedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.WebSocketClosedEventArgs {
    
    /** Gets information about the reason that a WebSocket object was closed. */
    /* CompleteClass */
    var code: Double = js.native
    
    /** Gets additional details about the reason that a WebSocket object was closed. */
    /* CompleteClass */
    var reason: String = js.native
  }
  
  /** Provides socket error status on a MessageWebSocket or StreamWebSocket object. */
  @JSGlobal("Windows.Networking.Sockets.WebSocketError")
  @js.native
  abstract class WebSocketError ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Sockets.WebSocketError
  object WebSocketError {
    
    @JSGlobal("Windows.Networking.Sockets.WebSocketError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a WebErrorStatus value based on an error encountered by a WebSocket operation.
      * @param hresult The error encountered by a WebSocket operation represented as an HRESULT.
      * @return The socket error status value for a WebSocket operation.
      */
    /* static member */
    inline def getStatus(hresult: Double): WebErrorStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(hresult.asInstanceOf[js.Any]).asInstanceOf[WebErrorStatus]
  }
}
