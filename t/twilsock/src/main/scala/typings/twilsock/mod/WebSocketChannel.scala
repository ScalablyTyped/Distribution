package typings.twilsock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketChannel extends Channel {
  
  /* private */ val WebSocket: Any = js.native
  
  def close(): Unit = js.native
  
  def connect(): Unit = js.native
  
  @JSName("isConnected")
  def isConnected_MWebSocketChannel: Boolean = js.native
  
  /* private */ var socket: Any = js.native
  
  /* private */ val url: Any = js.native
}
