package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typings.vscodeJsonrpc.libCommonConnectionMod.ConnectionOptions
import typings.vscodeJsonrpc.libCommonConnectionMod.ConnectionStrategy
import typings.vscodeJsonrpc.libCommonConnectionMod.GenericNotificationHandler
import typings.vscodeJsonrpc.libCommonConnectionMod.GenericRequestHandler
import typings.vscodeJsonrpc.libCommonConnectionMod.Logger
import typings.vscodeJsonrpc.libCommonConnectionMod.NotificationHandler
import typings.vscodeJsonrpc.libCommonConnectionMod.NotificationHandler0
import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler0
import typings.vscodeJsonrpc.libCommonConnectionMod.Trace
import typings.vscodeJsonrpc.libCommonConnectionMod.TraceOptions
import typings.vscodeJsonrpc.libCommonConnectionMod.Tracer
import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typings.vscodeJsonrpc.libCommonEventsMod.Event
import typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader
import typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter
import typings.vscodeJsonrpc.libCommonMessagesMod.Message
import typings.vscodeJsonrpc.libCommonMessagesMod.MessageSignature
import typings.vscodeJsonrpc.libCommonMessagesMod.NotificationMessage
import typings.vscodeJsonrpc.mod.NotificationType
import typings.vscodeJsonrpc.mod.NotificationType0
import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeJsonrpc.mod.RequestType
import typings.vscodeJsonrpc.mod.RequestType0
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType0
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonConnectionMod {
  
  @JSImport("vscode-languageserver-protocol/lib/common/connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createProtocolConnection(input: MessageReader, output: MessageWriter): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
  inline def createProtocolConnection(input: MessageReader, output: MessageWriter, logger: Unit, options: ConnectionOptions): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
  inline def createProtocolConnection(input: MessageReader, output: MessageWriter, logger: Unit, options: ConnectionStrategy): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
  inline def createProtocolConnection(input: MessageReader, output: MessageWriter, logger: Logger): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
  inline def createProtocolConnection(input: MessageReader, output: MessageWriter, logger: Logger, options: ConnectionOptions): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
  inline def createProtocolConnection(input: MessageReader, output: MessageWriter, logger: Logger, options: ConnectionStrategy): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
  
  @js.native
  trait ProtocolConnection extends StObject {
    
    /**
      * Actively disposes the connection.
      */
    def dispose(): Unit = js.native
    
    /**
      * Ends the connection.
      */
    def end(): Unit = js.native
    
    /**
      * Returns true if the connection has a pending response.
      * Otherwise false is returned.
      */
    def hasPendingResponse(): Boolean = js.native
    
    /**
      * Turns the connection into listening mode
      */
    def listen(): Unit = js.native
    
    /**
      * An event emitter firing when the connection got closed.
      */
    def onClose(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
    /**
      * An event emitter firing when the connection got closed.
      */
    @JSName("onClose")
    var onClose_Original: Event[Unit] = js.native
    
    /**
      * An event emitter firing when the connection got disposed.
      */
    def onDispose(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
    def onDispose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
    def onDispose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
    def onDispose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
    /**
      * An event emitter firing when the connection got disposed.
      */
    @JSName("onDispose")
    var onDispose_Original: Event[Unit] = js.native
    
    /**
      * An event emitter firing when an error occurs on the connection.
      */
    def onError(listener: js.Function1[/* e */ js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]], Any]): Disposable = js.native
    def onError(
      listener: js.Function1[/* e */ js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]], Any],
      thisArgs: Any
    ): Disposable = js.native
    def onError(
      listener: js.Function1[/* e */ js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]], Any],
      thisArgs: Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onError(
      listener: js.Function1[/* e */ js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]], Any],
      thisArgs: Unit,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    /**
      * An event emitter firing when an error occurs on the connection.
      */
    @JSName("onError")
    var onError_Original: Event[js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]]] = js.native
    
    def onNotification(method: String, handler: GenericNotificationHandler): Disposable = js.native
    /**
      * Installs a notification handler.
      *
      * @param methods The message signature or the method name to install the handler for.
      * @param handler The actual handler.
      * @returns A disposable to remove the handler.
      */
    def onNotification(method: MessageSignature, handler: GenericNotificationHandler): Disposable = js.native
    def onNotification(`type`: NotificationType0, handler: NotificationHandler0): Disposable = js.native
    def onNotification[P](`type`: NotificationType[P], handler: NotificationHandler[P]): Disposable = js.native
    /**
      * Installs a notification handler.
      *
      * @param type The notification type to install the handler for.
      * @param handler The actual handler.
      * @returns A disposable to remove the handler.
      */
    def onNotification[RO](`type`: ProtocolNotificationType0[RO], handler: NotificationHandler0): Disposable = js.native
    /**
      * Installs a notification handler.
      *
      * @param type The notification type to install the handler for.
      * @param handler The actual handler.
      * @returns A disposable to remove the handler.
      */
    def onNotification[P, RO](`type`: ProtocolNotificationType[P, RO], handler: NotificationHandler[P]): Disposable = js.native
    
    /**
      * Installs a progress handler for a given token.
      * @param type the progress type
      * @param token the token
      * @param handler the handler
      * @returns A disposable to remove the handler.
      */
    def onProgress[P](`type`: ProgressType[P], token: String, handler: NotificationHandler[P]): Disposable = js.native
    def onProgress[P](`type`: ProgressType[P], token: Double, handler: NotificationHandler[P]): Disposable = js.native
    
    def onRequest[R, E](method: String, handler: GenericRequestHandler[R, E]): Disposable = js.native
    /**
      * Installs a request handler.
      *
      * @param methods the message signature or the method name to install a handler for.
      * @param handler The actual handler.
      * @returns A disposable to remove the handler.
      */
    def onRequest[R, E](method: MessageSignature, handler: GenericRequestHandler[R, E]): Disposable = js.native
    def onRequest[R, E](`type`: RequestType0[R, E], handler: RequestHandler0[R, E]): Disposable = js.native
    def onRequest[P, R, E](`type`: RequestType[P, R, E], handler: RequestHandler[P, R, E]): Disposable = js.native
    /**
      * Installs a request handler.
      *
      * @param type The request type to install the handler for.
      * @param handler The actual handler.
      * @returns A disposable to remove the handler.
      */
    def onRequest[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO], handler: RequestHandler0[R, E]): Disposable = js.native
    /**
      * Installs a request handler.
      *
      * @param type The request type to install the handler for.
      * @param handler The actual handler.
      * @returns A disposable to remove the handler.
      */
    def onRequest[P, R, PR, E, RO](`type`: ProtocolRequestType[P, R, PR, E, RO], handler: RequestHandler[P, R, E]): Disposable = js.native
    
    /**
      * An event emitter firing when the connection receives a notification that is not
      * handled.
      */
    def onUnhandledNotification(listener: js.Function1[/* e */ NotificationMessage, Any]): Disposable = js.native
    def onUnhandledNotification(listener: js.Function1[/* e */ NotificationMessage, Any], thisArgs: Any): Disposable = js.native
    def onUnhandledNotification(
      listener: js.Function1[/* e */ NotificationMessage, Any],
      thisArgs: Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onUnhandledNotification(
      listener: js.Function1[/* e */ NotificationMessage, Any],
      thisArgs: Unit,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    /**
      * An event emitter firing when the connection receives a notification that is not
      * handled.
      */
    @JSName("onUnhandledNotification")
    var onUnhandledNotification_Original: Event[NotificationMessage] = js.native
    
    def sendNotification(method: String): js.Promise[Unit] = js.native
    def sendNotification(method: String, params: Any): js.Promise[Unit] = js.native
    /**
      * Sends a notification.
      *
      * @param method the notification's method signature or the method name.
      * @returns A promise that resolves when the notification is written to the
      * network layer.
      */
    def sendNotification(method: MessageSignature): js.Promise[Unit] = js.native
    /**
      * Sends a notification.
      *
      * @param method the notification's method signature or the method name.
      * @param params the notification's parameters.
      * @returns A promise that resolves when the notification is written to the
      * network layer.
      */
    def sendNotification(method: MessageSignature, params: Any): js.Promise[Unit] = js.native
    /**
      * Sends a notification.
      *
      * @param type the notification's type to send.
      * @returns A promise that resolves when the notification is written to the
      * network layer.
      */
    def sendNotification(`type`: NotificationType0): js.Promise[Unit] = js.native
    def sendNotification[P](`type`: NotificationType[P]): js.Promise[Unit] = js.native
    def sendNotification[P](`type`: NotificationType[P], params: P): js.Promise[Unit] = js.native
    def sendNotification[RO](`type`: ProtocolNotificationType0[RO]): js.Promise[Unit] = js.native
    /**
      * Sends a notification.
      *
      * @param type the notification's type to send.
      * @param params the notification's parameters.
      * @returns A promise that resolves when the notification is written to the
      * network layer.
      */
    def sendNotification[P, RO](`type`: ProtocolNotificationType[P, RO]): js.Promise[Unit] = js.native
    def sendNotification[P, RO](`type`: ProtocolNotificationType[P, RO], params: P): js.Promise[Unit] = js.native
    
    /**
      * Sends progress.
      * @param type the progress type
      * @param token the token to use
      * @param value the progress value
      * @returns A promise that resolves when the progress is written to the
      * network layer.
      */
    def sendProgress[P](`type`: ProgressType[P], token: String, value: P): js.Promise[Unit] = js.native
    def sendProgress[P](`type`: ProgressType[P], token: Double, value: P): js.Promise[Unit] = js.native
    
    def sendRequest[R](method: String): js.Promise[R] = js.native
    def sendRequest[R](method: String, param: Any): js.Promise[R] = js.native
    def sendRequest[R](method: String, param: Any, token: CancellationToken): js.Promise[R] = js.native
    def sendRequest[R](method: String, token: CancellationToken): js.Promise[R] = js.native
    /**
      * Sends a request and returns a promise resolving to the result of the request.
      *
      * @param method the message signature or the method name.
      * @param token An optional cancellation token.
      * @returns A promise resolving to the request's result.
      */
    def sendRequest[R](method: MessageSignature): js.Promise[R] = js.native
    /**
      * Sends a request and returns a promise resolving to the result of the request.
      *
      * @param method the message signature or the method name.
      * @param params The request's parameter.
      * @param token An optional cancellation token.
      * @returns A promise resolving to the request's result.
      */
    def sendRequest[R](method: MessageSignature, param: Any): js.Promise[R] = js.native
    def sendRequest[R](method: MessageSignature, param: Any, token: CancellationToken): js.Promise[R] = js.native
    def sendRequest[R](method: MessageSignature, token: CancellationToken): js.Promise[R] = js.native
    def sendRequest[R, E](`type`: RequestType0[R, E]): js.Promise[R] = js.native
    def sendRequest[R, E](`type`: RequestType0[R, E], token: CancellationToken): js.Promise[R] = js.native
    def sendRequest[P, R, E](`type`: RequestType[P, R, E], params: P): js.Promise[R] = js.native
    def sendRequest[P, R, E](`type`: RequestType[P, R, E], params: P, token: CancellationToken): js.Promise[R] = js.native
    /**
      * Sends a request and returns a promise resolving to the result of the request.
      *
      * @param type The type of request to sent.
      * @param token An optional cancellation token.
      * @returns A promise resolving to the request's result.
      */
    def sendRequest[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO]): js.Promise[R] = js.native
    def sendRequest[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO], token: CancellationToken): js.Promise[R] = js.native
    /**
      * Sends a request and returns a promise resolving to the result of the request.
      *
      * @param type The type of request to sent.
      * @param params The request's parameter.
      * @param token An optional cancellation token.
      * @returns A promise resolving to the request's result.
      */
    def sendRequest[P, R, PR, E, RO](`type`: ProtocolRequestType[P, R, PR, E, RO], params: P): js.Promise[R] = js.native
    def sendRequest[P, R, PR, E, RO](`type`: ProtocolRequestType[P, R, PR, E, RO], params: P, token: CancellationToken): js.Promise[R] = js.native
    
    /**
      * Enables tracing mode for the connection.
      * @returns A promise that resolves when the trace value is written to the
      * network layer.
      */
    def trace(value: Trace, tracer: Tracer): js.Promise[Unit] = js.native
    def trace(value: Trace, tracer: Tracer, sendNotification: Boolean): js.Promise[Unit] = js.native
    def trace(value: Trace, tracer: Tracer, traceOptions: TraceOptions): js.Promise[Unit] = js.native
  }
}
