package typings.winrt.global.Windows.Networking

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResourceType
import typings.winrt.Windows.Networking.Sockets.SocketErrorStatus
import typings.winrt.Windows.Web.WebErrorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sockets {
  
  @JSGlobal("Windows.Networking.Sockets.ControlChannelTrigger")
  @js.native
  class ControlChannelTrigger protected ()
    extends typings.winrt.Windows.Networking.Sockets.ControlChannelTrigger {
    def this(channelId: String, serverKeepAliveIntervalInMinutes: Double) = this()
    def this(
      channelId: String,
      serverKeepAliveIntervalInMinutes: Double,
      resourceRequestType: ControlChannelTriggerResourceType
    ) = this()
  }
  
  @JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerResetReason")
  @js.native
  object ControlChannelTriggerResetReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResetReason with Double
      ] = js.native
    
    /* 0 */ val fastUserSwitched: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResetReason.fastUserSwitched with Double = js.native
    
    /* 1 */ val lowPowerExit: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResetReason.lowPowerExit with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerResourceType")
  @js.native
  object ControlChannelTriggerResourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResourceType with Double
      ] = js.native
    
    /* 1 */ val requestHardwareSlot: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResourceType.requestHardwareSlot with Double = js.native
    
    /* 0 */ val requestSoftwareSlot: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResourceType.requestSoftwareSlot with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerStatus")
  @js.native
  object ControlChannelTriggerStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus with Double] = js.native
    
    /* 2 */ val hardwareSlotAllocated: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.hardwareSlotAllocated with Double = js.native
    
    /* 0 */ val hardwareSlotRequested: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.hardwareSlotRequested with Double = js.native
    
    /* 3 */ val policyError: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.policyError with Double = js.native
    
    /* 6 */ val serviceUnavailable: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.serviceUnavailable with Double = js.native
    
    /* 1 */ val softwareSlotAllocated: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.softwareSlotAllocated with Double = js.native
    
    /* 4 */ val systemError: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.systemError with Double = js.native
    
    /* 5 */ val transportDisconnected: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.transportDisconnected with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.DatagramSocket")
  @js.native
  class DatagramSocket ()
    extends typings.winrt.Windows.Networking.Sockets.DatagramSocket
  /* static members */
  object DatagramSocket {
    
    @JSGlobal("Windows.Networking.Sockets.DatagramSocket.getEndpointPairsAsync")
    @js.native
    def getEndpointPairsAsync(remoteHostName: typings.winrt.Windows.Networking.HostName, remoteServiceName: String): IAsyncOperation[IVectorView[typings.winrt.Windows.Networking.EndpointPair]] = js.native
    @JSGlobal("Windows.Networking.Sockets.DatagramSocket.getEndpointPairsAsync")
    @js.native
    def getEndpointPairsAsync(
      remoteHostName: typings.winrt.Windows.Networking.HostName,
      remoteServiceName: String,
      sortOptions: typings.winrt.Windows.Networking.HostNameSortOptions
    ): IAsyncOperation[IVectorView[typings.winrt.Windows.Networking.EndpointPair]] = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.DatagramSocketControl")
  @js.native
  class DatagramSocketControl ()
    extends typings.winrt.Windows.Networking.Sockets.DatagramSocketControl
  
  @JSGlobal("Windows.Networking.Sockets.DatagramSocketInformation")
  @js.native
  class DatagramSocketInformation ()
    extends typings.winrt.Windows.Networking.Sockets.DatagramSocketInformation
  
  @JSGlobal("Windows.Networking.Sockets.DatagramSocketMessageReceivedEventArgs")
  @js.native
  class DatagramSocketMessageReceivedEventArgs ()
    extends typings.winrt.Windows.Networking.Sockets.DatagramSocketMessageReceivedEventArgs
  
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocket")
  @js.native
  class MessageWebSocket ()
    extends typings.winrt.Windows.Networking.Sockets.MessageWebSocket
  
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocketControl")
  @js.native
  class MessageWebSocketControl ()
    extends typings.winrt.Windows.Networking.Sockets.MessageWebSocketControl
  
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocketInformation")
  @js.native
  class MessageWebSocketInformation ()
    extends typings.winrt.Windows.Networking.Sockets.MessageWebSocketInformation
  
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs")
  @js.native
  class MessageWebSocketMessageReceivedEventArgs ()
    extends typings.winrt.Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs
  
  @JSGlobal("Windows.Networking.Sockets.SocketError")
  @js.native
  class SocketError ()
    extends typings.winrt.Windows.Networking.Sockets.SocketError
  /* static members */
  object SocketError {
    
    @JSGlobal("Windows.Networking.Sockets.SocketError.getStatus")
    @js.native
    def getStatus(hresult: Double): SocketErrorStatus = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.SocketErrorStatus")
  @js.native
  object SocketErrorStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Sockets.SocketErrorStatus with Double] = js.native
    
    /* 10 */ val addressAlreadyInUse: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.addressAlreadyInUse with Double = js.native
    
    /* 4 */ val addressFamilyNotSupported: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.addressFamilyNotSupported with Double = js.native
    
    /* 11 */ val cannotAssignRequestedAddress: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.cannotAssignRequestedAddress with Double = js.native
    
    /* 25 */ val certificateCommonNameIsIncorrect: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateCommonNameIsIncorrect with Double = js.native
    
    /* 23 */ val certificateExpired: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateExpired with Double = js.native
    
    /* 30 */ val certificateIsInvalid: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateIsInvalid with Double = js.native
    
    /* 28 */ val certificateNoRevocationCheck: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateNoRevocationCheck with Double = js.native
    
    /* 29 */ val certificateRevocationServerOffline: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateRevocationServerOffline with Double = js.native
    
    /* 27 */ val certificateRevoked: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateRevoked with Double = js.native
    
    /* 24 */ val certificateUntrustedRoot: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateUntrustedRoot with Double = js.native
    
    /* 26 */ val certificateWrongUsage: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateWrongUsage with Double = js.native
    
    /* 9 */ val classTypeNotFound: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.classTypeNotFound with Double = js.native
    
    /* 12 */ val connectionRefused: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.connectionRefused with Double = js.native
    
    /* 18 */ val connectionResetByPeer: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.connectionResetByPeer with Double = js.native
    
    /* 3 */ val connectionTimedOut: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.connectionTimedOut with Double = js.native
    
    /* 19 */ val hostIsDown: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.hostIsDown with Double = js.native
    
    /* 6 */ val hostNotFound: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.hostNotFound with Double = js.native
    
    /* 2 */ val httpInvalidServerResponse: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.httpInvalidServerResponse with Double = js.native
    
    /* 22 */ val messageTooLong: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.messageTooLong with Double = js.native
    
    /* 16 */ val networkDroppedConnectionOnReset: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.networkDroppedConnectionOnReset with Double = js.native
    
    /* 15 */ val networkIsDown: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.networkIsDown with Double = js.native
    
    /* 13 */ val networkIsUnreachable: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.networkIsUnreachable with Double = js.native
    
    /* 20 */ val noAddressesFound: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.noAddressesFound with Double = js.native
    
    /* 7 */ val noDataRecordOfRequestedType: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.noDataRecordOfRequestedType with Double = js.native
    
    /* 8 */ val nonAuthoritativeHostNotFound: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.nonAuthoritativeHostNotFound with Double = js.native
    
    /* 1 */ val operationAborted: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.operationAborted with Double = js.native
    
    /* 5 */ val socketTypeNotSupported: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.socketTypeNotSupported with Double = js.native
    
    /* 17 */ val softwareCausedConnectionAbort: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.softwareCausedConnectionAbort with Double = js.native
    
    /* 21 */ val tooManyOpenFiles: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.tooManyOpenFiles with Double = js.native
    
    /* 0 */ val unknown: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.unknown with Double = js.native
    
    /* 14 */ val unreachableHost: typings.winrt.Windows.Networking.Sockets.SocketErrorStatus.unreachableHost with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.SocketMessageType")
  @js.native
  object SocketMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Sockets.SocketMessageType with Double] = js.native
    
    /* 0 */ val binary: typings.winrt.Windows.Networking.Sockets.SocketMessageType.binary with Double = js.native
    
    /* 1 */ val utf8: typings.winrt.Windows.Networking.Sockets.SocketMessageType.utf8 with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.SocketProtectionLevel")
  @js.native
  object SocketProtectionLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Sockets.SocketProtectionLevel with Double] = js.native
    
    /* 0 */ val plainSocket: typings.winrt.Windows.Networking.Sockets.SocketProtectionLevel.plainSocket with Double = js.native
    
    /* 1 */ val ssl: typings.winrt.Windows.Networking.Sockets.SocketProtectionLevel.ssl with Double = js.native
    
    /* 2 */ val sslAllowNullEncryption: typings.winrt.Windows.Networking.Sockets.SocketProtectionLevel.sslAllowNullEncryption with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.SocketQualityOfService")
  @js.native
  object SocketQualityOfService extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Sockets.SocketQualityOfService with Double] = js.native
    
    /* 1 */ val lowLatency: typings.winrt.Windows.Networking.Sockets.SocketQualityOfService.lowLatency with Double = js.native
    
    /* 0 */ val normal: typings.winrt.Windows.Networking.Sockets.SocketQualityOfService.normal with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.StreamSocket")
  @js.native
  class StreamSocket ()
    extends typings.winrt.Windows.Networking.Sockets.StreamSocket
  
  @JSGlobal("Windows.Networking.Sockets.StreamSocketControl")
  @js.native
  class StreamSocketControl ()
    extends typings.winrt.Windows.Networking.Sockets.StreamSocketControl
  
  @JSGlobal("Windows.Networking.Sockets.StreamSocketInformation")
  @js.native
  class StreamSocketInformation ()
    extends typings.winrt.Windows.Networking.Sockets.StreamSocketInformation
  
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListener")
  @js.native
  class StreamSocketListener ()
    extends typings.winrt.Windows.Networking.Sockets.StreamSocketListener
  
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListenerConnectionReceivedEventArgs")
  @js.native
  class StreamSocketListenerConnectionReceivedEventArgs ()
    extends typings.winrt.Windows.Networking.Sockets.StreamSocketListenerConnectionReceivedEventArgs
  
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListenerControl")
  @js.native
  class StreamSocketListenerControl ()
    extends typings.winrt.Windows.Networking.Sockets.StreamSocketListenerControl
  
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListenerInformation")
  @js.native
  class StreamSocketListenerInformation ()
    extends typings.winrt.Windows.Networking.Sockets.StreamSocketListenerInformation
  
  @JSGlobal("Windows.Networking.Sockets.StreamWebSocket")
  @js.native
  class StreamWebSocket ()
    extends typings.winrt.Windows.Networking.Sockets.StreamWebSocket
  
  @JSGlobal("Windows.Networking.Sockets.StreamWebSocketControl")
  @js.native
  class StreamWebSocketControl ()
    extends typings.winrt.Windows.Networking.Sockets.StreamWebSocketControl
  
  @JSGlobal("Windows.Networking.Sockets.StreamWebSocketInformation")
  @js.native
  class StreamWebSocketInformation ()
    extends typings.winrt.Windows.Networking.Sockets.StreamWebSocketInformation
  
  @JSGlobal("Windows.Networking.Sockets.WebSocketClosedEventArgs")
  @js.native
  class WebSocketClosedEventArgs ()
    extends typings.winrt.Windows.Networking.Sockets.WebSocketClosedEventArgs
  
  @JSGlobal("Windows.Networking.Sockets.WebSocketError")
  @js.native
  class WebSocketError ()
    extends typings.winrt.Windows.Networking.Sockets.WebSocketError
  /* static members */
  object WebSocketError {
    
    @JSGlobal("Windows.Networking.Sockets.WebSocketError.getStatus")
    @js.native
    def getStatus(hresult: Double): WebErrorStatus = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.WebSocketKeepAlive")
  @js.native
  class WebSocketKeepAlive ()
    extends typings.winrt.Windows.Networking.Sockets.WebSocketKeepAlive
}
