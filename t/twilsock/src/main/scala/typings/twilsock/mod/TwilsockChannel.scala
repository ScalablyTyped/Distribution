package typings.twilsock.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Twilsock channel level protocol implementation
  */
@js.native
trait TwilsockChannel extends EventEmitter {
  
  /* private */ var cancelDisconnectTimer: Any = js.native
  
  /* private */ var cancelInit: Any = js.native
  
  /* private */ var cancelUpdate: Any = js.native
  
  /* private */ var changeState: Any = js.native
  
  /**
    * Shutdown connection
    */
  /* private */ var closeSocket: Any = js.native
  
  /* private */ val config: Any = js.native
  
  /**
    * Should be called for each message to confirm it received
    */
  /* private */ var confirmReceiving: Any = js.native
  
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
  
  /* private */ var disconnectedPromiseResolve: Any = js.native
  
  /* private */ var disconnectingTimer: Any = js.native
  
  /* private */ var emitReplyConnectionError: Any = js.native
  
  /* private */ var finalizeSocket: Any = js.native
  
  /* private */ val fsm: Any = js.native
  
  def getTerminationReason: String = js.native
  
  /* private */ var initRetry: Any = js.native
  
  def isConnected: Boolean = js.native
  
  def isTerminalState: Boolean = js.native
  
  /* private */ var lastEmittedState: Any = js.native
  
  /* private */ var modifyBackoff: Any = js.native
  
  /* private */ var onCloseReceived: Any = js.native
  
  /* private */ var onConnected: Any = js.native
  
  /* private */ var onIncomingMessage: Any = js.native
  
  /* private */ var resetBackoff: Any = js.native
  
  /* private */ var retrier: Any = js.native
  
  /* private */ var retry: Any = js.native
  
  /* private */ var sendInit: Any = js.native
  
  /* private */ var sendUpdate: Any = js.native
  
  /* private */ var setupSocket: Any = js.native
  
  /* private */ var startDisconnectTimer: Any = js.native
  
  def state: ConnectionState = js.native
  
  /* private */ val terminalStates: Any = js.native
  
  /* private */ var terminationReason: Any = js.native
  
  /* private */ val tokenExpiredSasCode: Any = js.native
  
  /* private */ var transport: Any = js.native
  
  /**
    * Update fpa token for twilsock connection
    */
  def updateToken(token: String): js.Promise[Unit] = js.native
  
  /* private */ var websocket: Any = js.native
}
