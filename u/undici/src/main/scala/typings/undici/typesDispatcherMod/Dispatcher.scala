package typings.undici.typesDispatcherMod

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.node.urlMod.URL_
import typings.std.Blob
import typings.std.Record
import typings.undici.anon.Headers
import typings.undici.typesDispatcherMod.Dispatcher.ConnectData
import typings.undici.typesDispatcherMod.Dispatcher.ConnectOptions
import typings.undici.typesDispatcherMod.Dispatcher.DispatchHandlers
import typings.undici.typesDispatcherMod.Dispatcher.DispatchOptions
import typings.undici.typesDispatcherMod.Dispatcher.PipelineHandler
import typings.undici.typesDispatcherMod.Dispatcher.PipelineOptions
import typings.undici.typesDispatcherMod.Dispatcher.RequestOptions
import typings.undici.typesDispatcherMod.Dispatcher.ResponseData
import typings.undici.typesDispatcherMod.Dispatcher.StreamData
import typings.undici.typesDispatcherMod.Dispatcher.StreamFactory
import typings.undici.typesDispatcherMod.Dispatcher.UpgradeData
import typings.undici.typesDispatcherMod.Dispatcher.UpgradeOptions
import typings.undici.typesErrorsMod.default.UndiciError
import typings.undici.typesFormdataMod.FormData
import typings.undici.typesHeaderMod.IncomingHttpHeaders
import typings.undici.undiciStrings.connect_
import typings.undici.undiciStrings.connectionError
import typings.undici.undiciStrings.disconnect
import typings.undici.undiciStrings.drain
import typings.undici.undiciStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Dispatcher is the core API used to dispatch requests. */
@js.native
trait Dispatcher extends EventEmitter {
  
  @JSName("addListener")
  def addListener_connect(
    eventName: connect_,
    callback: js.Function2[/* origin */ URL_, /* targets */ js.Array[this.type], Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_connectionError(
    eventName: connectionError,
    callback: js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_disconnect(
    eventName: disconnect,
    callback: js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_drain(eventName: drain, callback: js.Function1[/* origin */ URL_, Unit]): this.type = js.native
  
  /** Closes the client and gracefully waits for enqueued requests to complete before invoking the callback (or returning a promise if no callback is provided). */
  def close(): js.Promise[Unit] = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  
  /** Starts two-way communications with the requested resource. */
  def connect(options: ConnectOptions): js.Promise[ConnectData] = js.native
  def connect(
    options: ConnectOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* data */ ConnectData, Unit]
  ): Unit = js.native
  
  /** Destroy the client abruptly with the given err. All the pending and running requests will be asynchronously aborted and error. Waits until socket is closed before invoking the callback (or returning a promise if no callback is provided). Since this operation is asynchronously dispatched there might still be some progress on dispatched requests. */
  def destroy(): js.Promise[Unit] = js.native
  def destroy(callback: js.Function0[Unit]): Unit = js.native
  def destroy(err: js.Error): js.Promise[Unit] = js.native
  def destroy(err: js.Error, callback: js.Function0[Unit]): Unit = js.native
  def destroy(err: Null, callback: js.Function0[Unit]): Unit = js.native
  
  /** Dispatches a request. This API is expected to evolve through semver-major versions and is less stable than the preceding higher level APIs. It is primarily intended for library developers who implement higher level APIs on top of this. */
  def dispatch(options: DispatchOptions, handler: DispatchHandlers): Boolean = js.native
  
  @JSName("emit")
  def emit_connect(eventName: connect_, origin: URL_, targets: js.Array[Dispatcher]): Boolean = js.native
  @JSName("emit")
  def emit_connectionError(eventName: connectionError, origin: URL_, targets: js.Array[Dispatcher], error: UndiciError): Boolean = js.native
  @JSName("emit")
  def emit_disconnect(eventName: disconnect, origin: URL_, targets: js.Array[Dispatcher], error: UndiciError): Boolean = js.native
  @JSName("emit")
  def emit_drain(eventName: drain, origin: URL_): Boolean = js.native
  
  @JSName("listeners")
  def listeners_connect(eventName: connect_): js.Array[js.Function2[/* origin */ URL_, /* targets */ js.Array[this.type], Unit]] = js.native
  @JSName("listeners")
  def listeners_connectionError(eventName: connectionError): js.Array[
    js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ] = js.native
  @JSName("listeners")
  def listeners_disconnect(eventName: disconnect): js.Array[
    js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ] = js.native
  @JSName("listeners")
  def listeners_drain(eventName: drain): js.Array[js.Function1[/* origin */ URL_, Unit]] = js.native
  
  @JSName("off")
  def off_connect(
    eventName: connect_,
    callback: js.Function2[/* origin */ URL_, /* targets */ js.Array[this.type], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_connectionError(
    eventName: connectionError,
    callback: js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_disconnect(
    eventName: disconnect,
    callback: js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_drain(eventName: drain, callback: js.Function1[/* origin */ URL_, Unit]): this.type = js.native
  
  @JSName("on")
  def on_connect(
    eventName: connect_,
    callback: js.Function2[/* origin */ URL_, /* targets */ js.Array[this.type], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connectionError(
    eventName: connectionError,
    callback: js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_disconnect(
    eventName: disconnect,
    callback: js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_drain(eventName: drain, callback: js.Function1[/* origin */ URL_, Unit]): this.type = js.native
  
  @JSName("once")
  def once_connect(
    eventName: connect_,
    callback: js.Function2[/* origin */ URL_, /* targets */ js.Array[this.type], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connectionError(
    eventName: connectionError,
    callback: js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_disconnect(
    eventName: disconnect,
    callback: js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_drain(eventName: drain, callback: js.Function1[/* origin */ URL_, Unit]): this.type = js.native
  
  /** For easy use with `stream.pipeline`. */
  def pipeline(options: PipelineOptions, handler: PipelineHandler): Duplex = js.native
  
  @JSName("prependListener")
  def prependListener_connect(
    eventName: connect_,
    callback: js.Function2[/* origin */ URL_, /* targets */ js.Array[this.type], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_connectionError(
    eventName: connectionError,
    callback: js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(
    eventName: disconnect,
    callback: js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(eventName: drain, callback: js.Function1[/* origin */ URL_, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_connect(
    eventName: connect_,
    callback: js.Function2[/* origin */ URL_, /* targets */ js.Array[this.type], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connectionError(
    eventName: connectionError,
    callback: js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(
    eventName: disconnect,
    callback: js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(eventName: drain, callback: js.Function1[/* origin */ URL_, Unit]): this.type = js.native
  
  @JSName("rawListeners")
  def rawListeners_connect(eventName: connect_): js.Array[js.Function2[/* origin */ URL_, /* targets */ js.Array[this.type], Unit]] = js.native
  @JSName("rawListeners")
  def rawListeners_connectionError(eventName: connectionError): js.Array[
    js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ] = js.native
  @JSName("rawListeners")
  def rawListeners_disconnect(eventName: disconnect): js.Array[
    js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ] = js.native
  @JSName("rawListeners")
  def rawListeners_drain(eventName: drain): js.Array[js.Function1[/* origin */ URL_, Unit]] = js.native
  
  @JSName("removeListener")
  def removeListener_connect(
    eventName: connect_,
    callback: js.Function2[/* origin */ URL_, /* targets */ js.Array[this.type], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_connectionError(
    eventName: connectionError,
    callback: js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_disconnect(
    eventName: disconnect,
    callback: js.Function3[/* origin */ URL_, /* targets */ js.Array[this.type], /* error */ UndiciError, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_drain(eventName: drain, callback: js.Function1[/* origin */ URL_, Unit]): this.type = js.native
  
  /** Performs an HTTP request. */
  def request(options: RequestOptions): js.Promise[ResponseData] = js.native
  def request(
    options: RequestOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* data */ ResponseData, Unit]
  ): Unit = js.native
  
  /** A faster version of `Dispatcher.request`. */
  def stream(options: RequestOptions, factory: StreamFactory): js.Promise[StreamData] = js.native
  def stream(
    options: RequestOptions,
    factory: StreamFactory,
    callback: js.Function2[/* err */ js.Error | Null, /* data */ StreamData, Unit]
  ): Unit = js.native
  
  /** Upgrade to a different protocol. */
  def upgrade(options: UpgradeOptions): js.Promise[UpgradeData] = js.native
  def upgrade(
    options: UpgradeOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* data */ UpgradeData, Unit]
  ): Unit = js.native
}
object Dispatcher {
  
  /**
    * @link https://fetch.spec.whatwg.org/#body-mixin
    */
  trait BodyMixin extends StObject {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
    
    def blob(): js.Promise[Blob]
    
    val body: js.UndefOr[scala.Nothing] = js.undefined
    
    // throws on node v16.6.0
    val bodyUsed: Boolean
    
    def formData(): js.Promise[scala.Nothing]
    
    def json(): js.Promise[Any]
    
    def text(): js.Promise[String]
  }
  object BodyMixin {
    
    inline def apply(
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[Blob],
      bodyUsed: Boolean,
      formData: () => js.Promise[scala.Nothing],
      json: () => js.Promise[Any],
      text: () => js.Promise[String]
    ): BodyMixin = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[BodyMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BodyMixin] (val x: Self) extends AnyVal {
      
      inline def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      inline def setBlob(value: () => js.Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: () => js.Promise[scala.Nothing]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
      
      inline def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
  
  trait ConnectData extends StObject {
    
    var headers: IncomingHttpHeaders
    
    var opaque: Any
    
    var socket: Duplex
    
    var statusCode: Double
  }
  object ConnectData {
    
    inline def apply(headers: IncomingHttpHeaders, opaque: Any, socket: Duplex, statusCode: Double): ConnectData = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectData] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setSocket(value: Duplex): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectOptions extends StObject {
    
    /** Default: `null` */
    var headers: js.UndefOr[IncomingHttpHeaders | js.Array[String] | Null] = js.undefined
    
    /** Default: 0 */
    var maxRedirections: js.UndefOr[Double] = js.undefined
    
    /** This argument parameter is passed through to `ConnectData` */
    var opaque: js.UndefOr[Any] = js.undefined
    
    var path: String
    
    /** Default: `null` */
    var responseHeader: js.UndefOr[raw | Null] = js.undefined
    
    /** Default: `null` */
    var signal: js.UndefOr[AbortSignal | EventEmitter | Null] = js.undefined
  }
  object ConnectOptions {
    
    inline def apply(path: String): ConnectOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: IncomingHttpHeaders | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setMaxRedirections(value: Double): Self = StObject.set(x, "maxRedirections", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectionsUndefined: Self = StObject.set(x, "maxRedirections", js.undefined)
      
      inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setResponseHeader(value: raw): Self = StObject.set(x, "responseHeader", value.asInstanceOf[js.Any])
      
      inline def setResponseHeaderNull: Self = StObject.set(x, "responseHeader", null)
      
      inline def setResponseHeaderUndefined: Self = StObject.set(x, "responseHeader", js.undefined)
      
      inline def setSignal(value: AbortSignal | EventEmitter): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  trait DispatchHandlers extends StObject {
    
    /** Invoked when a body chunk is sent to the server. May be invoked multiple times for chunked requests */
    var onBodySent: js.UndefOr[js.Function2[/* chunkSize */ Double, /* totalBytesSent */ Double, Unit]] = js.undefined
    
    /** Invoked when response payload and trailers have been received and the request has completed. */
    var onComplete: js.UndefOr[js.Function1[/* trailers */ js.Array[String] | Null, Unit]] = js.undefined
    
    /** Invoked before request is dispatched on socket. May be invoked multiple times when a request is retried when the request at the head of the pipeline fails. */
    var onConnect: js.UndefOr[js.Function1[/* abort */ js.Function0[Unit], Unit]] = js.undefined
    
    /** Invoked when response payload data is received. */
    var onData: js.UndefOr[js.Function1[/* chunk */ Buffer, Boolean]] = js.undefined
    
    /** Invoked when an error has occurred. */
    var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    /** Invoked when statusCode and headers have been received. May be invoked multiple times due to 1xx informational headers. */
    var onHeaders: js.UndefOr[
        js.Function3[
          /* statusCode */ Double, 
          /* headers */ (js.Array[Buffer | String]) | Null, 
          /* resume */ js.Function0[Unit], 
          Boolean
        ]
      ] = js.undefined
    
    /** Invoked when request is upgraded either due to a `Upgrade` header or `CONNECT` method. */
    var onUpgrade: js.UndefOr[
        js.Function3[
          /* statusCode */ Double, 
          /* headers */ (js.Array[Buffer | String]) | Null, 
          /* socket */ Duplex, 
          Unit
        ]
      ] = js.undefined
  }
  object DispatchHandlers {
    
    inline def apply(): DispatchHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DispatchHandlers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DispatchHandlers] (val x: Self) extends AnyVal {
      
      inline def setOnBodySent(value: (/* chunkSize */ Double, /* totalBytesSent */ Double) => Unit): Self = StObject.set(x, "onBodySent", js.Any.fromFunction2(value))
      
      inline def setOnBodySentUndefined: Self = StObject.set(x, "onBodySent", js.undefined)
      
      inline def setOnComplete(value: /* trailers */ js.Array[String] | Null => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnConnect(value: /* abort */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction1(value))
      
      inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      inline def setOnData(value: /* chunk */ Buffer => Boolean): Self = StObject.set(x, "onData", js.Any.fromFunction1(value))
      
      inline def setOnDataUndefined: Self = StObject.set(x, "onData", js.undefined)
      
      inline def setOnError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnHeaders(
        value: (/* statusCode */ Double, /* headers */ (js.Array[Buffer | String]) | Null, /* resume */ js.Function0[Unit]) => Boolean
      ): Self = StObject.set(x, "onHeaders", js.Any.fromFunction3(value))
      
      inline def setOnHeadersUndefined: Self = StObject.set(x, "onHeaders", js.undefined)
      
      inline def setOnUpgrade(
        value: (/* statusCode */ Double, /* headers */ (js.Array[Buffer | String]) | Null, /* socket */ Duplex) => Unit
      ): Self = StObject.set(x, "onUpgrade", js.Any.fromFunction3(value))
      
      inline def setOnUpgradeUndefined: Self = StObject.set(x, "onUpgrade", js.undefined)
    }
  }
  
  type DispatchInterceptor = js.Function1[
    /* dispatch */ js.Function2[/* options */ DispatchOptions, /* handler */ DispatchHandlers, Boolean], 
    js.Function2[/* options */ DispatchOptions, /* handler */ DispatchHandlers, Boolean]
  ]
  
  trait DispatchOptions extends StObject {
    
    /** Whether the response is expected to take a long time and would end up blocking the pipeline. When this is set to `true` further pipelining will be avoided on the same connection until headers have been received. */
    var blocking: js.UndefOr[Boolean] = js.undefined
    
    /** Default: `null` */
    var body: js.UndefOr[String | Buffer | js.typedarray.Uint8Array | Readable | Null | FormData] = js.undefined
    
    /** The timeout after which a request will time out, in milliseconds. Monitors time between receiving body data. Use 0 to disable it entirely. Defaults to 300 seconds. */
    var bodyTimeout: js.UndefOr[Double | Null] = js.undefined
    
    /** Default: `null` */
    var headers: js.UndefOr[IncomingHttpHeaders | js.Array[String] | Null] = js.undefined
    
    /** The amount of time the parser will wait to receive the complete HTTP headers. Defaults to 300 seconds. */
    var headersTimeout: js.UndefOr[Double | Null] = js.undefined
    
    /** Whether the requests can be safely retried or not. If `false` the request won't be sent until all preceding requests in the pipeline have completed. Default: `true` if `method` is `HEAD` or `GET`. */
    var idempotent: js.UndefOr[Boolean] = js.undefined
    
    var method: HttpMethod
    
    var origin: js.UndefOr[String | URL_] = js.undefined
    
    var path: String
    
    /** Query string params to be embedded in the request URL. Default: `null` */
    var query: js.UndefOr[Record[String, Any]] = js.undefined
    
    /** Whether the request should stablish a keep-alive or not. Default `false` */
    var reset: js.UndefOr[Boolean] = js.undefined
    
    /** Whether Undici should throw an error upon receiving a 4xx or 5xx response from the server. Defaults to false */
    var throwOnError: js.UndefOr[Boolean] = js.undefined
    
    /** Upgrade the request. Should be used to specify the kind of upgrade i.e. `'Websocket'`. Default: `method === 'CONNECT' || null`. */
    var upgrade: js.UndefOr[Boolean | String | Null] = js.undefined
  }
  object DispatchOptions {
    
    inline def apply(method: HttpMethod, path: String): DispatchOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DispatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DispatchOptions] (val x: Self) extends AnyVal {
      
      inline def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
      
      inline def setBlockingUndefined: Self = StObject.set(x, "blocking", js.undefined)
      
      inline def setBody(value: String | Buffer | js.typedarray.Uint8Array | Readable | FormData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyTimeout(value: Double): Self = StObject.set(x, "bodyTimeout", value.asInstanceOf[js.Any])
      
      inline def setBodyTimeoutNull: Self = StObject.set(x, "bodyTimeout", null)
      
      inline def setBodyTimeoutUndefined: Self = StObject.set(x, "bodyTimeout", js.undefined)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      inline def setHeadersTimeout(value: Double): Self = StObject.set(x, "headersTimeout", value.asInstanceOf[js.Any])
      
      inline def setHeadersTimeoutNull: Self = StObject.set(x, "headersTimeout", null)
      
      inline def setHeadersTimeoutUndefined: Self = StObject.set(x, "headersTimeout", js.undefined)
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIdempotent(value: Boolean): Self = StObject.set(x, "idempotent", value.asInstanceOf[js.Any])
      
      inline def setIdempotentUndefined: Self = StObject.set(x, "idempotent", js.undefined)
      
      inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String | URL_): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Record[String, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setThrowOnError(value: Boolean): Self = StObject.set(x, "throwOnError", value.asInstanceOf[js.Any])
      
      inline def setThrowOnErrorUndefined: Self = StObject.set(x, "throwOnError", js.undefined)
      
      inline def setUpgrade(value: Boolean | String): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      inline def setUpgradeNull: Self = StObject.set(x, "upgrade", null)
      
      inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.undici.undiciStrings.GET
    - typings.undici.undiciStrings.HEAD
    - typings.undici.undiciStrings.POST
    - typings.undici.undiciStrings.PUT
    - typings.undici.undiciStrings.DELETE
    - typings.undici.undiciStrings.CONNECT
    - typings.undici.undiciStrings.OPTIONS
    - typings.undici.undiciStrings.TRACE
    - typings.undici.undiciStrings.PATCH
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def CONNECT: typings.undici.undiciStrings.CONNECT = "CONNECT".asInstanceOf[typings.undici.undiciStrings.CONNECT]
    
    inline def DELETE: typings.undici.undiciStrings.DELETE = "DELETE".asInstanceOf[typings.undici.undiciStrings.DELETE]
    
    inline def GET: typings.undici.undiciStrings.GET = "GET".asInstanceOf[typings.undici.undiciStrings.GET]
    
    inline def HEAD: typings.undici.undiciStrings.HEAD = "HEAD".asInstanceOf[typings.undici.undiciStrings.HEAD]
    
    inline def OPTIONS: typings.undici.undiciStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.undici.undiciStrings.OPTIONS]
    
    inline def PATCH: typings.undici.undiciStrings.PATCH = "PATCH".asInstanceOf[typings.undici.undiciStrings.PATCH]
    
    inline def POST: typings.undici.undiciStrings.POST = "POST".asInstanceOf[typings.undici.undiciStrings.POST]
    
    inline def PUT: typings.undici.undiciStrings.PUT = "PUT".asInstanceOf[typings.undici.undiciStrings.PUT]
    
    inline def TRACE: typings.undici.undiciStrings.TRACE = "TRACE".asInstanceOf[typings.undici.undiciStrings.TRACE]
  }
  
  type PipelineHandler = js.Function1[/* data */ PipelineHandlerData, Readable]
  
  trait PipelineHandlerData extends StObject {
    
    var body: typings.undici.typesReadableMod.default
    
    var context: js.Object
    
    var headers: IncomingHttpHeaders
    
    var opaque: Any
    
    var statusCode: Double
  }
  object PipelineHandlerData {
    
    inline def apply(
      body: typings.undici.typesReadableMod.default,
      context: js.Object,
      headers: IncomingHttpHeaders,
      opaque: Any,
      statusCode: Double
    ): PipelineHandlerData = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineHandlerData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PipelineHandlerData] (val x: Self) extends AnyVal {
      
      inline def setBody(value: typings.undici.typesReadableMod.default): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait PipelineOptions
    extends StObject
       with RequestOptions {
    
    /** `true` if the `handler` will return an object stream. Default: `false` */
    var objectMode: js.UndefOr[Boolean] = js.undefined
  }
  object PipelineOptions {
    
    inline def apply(method: HttpMethod, path: String): PipelineOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PipelineOptions] (val x: Self) extends AnyVal {
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    }
  }
  
  trait RequestOptions
    extends StObject
       with DispatchOptions {
    
    /** Default: `64 KiB` */
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    /** Default: 0 */
    var maxRedirections: js.UndefOr[Double] = js.undefined
    
    /** Default: `null` */
    var onInfo: js.UndefOr[js.Function1[/* info */ Headers, Unit]] = js.undefined
    
    /** Default: `null` */
    var opaque: js.UndefOr[Any] = js.undefined
    
    /** Default: `null` */
    var responseHeader: js.UndefOr[raw | Null] = js.undefined
    
    /** Default: `null` */
    var signal: js.UndefOr[AbortSignal | EventEmitter | Null] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(method: HttpMethod, path: String): RequestOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setMaxRedirections(value: Double): Self = StObject.set(x, "maxRedirections", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectionsUndefined: Self = StObject.set(x, "maxRedirections", js.undefined)
      
      inline def setOnInfo(value: /* info */ Headers => Unit): Self = StObject.set(x, "onInfo", js.Any.fromFunction1(value))
      
      inline def setOnInfoUndefined: Self = StObject.set(x, "onInfo", js.undefined)
      
      inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      inline def setResponseHeader(value: raw): Self = StObject.set(x, "responseHeader", value.asInstanceOf[js.Any])
      
      inline def setResponseHeaderNull: Self = StObject.set(x, "responseHeader", null)
      
      inline def setResponseHeaderUndefined: Self = StObject.set(x, "responseHeader", js.undefined)
      
      inline def setSignal(value: AbortSignal | EventEmitter): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  trait ResponseData extends StObject {
    
    var body: typings.undici.typesReadableMod.default & BodyMixin
    
    var context: js.Object
    
    var headers: IncomingHttpHeaders
    
    var opaque: Any
    
    var statusCode: Double
    
    var trailers: Record[String, String]
  }
  object ResponseData {
    
    inline def apply(
      body: typings.undici.typesReadableMod.default & BodyMixin,
      context: js.Object,
      headers: IncomingHttpHeaders,
      opaque: Any,
      statusCode: Double,
      trailers: Record[String, String]
    ): ResponseData = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseData] (val x: Self) extends AnyVal {
      
      inline def setBody(value: typings.undici.typesReadableMod.default & BodyMixin): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setTrailers(value: Record[String, String]): Self = StObject.set(x, "trailers", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamData extends StObject {
    
    var opaque: Any
    
    var trailers: Record[String, String]
  }
  object StreamData {
    
    inline def apply(opaque: Any, trailers: Record[String, String]): StreamData = {
      val __obj = js.Dynamic.literal(opaque = opaque.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamData] (val x: Self) extends AnyVal {
      
      inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setTrailers(value: Record[String, String]): Self = StObject.set(x, "trailers", value.asInstanceOf[js.Any])
    }
  }
  
  type StreamFactory = js.Function1[/* data */ StreamFactoryData, Writable]
  
  trait StreamFactoryData extends StObject {
    
    var context: js.Object
    
    var headers: IncomingHttpHeaders
    
    var opaque: Any
    
    var statusCode: Double
  }
  object StreamFactoryData {
    
    inline def apply(context: js.Object, headers: IncomingHttpHeaders, opaque: Any, statusCode: Double): StreamFactoryData = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamFactoryData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamFactoryData] (val x: Self) extends AnyVal {
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpgradeData extends StObject {
    
    var headers: IncomingHttpHeaders
    
    var opaque: Any
    
    var socket: Duplex
  }
  object UpgradeData {
    
    inline def apply(headers: IncomingHttpHeaders, opaque: Any, socket: Duplex): UpgradeData = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpgradeData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpgradeData] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setSocket(value: Duplex): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpgradeOptions extends StObject {
    
    /** Default: `null` */
    var headers: js.UndefOr[IncomingHttpHeaders | js.Array[String] | Null] = js.undefined
    
    /** Default: 0 */
    var maxRedirections: js.UndefOr[Double] = js.undefined
    
    /** Default: `'GET'` */
    var method: js.UndefOr[String] = js.undefined
    
    var path: String
    
    /** A string of comma separated protocols, in descending preference order. Default: `'Websocket'` */
    var protocol: js.UndefOr[String] = js.undefined
    
    /** Default: `null` */
    var responseHeader: js.UndefOr[raw | Null] = js.undefined
    
    /** Default: `null` */
    var signal: js.UndefOr[AbortSignal | EventEmitter | Null] = js.undefined
  }
  object UpgradeOptions {
    
    inline def apply(path: String): UpgradeOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpgradeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpgradeOptions] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: IncomingHttpHeaders | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setMaxRedirections(value: Double): Self = StObject.set(x, "maxRedirections", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectionsUndefined: Self = StObject.set(x, "maxRedirections", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setResponseHeader(value: raw): Self = StObject.set(x, "responseHeader", value.asInstanceOf[js.Any])
      
      inline def setResponseHeaderNull: Self = StObject.set(x, "responseHeader", null)
      
      inline def setResponseHeaderUndefined: Self = StObject.set(x, "responseHeader", js.undefined)
      
      inline def setSignal(value: AbortSignal | EventEmitter): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
}
