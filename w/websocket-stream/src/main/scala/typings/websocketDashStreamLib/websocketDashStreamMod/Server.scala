package typings
package websocketDashStreamLib.websocketDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websocket-stream", "Server")
@js.native
class Server ()
  extends wsLib.wsMod.Server {
  @JSName("on")
  def on_connection(
    event: websocketDashStreamLib.websocketDashStreamLibStrings.connection,
    cb: js.ThisFunction2[
      /* this */ wsLib.wsMod.^, 
      /* socket */ wsLib.wsMod.^, 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: websocketDashStreamLib.websocketDashStreamLibStrings.error,
    cb: js.ThisFunction1[/* this */ wsLib.wsMod.^, /* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_headers(
    event: websocketDashStreamLib.websocketDashStreamLibStrings.headers,
    cb: js.ThisFunction2[
      /* this */ wsLib.wsMod.^, 
      /* headers */ js.Array[java.lang.String], 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_listening(
    event: websocketDashStreamLib.websocketDashStreamLibStrings.listening,
    cb: js.ThisFunction0[/* this */ wsLib.wsMod.^, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_stream(
    event: websocketDashStreamLib.websocketDashStreamLibStrings.stream,
    cb: js.ThisFunction2[
      /* this */ wsLib.wsMod.^, 
      /* stream */ WebSocketDuplex, 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
}

