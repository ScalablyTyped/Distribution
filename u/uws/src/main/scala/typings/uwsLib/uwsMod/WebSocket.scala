package typings
package uwsLib.uwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocket
  extends nodeLib.eventsMod.EventEmitter {
  var CLOSED: scala.Double = js.native
  var CLOSING: scala.Double = js.native
  var CONNECTING: scala.Double = js.native
  var OPEN: scala.Double = js.native
  var bytesReceived: scala.Double = js.native
  var protocol: java.lang.String = js.native
  var protocolVersion: java.lang.String = js.native
  var readyState: scala.Double = js.native
  var supports: js.Any = js.native
  var upgradeReq: nodeLib.httpMod.IncomingMessage = js.native
  var url: java.lang.String = js.native
  def addEventListener(method: java.lang.String): scala.Unit = js.native
  def addEventListener(method: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(method: uwsLib.uwsLibStrings.close): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(method: uwsLib.uwsLibStrings.close, cb: js.Function1[/* event */ uwsLib.Anon_WasClean, scala.Unit]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(method: uwsLib.uwsLibStrings.error): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(method: uwsLib.uwsLibStrings.error, cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  // HTML5 WebSocket events
  @JSName("addEventListener")
  def addEventListener_message(method: uwsLib.uwsLibStrings.message): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    method: uwsLib.uwsLibStrings.message,
    cb: js.Function1[/* event */ uwsLib.Anon_TypeData, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(method: uwsLib.uwsLibStrings.open): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(method: uwsLib.uwsLibStrings.open, cb: js.Function1[/* event */ uwsLib.Anon_Target, scala.Unit]): scala.Unit = js.native
  @JSName("addListener")
  def addListener_close(
    event: uwsLib.uwsLibStrings.close,
    cb: js.Function2[/* code */ scala.Double, /* message */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: uwsLib.uwsLibStrings.error, cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: uwsLib.uwsLibStrings.message,
    cb: js.Function2[/* data */ js.Any, /* flags */ uwsLib.Anon_BinaryBoolean, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_open(event: uwsLib.uwsLibStrings.open, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_ping(
    event: uwsLib.uwsLibStrings.ping,
    cb: js.Function2[/* data */ js.Any, /* flags */ uwsLib.Anon_BinaryBoolean, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_pong(
    event: uwsLib.uwsLibStrings.pong,
    cb: js.Function2[/* data */ js.Any, /* flags */ uwsLib.Anon_BinaryBoolean, scala.Unit]
  ): this.type = js.native
  def close(): scala.Unit = js.native
  def close(code: scala.Double): scala.Unit = js.native
  def close(code: scala.Double, data: js.Any): scala.Unit = js.native
  def on(
    event: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_close(
    event: uwsLib.uwsLibStrings.close,
    cb: js.ThisFunction2[
      /* this */ this.type, 
      /* code */ scala.Double, 
      /* message */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  // Events
  @JSName("on")
  def on_error(
    event: uwsLib.uwsLibStrings.error,
    cb: js.ThisFunction1[/* this */ this.type, /* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: uwsLib.uwsLibStrings.message,
    cb: js.ThisFunction2[
      /* this */ this.type, 
      /* data */ js.Any, 
      /* flags */ uwsLib.Anon_BinaryBoolean, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_open(event: uwsLib.uwsLibStrings.open, cb: js.ThisFunction0[/* this */ this.type, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_ping(
    event: uwsLib.uwsLibStrings.ping,
    cb: js.ThisFunction2[
      /* this */ this.type, 
      /* data */ js.Any, 
      /* flags */ uwsLib.Anon_BinaryBoolean, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pong(
    event: uwsLib.uwsLibStrings.pong,
    cb: js.ThisFunction2[
      /* this */ this.type, 
      /* data */ js.Any, 
      /* flags */ uwsLib.Anon_BinaryBoolean, 
      scala.Unit
    ]
  ): this.type = js.native
  def onclose(event: uwsLib.Anon_WasCleanTarget): scala.Unit = js.native
  def onerror(err: nodeLib.Error): scala.Unit = js.native
  def onmessage(event: uwsLib.Anon_Type): scala.Unit = js.native
  def onopen(event: uwsLib.Anon_TargetWebSocket): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def ping(): scala.Unit = js.native
  def ping(data: js.Any): scala.Unit = js.native
  def ping(data: js.Any, options: uwsLib.Anon_Binary): scala.Unit = js.native
  def ping(data: js.Any, options: uwsLib.Anon_Binary, dontFail: scala.Boolean): scala.Unit = js.native
  def pong(): scala.Unit = js.native
  def pong(data: js.Any): scala.Unit = js.native
  def pong(data: js.Any, options: uwsLib.Anon_Binary): scala.Unit = js.native
  def pong(data: js.Any, options: uwsLib.Anon_Binary, dontFail: scala.Boolean): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def send(data: js.Any): scala.Unit = js.native
  def send(data: js.Any, cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def send(data: js.Any, options: uwsLib.Anon_Binary): scala.Unit = js.native
  def send(data: js.Any, options: uwsLib.Anon_Binary, cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def stream(): scala.Unit = js.native
  def stream(cb: js.Function2[/* err */ nodeLib.Error, /* final */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def stream(options: uwsLib.Anon_Binary): scala.Unit = js.native
  def stream(
    options: uwsLib.Anon_Binary,
    cb: js.Function2[/* err */ nodeLib.Error, /* final */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def terminate(): scala.Unit = js.native
}

