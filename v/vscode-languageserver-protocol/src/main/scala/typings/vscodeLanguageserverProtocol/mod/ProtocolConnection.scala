package typings.vscodeLanguageserverProtocol.mod

import typings.std.Error
import typings.vscodeJsonrpc.messagesMod.Message
import typings.vscodeJsonrpc.messagesMod.NotificationMessage
import typings.vscodeJsonrpc.mod.GenericNotificationHandler
import typings.vscodeJsonrpc.mod.GenericRequestHandler
import typings.vscodeJsonrpc.mod.NotificationHandler
import typings.vscodeJsonrpc.mod.NotificationHandler0
import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeJsonrpc.mod.RequestHandler0
import typings.vscodeJsonrpc.mod.TraceOptions
import typings.vscodeJsonrpc.mod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtocolConnection extends js.Object {
  
  /**
    * Actively disposes the connection.
    */
  def dispose(): Unit = js.native
  
  /**
    * Turns the connection into listening mode
    */
  def listen(): Unit = js.native
  
  /**
    * An event emitter firing when the connection got closed.
    */
  def onClose(listener: js.Function1[/* e */ Unit, _]): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onClose(
    listener: js.Function1[/* e */ Unit, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[typings.vscodeJsonrpc.eventsMod.Disposable]
  ): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onClose(
    listener: js.Function1[/* e */ Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[typings.vscodeJsonrpc.eventsMod.Disposable]
  ): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  /**
    * An event emitter firing when the connection got closed.
    */
  @JSName("onClose")
  var onClose_Original: typings.vscodeJsonrpc.eventsMod.Event[Unit] = js.native
  
  /**
    * An event emitter firing when the connection got disposed.
    */
  def onDispose(listener: js.Function1[/* e */ Unit, _]): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onDispose(
    listener: js.Function1[/* e */ Unit, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[typings.vscodeJsonrpc.eventsMod.Disposable]
  ): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onDispose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onDispose(
    listener: js.Function1[/* e */ Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[typings.vscodeJsonrpc.eventsMod.Disposable]
  ): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  /**
    * An event emitter firing when the connection got disposed.
    */
  @JSName("onDispose")
  var onDispose_Original: typings.vscodeJsonrpc.eventsMod.Event[Unit] = js.native
  
  /**
    * An event emitter firing when an error occurs on the connection.
    */
  def onError(listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _]): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onError(
    listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[typings.vscodeJsonrpc.eventsMod.Disposable]
  ): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onError(
    listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _],
    thisArgs: js.Any
  ): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onError(
    listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _],
    thisArgs: js.Any,
    disposables: js.Array[typings.vscodeJsonrpc.eventsMod.Disposable]
  ): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  /**
    * An event emitter firing when an error occurs on the connection.
    */
  @JSName("onError")
  var onError_Original: typings.vscodeJsonrpc.eventsMod.Event[js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]]] = js.native
  
  /**
    * Installs a notification handler.
    *
    * @param methods The method name to install the handler for.
    * @param handler The actual handler.
    */
  def onNotification(method: String, handler: GenericNotificationHandler): Unit = js.native
  /**
    * Installs a notification handler.
    *
    * @param type The notification type to install the handler for.
    * @param handler The actual handler.
    */
  def onNotification[RO](`type`: typings.vscodeJsonrpc.mod.NotificationType0[RO], handler: NotificationHandler0): Unit = js.native
  /**
    * Installs a notification handler.
    *
    * @param type The notification type to install the handler for.
    * @param handler The actual handler.
    */
  def onNotification[P, RO](`type`: typings.vscodeJsonrpc.mod.NotificationType[P, RO], handler: NotificationHandler[P]): Unit = js.native
  
  /**
    * Installs a progress handler for a given token.
    * @param type the progress type
    * @param token the token
    * @param handler the handler
    */
  def onProgress[P](`type`: typings.vscodeJsonrpc.mod.ProgressType[P], token: String, handler: NotificationHandler[P]): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onProgress[P](`type`: typings.vscodeJsonrpc.mod.ProgressType[P], token: Double, handler: NotificationHandler[P]): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  
  /**
    * Installs a request handler.
    *
    * @param methods The method name to install the handler for.
    * @param handler The actual handler.
    */
  def onRequest[R, E](method: String, handler: GenericRequestHandler[R, E]): Unit = js.native
  /**
    * Installs a request handler.
    *
    * @param type The request type to install the handler for.
    * @param handler The actual handler.
    */
  def onRequest[R, E, RO](`type`: typings.vscodeJsonrpc.mod.RequestType0[R, E, RO], handler: RequestHandler0[R, E]): Unit = js.native
  /**
    * Installs a request handler.
    *
    * @param type The request type to install the handler for.
    * @param handler The actual handler.
    */
  def onRequest[P, R, E, RO](`type`: typings.vscodeJsonrpc.mod.RequestType[P, R, E, RO], handler: RequestHandler[P, R, E]): Unit = js.native
  
  /**
    * An event emiiter firing when the connection receives a notification that is not
    * handled.
    */
  def onUnhandledNotification(listener: js.Function1[/* e */ NotificationMessage, _]): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onUnhandledNotification(
    listener: js.Function1[/* e */ NotificationMessage, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[typings.vscodeJsonrpc.eventsMod.Disposable]
  ): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onUnhandledNotification(listener: js.Function1[/* e */ NotificationMessage, _], thisArgs: js.Any): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onUnhandledNotification(
    listener: js.Function1[/* e */ NotificationMessage, _],
    thisArgs: js.Any,
    disposables: js.Array[typings.vscodeJsonrpc.eventsMod.Disposable]
  ): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  /**
    * An event emiiter firing when the connection receives a notification that is not
    * handled.
    */
  @JSName("onUnhandledNotification")
  var onUnhandledNotification_Original: typings.vscodeJsonrpc.eventsMod.Event[NotificationMessage] = js.native
  
  /**
    * Sends a notification.
    *
    * @param method the notification's method name.
    */
  def sendNotification(method: String): Unit = js.native
  /**
    * Sends a notification.
    *
    * @param method the notification's method name.
    * @param params the notification's parameters.
    */
  def sendNotification(method: String, params: js.Any): Unit = js.native
  /**
    * Sends a notification.
    *
    * @param type the notification's type to send.
    */
  def sendNotification[RO](`type`: typings.vscodeJsonrpc.mod.NotificationType0[RO]): Unit = js.native
  /**
    * Sends a notification.
    *
    * @param type the notification's type to send.
    * @param params the notification's parameters.
    */
  def sendNotification[P, RO](`type`: typings.vscodeJsonrpc.mod.NotificationType[P, RO]): Unit = js.native
  def sendNotification[P, RO](`type`: typings.vscodeJsonrpc.mod.NotificationType[P, RO], params: P): Unit = js.native
  
  /**
    * Sends progress.
    * @param type the progress type
    * @param token the token to use
    * @param value the progress value
    */
  def sendProgress[P](`type`: typings.vscodeJsonrpc.mod.ProgressType[P], token: String, value: P): Unit = js.native
  def sendProgress[P](`type`: typings.vscodeJsonrpc.mod.ProgressType[P], token: Double, value: P): Unit = js.native
  
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param method the request's method name.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[R](method: String): js.Promise[R] = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param method the request's method name.
    * @param params The request's parameter.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[R](method: String, param: js.Any): js.Promise[R] = js.native
  def sendRequest[R](method: String, param: js.Any, token: typings.vscodeJsonrpc.cancellationMod.CancellationToken): js.Promise[R] = js.native
  def sendRequest[R](method: String, token: typings.vscodeJsonrpc.cancellationMod.CancellationToken): js.Promise[R] = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param type The type of request to sent.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[R, E, RO](`type`: typings.vscodeJsonrpc.mod.RequestType0[R, E, RO]): js.Promise[R] = js.native
  def sendRequest[R, E, RO](
    `type`: typings.vscodeJsonrpc.mod.RequestType0[R, E, RO],
    token: typings.vscodeJsonrpc.cancellationMod.CancellationToken
  ): js.Promise[R] = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param type The type of request to sent.
    * @param params The request's parameter.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[P, R, E, RO](`type`: typings.vscodeJsonrpc.mod.RequestType[P, R, E, RO], params: P): js.Promise[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: typings.vscodeJsonrpc.mod.RequestType[P, R, E, RO],
    params: P,
    token: typings.vscodeJsonrpc.cancellationMod.CancellationToken
  ): js.Promise[R] = js.native
  
  /**
    * Enables tracing mode for the connection.
    */
  def trace(value: typings.vscodeJsonrpc.mod.Trace, tracer: Tracer): Unit = js.native
  def trace(value: typings.vscodeJsonrpc.mod.Trace, tracer: Tracer, sendNotification: Boolean): Unit = js.native
  def trace(value: typings.vscodeJsonrpc.mod.Trace, tracer: Tracer, traceOptions: TraceOptions): Unit = js.native
}
