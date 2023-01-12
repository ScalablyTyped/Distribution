package typings.webpackDevServer

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.anymatch.mod.AnymatchMatcher
import typings.anymatch.mod.AnymatchPattern
import typings.chokidar.mod.AwaitWriteFinishOptions
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.sockjs.anon.Address
import typings.sockjs.mod.Connection
import typings.sockjs.mod.ServerOptions
import typings.std.ArrayBufferLike
import typings.std.Blob
import typings.webpack.mod.WebpackLogger
import typings.webpackDevServer.mod.ExpressErrorRequestHandler
import typings.webpackDevServer.mod.ExpressRequestHandler
import typings.webpackDevServer.webpackDevServerStrings.close
import typings.webpackDevServer.webpackDevServerStrings.connection
import typings.webpackDevServer.webpackDevServerStrings.data
import typings.ws.anon.Binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined sockjs.sockjs.Connection & {  send :ws.ws.WebSocket['send'],   terminate :ws.ws.WebSocket['terminate'],   ping :ws.ws.WebSocket['ping']} & {  isAlive :boolean | undefined} */
  @js.native
  trait ConnectionsendWebSocketse extends StObject {
    
    /**
      * Alias for `emitter.on(eventName, listener)`.
      * @since v0.1.26
      */
    def addListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def addListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    var address: StringDictionary[Address] = js.native
    
    def close(): Boolean = js.native
    def close(code: String): Boolean = js.native
    def close(code: String, reason: String): Boolean = js.native
    def close(code: Unit, reason: String): Boolean = js.native
    
    def destroy(): Unit = js.native
    
    /**
      * Synchronously calls each of the listeners registered for the event named`eventName`, in the order they were registered, passing the supplied arguments
      * to each.
      *
      * Returns `true` if the event had listeners, `false` otherwise.
      *
      * ```js
      * const EventEmitter = require('events');
      * const myEmitter = new EventEmitter();
      *
      * // First listener
      * myEmitter.on('event', function firstListener() {
      *   console.log('Helloooo! first listener');
      * });
      * // Second listener
      * myEmitter.on('event', function secondListener(arg1, arg2) {
      *   console.log(`event with parameters ${arg1}, ${arg2} in second listener`);
      * });
      * // Third listener
      * myEmitter.on('event', function thirdListener(...args) {
      *   const parameters = args.join(', ');
      *   console.log(`event with parameters ${parameters} in third listener`);
      * });
      *
      * console.log(myEmitter.listeners('event'));
      *
      * myEmitter.emit('event', 1, 2, 3, 4, 5);
      *
      * // Prints:
      * // [
      * //   [Function: firstListener],
      * //   [Function: secondListener],
      * //   [Function: thirdListener]
      * // ]
      * // Helloooo! first listener
      * // event with parameters 1, 2 in second listener
      * // event with parameters 1, 2, 3, 4, 5 in third listener
      * ```
      * @since v0.1.26
      */
    def emit(eventName: String, args: Any*): Boolean = js.native
    def emit(eventName: js.Symbol, args: Any*): Boolean = js.native
    
    def end(): this.type = js.native
    def end(cb: js.Function0[Unit]): this.type = js.native
    def end(data: String): this.type = js.native
    def end(data: String, cb: js.Function0[Unit]): this.type = js.native
    def end(data: js.typedarray.Uint8Array): this.type = js.native
    def end(data: js.typedarray.Uint8Array, cb: js.Function0[Unit]): this.type = js.native
    def end(str: String, encoding: Unit, cb: js.Function0[Unit]): this.type = js.native
    def end(str: String, encoding: BufferEncoding): this.type = js.native
    def end(str: String, encoding: BufferEncoding, cb: js.Function0[Unit]): this.type = js.native
    
    /**
      * Returns an array listing the events for which the emitter has registered
      * listeners. The values in the array are strings or `Symbol`s.
      *
      * ```js
      * const EventEmitter = require('events');
      * const myEE = new EventEmitter();
      * myEE.on('foo', () => {});
      * myEE.on('bar', () => {});
      *
      * const sym = Symbol('symbol');
      * myEE.on(sym, () => {});
      *
      * console.log(myEE.eventNames());
      * // Prints: [ 'foo', 'bar', Symbol(symbol) ]
      * ```
      * @since v6.0.0
      */
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    /**
      * Returns the current max listener value for the `EventEmitter` which is either
      * set by `emitter.setMaxListeners(n)` or defaults to {@link defaultMaxListeners}.
      * @since v1.0.0
      */
    def getMaxListeners(): Double = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var id: String = js.native
    
    var isAlive: js.UndefOr[Boolean] = js.native
    
    def isPaused(): Boolean = js.native
    
    /**
      * Returns the number of listeners listening to the event named `eventName`.
      * @since v3.2.0
      * @param eventName The name of the event being listened for
      */
    def listenerCount(eventName: String): Double = js.native
    def listenerCount(eventName: js.Symbol): Double = js.native
    
    /**
      * Returns a copy of the array of listeners for the event named `eventName`.
      *
      * ```js
      * server.on('connection', (stream) => {
      *   console.log('someone connected!');
      * });
      * console.log(util.inspect(server.listeners('connection')));
      * // Prints: [ [Function] ]
      * ```
      * @since v0.1.26
      */
    def listeners(eventName: String): js.Array[js.Function] = js.native
    def listeners(eventName: js.Symbol): js.Array[js.Function] = js.native
    
    /**
      * Alias for `emitter.removeListener()`.
      * @since v10.0.0
      */
    def off(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def off(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds the `listener` function to the end of the listeners array for the
      * event named `eventName`. No checks are made to see if the `listener` has
      * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
      * times.
      *
      * ```js
      * server.on('connection', (stream) => {
      *   console.log('someone connected!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      *
      * By default, event listeners are invoked in the order they are added. The`emitter.prependListener()` method can be used as an alternative to add the
      * event listener to the beginning of the listeners array.
      *
      * ```js
      * const myEE = new EventEmitter();
      * myEE.on('foo', () => console.log('a'));
      * myEE.prependListener('foo', () => console.log('b'));
      * myEE.emit('foo');
      * // Prints:
      * //   b
      * //   a
      * ```
      * @since v0.1.101
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    def on(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* message */ String, Any]): this.type = js.native
    
    /**
      * Adds a **one-time**`listener` function for the event named `eventName`. The
      * next time `eventName` is triggered, this listener is removed and then invoked.
      *
      * ```js
      * server.once('connection', (stream) => {
      *   console.log('Ah, we have our first user!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      *
      * By default, event listeners are invoked in the order they are added. The`emitter.prependOnceListener()` method can be used as an alternative to add the
      * event listener to the beginning of the listeners array.
      *
      * ```js
      * const myEE = new EventEmitter();
      * myEE.once('foo', () => console.log('a'));
      * myEE.prependOnceListener('foo', () => console.log('b'));
      * myEE.emit('foo');
      * // Prints:
      * //   b
      * //   a
      * ```
      * @since v0.3.0
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    def once(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def once(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    var pathname: String = js.native
    
    def pause(): this.type = js.native
    
    def ping(): Unit = js.native
    def ping(data: Any): Unit = js.native
    def ping(data: Any, mask: Boolean): Unit = js.native
    def ping(data: Any, mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def ping(data: Any, mask: Unit, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def ping(data: Unit, mask: Boolean): Unit = js.native
    def ping(data: Unit, mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def ping(data: Unit, mask: Unit, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("ping")
    var ping_Original: FnCallDataMaskCb = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    var prefix: String = js.native
    
    /**
      * Adds the `listener` function to the _beginning_ of the listeners array for the
      * event named `eventName`. No checks are made to see if the `listener` has
      * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
      * times.
      *
      * ```js
      * server.prependListener('connection', (stream) => {
      *   console.log('someone connected!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v6.0.0
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    def prependListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a **one-time**`listener` function for the event named `eventName` to the _beginning_ of the listeners array. The next time `eventName` is triggered, this
      * listener is removed, and then invoked.
      *
      * ```js
      * server.prependOnceListener('connection', (stream) => {
      *   console.log('Ah, we have our first user!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v6.0.0
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    def prependOnceListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependOnceListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    var protocol: String = js.native
    
    /**
      * Returns a copy of the array of listeners for the event named `eventName`,
      * including any wrappers (such as those created by `.once()`).
      *
      * ```js
      * const emitter = new EventEmitter();
      * emitter.once('log', () => console.log('log once'));
      *
      * // Returns a new Array with a function `onceWrapper` which has a property
      * // `listener` which contains the original listener bound above
      * const listeners = emitter.rawListeners('log');
      * const logFnWrapper = listeners[0];
      *
      * // Logs "log once" to the console and does not unbind the `once` event
      * logFnWrapper.listener();
      *
      * // Logs "log once" to the console and removes the listener
      * logFnWrapper();
      *
      * emitter.on('log', () => console.log('log persistently'));
      * // Will return a new Array with a single function bound by `.on()` above
      * const newListeners = emitter.rawListeners('log');
      *
      * // Logs "log persistently" twice
      * newListeners[0]();
      * emitter.emit('log');
      * ```
      * @since v9.4.0
      */
    def rawListeners(eventName: String): js.Array[js.Function] = js.native
    def rawListeners(eventName: js.Symbol): js.Array[js.Function] = js.native
    
    def read(): String | Buffer = js.native
    def read(size: Double): String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    var readyState: Double = js.native
    
    var remoteAddress: String = js.native
    
    var remotePort: Double = js.native
    
    /**
      * Removes all listeners, or those of the specified `eventName`.
      *
      * It is bad practice to remove listeners added elsewhere in the code,
      * particularly when the `EventEmitter` instance was created by some other
      * component or module (e.g. sockets or file streams).
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v0.1.26
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    /**
      * Removes the specified `listener` from the listener array for the event named`eventName`.
      *
      * ```js
      * const callback = (stream) => {
      *   console.log('someone connected!');
      * };
      * server.on('connection', callback);
      * // ...
      * server.removeListener('connection', callback);
      * ```
      *
      * `removeListener()` will remove, at most, one instance of a listener from the
      * listener array. If any single listener has been added multiple times to the
      * listener array for the specified `eventName`, then `removeListener()` must be
      * called multiple times to remove each instance.
      *
      * Once an event is emitted, all listeners attached to it at the
      * time of emitting are called in order. This implies that any`removeListener()` or `removeAllListeners()` calls _after_ emitting and _before_ the last listener finishes execution
      * will not remove them from`emit()` in progress. Subsequent events behave as expected.
      *
      * ```js
      * const myEmitter = new MyEmitter();
      *
      * const callbackA = () => {
      *   console.log('A');
      *   myEmitter.removeListener('event', callbackB);
      * };
      *
      * const callbackB = () => {
      *   console.log('B');
      * };
      *
      * myEmitter.on('event', callbackA);
      *
      * myEmitter.on('event', callbackB);
      *
      * // callbackA removes listener callbackB but it will still be called.
      * // Internal listener array at time of emit [callbackA, callbackB]
      * myEmitter.emit('event');
      * // Prints:
      * //   A
      * //   B
      *
      * // callbackB is now removed.
      * // Internal listener array [callbackA]
      * myEmitter.emit('event');
      * // Prints:
      * //   A
      * ```
      *
      * Because listeners are managed using an internal array, calling this will
      * change the position indices of any listener registered _after_ the listener
      * being removed. This will not impact the order in which listeners are called,
      * but it means that any copies of the listener array as returned by
      * the `emitter.listeners()` method will need to be recreated.
      *
      * When a single function has been added as a handler multiple times for a single
      * event (as in the example below), `removeListener()` will remove the most
      * recently added instance. In the example the `once('ping')`listener is removed:
      *
      * ```js
      * const ee = new EventEmitter();
      *
      * function pong() {
      *   console.log('pong');
      * }
      *
      * ee.on('ping', pong);
      * ee.once('ping', pong);
      * ee.removeListener('ping', pong);
      *
      * ee.emit('ping');
      * ee.emit('ping');
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v0.1.26
      */
    def removeListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def removeListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    def resume(): this.type = js.native
    
    def send(data: String): Unit = js.native
    def send(data: js.typedarray.ArrayBufferView): Unit = js.native
    def send(data: Any): Unit = js.native
    def send(data: Any, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def send(data: Any, options: Binary): Unit = js.native
    def send(data: Any, options: Binary, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def send(data: ArrayBufferLike): Unit = js.native
    def send(data: Blob): Unit = js.native
    @JSName("send")
    var send_Original: FnCall = js.native
    
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    
    /**
      * By default `EventEmitter`s will print a warning if more than `10` listeners are
      * added for a particular event. This is a useful default that helps finding
      * memory leaks. The `emitter.setMaxListeners()` method allows the limit to be
      * modified for this specific `EventEmitter` instance. The value can be set to`Infinity` (or `0`) to indicate an unlimited number of listeners.
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v0.3.5
      */
    def setMaxListeners(n: Double): this.type = js.native
    
    def terminate(): Unit = js.native
    @JSName("terminate")
    var terminate_Original: js.Function0[Unit] = js.native
    
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    
    def unshift(chunk: String): Unit = js.native
    def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.typedarray.Uint8Array): Unit = js.native
    def unshift(chunk: js.typedarray.Uint8Array, encoding: BufferEncoding): Unit = js.native
    
    var url: String = js.native
    
    def wrap(oldStream: ReadableStream): this.type = js.native
    
    var writable: Boolean = js.native
    
    def write(buffer: String): Boolean = js.native
    def write(buffer: String, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
    def write(buffer: js.typedarray.Uint8Array): Boolean = js.native
    def write(buffer: js.typedarray.Uint8Array, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
    def write(str: String, encoding: Unit, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
    def write(str: String, encoding: BufferEncoding): Boolean = js.native
    def write(
      str: String,
      encoding: BufferEncoding,
      cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Boolean = js.native
  }
  
  trait Errors extends StObject {
    
    var errors: js.UndefOr[Boolean] = js.undefined
    
    var warnings: js.UndefOr[Boolean] = js.undefined
  }
  object Errors {
    
    inline def apply(): Errors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(data: String): Unit = js.native
    def apply(data: js.typedarray.ArrayBufferView): Unit = js.native
    def apply(data: Any): Unit = js.native
    def apply(data: Any, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def apply(data: Any, options: Binary): Unit = js.native
    def apply(data: Any, options: Binary, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def apply(data: ArrayBufferLike): Unit = js.native
    def apply(data: Blob): Unit = js.native
  }
  
  @js.native
  trait FnCallCb extends StObject {
    
    def apply(): Unit = js.native
    def apply(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  }
  
  @js.native
  trait FnCallDataMaskCb extends StObject {
    
    def apply(): Unit = js.native
    def apply(data: Any): Unit = js.native
    def apply(data: Any, mask: Boolean): Unit = js.native
    def apply(data: Any, mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def apply(data: Any, mask: Unit, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def apply(data: Unit, mask: Boolean): Unit = js.native
    def apply(data: Unit, mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def apply(data: Unit, mask: Unit, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  }
  
  @js.native
  trait FnCallName extends StObject {
    
    def apply(name: String): WebpackLogger = js.native
    def apply(name: js.Function0[String]): WebpackLogger = js.native
  }
  
  trait IsAlive extends StObject {
    
    var isAlive: js.UndefOr[Boolean] = js.undefined
  }
  object IsAlive {
    
    inline def apply(): IsAlive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsAlive]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsAlive] (val x: Self) extends AnyVal {
      
      inline def setIsAlive(value: Boolean): Self = StObject.set(x, "isAlive", value.asInstanceOf[js.Any])
      
      inline def setIsAliveUndefined: Self = StObject.set(x, "isAlive", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var value: String
  }
  object Key {
    
    inline def apply(key: String, value: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Middleware extends StObject {
    
    var middleware: ExpressRequestHandler | ExpressErrorRequestHandler
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object Middleware {
    
    inline def apply(middleware: ExpressRequestHandler | ExpressErrorRequestHandler): Middleware = {
      val __obj = js.Dynamic.literal(middleware = middleware.asInstanceOf[js.Any])
      __obj.asInstanceOf[Middleware]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Middleware] (val x: Self) extends AnyVal {
      
      inline def setMiddleware(value: ExpressRequestHandler | ExpressErrorRequestHandler): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait Plain extends StObject {
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var protocols: js.UndefOr[js.Array[String]] = js.undefined
    
    var ssl: js.UndefOr[Boolean] = js.undefined
    
    var `x-forwarded-for`: js.UndefOr[String] = js.undefined
  }
  object Plain {
    
    inline def apply(): Plain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plain] (val x: Self) extends AnyVal {
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def `setX-forwarded-for`(value: String): Self = StObject.set(x, "x-forwarded-for", value.asInstanceOf[js.Any])
      
      inline def `setX-forwarded-forUndefined`: Self = StObject.set(x, "x-forwarded-for", js.undefined)
    }
  }
  
  /* Inlined sockjs.sockjs.Server & {  close :ws.ws.WebSocketServer['close']} */
  @js.native
  trait ServercloseWebSocketServe extends StObject {
    
    /**
      * Alias for `emitter.on(eventName, listener)`.
      * @since v0.1.26
      */
    def addListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def addListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    def close(): Unit = js.native
    def close(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    @JSName("close")
    var close_Original: FnCallCb = js.native
    
    /**
      * Synchronously calls each of the listeners registered for the event named`eventName`, in the order they were registered, passing the supplied arguments
      * to each.
      *
      * Returns `true` if the event had listeners, `false` otherwise.
      *
      * ```js
      * const EventEmitter = require('events');
      * const myEmitter = new EventEmitter();
      *
      * // First listener
      * myEmitter.on('event', function firstListener() {
      *   console.log('Helloooo! first listener');
      * });
      * // Second listener
      * myEmitter.on('event', function secondListener(arg1, arg2) {
      *   console.log(`event with parameters ${arg1}, ${arg2} in second listener`);
      * });
      * // Third listener
      * myEmitter.on('event', function thirdListener(...args) {
      *   const parameters = args.join(', ');
      *   console.log(`event with parameters ${parameters} in third listener`);
      * });
      *
      * console.log(myEmitter.listeners('event'));
      *
      * myEmitter.emit('event', 1, 2, 3, 4, 5);
      *
      * // Prints:
      * // [
      * //   [Function: firstListener],
      * //   [Function: secondListener],
      * //   [Function: thirdListener]
      * // ]
      * // Helloooo! first listener
      * // event with parameters 1, 2 in second listener
      * // event with parameters 1, 2, 3, 4, 5 in third listener
      * ```
      * @since v0.1.26
      */
    def emit(eventName: String, args: Any*): Boolean = js.native
    def emit(eventName: js.Symbol, args: Any*): Boolean = js.native
    
    /**
      * Returns an array listing the events for which the emitter has registered
      * listeners. The values in the array are strings or `Symbol`s.
      *
      * ```js
      * const EventEmitter = require('events');
      * const myEE = new EventEmitter();
      * myEE.on('foo', () => {});
      * myEE.on('bar', () => {});
      *
      * const sym = Symbol('symbol');
      * myEE.on(sym, () => {});
      *
      * console.log(myEE.eventNames());
      * // Prints: [ 'foo', 'bar', Symbol(symbol) ]
      * ```
      * @since v6.0.0
      */
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    /**
      * Returns the current max listener value for the `EventEmitter` which is either
      * set by `emitter.setMaxListeners(n)` or defaults to {@link defaultMaxListeners}.
      * @since v1.0.0
      */
    def getMaxListeners(): Double = js.native
    
    def installHandlers(
      server: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Any = js.native
    def installHandlers(
      server: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ],
      options: ServerOptions
    ): Any = js.native
    
    /**
      * Returns the number of listeners listening to the event named `eventName`.
      * @since v3.2.0
      * @param eventName The name of the event being listened for
      */
    def listenerCount(eventName: String): Double = js.native
    def listenerCount(eventName: js.Symbol): Double = js.native
    
    /**
      * Returns a copy of the array of listeners for the event named `eventName`.
      *
      * ```js
      * server.on('connection', (stream) => {
      *   console.log('someone connected!');
      * });
      * console.log(util.inspect(server.listeners('connection')));
      * // Prints: [ [Function] ]
      * ```
      * @since v0.1.26
      */
    def listeners(eventName: String): js.Array[js.Function] = js.native
    def listeners(eventName: js.Symbol): js.Array[js.Function] = js.native
    
    /**
      * Alias for `emitter.removeListener()`.
      * @since v10.0.0
      */
    def off(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def off(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds the `listener` function to the end of the listeners array for the
      * event named `eventName`. No checks are made to see if the `listener` has
      * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
      * times.
      *
      * ```js
      * server.on('connection', (stream) => {
      *   console.log('someone connected!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      *
      * By default, event listeners are invoked in the order they are added. The`emitter.prependListener()` method can be used as an alternative to add the
      * event listener to the beginning of the listeners array.
      *
      * ```js
      * const myEE = new EventEmitter();
      * myEE.on('foo', () => console.log('a'));
      * myEE.prependListener('foo', () => console.log('b'));
      * myEE.emit('foo');
      * // Prints:
      * //   b
      * //   a
      * ```
      * @since v0.1.101
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    def on(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_connection(event: connection, listener: js.Function1[/* conn */ Connection, Any]): this.type = js.native
    
    /**
      * Adds a **one-time**`listener` function for the event named `eventName`. The
      * next time `eventName` is triggered, this listener is removed and then invoked.
      *
      * ```js
      * server.once('connection', (stream) => {
      *   console.log('Ah, we have our first user!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      *
      * By default, event listeners are invoked in the order they are added. The`emitter.prependOnceListener()` method can be used as an alternative to add the
      * event listener to the beginning of the listeners array.
      *
      * ```js
      * const myEE = new EventEmitter();
      * myEE.once('foo', () => console.log('a'));
      * myEE.prependOnceListener('foo', () => console.log('b'));
      * myEE.emit('foo');
      * // Prints:
      * //   b
      * //   a
      * ```
      * @since v0.3.0
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    def once(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def once(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds the `listener` function to the _beginning_ of the listeners array for the
      * event named `eventName`. No checks are made to see if the `listener` has
      * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
      * times.
      *
      * ```js
      * server.prependListener('connection', (stream) => {
      *   console.log('someone connected!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v6.0.0
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    def prependListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a **one-time**`listener` function for the event named `eventName` to the _beginning_ of the listeners array. The next time `eventName` is triggered, this
      * listener is removed, and then invoked.
      *
      * ```js
      * server.prependOnceListener('connection', (stream) => {
      *   console.log('Ah, we have our first user!');
      * });
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v6.0.0
      * @param eventName The name of the event.
      * @param listener The callback function
      */
    def prependOnceListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependOnceListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Returns a copy of the array of listeners for the event named `eventName`,
      * including any wrappers (such as those created by `.once()`).
      *
      * ```js
      * const emitter = new EventEmitter();
      * emitter.once('log', () => console.log('log once'));
      *
      * // Returns a new Array with a function `onceWrapper` which has a property
      * // `listener` which contains the original listener bound above
      * const listeners = emitter.rawListeners('log');
      * const logFnWrapper = listeners[0];
      *
      * // Logs "log once" to the console and does not unbind the `once` event
      * logFnWrapper.listener();
      *
      * // Logs "log once" to the console and removes the listener
      * logFnWrapper();
      *
      * emitter.on('log', () => console.log('log persistently'));
      * // Will return a new Array with a single function bound by `.on()` above
      * const newListeners = emitter.rawListeners('log');
      *
      * // Logs "log persistently" twice
      * newListeners[0]();
      * emitter.emit('log');
      * ```
      * @since v9.4.0
      */
    def rawListeners(eventName: String): js.Array[js.Function] = js.native
    def rawListeners(eventName: js.Symbol): js.Array[js.Function] = js.native
    
    /**
      * Removes all listeners, or those of the specified `eventName`.
      *
      * It is bad practice to remove listeners added elsewhere in the code,
      * particularly when the `EventEmitter` instance was created by some other
      * component or module (e.g. sockets or file streams).
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v0.1.26
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    /**
      * Removes the specified `listener` from the listener array for the event named`eventName`.
      *
      * ```js
      * const callback = (stream) => {
      *   console.log('someone connected!');
      * };
      * server.on('connection', callback);
      * // ...
      * server.removeListener('connection', callback);
      * ```
      *
      * `removeListener()` will remove, at most, one instance of a listener from the
      * listener array. If any single listener has been added multiple times to the
      * listener array for the specified `eventName`, then `removeListener()` must be
      * called multiple times to remove each instance.
      *
      * Once an event is emitted, all listeners attached to it at the
      * time of emitting are called in order. This implies that any`removeListener()` or `removeAllListeners()` calls _after_ emitting and _before_ the last listener finishes execution
      * will not remove them from`emit()` in progress. Subsequent events behave as expected.
      *
      * ```js
      * const myEmitter = new MyEmitter();
      *
      * const callbackA = () => {
      *   console.log('A');
      *   myEmitter.removeListener('event', callbackB);
      * };
      *
      * const callbackB = () => {
      *   console.log('B');
      * };
      *
      * myEmitter.on('event', callbackA);
      *
      * myEmitter.on('event', callbackB);
      *
      * // callbackA removes listener callbackB but it will still be called.
      * // Internal listener array at time of emit [callbackA, callbackB]
      * myEmitter.emit('event');
      * // Prints:
      * //   A
      * //   B
      *
      * // callbackB is now removed.
      * // Internal listener array [callbackA]
      * myEmitter.emit('event');
      * // Prints:
      * //   A
      * ```
      *
      * Because listeners are managed using an internal array, calling this will
      * change the position indices of any listener registered _after_ the listener
      * being removed. This will not impact the order in which listeners are called,
      * but it means that any copies of the listener array as returned by
      * the `emitter.listeners()` method will need to be recreated.
      *
      * When a single function has been added as a handler multiple times for a single
      * event (as in the example below), `removeListener()` will remove the most
      * recently added instance. In the example the `once('ping')`listener is removed:
      *
      * ```js
      * const ee = new EventEmitter();
      *
      * function pong() {
      *   console.log('pong');
      * }
      *
      * ee.on('ping', pong);
      * ee.once('ping', pong);
      * ee.removeListener('ping', pong);
      *
      * ee.emit('ping');
      * ee.emit('ping');
      * ```
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v0.1.26
      */
    def removeListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def removeListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * By default `EventEmitter`s will print a warning if more than `10` listeners are
      * added for a particular event. This is a useful default that helps finding
      * memory leaks. The `emitter.setMaxListeners()` method allows the limit to be
      * modified for this specific `EventEmitter` instance. The value can be set to`Infinity` (or `0`) to indicate an unlimited number of listeners.
      *
      * Returns a reference to the `EventEmitter`, so that calls can be chained.
      * @since v0.3.5
      */
    def setMaxListeners(n: Double): this.type = js.native
  }
  
  /* Inlined chokidar.chokidar.WatchOptions & {  aggregateTimeout :number | undefined,   ignored :webpack-dev-server.webpack-dev-server.WatchOptions['ignored'] | undefined,   poll :number | boolean | undefined} */
  trait WatchOptionsaggregateTime extends StObject {
    
    var aggregateTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * If relying upon the [`fs.Stats`](https://nodejs.org/api/fs.html#fs_class_fs_stats) object that
      * may get passed with `add`, `addDir`, and `change` events, set this to `true` to ensure it is
      * provided even in cases where it wasn't already available from the underlying watch events.
      */
    var alwaysStat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `true` if `useFsEvents` and `usePolling` are `false`). Automatically filters out artifacts
      * that occur when using editors that use "atomic writes" instead of writing directly to the
      * source file. If a file is re-added within 100 ms of being deleted, Chokidar emits a `change`
      * event rather than `unlink` then `add`. If the default of 100 ms does not work well for you,
      * you can override it by setting `atomic` to a custom value, in milliseconds.
      */
    var atomic: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * can be set to an object in order to adjust timing params:
      */
    var awaitWriteFinish: js.UndefOr[AwaitWriteFinishOptions | Boolean] = js.undefined
    
    /**
      * Interval of file system polling for binary files. ([see list of binary extensions](https://gi
      * thub.com/sindresorhus/binary-extensions/blob/master/binary-extensions.json))
      */
    var binaryInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * The base directory from which watch `paths` are to be derived. Paths emitted with events will
      * be relative to this.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * If set, limits how many levels of subdirectories will be traversed.
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      *  If set to true then the strings passed to .watch() and .add() are treated as literal path
      *  names, even if they look like globs. Default: false.
      */
    var disableGlobbing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `false`, only the symlinks themselves will be watched for changes instead of following
      * the link references and bubbling events through the link's path.
      */
    var followSymlinks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `false` then `add`/`addDir` events are also emitted for matching paths while
      * instantiating the watching as chokidar discovers these file paths (before the `ready` event).
      */
    var ignoreInitial: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  Indicates whether to watch files that don't have read permissions if possible. If watching
      *  fails due to `EPERM` or `EACCES` with this set to `true`, the errors will be suppressed
      *  silently.
      */
    var ignorePermissionErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * ([anymatch](https://github.com/micromatch/anymatch)-compatible definition) Defines files/paths to
      * be ignored. The whole relative or absolute path is tested, not just filename. If a function
      * with two arguments is provided, it gets called twice per path - once with a single argument
      * (the path), second time with two arguments (the path and the
      * [`fs.Stats`](https://nodejs.org/api/fs.html#fs_class_fs_stats) object of that path).
      */
    var ignored: js.UndefOr[AnymatchMatcher] = js.undefined
    
    /**
      * Interval of file system polling.
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicates whether the process should continue to run as long as files are being watched. If
      * set to `false` when using `fsevents` to watch, no more events will be emitted after `ready`,
      * even if the process continues to run.
      */
    var persistent: js.UndefOr[Boolean] = js.undefined
    
    var poll: js.UndefOr[Double | Boolean] = js.undefined
    
    /**
      * Whether to use the `fsevents` watching interface if available. When set to `true` explicitly
      * and `fsevents` is available this supercedes the `usePolling` setting. When set to `false` on
      * OS X, `usePolling: true` becomes the default.
      */
    var useFsEvents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use fs.watchFile (backed by polling), or fs.watch. If polling leads to high CPU
      * utilization, consider setting this to `false`. It is typically necessary to **set this to
      * `true` to successfully watch files over a network**, and it may be necessary to successfully
      * watch files in other non-standard situations. Setting to `true` explicitly on OS X overrides
      * the `useFsEvents` default.
      */
    var usePolling: js.UndefOr[Boolean] = js.undefined
  }
  object WatchOptionsaggregateTime {
    
    inline def apply(): WatchOptionsaggregateTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptionsaggregateTime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatchOptionsaggregateTime] (val x: Self) extends AnyVal {
      
      inline def setAggregateTimeout(value: Double): Self = StObject.set(x, "aggregateTimeout", value.asInstanceOf[js.Any])
      
      inline def setAggregateTimeoutUndefined: Self = StObject.set(x, "aggregateTimeout", js.undefined)
      
      inline def setAlwaysStat(value: Boolean): Self = StObject.set(x, "alwaysStat", value.asInstanceOf[js.Any])
      
      inline def setAlwaysStatUndefined: Self = StObject.set(x, "alwaysStat", js.undefined)
      
      inline def setAtomic(value: Boolean | Double): Self = StObject.set(x, "atomic", value.asInstanceOf[js.Any])
      
      inline def setAtomicUndefined: Self = StObject.set(x, "atomic", js.undefined)
      
      inline def setAwaitWriteFinish(value: AwaitWriteFinishOptions | Boolean): Self = StObject.set(x, "awaitWriteFinish", value.asInstanceOf[js.Any])
      
      inline def setAwaitWriteFinishUndefined: Self = StObject.set(x, "awaitWriteFinish", js.undefined)
      
      inline def setBinaryInterval(value: Double): Self = StObject.set(x, "binaryInterval", value.asInstanceOf[js.Any])
      
      inline def setBinaryIntervalUndefined: Self = StObject.set(x, "binaryInterval", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setDisableGlobbing(value: Boolean): Self = StObject.set(x, "disableGlobbing", value.asInstanceOf[js.Any])
      
      inline def setDisableGlobbingUndefined: Self = StObject.set(x, "disableGlobbing", js.undefined)
      
      inline def setFollowSymlinks(value: Boolean): Self = StObject.set(x, "followSymlinks", value.asInstanceOf[js.Any])
      
      inline def setFollowSymlinksUndefined: Self = StObject.set(x, "followSymlinks", js.undefined)
      
      inline def setIgnoreInitial(value: Boolean): Self = StObject.set(x, "ignoreInitial", value.asInstanceOf[js.Any])
      
      inline def setIgnoreInitialUndefined: Self = StObject.set(x, "ignoreInitial", js.undefined)
      
      inline def setIgnorePermissionErrors(value: Boolean): Self = StObject.set(x, "ignorePermissionErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnorePermissionErrorsUndefined: Self = StObject.set(x, "ignorePermissionErrors", js.undefined)
      
      inline def setIgnored(value: AnymatchMatcher): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      inline def setIgnoredFunction1(value: /* testString */ String => Boolean): Self = StObject.set(x, "ignored", js.Any.fromFunction1(value))
      
      inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
      
      inline def setIgnoredVarargs(value: AnymatchPattern*): Self = StObject.set(x, "ignored", js.Array(value*))
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
      
      inline def setPoll(value: Double | Boolean): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
      
      inline def setUseFsEvents(value: Boolean): Self = StObject.set(x, "useFsEvents", value.asInstanceOf[js.Any])
      
      inline def setUseFsEventsUndefined: Self = StObject.set(x, "useFsEvents", js.undefined)
      
      inline def setUsePolling(value: Boolean): Self = StObject.set(x, "usePolling", value.asInstanceOf[js.Any])
      
      inline def setUsePollingUndefined: Self = StObject.set(x, "usePolling", js.undefined)
    }
  }
}
