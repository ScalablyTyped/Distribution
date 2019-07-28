package typings.websocketDashStream.websocketDashStreamMod

import typings.node.httpMod.IncomingMessage
import typings.std.Error
import typings.websocketDashStream.websocketDashStreamStrings.connection
import typings.websocketDashStream.websocketDashStreamStrings.error
import typings.websocketDashStream.websocketDashStreamStrings.headers
import typings.websocketDashStream.websocketDashStreamStrings.listening
import typings.websocketDashStream.websocketDashStreamStrings.stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websocket-stream", "Server")
@js.native
class Server ()
  extends typings.ws.wsMod.Server {
  @JSName("on")
  def on_connection(
    event: connection,
    cb: js.ThisFunction2[
      /* this */ typings.ws.wsMod.^, 
      /* socket */ typings.ws.wsMod.^, 
      /* request */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.ThisFunction1[/* this */ typings.ws.wsMod.^, /* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_headers(
    event: headers,
    cb: js.ThisFunction2[
      /* this */ typings.ws.wsMod.^, 
      /* headers */ js.Array[String], 
      /* request */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_listening(event: listening, cb: js.ThisFunction0[/* this */ typings.ws.wsMod.^, Unit]): this.type = js.native
  @JSName("on")
  def on_stream(
    event: stream,
    cb: js.ThisFunction2[
      /* this */ typings.ws.wsMod.^, 
      /* stream */ WebSocketDuplex, 
      /* request */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
}

