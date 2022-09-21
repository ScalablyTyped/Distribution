package typings.vscodeJsonrpc.connectionMod

import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeJsonrpc.disposableMod.Disposable
import typings.vscodeJsonrpc.eventsMod.Event
import typings.vscodeJsonrpc.messagesMod.Message
import typings.vscodeJsonrpc.messagesMod.NotificationMessage
import typings.vscodeJsonrpc.messagesMod.NotificationType
import typings.vscodeJsonrpc.messagesMod.NotificationType0
import typings.vscodeJsonrpc.messagesMod.NotificationType1
import typings.vscodeJsonrpc.messagesMod.NotificationType2
import typings.vscodeJsonrpc.messagesMod.NotificationType3
import typings.vscodeJsonrpc.messagesMod.NotificationType4
import typings.vscodeJsonrpc.messagesMod.NotificationType5
import typings.vscodeJsonrpc.messagesMod.NotificationType6
import typings.vscodeJsonrpc.messagesMod.NotificationType7
import typings.vscodeJsonrpc.messagesMod.NotificationType8
import typings.vscodeJsonrpc.messagesMod.NotificationType9
import typings.vscodeJsonrpc.messagesMod.ParameterStructures
import typings.vscodeJsonrpc.messagesMod.RequestType
import typings.vscodeJsonrpc.messagesMod.RequestType0
import typings.vscodeJsonrpc.messagesMod.RequestType1
import typings.vscodeJsonrpc.messagesMod.RequestType2
import typings.vscodeJsonrpc.messagesMod.RequestType3
import typings.vscodeJsonrpc.messagesMod.RequestType4
import typings.vscodeJsonrpc.messagesMod.RequestType5
import typings.vscodeJsonrpc.messagesMod.RequestType6
import typings.vscodeJsonrpc.messagesMod.RequestType7
import typings.vscodeJsonrpc.messagesMod.RequestType8
import typings.vscodeJsonrpc.messagesMod.RequestType9
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageConnection extends StObject {
  
  def dispose(): Unit = js.native
  
  def end(): Unit = js.native
  
  def hasPendingResponse(): Boolean = js.native
  
  def inspect(): Unit = js.native
  
  def listen(): Unit = js.native
  
  def onClose(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
  def onClose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
  def onClose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onClose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onClose")
  var onClose_Original: Event[Unit] = js.native
  
  def onDispose(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
  def onDispose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
  def onDispose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDispose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onDispose")
  var onDispose_Original: Event[Unit] = js.native
  
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
  @JSName("onError")
  var onError_Original: Event[js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]]] = js.native
  
  def onNotification(handler: StarNotificationHandler): Disposable = js.native
  def onNotification(method: String, handler: GenericNotificationHandler): Disposable = js.native
  def onNotification(`type`: NotificationType0, handler: NotificationHandler0): Disposable = js.native
  def onNotification[P1](`type`: NotificationType1[P1], handler: NotificationHandler1[P1]): Disposable = js.native
  def onNotification[P](`type`: NotificationType[P], handler: NotificationHandler[P]): Disposable = js.native
  def onNotification[P1, P2](`type`: NotificationType2[P1, P2], handler: NotificationHandler2[P1, P2]): Disposable = js.native
  def onNotification[P1, P2, P3](`type`: NotificationType3[P1, P2, P3], handler: NotificationHandler3[P1, P2, P3]): Disposable = js.native
  def onNotification[P1, P2, P3, P4](`type`: NotificationType4[P1, P2, P3, P4], handler: NotificationHandler4[P1, P2, P3, P4]): Disposable = js.native
  def onNotification[P1, P2, P3, P4, P5](`type`: NotificationType5[P1, P2, P3, P4, P5], handler: NotificationHandler5[P1, P2, P3, P4, P5]): Disposable = js.native
  def onNotification[P1, P2, P3, P4, P5, P6](
    `type`: NotificationType6[P1, P2, P3, P4, P5, P6],
    handler: NotificationHandler6[P1, P2, P3, P4, P5, P6]
  ): Disposable = js.native
  def onNotification[P1, P2, P3, P4, P5, P6, P7](
    `type`: NotificationType7[P1, P2, P3, P4, P5, P6, P7],
    handler: NotificationHandler7[P1, P2, P3, P4, P5, P6, P7]
  ): Disposable = js.native
  def onNotification[P1, P2, P3, P4, P5, P6, P7, P8](
    `type`: NotificationType8[P1, P2, P3, P4, P5, P6, P7, P8],
    handler: NotificationHandler8[P1, P2, P3, P4, P5, P6, P7, P8]
  ): Disposable = js.native
  def onNotification[P1, P2, P3, P4, P5, P6, P7, P8, P9](
    `type`: NotificationType9[P1, P2, P3, P4, P5, P6, P7, P8, P9],
    handler: NotificationHandler9[P1, P2, P3, P4, P5, P6, P7, P8, P9]
  ): Disposable = js.native
  
  def onProgress[P](`type`: ProgressType[P], token: String, handler: NotificationHandler[P]): Disposable = js.native
  def onProgress[P](`type`: ProgressType[P], token: Double, handler: NotificationHandler[P]): Disposable = js.native
  
  def onRequest(handler: StarRequestHandler): Disposable = js.native
  def onRequest[R, E](method: String, handler: GenericRequestHandler[R, E]): Disposable = js.native
  def onRequest[R, E](`type`: RequestType0[R, E], handler: RequestHandler0[R, E]): Disposable = js.native
  def onRequest[P1, R, E](`type`: RequestType1[P1, R, E], handler: RequestHandler1[P1, R, E]): Disposable = js.native
  def onRequest[P, R, E](`type`: RequestType[P, R, E], handler: RequestHandler[P, R, E]): Disposable = js.native
  def onRequest[P1, P2, R, E](`type`: RequestType2[P1, P2, R, E], handler: RequestHandler2[P1, P2, R, E]): Disposable = js.native
  def onRequest[P1, P2, P3, R, E](`type`: RequestType3[P1, P2, P3, R, E], handler: RequestHandler3[P1, P2, P3, R, E]): Disposable = js.native
  def onRequest[P1, P2, P3, P4, R, E](`type`: RequestType4[P1, P2, P3, P4, R, E], handler: RequestHandler4[P1, P2, P3, P4, R, E]): Disposable = js.native
  def onRequest[P1, P2, P3, P4, P5, R, E](`type`: RequestType5[P1, P2, P3, P4, P5, R, E], handler: RequestHandler5[P1, P2, P3, P4, P5, R, E]): Disposable = js.native
  def onRequest[P1, P2, P3, P4, P5, P6, R, E](
    `type`: RequestType6[P1, P2, P3, P4, P5, P6, R, E],
    handler: RequestHandler6[P1, P2, P3, P4, P5, P6, R, E]
  ): Disposable = js.native
  def onRequest[P1, P2, P3, P4, P5, P6, P7, R, E](
    `type`: RequestType7[P1, P2, P3, P4, P5, P6, P7, R, E],
    handler: RequestHandler7[P1, P2, P3, P4, P5, P6, P7, R, E]
  ): Disposable = js.native
  def onRequest[P1, P2, P3, P4, P5, P6, P7, P8, R, E](
    `type`: RequestType8[P1, P2, P3, P4, P5, P6, P7, P8, R, E],
    handler: RequestHandler8[P1, P2, P3, P4, P5, P6, P7, P8, R, E]
  ): Disposable = js.native
  def onRequest[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E](
    `type`: RequestType9[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E],
    handler: RequestHandler9[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E]
  ): Disposable = js.native
  
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
  @JSName("onUnhandledNotification")
  var onUnhandledNotification_Original: Event[NotificationMessage] = js.native
  
  def onUnhandledProgress(listener: js.Function1[/* e */ ProgressParams[Any], Any]): Disposable = js.native
  def onUnhandledProgress(listener: js.Function1[/* e */ ProgressParams[Any], Any], thisArgs: Any): Disposable = js.native
  def onUnhandledProgress(
    listener: js.Function1[/* e */ ProgressParams[Any], Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onUnhandledProgress(
    listener: js.Function1[/* e */ ProgressParams[Any], Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  @JSName("onUnhandledProgress")
  var onUnhandledProgress_Original: Event[ProgressParams[Any]] = js.native
  
  def sendNotification(method: String, r0: Any, rest: Any*): js.Promise[Unit] = js.native
  def sendNotification(method: String, r0: Unit, rest: Any*): js.Promise[Unit] = js.native
  def sendNotification(method: String, r0: ParameterStructures, rest: Any*): js.Promise[Unit] = js.native
  def sendNotification(`type`: NotificationType0): js.Promise[Unit] = js.native
  def sendNotification[P](`type`: NotificationType[P]): js.Promise[Unit] = js.native
  def sendNotification[P1](`type`: NotificationType1[P1], p1: P1): js.Promise[Unit] = js.native
  def sendNotification[P](`type`: NotificationType[P], params: P): js.Promise[Unit] = js.native
  def sendNotification[P1, P2](`type`: NotificationType2[P1, P2], p1: P1, p2: P2): js.Promise[Unit] = js.native
  def sendNotification[P1, P2, P3](`type`: NotificationType3[P1, P2, P3], p1: P1, p2: P2, p3: P3): js.Promise[Unit] = js.native
  def sendNotification[P1, P2, P3, P4](`type`: NotificationType4[P1, P2, P3, P4], p1: P1, p2: P2, p3: P3, p4: P4): js.Promise[Unit] = js.native
  def sendNotification[P1, P2, P3, P4, P5](`type`: NotificationType5[P1, P2, P3, P4, P5], p1: P1, p2: P2, p3: P3, p4: P4, p5: P5): js.Promise[Unit] = js.native
  def sendNotification[P1, P2, P3, P4, P5, P6](`type`: NotificationType6[P1, P2, P3, P4, P5, P6], p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6): js.Promise[Unit] = js.native
  def sendNotification[P1, P2, P3, P4, P5, P6, P7](
    `type`: NotificationType7[P1, P2, P3, P4, P5, P6, P7],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7
  ): js.Promise[Unit] = js.native
  def sendNotification[P1, P2, P3, P4, P5, P6, P7, P8](
    `type`: NotificationType8[P1, P2, P3, P4, P5, P6, P7, P8],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8
  ): js.Promise[Unit] = js.native
  def sendNotification[P1, P2, P3, P4, P5, P6, P7, P8, P9](
    `type`: NotificationType9[P1, P2, P3, P4, P5, P6, P7, P8, P9],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9
  ): js.Promise[Unit] = js.native
  
  def sendProgress[P](`type`: ProgressType[P], token: String, value: P): js.Promise[Unit] = js.native
  def sendProgress[P](`type`: ProgressType[P], token: Double, value: P): js.Promise[Unit] = js.native
  
  def sendRequest[R](method: String, r0: Any, rest: Any*): js.Promise[R] = js.native
  def sendRequest[R](method: String, r0: Unit, rest: Any*): js.Promise[R] = js.native
  def sendRequest[R](method: String, r0: ParameterStructures, rest: Any*): js.Promise[R] = js.native
  def sendRequest[R, E](`type`: RequestType0[R, E]): js.Promise[R] = js.native
  def sendRequest[R, E](`type`: RequestType0[R, E], token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[P1, R, E](`type`: RequestType1[P1, R, E], p1: P1): js.Promise[R] = js.native
  def sendRequest[P1, R, E](`type`: RequestType1[P1, R, E], p1: P1, token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[P, R, E](`type`: RequestType[P, R, E], params: P): js.Promise[R] = js.native
  def sendRequest[P, R, E](`type`: RequestType[P, R, E], params: P, token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[P1, P2, R, E](`type`: RequestType2[P1, P2, R, E], p1: P1, p2: P2): js.Promise[R] = js.native
  def sendRequest[P1, P2, R, E](`type`: RequestType2[P1, P2, R, E], p1: P1, p2: P2, token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[P1, P2, P3, R, E](`type`: RequestType3[P1, P2, P3, R, E], p1: P1, p2: P2, p3: P3): js.Promise[R] = js.native
  def sendRequest[P1, P2, P3, R, E](`type`: RequestType3[P1, P2, P3, R, E], p1: P1, p2: P2, p3: P3, token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[P1, P2, P3, P4, R, E](`type`: RequestType4[P1, P2, P3, P4, R, E], p1: P1, p2: P2, p3: P3, p4: P4): js.Promise[R] = js.native
  def sendRequest[P1, P2, P3, P4, R, E](
    `type`: RequestType4[P1, P2, P3, P4, R, E],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    token: CancellationToken
  ): js.Promise[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, R, E](`type`: RequestType5[P1, P2, P3, P4, P5, R, E], p1: P1, p2: P2, p3: P3, p4: P4, p5: P5): js.Promise[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, R, E](
    `type`: RequestType5[P1, P2, P3, P4, P5, R, E],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    token: CancellationToken
  ): js.Promise[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, R, E](`type`: RequestType6[P1, P2, P3, P4, P5, P6, R, E], p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6): js.Promise[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, R, E](
    `type`: RequestType6[P1, P2, P3, P4, P5, P6, R, E],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    token: CancellationToken
  ): js.Promise[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, R, E](
    `type`: RequestType7[P1, P2, P3, P4, P5, P6, P7, R, E],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7
  ): js.Promise[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, R, E](
    `type`: RequestType7[P1, P2, P3, P4, P5, P6, P7, R, E],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    token: CancellationToken
  ): js.Promise[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, P8, R, E](
    `type`: RequestType8[P1, P2, P3, P4, P5, P6, P7, P8, R, E],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8
  ): js.Promise[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, P8, R, E](
    `type`: RequestType8[P1, P2, P3, P4, P5, P6, P7, P8, R, E],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    token: CancellationToken
  ): js.Promise[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E](
    `type`: RequestType9[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9
  ): js.Promise[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E](
    `type`: RequestType9[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    token: CancellationToken
  ): js.Promise[R] = js.native
  
  def trace(value: Trace, tracer: Tracer): js.Promise[Unit] = js.native
  def trace(value: Trace, tracer: Tracer, sendNotification: Boolean): js.Promise[Unit] = js.native
  def trace(value: Trace, tracer: Tracer, traceOptions: TraceOptions): js.Promise[Unit] = js.native
}
