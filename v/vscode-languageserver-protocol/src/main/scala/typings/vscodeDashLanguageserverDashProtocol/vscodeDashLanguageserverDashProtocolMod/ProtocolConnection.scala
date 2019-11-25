package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import typings.std.Error
import typings.vscodeDashJsonrpc.Thenable
import typings.vscodeDashJsonrpc.libMessagesMod.Message
import typings.vscodeDashJsonrpc.libMessagesMod.NotificationMessage
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.GenericNotificationHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.GenericRequestHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationHandler0
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestHandler0
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.TraceOptions
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtocolConnection extends js.Object {
  /**
    * An event emitter firing when the connection got closed.
    */
  @JSName("onClose")
  var onClose_Original: typings.vscodeDashJsonrpc.libEventsMod.Event[Unit] = js.native
  /**
    * An event emitter firing when the connection got disposed.
    */
  @JSName("onDispose")
  var onDispose_Original: typings.vscodeDashJsonrpc.libEventsMod.Event[Unit] = js.native
  /**
    * An event emitter firing when an error occurs on the connection.
    */
  @JSName("onError")
  var onError_Original: typings.vscodeDashJsonrpc.libEventsMod.Event[js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]]] = js.native
  /**
    * An event emiiter firing when the connection receives a notification that is not
    * handled.
    */
  @JSName("onUnhandledNotification")
  var onUnhandledNotification_Original: typings.vscodeDashJsonrpc.libEventsMod.Event[NotificationMessage] = js.native
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
  def onClose(listener: js.Function1[/* e */ Unit, _]): typings.vscodeDashJsonrpc.libEventsMod.Disposable = js.native
  def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): typings.vscodeDashJsonrpc.libEventsMod.Disposable = js.native
  def onClose(
    listener: js.Function1[/* e */ Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[typings.vscodeDashJsonrpc.libEventsMod.Disposable]
  ): typings.vscodeDashJsonrpc.libEventsMod.Disposable = js.native
  /**
    * An event emitter firing when the connection got disposed.
    */
  def onDispose(listener: js.Function1[/* e */ Unit, _]): typings.vscodeDashJsonrpc.libEventsMod.Disposable = js.native
  def onDispose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): typings.vscodeDashJsonrpc.libEventsMod.Disposable = js.native
  def onDispose(
    listener: js.Function1[/* e */ Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[typings.vscodeDashJsonrpc.libEventsMod.Disposable]
  ): typings.vscodeDashJsonrpc.libEventsMod.Disposable = js.native
  /**
    * An event emitter firing when an error occurs on the connection.
    */
  def onError(listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _]): typings.vscodeDashJsonrpc.libEventsMod.Disposable = js.native
  def onError(
    listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _],
    thisArgs: js.Any
  ): typings.vscodeDashJsonrpc.libEventsMod.Disposable = js.native
  def onError(
    listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _],
    thisArgs: js.Any,
    disposables: js.Array[typings.vscodeDashJsonrpc.libEventsMod.Disposable]
  ): typings.vscodeDashJsonrpc.libEventsMod.Disposable = js.native
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
  def onNotification[RO](
    `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationType0[RO],
    handler: NotificationHandler0
  ): Unit = js.native
  /**
    * Installs a notification handler.
    *
    * @param type The notification type to install the handler for.
    * @param handler The actual handler.
    */
  def onNotification[P, RO](
    `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationType[P, RO],
    handler: NotificationHandler[P]
  ): Unit = js.native
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
  def onRequest[R, E, RO](
    `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType0[R, E, RO],
    handler: RequestHandler0[R, E]
  ): Unit = js.native
  /**
    * Installs a request handler.
    *
    * @param type The request type to install the handler for.
    * @param handler The actual handler.
    */
  def onRequest[P, R, E, RO](
    `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[P, R, E, RO],
    handler: RequestHandler[P, R, E]
  ): Unit = js.native
  /**
    * An event emiiter firing when the connection receives a notification that is not
    * handled.
    */
  def onUnhandledNotification(listener: js.Function1[/* e */ NotificationMessage, _]): typings.vscodeDashJsonrpc.libEventsMod.Disposable = js.native
  def onUnhandledNotification(listener: js.Function1[/* e */ NotificationMessage, _], thisArgs: js.Any): typings.vscodeDashJsonrpc.libEventsMod.Disposable = js.native
  def onUnhandledNotification(
    listener: js.Function1[/* e */ NotificationMessage, _],
    thisArgs: js.Any,
    disposables: js.Array[typings.vscodeDashJsonrpc.libEventsMod.Disposable]
  ): typings.vscodeDashJsonrpc.libEventsMod.Disposable = js.native
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
  def sendNotification[RO](`type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationType0[RO]): Unit = js.native
  /**
    * Sends a notification.
    *
    * @param type the notification's type to send.
    * @param params the notification's parameters.
    */
  def sendNotification[P, RO](`type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationType[P, RO]): Unit = js.native
  def sendNotification[P, RO](`type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationType[P, RO], params: P): Unit = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param method the request's method name.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[R](method: String): Thenable[R] = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param method the request's method name.
    * @param params The request's parameter.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[R](method: String, param: js.Any): Thenable[R] = js.native
  def sendRequest[R](
    method: String,
    param: js.Any,
    token: typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[R](method: String, token: typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken): Thenable[R] = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param type The type of request to sent.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[R, E, RO](`type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType0[R, E, RO]): Thenable[R] = js.native
  def sendRequest[R, E, RO](
    `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType0[R, E, RO],
    token: typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
  ): Thenable[R] = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param type The type of request to sent.
    * @param params The request's parameter.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[P, R, E, RO](`type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[P, R, E, RO], params: P): Thenable[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[P, R, E, RO],
    params: P,
    token: typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
  ): Thenable[R] = js.native
  /**
    * Enables tracing mode for the connection.
    */
  def trace(value: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace, tracer: Tracer): Unit = js.native
  def trace(
    value: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace,
    tracer: Tracer,
    sendNotification: Boolean
  ): Unit = js.native
  def trace(
    value: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace,
    tracer: Tracer,
    traceOptions: TraceOptions
  ): Unit = js.native
}

