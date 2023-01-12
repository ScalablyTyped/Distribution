package typings.vite.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.nodeColonhttpMod.Agent
import typings.node.nodeColonhttpMod.ClientRequest
import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.node.nodeColonstreamMod.Duplex
import typings.node.tlsMod.SecureContextOptions
import typings.node.zlibMod.ZlibOptions
import typings.std.CloseEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.MessageEvent
import typings.std.Set
import typings.vite.anon.Binary
import typings.vite.anon.ChunkSize
import typings.vite.anon.Origin
import typings.vite.anon.TypeofWebSocket
import typings.vite.mod.WebSocket2.RawData
import typings.vite.viteBooleans.`false`
import typings.vite.viteInts.`0`
import typings.vite.viteInts.`1`
import typings.vite.viteInts.`2`
import typings.vite.viteInts.`3`
import typings.vite.viteStrings.`unexpected-response`
import typings.vite.viteStrings.arraybuffer
import typings.vite.viteStrings.close
import typings.vite.viteStrings.connection
import typings.vite.viteStrings.error
import typings.vite.viteStrings.fragments
import typings.vite.viteStrings.headers
import typings.vite.viteStrings.listening
import typings.vite.viteStrings.message
import typings.vite.viteStrings.nodebuffer
import typings.vite.viteStrings.open
import typings.vite.viteStrings.ping
import typings.vite.viteStrings.pong
import typings.vite.viteStrings.upgrade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocket2 extends EventEmitter {
  
  /** The connection is closed. */
  val CLOSED: `3` = js.native
  
  /** The connection is in the process of closing. */
  val CLOSING: `2` = js.native
  
  /** The connection is not yet open. */
  val CONNECTING: `0` = js.native
  
  /** The connection is open and ready to communicate. */
  val OPEN: `1` = js.native
  
  @JSName("addEventListener")
  def addEventListener_close(method: close, cb: js.Function1[/* event */ CloseEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(method: close, cb: js.Function1[/* event */ CloseEvent, Unit], options: EventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(method: error, cb: js.Function1[/* event */ ErrorEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(method: error, cb: js.Function1[/* event */ ErrorEvent, Unit], options: EventListenerOptions): Unit = js.native
  // HTML5 WebSocket events
  @JSName("addEventListener")
  def addEventListener_message(method: message, cb: js.Function1[/* event */ MessageEvent[Any], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    method: message,
    cb: js.Function1[/* event */ MessageEvent[Any], Unit],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(method: open, cb: js.Function1[/* event */ Event, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(method: open, cb: js.Function1[/* event */ Event, Unit], options: EventListenerOptions): Unit = js.native
  
  def addListener(event: ping | pong, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function2[/* code */ Double, /* reason */ Buffer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function2[/* data */ RawData, /* isBinary */ Boolean, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_open(event: open, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unexpectedresponse(
    event: `unexpected-response`,
    listener: js.Function2[/* request */ ClientRequest, /* response */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_upgrade(event: upgrade, listener: js.Function1[/* request */ IncomingMessage, Unit]): this.type = js.native
  
  var binaryType: nodebuffer | arraybuffer | fragments = js.native
  
  val bufferedAmount: Double = js.native
  
  def close(): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, data: String): Unit = js.native
  def close(code: Double, data: Buffer): Unit = js.native
  def close(code: Unit, data: String): Unit = js.native
  def close(code: Unit, data: Buffer): Unit = js.native
  
  val extensions: String = js.native
  
  /** Indicates whether the websocket is paused */
  val isPaused: Boolean = js.native
  
  def off(event: ping | pong, listener: js.ThisFunction1[/* this */ this.type, /* data */ Buffer, Unit]): this.type = js.native
  def off(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Unit]): this.type = js.native
  def off(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Unit]): this.type = js.native
  @JSName("off")
  def off_close(
    event: close,
    listener: js.ThisFunction2[/* this */ this.type, /* code */ Double, /* reason */ Buffer, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_error(event: error, listener: js.ThisFunction1[/* this */ this.type, /* err */ js.Error, Unit]): this.type = js.native
  @JSName("off")
  def off_message(
    event: message,
    listener: js.ThisFunction2[/* this */ this.type, /* data */ RawData, /* isBinary */ Boolean, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_open(event: open, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("off")
  def off_unexpectedresponse(
    event: `unexpected-response`,
    listener: js.ThisFunction2[
      /* this */ this.type, 
      /* request */ ClientRequest, 
      /* response */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_upgrade(
    event: upgrade,
    listener: js.ThisFunction1[/* this */ this.type, /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  
  def on(event: ping | pong, listener: js.ThisFunction1[/* this */ this.type, /* data */ Buffer, Unit]): this.type = js.native
  def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Unit]): this.type = js.native
  // Events
  @JSName("on")
  def on_close(
    event: close,
    listener: js.ThisFunction2[/* this */ this.type, /* code */ Double, /* reason */ Buffer, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.ThisFunction1[/* this */ this.type, /* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_message(
    event: message,
    listener: js.ThisFunction2[/* this */ this.type, /* data */ RawData, /* isBinary */ Boolean, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_open(event: open, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
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
  
  def once(event: ping | pong, listener: js.ThisFunction1[/* this */ this.type, /* data */ Buffer, Unit]): this.type = js.native
  def once(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Unit]): this.type = js.native
  @JSName("once")
  def once_close(
    event: close,
    listener: js.ThisFunction2[/* this */ this.type, /* code */ Double, /* reason */ Buffer, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.ThisFunction1[/* this */ this.type, /* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_message(
    event: message,
    listener: js.ThisFunction2[/* this */ this.type, /* data */ RawData, /* isBinary */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_open(event: open, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("once")
  def once_unexpectedresponse(
    event: `unexpected-response`,
    listener: js.ThisFunction2[
      /* this */ this.type, 
      /* request */ ClientRequest, 
      /* response */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_upgrade(
    event: upgrade,
    listener: js.ThisFunction1[/* this */ this.type, /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  
  var onclose: (js.Function1[/* event */ CloseEvent, Unit]) | Null = js.native
  
  var onerror: (js.Function1[/* event */ ErrorEvent, Unit]) | Null = js.native
  
  var onmessage: (js.Function1[/* event */ MessageEvent[Any], Unit]) | Null = js.native
  
  var onopen: (js.Function1[/* event */ Event, Unit]) | Null = js.native
  
  /**
    * Pause the websocket causing it to stop emitting events. Some events can still be
    * emitted after this is called, until all buffered data is consumed. This method
    * is a noop if the ready state is `CONNECTING` or `CLOSED`.
    */
  def pause(): Unit = js.native
  
  def ping(): Unit = js.native
  def ping(data: Any): Unit = js.native
  def ping(data: Any, mask: Boolean): Unit = js.native
  def ping(data: Any, mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def ping(data: Any, mask: Unit, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def ping(data: Unit, mask: Boolean): Unit = js.native
  def ping(data: Unit, mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def ping(data: Unit, mask: Unit, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def pong(): Unit = js.native
  def pong(data: Any): Unit = js.native
  def pong(data: Any, mask: Boolean): Unit = js.native
  def pong(data: Any, mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def pong(data: Any, mask: Unit, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def pong(data: Unit, mask: Boolean): Unit = js.native
  def pong(data: Unit, mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def pong(data: Unit, mask: Unit, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  val protocol: String = js.native
  
  /** The current state of the connection */
  val readyState: `0` | `1` | `2` | `3` = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_close(method: close, cb: js.Function1[/* event */ CloseEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(method: error, cb: js.Function1[/* event */ ErrorEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(method: message, cb: js.Function1[/* event */ MessageEvent[Any], Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(method: open, cb: js.Function1[/* event */ Event, Unit]): Unit = js.native
  
  def removeListener(event: ping | pong, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function2[/* code */ Double, /* reason */ Buffer, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(event: message, listener: js.Function2[/* data */ RawData, /* isBinary */ Boolean, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_open(event: open, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_unexpectedresponse(
    event: `unexpected-response`,
    listener: js.Function2[/* request */ ClientRequest, /* response */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_upgrade(event: upgrade, listener: js.Function1[/* request */ IncomingMessage, Unit]): this.type = js.native
  
  /**
    * Make a paused socket resume emitting events. This method is a noop if the ready
    * state is `CONNECTING` or `CLOSED`.
    */
  def resume(): Unit = js.native
  
  def send(data: Any): Unit = js.native
  def send(data: Any, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def send(data: Any, options: Binary): Unit = js.native
  def send(data: Any, options: Binary, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  def terminate(): Unit = js.native
  
  val url: String = js.native
}
object WebSocket2 {
  
  trait AddressInfo extends StObject {
    
    var address: String
    
    var family: String
    
    var port: Double
  }
  object AddressInfo {
    
    inline def apply(address: String, family: String, port: Double): AddressInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddressInfo] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * CertMeta represents the accepted types for certificate & key data.
    */
  type CertMeta = String | (js.Array[Buffer | String]) | Buffer
  
  trait ClientOptions
    extends StObject
       with SecureContextOptions {
    
    var agent: js.UndefOr[Agent] = js.undefined
    
    var checkServerIdentity: js.UndefOr[js.Function2[/* servername */ String, /* cert */ CertMeta, Boolean]] = js.undefined
    
    var family: js.UndefOr[Double] = js.undefined
    
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    var generateMask: js.UndefOr[js.Function1[/* mask */ Buffer, Unit]] = js.undefined
    
    var handshakeTimeout: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var maxPayload: js.UndefOr[Double] = js.undefined
    
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var perMessageDeflate: js.UndefOr[Boolean | PerMessageDeflateOptions] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var protocolVersion: js.UndefOr[Double] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var skipUTF8Validation: js.UndefOr[Boolean] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setCheckServerIdentity(value: (/* servername */ String, /* cert */ CertMeta) => Boolean): Self = StObject.set(x, "checkServerIdentity", js.Any.fromFunction2(value))
      
      inline def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      inline def setGenerateMask(value: /* mask */ Buffer => Unit): Self = StObject.set(x, "generateMask", js.Any.fromFunction1(value))
      
      inline def setGenerateMaskUndefined: Self = StObject.set(x, "generateMask", js.undefined)
      
      inline def setHandshakeTimeout(value: Double): Self = StObject.set(x, "handshakeTimeout", value.asInstanceOf[js.Any])
      
      inline def setHandshakeTimeoutUndefined: Self = StObject.set(x, "handshakeTimeout", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setMaxPayload(value: Double): Self = StObject.set(x, "maxPayload", value.asInstanceOf[js.Any])
      
      inline def setMaxPayloadUndefined: Self = StObject.set(x, "maxPayload", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPerMessageDeflate(value: Boolean | PerMessageDeflateOptions): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
      inline def setPerMessageDeflateUndefined: Self = StObject.set(x, "perMessageDeflate", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setProtocolVersion(value: Double): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
      
      inline def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setSkipUTF8Validation(value: Boolean): Self = StObject.set(x, "skipUTF8Validation", value.asInstanceOf[js.Any])
      
      inline def setSkipUTF8ValidationUndefined: Self = StObject.set(x, "skipUTF8Validation", js.undefined)
    }
  }
  
  trait CloseEvent extends StObject {
    
    var code: Double
    
    var reason: String
    
    var target: typings.vite.mod.WebSocket2.WebSocket
    
    var `type`: String
    
    var wasClean: Boolean
  }
  object CloseEvent {
    
    inline def apply(
      code: Double,
      reason: String,
      target: typings.vite.mod.WebSocket2.WebSocket,
      `type`: String,
      wasClean: Boolean
    ): typings.vite.mod.WebSocket2.CloseEvent = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vite.mod.WebSocket2.CloseEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.vite.mod.WebSocket2.CloseEvent] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: typings.vite.mod.WebSocket2.WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWasClean(value: Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Data represents the message payload received over the WebSocket.
    */
  type Data = String | Buffer | js.typedarray.ArrayBuffer | js.Array[Buffer]
  
  trait ErrorEvent extends StObject {
    
    var error: Any
    
    var message: String
    
    var target: typings.vite.mod.WebSocket2.WebSocket
    
    var `type`: String
  }
  object ErrorEvent {
    
    inline def apply(error: Any, message: String, target: typings.vite.mod.WebSocket2.WebSocket, `type`: String): typings.vite.mod.WebSocket2.ErrorEvent = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vite.mod.WebSocket2.ErrorEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.vite.mod.WebSocket2.ErrorEvent] (val x: Self) extends AnyVal {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: typings.vite.mod.WebSocket2.WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Event extends StObject {
    
    var target: typings.vite.mod.WebSocket2.WebSocket
    
    var `type`: String
  }
  object Event {
    
    inline def apply(target: typings.vite.mod.WebSocket2.WebSocket, `type`: String): typings.vite.mod.WebSocket2.Event = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vite.mod.WebSocket2.Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.vite.mod.WebSocket2.Event] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: typings.vite.mod.WebSocket2.WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventListenerOptions extends StObject {
    
    var once: js.UndefOr[Boolean] = js.undefined
  }
  object EventListenerOptions {
    
    inline def apply(): typings.vite.mod.WebSocket2.EventListenerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vite.mod.WebSocket2.EventListenerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.vite.mod.WebSocket2.EventListenerOptions] (val x: Self) extends AnyVal {
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    }
  }
  
  trait MessageEvent extends StObject {
    
    var data: Data
    
    var target: typings.vite.mod.WebSocket2.WebSocket
    
    var `type`: String
  }
  object MessageEvent {
    
    inline def apply(data: Data, target: typings.vite.mod.WebSocket2.WebSocket, `type`: String): typings.vite.mod.WebSocket2.MessageEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vite.mod.WebSocket2.MessageEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.vite.mod.WebSocket2.MessageEvent] (val x: Self) extends AnyVal {
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Buffer*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setTarget(value: typings.vite.mod.WebSocket2.WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PerMessageDeflateOptions extends StObject {
    
    var clientMaxWindowBits: js.UndefOr[Double] = js.undefined
    
    var clientNoContextTakeover: js.UndefOr[Boolean] = js.undefined
    
    var concurrencyLimit: js.UndefOr[Double] = js.undefined
    
    var serverMaxWindowBits: js.UndefOr[Double] = js.undefined
    
    var serverNoContextTakeover: js.UndefOr[Boolean] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var zlibDeflateOptions: js.UndefOr[ChunkSize] = js.undefined
    
    var zlibInflateOptions: js.UndefOr[ZlibOptions] = js.undefined
  }
  object PerMessageDeflateOptions {
    
    inline def apply(): PerMessageDeflateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PerMessageDeflateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PerMessageDeflateOptions] (val x: Self) extends AnyVal {
      
      inline def setClientMaxWindowBits(value: Double): Self = StObject.set(x, "clientMaxWindowBits", value.asInstanceOf[js.Any])
      
      inline def setClientMaxWindowBitsUndefined: Self = StObject.set(x, "clientMaxWindowBits", js.undefined)
      
      inline def setClientNoContextTakeover(value: Boolean): Self = StObject.set(x, "clientNoContextTakeover", value.asInstanceOf[js.Any])
      
      inline def setClientNoContextTakeoverUndefined: Self = StObject.set(x, "clientNoContextTakeover", js.undefined)
      
      inline def setConcurrencyLimit(value: Double): Self = StObject.set(x, "concurrencyLimit", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyLimitUndefined: Self = StObject.set(x, "concurrencyLimit", js.undefined)
      
      inline def setServerMaxWindowBits(value: Double): Self = StObject.set(x, "serverMaxWindowBits", value.asInstanceOf[js.Any])
      
      inline def setServerMaxWindowBitsUndefined: Self = StObject.set(x, "serverMaxWindowBits", js.undefined)
      
      inline def setServerNoContextTakeover(value: Boolean): Self = StObject.set(x, "serverNoContextTakeover", value.asInstanceOf[js.Any])
      
      inline def setServerNoContextTakeoverUndefined: Self = StObject.set(x, "serverNoContextTakeover", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setZlibDeflateOptions(value: ChunkSize): Self = StObject.set(x, "zlibDeflateOptions", value.asInstanceOf[js.Any])
      
      inline def setZlibDeflateOptionsUndefined: Self = StObject.set(x, "zlibDeflateOptions", js.undefined)
      
      inline def setZlibInflateOptions(value: ZlibOptions): Self = StObject.set(x, "zlibInflateOptions", value.asInstanceOf[js.Any])
      
      inline def setZlibInflateOptionsUndefined: Self = StObject.set(x, "zlibInflateOptions", js.undefined)
    }
  }
  
  /**
    * Data represents the raw message payload received over the WebSocket.
    */
  type RawData = Buffer | js.typedarray.ArrayBuffer | js.Array[Buffer]
  
  // WebSocket Server
  @js.native
  trait Server[T /* <: typings.vite.mod.WebSocket2.WebSocket */] extends EventEmitter {
    
    def addListener(event: close | listening, cb: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_connection(event: connection, cb: js.Function2[/* client */ T, /* request */ IncomingMessage, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_headers(
      event: headers,
      cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    
    def address(): AddressInfo | String = js.native
    
    var clients: Set[T] = js.native
    
    def close(): Unit = js.native
    def close(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def handleUpgrade(
      request: IncomingMessage,
      socket: Duplex,
      upgradeHead: Buffer,
      callback: js.Function2[/* client */ T, /* request */ IncomingMessage, Unit]
    ): Unit = js.native
    
    def off(event: close | listening, cb: js.ThisFunction0[/* this */ Server[T], Unit]): this.type = js.native
    def off(event: String, listener: js.ThisFunction1[/* this */ Server[T], /* repeated */ Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.ThisFunction1[/* this */ Server[T], /* repeated */ Any, Unit]): this.type = js.native
    @JSName("off")
    def off_connection(
      event: connection,
      cb: js.ThisFunction2[/* this */ Server[T], /* socket */ T, /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("off")
    def off_error(event: error, cb: js.ThisFunction1[/* this */ Server[T], /* error */ js.Error, Unit]): this.type = js.native
    @JSName("off")
    def off_headers(
      event: headers,
      cb: js.ThisFunction2[
          /* this */ Server[T], 
          /* headers */ js.Array[String], 
          /* request */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    
    def on(event: close | listening, cb: js.ThisFunction0[/* this */ Server[T], Unit]): this.type = js.native
    def on(event: String, listener: js.ThisFunction1[/* this */ Server[T], /* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.ThisFunction1[/* this */ Server[T], /* repeated */ Any, Unit]): this.type = js.native
    // Events
    @JSName("on")
    def on_connection(
      event: connection,
      cb: js.ThisFunction2[/* this */ Server[T], /* socket */ T, /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.ThisFunction1[/* this */ Server[T], /* error */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_headers(
      event: headers,
      cb: js.ThisFunction2[
          /* this */ Server[T], 
          /* headers */ js.Array[String], 
          /* request */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    
    def once(event: close | listening, cb: js.ThisFunction0[/* this */ Server[T], Unit]): this.type = js.native
    def once(event: String, listener: js.ThisFunction1[/* this */ Server[T], /* repeated */ Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.ThisFunction1[/* this */ Server[T], /* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_connection(
      event: connection,
      cb: js.ThisFunction2[/* this */ Server[T], /* socket */ T, /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_error(event: error, cb: js.ThisFunction1[/* this */ Server[T], /* error */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_headers(
      event: headers,
      cb: js.ThisFunction2[
          /* this */ Server[T], 
          /* headers */ js.Array[String], 
          /* request */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    
    var options: typings.vite.mod.WebSocket2.ServerOptions = js.native
    
    var path: String = js.native
    
    def removeListener(event: close | listening, cb: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_connection(event: connection, cb: js.Function1[/* client */ T, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_headers(
      event: headers,
      cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    
    def shouldHandle(request: IncomingMessage): Boolean | js.Promise[Boolean] = js.native
  }
  
  trait ServerOptions extends StObject {
    
    var WebSocket: js.UndefOr[TypeofWebSocket] = js.undefined
    
    var backlog: js.UndefOr[Double] = js.undefined
    
    var clientTracking: js.UndefOr[Boolean] = js.undefined
    
    var handleProtocols: js.UndefOr[
        js.Function2[/* protocols */ Set[String], /* request */ IncomingMessage, String | `false`]
      ] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var maxPayload: js.UndefOr[Double] = js.undefined
    
    var noServer: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var perMessageDeflate: js.UndefOr[Boolean | PerMessageDeflateOptions] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var server: js.UndefOr[
        Server[typings.vite.mod.WebSocket2.WebSocket] | (typings.node.nodeColonhttpsMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ])
      ] = js.undefined
    
    var skipUTF8Validation: js.UndefOr[Boolean] = js.undefined
    
    var verifyClient: js.UndefOr[VerifyClientCallbackAsync | VerifyClientCallbackSync] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): typings.vite.mod.WebSocket2.ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vite.mod.WebSocket2.ServerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.vite.mod.WebSocket2.ServerOptions] (val x: Self) extends AnyVal {
      
      inline def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
      
      inline def setBacklogUndefined: Self = StObject.set(x, "backlog", js.undefined)
      
      inline def setClientTracking(value: Boolean): Self = StObject.set(x, "clientTracking", value.asInstanceOf[js.Any])
      
      inline def setClientTrackingUndefined: Self = StObject.set(x, "clientTracking", js.undefined)
      
      inline def setHandleProtocols(value: (/* protocols */ Set[String], /* request */ IncomingMessage) => String | `false`): Self = StObject.set(x, "handleProtocols", js.Any.fromFunction2(value))
      
      inline def setHandleProtocolsUndefined: Self = StObject.set(x, "handleProtocols", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setMaxPayload(value: Double): Self = StObject.set(x, "maxPayload", value.asInstanceOf[js.Any])
      
      inline def setMaxPayloadUndefined: Self = StObject.set(x, "maxPayload", js.undefined)
      
      inline def setNoServer(value: Boolean): Self = StObject.set(x, "noServer", value.asInstanceOf[js.Any])
      
      inline def setNoServerUndefined: Self = StObject.set(x, "noServer", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPerMessageDeflate(value: Boolean | PerMessageDeflateOptions): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
      inline def setPerMessageDeflateUndefined: Self = StObject.set(x, "perMessageDeflate", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setServer(
        value: Server[typings.vite.mod.WebSocket2.WebSocket] | (typings.node.nodeColonhttpsMod.Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[typings.node.httpMod.IncomingMessage]
              ]
            ])
      ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setSkipUTF8Validation(value: Boolean): Self = StObject.set(x, "skipUTF8Validation", value.asInstanceOf[js.Any])
      
      inline def setSkipUTF8ValidationUndefined: Self = StObject.set(x, "skipUTF8Validation", js.undefined)
      
      inline def setVerifyClient(value: VerifyClientCallbackAsync | VerifyClientCallbackSync): Self = StObject.set(x, "verifyClient", value.asInstanceOf[js.Any])
      
      inline def setVerifyClientFunction1(value: /* info */ Origin => Boolean): Self = StObject.set(x, "verifyClient", js.Any.fromFunction1(value))
      
      inline def setVerifyClientFunction2(
        value: (/* info */ Origin, /* callback */ js.Function4[
              /* res */ Boolean, 
              /* code */ js.UndefOr[Double], 
              /* message */ js.UndefOr[String], 
              /* headers */ js.UndefOr[OutgoingHttpHeaders], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "verifyClient", js.Any.fromFunction2(value))
      
      inline def setVerifyClientUndefined: Self = StObject.set(x, "verifyClient", js.undefined)
      
      inline def setWebSocket(value: TypeofWebSocket): Self = StObject.set(x, "WebSocket", value.asInstanceOf[js.Any])
      
      inline def setWebSocketUndefined: Self = StObject.set(x, "WebSocket", js.undefined)
    }
  }
  
  /**
    * VerifyClientCallbackAsync is an asynchronous callback used to inspect the
    * incoming message. The return value (boolean) of the function determines
    * whether or not to accept the handshake.
    */
  type VerifyClientCallbackAsync = js.Function2[
    /* info */ Origin, 
    /* callback */ js.Function4[
      /* res */ Boolean, 
      /* code */ js.UndefOr[Double], 
      /* message */ js.UndefOr[String], 
      /* headers */ js.UndefOr[OutgoingHttpHeaders], 
      Unit
    ], 
    Unit
  ]
  
  /**
    * VerifyClientCallbackSync is a synchronous callback used to inspect the
    * incoming message. The return value (boolean) of the function determines
    * whether or not to accept the handshake.
    */
  type VerifyClientCallbackSync = js.Function1[/* info */ Origin, Boolean]
  
  type WebSocket = WebSocketAlias
  
  // WebSocket Server
  /* was `typeof Server` */
  @js.native
  trait WebSocketServer[T /* <: typings.vite.mod.WebSocket2.WebSocket */]
    extends Server[T | typings.vite.mod.WebSocket2.WebSocket]
}
