package typings
package wsLib.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebSocket socket.
@js.native
trait WebSocket
  extends nodeLib.eventsMod.EventEmitter {
  var CLOSED: scala.Double = js.native
  var CLOSING: scala.Double = js.native
  var CONNECTING: scala.Double = js.native
  var OPEN: scala.Double = js.native
  var binaryType: java.lang.String = js.native
  var bufferedAmount: scala.Double = js.native
  var extensions: java.lang.String = js.native
  var protocol: java.lang.String = js.native
  var readyState: scala.Double = js.native
  var url: java.lang.String = js.native
  def addEventListener(method: java.lang.String): scala.Unit = js.native
  def addEventListener(method: java.lang.String, listener: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(method: wsLib.wsLibStrings.close): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(method: wsLib.wsLibStrings.close, cb: js.Function1[/* event */ wsLib.Anon_WasClean, scala.Unit]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(method: wsLib.wsLibStrings.error): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(method: wsLib.wsLibStrings.error, cb: js.Function1[/* event */ wsLib.Anon_TypeError, scala.Unit]): scala.Unit = js.native
  // HTML5 WebSocket events
  @JSName("addEventListener")
  def addEventListener_message(method: wsLib.wsLibStrings.message): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(method: wsLib.wsLibStrings.message, cb: js.Function1[/* event */ wsLib.Anon_TypeData, scala.Unit]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(method: wsLib.wsLibStrings.open): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(method: wsLib.wsLibStrings.open, cb: js.Function1[/* event */ wsLib.Anon_Target, scala.Unit]): scala.Unit = js.native
  @JSName("addListener")
  def addListener_close(
    event: wsLib.wsLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* message */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: wsLib.wsLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: wsLib.wsLibStrings.message,
    listener: js.Function1[/* data */ wsLib.wsMod.WebSocketNs.Data, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_open(event: wsLib.wsLibStrings.open, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_ping(event: wsLib.wsLibStrings.ping, listener: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pong(event: wsLib.wsLibStrings.pong, listener: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def `addListener_unexpected-response`(
    event: wsLib.wsLibStrings.`unexpected-response`,
    listener: js.Function2[
      /* request */ nodeLib.httpMod.ClientRequest, 
      /* response */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_upgrade(
    event: wsLib.wsLibStrings.upgrade,
    listener: js.Function1[/* request */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): this.type = js.native
  def close(): scala.Unit = js.native
  def close(code: scala.Double): scala.Unit = js.native
  def close(code: scala.Double, data: java.lang.String): scala.Unit = js.native
  def on(
    event: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  def on(
    event: js.Symbol,
    listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  // Events
  @JSName("on")
  def on_close(
    event: wsLib.wsLibStrings.close,
    listener: js.ThisFunction2[
      /* this */ this.type, 
      /* code */ scala.Double, 
      /* reason */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: wsLib.wsLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: wsLib.wsLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* data */ wsLib.wsMod.WebSocketNs.Data, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_open(event: wsLib.wsLibStrings.open, listener: js.ThisFunction0[/* this */ this.type, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_ping(
    event: wsLib.wsLibStrings.ping,
    listener: js.ThisFunction1[/* this */ this.type, /* data */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pong(
    event: wsLib.wsLibStrings.pong,
    listener: js.ThisFunction1[/* this */ this.type, /* data */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_unexpected-response`(
    event: wsLib.wsLibStrings.`unexpected-response`,
    listener: js.ThisFunction2[
      /* this */ this.type, 
      /* request */ nodeLib.httpMod.ClientRequest, 
      /* response */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_upgrade(
    event: wsLib.wsLibStrings.upgrade,
    listener: js.ThisFunction1[/* this */ this.type, /* request */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): this.type = js.native
  def onclose(event: wsLib.Anon_WasCleanTarget): scala.Unit = js.native
  def onerror(event: wsLib.Anon_TypeErrorTarget): scala.Unit = js.native
  def onmessage(event: wsLib.Anon_Type): scala.Unit = js.native
  def onopen(event: wsLib.Anon_TargetWebSocket): scala.Unit = js.native
  def ping(): scala.Unit = js.native
  def ping(data: js.Any): scala.Unit = js.native
  def ping(data: js.Any, mask: scala.Boolean): scala.Unit = js.native
  def ping(data: js.Any, mask: scala.Boolean, cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def pong(): scala.Unit = js.native
  def pong(data: js.Any): scala.Unit = js.native
  def pong(data: js.Any, mask: scala.Boolean): scala.Unit = js.native
  def pong(data: js.Any, mask: scala.Boolean, cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def removeEventListener(method: java.lang.String): scala.Unit = js.native
  def removeEventListener(method: java.lang.String, listener: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(method: wsLib.wsLibStrings.close): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(method: wsLib.wsLibStrings.close, cb: js.Function1[/* event */ wsLib.Anon_WasClean, scala.Unit]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(method: wsLib.wsLibStrings.error): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(method: wsLib.wsLibStrings.error, cb: js.Function1[/* event */ wsLib.Anon_TypeError, scala.Unit]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(method: wsLib.wsLibStrings.message): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(method: wsLib.wsLibStrings.message, cb: js.Function1[/* event */ wsLib.Anon_TypeData, scala.Unit]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(method: wsLib.wsLibStrings.open): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(method: wsLib.wsLibStrings.open, cb: js.Function1[/* event */ wsLib.Anon_Target, scala.Unit]): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_close(
    event: wsLib.wsLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* message */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: wsLib.wsLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(
    event: wsLib.wsLibStrings.message,
    listener: js.Function1[/* data */ wsLib.wsMod.WebSocketNs.Data, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_open(event: wsLib.wsLibStrings.open, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_ping(event: wsLib.wsLibStrings.ping, listener: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pong(event: wsLib.wsLibStrings.pong, listener: js.Function1[/* data */ nodeLib.Buffer, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def `removeListener_unexpected-response`(
    event: wsLib.wsLibStrings.`unexpected-response`,
    listener: js.Function2[
      /* request */ nodeLib.httpMod.ClientRequest, 
      /* response */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_upgrade(
    event: wsLib.wsLibStrings.upgrade,
    listener: js.Function1[/* request */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): this.type = js.native
  def send(data: js.Any): scala.Unit = js.native
  def send(data: js.Any, cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): scala.Unit = js.native
  def send(data: js.Any, options: wsLib.Anon_Fin): scala.Unit = js.native
  def send(
    data: js.Any,
    options: wsLib.Anon_Fin,
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def terminate(): scala.Unit = js.native
}

