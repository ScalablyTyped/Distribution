package typings.websocketStream

import typings.node.AnonChunk
import typings.node.AnonEnd
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.EventEmitterOptions
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.std.Error
import typings.std.Uint8Array
import typings.websocketStream.websocketStreamStrings.close
import typings.websocketStream.websocketStreamStrings.connection
import typings.websocketStream.websocketStreamStrings.data
import typings.websocketStream.websocketStreamStrings.drain
import typings.websocketStream.websocketStreamStrings.end
import typings.websocketStream.websocketStreamStrings.error
import typings.websocketStream.websocketStreamStrings.finish
import typings.websocketStream.websocketStreamStrings.headers
import typings.websocketStream.websocketStreamStrings.listening
import typings.websocketStream.websocketStreamStrings.pipe
import typings.websocketStream.websocketStreamStrings.readable
import typings.websocketStream.websocketStreamStrings.stream
import typings.websocketStream.websocketStreamStrings.unpipe
import typings.ws.mod.ClientOptions
import typings.ws.mod.ServerOptions
import typings.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websocket-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Server ()
    extends typings.ws.mod.Server {
    @JSName("on")
    def on_connection(
      event: connection,
      cb: js.ThisFunction2[/* this */ ^, /* socket */ ^, /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.ThisFunction1[/* this */ ^, /* error */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_headers(
      event: headers,
      cb: js.ThisFunction2[/* this */ ^, /* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_listening(event: listening, cb: js.ThisFunction0[/* this */ ^, Unit]): this.type = js.native
    @JSName("on")
    def on_stream(
      event: stream,
      cb: js.ThisFunction2[/* this */ ^, /* stream */ WebSocketDuplex, /* request */ IncomingMessage, Unit]
    ): this.type = js.native
  }
  
  /* Inlined node.stream.Duplex & {  socket  :ws.ws.^} */
  @js.native
  trait WebSocketDuplex extends js.Object {
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[AnonChunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    var destroyed: Boolean = js.native
    var readable: Boolean = js.native
    val readableHighWaterMark: Double = js.native
    val readableLength: Double = js.native
    val readableObjectMode: Boolean = js.native
    var socket: ^ = js.native
    val writable: Boolean = js.native
    val writableCorked: Double = js.native
    val writableEnded: Boolean = js.native
    val writableFinished: Boolean = js.native
    val writableHighWaterMark: Double = js.native
    val writableLength: Double = js.native
    val writableObjectMode: Boolean = js.native
    def _destroy(error: Null, callback: js.Function1[js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _final(callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _read(size: Double): Unit = js.native
    def _write(
      chunk: js.Any,
      encoding: String,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. drain
      * 3. error
      * 4. finish
      * 5. pipe
      * 6. unpipe
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    def cork(): Unit = js.native
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any): Unit = js.native
    def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: String): Unit = js.native
    def end(chunk: js.Any, encoding: String, cb: js.Function0[Unit]): Unit = js.native
    def end(data: String): Unit = js.native
    def end(data: String, cb: js.Function0[Unit]): Unit = js.native
    def end(data: Uint8Array): Unit = js.native
    def end(data: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
    def end(str: String, encoding: String): Unit = js.native
    def end(str: String, encoding: String, cb: js.Function0[Unit]): Unit = js.native
    def eventNames(): js.Array[String | js.Symbol] = js.native
    def getMaxListeners(): Double = js.native
    def isPaused(): Boolean = js.native
    def listenerCount(`type`: String): Double = js.native
    def listenerCount(`type`: js.Symbol): Double = js.native
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    def pause(): this.type = js.native
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: String): Boolean = js.native
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    def read(): js.Any = js.native
    def read(size: Double): js.Any = js.native
    @JSName("read")
    def read_Union(): String | Buffer = js.native
    @JSName("read")
    def read_Union(size: Double): String | Buffer = js.native
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    def resume(): this.type = js.native
    def setDefaultEncoding(encoding: String): this.type = js.native
    def setEncoding(encoding: String): this.type = js.native
    def setMaxListeners(n: Double): this.type = js.native
    def uncork(): Unit = js.native
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    def unshift(chunk: String): Unit = js.native
    def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.Any): Unit = js.native
    def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: Uint8Array): Unit = js.native
    def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = js.native
    def wrap(oldStream: ReadableStream): this.type = js.native
    def write(buffer: String): Boolean = js.native
    def write(buffer: String, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(buffer: Uint8Array): Boolean = js.native
    def write(buffer: Uint8Array, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(chunk: js.Any): Boolean = js.native
    def write(chunk: js.Any, cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(chunk: js.Any, encoding: String): Boolean = js.native
    def write(chunk: js.Any, encoding: String, cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(str: String, encoding: String): Boolean = js.native
    def write(str: String, encoding: String, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  }
  
  def apply(target: String): WebSocketDuplex = js.native
  def apply(target: String, options: ClientOptions): WebSocketDuplex = js.native
  def apply(target: String, protocols: String): WebSocketDuplex = js.native
  def apply(target: String, protocols: String, options: ClientOptions): WebSocketDuplex = js.native
  def apply(target: String, protocols: js.Array[String]): WebSocketDuplex = js.native
  def apply(target: String, protocols: js.Array[String], options: ClientOptions): WebSocketDuplex = js.native
  def apply(target: ^): WebSocketDuplex = js.native
  def apply(target: ^, options: ClientOptions): WebSocketDuplex = js.native
  def apply(target: ^, protocols: String): WebSocketDuplex = js.native
  def apply(target: ^, protocols: String, options: ClientOptions): WebSocketDuplex = js.native
  def apply(target: ^, protocols: js.Array[String]): WebSocketDuplex = js.native
  def apply(target: ^, protocols: js.Array[String], options: ClientOptions): WebSocketDuplex = js.native
  def createServer(): Server = js.native
  def createServer(opts: ServerOptions): Server = js.native
  def createServer(opts: ServerOptions, callback: js.Function0[Unit]): Server = js.native
}

