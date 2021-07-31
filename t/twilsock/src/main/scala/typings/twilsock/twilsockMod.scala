package typings.twilsock

import typings.node.eventsMod.EventEmitter
import typings.twilsock.configurationMod.Configuration
import typings.twilsock.packetinterfaceMod.PacketInterface
import typings.twilsock.twilsockMod.TwilsockChannel.State
import typings.twilsock.websocketchannelMod.WebSocketChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilsockMod {
  
  @JSImport("twilsock/lib/twilsock", "Response")
  @js.native
  class Response () extends StObject
  
  /**
    * Twilsock channel level protocol implementation
    */
  @JSImport("twilsock/lib/twilsock", "TwilsockChannel")
  @js.native
  class TwilsockChannel protected () extends EventEmitter {
    def this(websocket: WebSocketChannel, transport: PacketInterface, config: Configuration) = this()
    
    var cancelDisconnectTimer: js.Any = js.native
    
    var cancelInit: js.Any = js.native
    
    var cancelUpdate: js.Any = js.native
    
    var changeState: js.Any = js.native
    
    /**
      * Shutdown connection
      */
    var closeSocket: js.Any = js.native
    
    val config: js.Any = js.native
    
    /**
      * Should be called for each message to confirm it received
      */
    var confirmReceiving: js.Any = js.native
    
    /**
      * Initiate the twilsock connection
      * If already connected, it does nothing
      */
    def connect(): Unit = js.native
    
    /**
      * Close twilsock connection
      * If already disconnected, it does nothing
      */
    def disconnect(): js.Promise[Unit] = js.native
    
    var disconnectedPromiseResolve: js.Any = js.native
    
    var disconnectingTimer: js.Any = js.native
    
    var emitReplyConnectionError: js.Any = js.native
    
    var finalizeSocket: js.Any = js.native
    
    val fsm: js.Any = js.native
    
    def getTerminationReason: String = js.native
    
    var initRetry: js.Any = js.native
    
    def isConnected: Boolean = js.native
    
    def isTerminalState: Boolean = js.native
    
    var lastEmittedState: js.Any = js.native
    
    var modifyBackoff: js.Any = js.native
    
    var onCloseReceived: js.Any = js.native
    
    var onConnected: js.Any = js.native
    
    var onIncomingMessage: js.Any = js.native
    
    var resetBackoff: js.Any = js.native
    
    var retrier: js.Any = js.native
    
    var retry: js.Any = js.native
    
    var sendInit: js.Any = js.native
    
    var sendUpdate: js.Any = js.native
    
    var setupSocket: js.Any = js.native
    
    var startDisconnectTimer: js.Any = js.native
    
    def state: State = js.native
    
    val terminalStates: js.Any = js.native
    
    var terminationReason: js.Any = js.native
    
    val tokenExpiredSasCode: js.Any = js.native
    
    var transport: js.Any = js.native
    
    var transportReady: js.Any = js.native
    
    /**
      * Update fpa token for twilsock connection
      */
    def updateToken(token: String): js.Promise[Unit] = js.native
    
    var websocket: js.Any = js.native
  }
  /**
    * Enum for connection state values.
    * @readonly
    * @enum {number}
    */
  object TwilsockChannel {
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilsock.twilsockStrings.unknown
      - typings.twilsock.twilsockStrings.disconnecting
      - typings.twilsock.twilsockStrings.disconnected
      - typings.twilsock.twilsockStrings.connecting
      - typings.twilsock.twilsockStrings.connected
      - typings.twilsock.twilsockStrings.error
      - typings.twilsock.twilsockStrings.rejected
    */
    trait State extends StObject
    object State {
      
      @scala.inline
      def connected: typings.twilsock.twilsockStrings.connected = "connected".asInstanceOf[typings.twilsock.twilsockStrings.connected]
      
      @scala.inline
      def connecting: typings.twilsock.twilsockStrings.connecting = "connecting".asInstanceOf[typings.twilsock.twilsockStrings.connecting]
      
      @scala.inline
      def disconnected: typings.twilsock.twilsockStrings.disconnected = "disconnected".asInstanceOf[typings.twilsock.twilsockStrings.disconnected]
      
      @scala.inline
      def disconnecting: typings.twilsock.twilsockStrings.disconnecting = "disconnecting".asInstanceOf[typings.twilsock.twilsockStrings.disconnecting]
      
      @scala.inline
      def error: typings.twilsock.twilsockStrings.error = "error".asInstanceOf[typings.twilsock.twilsockStrings.error]
      
      @scala.inline
      def rejected: typings.twilsock.twilsockStrings.rejected = "rejected".asInstanceOf[typings.twilsock.twilsockStrings.rejected]
      
      @scala.inline
      def unknown: typings.twilsock.twilsockStrings.unknown = "unknown".asInstanceOf[typings.twilsock.twilsockStrings.unknown]
    }
  }
  
  /**
    * Twilsock channel level protocol implementation
    */
  @JSImport("twilsock/lib/twilsock", "TwilsockImpl")
  @js.native
  class TwilsockImpl protected () extends TwilsockChannel {
    def this(websocket: WebSocketChannel, transport: PacketInterface, config: Configuration) = this()
  }
  /**
    * Enum for connection state values.
    * @readonly
    * @enum {number}
    */
  object TwilsockImpl
}
