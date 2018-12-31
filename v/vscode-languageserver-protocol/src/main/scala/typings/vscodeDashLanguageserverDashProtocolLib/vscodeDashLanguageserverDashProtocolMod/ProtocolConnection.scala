package typings
package vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtocolConnection extends js.Object {
  /**
    * An event emitter firing when the connection got closed.
    */
  @JSName("onClose")
  var onClose_Original: vscodeDashJsonrpcLib.libEventsMod.Event[scala.Unit] = js.native
  /**
    * An event emitter firing when the connection got disposed.
    */
  @JSName("onDispose")
  var onDispose_Original: vscodeDashJsonrpcLib.libEventsMod.Event[scala.Unit] = js.native
  /**
    * An event emitter firing when an error occurs on the connection.
    */
  @JSName("onError")
  var onError_Original: vscodeDashJsonrpcLib.libEventsMod.Event[
    js.Tuple3[
      nodeLib.Error, 
      js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.Message], 
      js.UndefOr[scala.Double]
    ]
  ] = js.native
  /**
    * An event emiiter firing when the connection receives a notification that is not
    * handled.
    */
  @JSName("onUnhandledNotification")
  var onUnhandledNotification_Original: vscodeDashJsonrpcLib.libEventsMod.Event[vscodeDashJsonrpcLib.libMessagesMod.NotificationMessage] = js.native
  /**
    * Actively disposes the connection.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Turns the connection into listening mode
    */
  def listen(): scala.Unit = js.native
  /**
    * An event emitter firing when the connection got closed.
    */
  def onClose(listener: js.Function1[/* e */ scala.Unit, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onClose(listener: js.Function1[/* e */ scala.Unit, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onClose(
    listener: js.Function1[/* e */ scala.Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
    * An event emitter firing when the connection got disposed.
    */
  def onDispose(listener: js.Function1[/* e */ scala.Unit, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onDispose(listener: js.Function1[/* e */ scala.Unit, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onDispose(
    listener: js.Function1[/* e */ scala.Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
    * An event emitter firing when an error occurs on the connection.
    */
  def onError(
    listener: js.Function1[
      /* e */ js.Tuple3[
        nodeLib.Error, 
        js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.Message], 
        js.UndefOr[scala.Double]
      ], 
      _
    ]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onError(
    listener: js.Function1[
      /* e */ js.Tuple3[
        nodeLib.Error, 
        js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.Message], 
        js.UndefOr[scala.Double]
      ], 
      _
    ],
    thisArgs: js.Any
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onError(
    listener: js.Function1[
      /* e */ js.Tuple3[
        nodeLib.Error, 
        js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.Message], 
        js.UndefOr[scala.Double]
      ], 
      _
    ],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
    * Installs a notification handler.
    *
    * @param methods The method name to install the handler for.
    * @param handler The actual handler.
    */
  def onNotification(
    method: java.lang.String,
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.GenericNotificationHandler
  ): scala.Unit = js.native
  /**
    * Installs a notification handler.
    *
    * @param type The notification type to install the handler for.
    * @param handler The actual handler.
    */
  def onNotification[RO](
    `type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationType0[RO],
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler0
  ): scala.Unit = js.native
  /**
    * Installs a notification handler.
    *
    * @param type The notification type to install the handler for.
    * @param handler The actual handler.
    */
  def onNotification[P, RO](
    `type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationType[P, RO],
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler[P]
  ): scala.Unit = js.native
  /**
    * Installs a request handler.
    *
    * @param methods The method name to install the handler for.
    * @param handler The actual handler.
    */
  def onRequest[R, E](
    method: java.lang.String,
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.GenericRequestHandler[R, E]
  ): scala.Unit = js.native
  /**
    * Installs a request handler.
    *
    * @param type The request type to install the handler for.
    * @param handler The actual handler.
    */
  def onRequest[R, E, RO](
    `type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestType0[R, E, RO],
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler0[R, E]
  ): scala.Unit = js.native
  /**
    * Installs a request handler.
    *
    * @param type The request type to install the handler for.
    * @param handler The actual handler.
    */
  def onRequest[P, R, E, RO](
    `type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestType[P, R, E, RO],
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[P, R, E]
  ): scala.Unit = js.native
  /**
    * An event emiiter firing when the connection receives a notification that is not
    * handled.
    */
  def onUnhandledNotification(listener: js.Function1[/* e */ vscodeDashJsonrpcLib.libMessagesMod.NotificationMessage, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onUnhandledNotification(
    listener: js.Function1[/* e */ vscodeDashJsonrpcLib.libMessagesMod.NotificationMessage, _],
    thisArgs: js.Any
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onUnhandledNotification(
    listener: js.Function1[/* e */ vscodeDashJsonrpcLib.libMessagesMod.NotificationMessage, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
    * Sends a notification.
    *
    * @param method the notification's method name.
    */
  def sendNotification(method: java.lang.String): scala.Unit = js.native
  /**
    * Sends a notification.
    *
    * @param method the notification's method name.
    * @param params the notification's parameters.
    */
  def sendNotification(method: java.lang.String, params: js.Any): scala.Unit = js.native
  /**
    * Sends a notification.
    *
    * @param type the notification's type to send.
    */
  def sendNotification[RO](`type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationType0[RO]): scala.Unit = js.native
  /**
    * Sends a notification.
    *
    * @param type the notification's type to send.
    * @param params the notification's parameters.
    */
  def sendNotification[P, RO](`type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationType[P, RO]): scala.Unit = js.native
  def sendNotification[P, RO](`type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationType[P, RO], params: P): scala.Unit = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param method the request's method name.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[R](method: java.lang.String): vscodeDashJsonrpcLib.Thenable[R] = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param method the request's method name.
    * @param params The request's parameter.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[R](method: java.lang.String, param: js.Any): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[R](
    method: java.lang.String,
    param: js.Any,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[R](method: java.lang.String, token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken): vscodeDashJsonrpcLib.Thenable[R] = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param type The type of request to sent.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[R, E, RO](`type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestType0[R, E, RO]): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[R, E, RO](
    `type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestType0[R, E, RO],
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  /**
    * Sends a request and returns a promise resolving to the result of the request.
    *
    * @param type The type of request to sent.
    * @param params The request's parameter.
    * @param token An optional cancellation token.
    * @returns A promise resolving to the request's result.
    */
  def sendRequest[P, R, E, RO](`type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestType[P, R, E, RO], params: P): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestType[P, R, E, RO],
    params: P,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  /**
    * Enables tracing mode for the connection.
    */
  def trace(
    value: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Trace,
    tracer: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Tracer
  ): scala.Unit = js.native
  def trace(
    value: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Trace,
    tracer: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Tracer,
    sendNotification: scala.Boolean
  ): scala.Unit = js.native
  def trace(
    value: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Trace,
    tracer: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Tracer,
    traceOptions: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.TraceOptions
  ): scala.Unit = js.native
}

