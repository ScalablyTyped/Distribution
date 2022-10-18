package typings.undici.typesDispatcherMod

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Duplex
import typings.node.urlMod.URL_
import typings.undici.typesErrorsMod.UndiciError
import typings.undici.undiciStrings.connect_
import typings.undici.undiciStrings.connectionError
import typings.undici.undiciStrings.disconnect
import typings.undici.undiciStrings.drain
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
