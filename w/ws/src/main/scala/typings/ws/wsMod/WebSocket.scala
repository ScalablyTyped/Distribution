package typings.ws.wsMod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.std.Error
import typings.ws.Anon_Binary
import typings.ws.Anon_Code
import typings.ws.Anon_CodeReason
import typings.ws.Anon_Data
import typings.ws.Anon_DataTarget
import typings.ws.Anon_Error
import typings.ws.Anon_ErrorMessage
import typings.ws.Anon_Target
import typings.ws.Anon_Target_1433945625
import typings.ws.wsStrings.`unexpected-response`
import typings.ws.wsStrings.close
import typings.ws.wsStrings.error
import typings.ws.wsStrings.message
import typings.ws.wsStrings.open
import typings.ws.wsStrings.ping
import typings.ws.wsStrings.pong
import typings.ws.wsStrings.upgrade
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebSocket socket.
@js.native
trait WebSocket extends EventEmitter {
  var CLOSED: Double = js.native
  var CLOSING: Double = js.native
  var CONNECTING: Double = js.native
  var OPEN: Double = js.native
  var binaryType: String = js.native
  var bufferedAmount: Double = js.native
  var extensions: String = js.native
  var protocol: String = js.native
  var readyState: Double = js.native
  var url: String = js.native
  def addEventListener(method: String): Unit = js.native
  def addEventListener(method: String, listener: js.Function0[Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(method: close): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(method: close, cb: js.Function1[/* event */ Anon_CodeReason, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(method: error): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(method: error, cb: js.Function1[/* event */ Anon_ErrorMessage, Unit]): Unit = js.native
  // HTML5 WebSocket events
  @JSName("addEventListener")
  def addEventListener_message(method: message): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(method: message, cb: js.Function1[/* event */ Anon_DataTarget, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(method: open): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(method: open, cb: js.Function1[/* event */ Anon_Target_1433945625, Unit]): Unit = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function2[/* code */ Double, /* message */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function1[/* data */ Data, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_open(event: open, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_ping(event: ping, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pong(event: pong, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unexpectedresponse(
    event: `unexpected-response`,
    listener: js.Function2[/* request */ ClientRequest, /* response */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_upgrade(event: upgrade, listener: js.Function1[/* request */ IncomingMessage, Unit]): this.type = js.native
  def close(): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, data: String): Unit = js.native
  def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  // Events
  @JSName("on")
  def on_close(
    event: close,
    listener: js.ThisFunction2[/* this */ this.type, /* code */ Double, /* reason */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.ThisFunction1[/* this */ this.type, /* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.ThisFunction1[/* this */ this.type, /* data */ Data, Unit]): this.type = js.native
  @JSName("on")
  def on_open(event: open, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_ping(event: ping, listener: js.ThisFunction1[/* this */ this.type, /* data */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_pong(event: pong, listener: js.ThisFunction1[/* this */ this.type, /* data */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_unexpectedresponse(
    event: `unexpected-response`,
    listener: js.ThisFunction2[
      /* this */ this.type, 
      /* request */ ClientRequest, 
      /* response */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_upgrade(
    event: upgrade,
    listener: js.ThisFunction1[/* this */ this.type, /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  def onclose(event: Anon_Code): Unit = js.native
  def onerror(event: Anon_Error): Unit = js.native
  def onmessage(event: Anon_Data): Unit = js.native
  def onopen(event: Anon_Target): Unit = js.native
  def ping(): Unit = js.native
  def ping(data: js.Any): Unit = js.native
  def ping(data: js.Any, mask: Boolean): Unit = js.native
  def ping(data: js.Any, mask: Boolean, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def pong(): Unit = js.native
  def pong(data: js.Any): Unit = js.native
  def pong(data: js.Any, mask: Boolean): Unit = js.native
  def pong(data: js.Any, mask: Boolean, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def removeEventListener(method: String): Unit = js.native
  def removeEventListener(method: String, listener: js.Function0[Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(method: close): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(method: close, cb: js.Function1[/* event */ Anon_CodeReason, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(method: error): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(method: error, cb: js.Function1[/* event */ Anon_ErrorMessage, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(method: message): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(method: message, cb: js.Function1[/* event */ Anon_DataTarget, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(method: open): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(method: open, cb: js.Function1[/* event */ Anon_Target_1433945625, Unit]): Unit = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function2[/* code */ Double, /* message */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(event: message, listener: js.Function1[/* data */ Data, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_open(event: open, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_ping(event: ping, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pong(event: pong, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_unexpectedresponse(
    event: `unexpected-response`,
    listener: js.Function2[/* request */ ClientRequest, /* response */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_upgrade(event: upgrade, listener: js.Function1[/* request */ IncomingMessage, Unit]): this.type = js.native
  def send(data: js.Any): Unit = js.native
  def send(data: js.Any, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def send(data: js.Any, options: Anon_Binary): Unit = js.native
  def send(data: js.Any, options: Anon_Binary, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def terminate(): Unit = js.native
}

