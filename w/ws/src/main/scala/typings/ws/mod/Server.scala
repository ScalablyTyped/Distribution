package typings.ws.mod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.netMod.Socket
import typings.std.Error
import typings.std.Set
import typings.ws.wsStrings.close
import typings.ws.wsStrings.connection
import typings.ws.wsStrings.error
import typings.ws.wsStrings.headers
import typings.ws.wsStrings.listening
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// WebSocket Server
@JSImport("ws", "Server")
@js.native
class Server () extends EventEmitter {
  def this(options: ServerOptions) = this()
  def this(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]) = this()
  def this(options: ServerOptions, callback: js.Function0[Unit]) = this()
  
  @JSName("addListener")
  def addListener_close(event: close, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connection(event: connection, cb: js.Function1[/* client */ WebSocket, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, cb: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_headers(
    event: headers,
    cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
  
  def address(): AddressInfo | String = js.native
  
  var clients: Set[WebSocket] = js.native
  
  def close(): Unit = js.native
  def close(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def handleUpgrade(
    request: IncomingMessage,
    socket: Socket,
    upgradeHead: Buffer,
    callback: js.Function2[/* client */ WebSocket, /* request */ IncomingMessage, Unit]
  ): Unit = js.native
  
  def off(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  def off(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("off")
  def off_close(event: close, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("off")
  def off_connection(
    event: connection,
    cb: js.ThisFunction2[/* this */ this.type, /* socket */ WebSocket, /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_error(event: error, cb: js.ThisFunction1[/* this */ this.type, /* error */ Error, Unit]): this.type = js.native
  @JSName("off")
  def off_headers(
    event: headers,
    cb: js.ThisFunction2[
      /* this */ this.type, 
      /* headers */ js.Array[String], 
      /* request */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_listening(event: listening, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  
  def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  // Events
  @JSName("on")
  def on_connection(
    event: connection,
    cb: js.ThisFunction2[/* this */ this.type, /* socket */ WebSocket, /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.ThisFunction1[/* this */ this.type, /* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_headers(
    event: headers,
    cb: js.ThisFunction2[
      /* this */ this.type, 
      /* headers */ js.Array[String], 
      /* request */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_listening(event: listening, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  
  @JSName("once")
  def once_close(event: close, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("once")
  def once_connection(
    event: connection,
    cb: js.ThisFunction2[/* this */ this.type, /* socket */ WebSocket, /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(event: error, cb: js.ThisFunction1[/* this */ this.type, /* error */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_headers(
    event: headers,
    cb: js.ThisFunction2[
      /* this */ this.type, 
      /* headers */ js.Array[String], 
      /* request */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_listening(event: listening, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  
  var options: ServerOptions = js.native
  
  var path: String = js.native
  
  @JSName("removeListener")
  def removeListener_close(event: close, cb: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_connection(event: connection, cb: js.Function1[/* client */ WebSocket, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, cb: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_headers(
    event: headers,
    cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
  
  def shouldHandle(request: IncomingMessage): Boolean | js.Promise[Boolean] = js.native
}
