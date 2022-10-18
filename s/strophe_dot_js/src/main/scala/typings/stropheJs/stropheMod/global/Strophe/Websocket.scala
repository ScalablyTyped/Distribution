package typings.stropheJs.stropheMod.global.Strophe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Class: Strophe.WebSocket
  *  _Private_ helper class that handles WebSocket Connections
  *
  *  The Strophe.WebSocket class is used internally by Strophe.Connection
  *  to encapsulate WebSocket sessions. It is not meant to be used from user's code.
  */
@JSGlobal("Strophe.Websocket")
@js.native
open class Websocket protected () extends StObject {
  /** PrivateConstructor: Strophe.Websocket
    *  Create and initialize a Strophe.WebSocket object.
    *  Currently only sets the connection Object.
    *
    *  Parameters:
    *    @param connection - The Strophe.Connection that will use WebSockets.
    *
    *  Returns:
    *    @returns A new Strophe.WebSocket object.
    */
  def this(connection: Connection) = this()
  
  /** PrivateFunction: _connect
    *  _Private_ function called by Strophe.Connection.connect
    *
    *  Creates a WebSocket for a connection and assigns Callbacks to it.
    *  Does nothing if there already is a WebSocket.
    */
  def _connect(): Unit = js.native
}
