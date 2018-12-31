package typings
package vscodeDashJsonrpcLib.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageConnection extends js.Object {
  @JSName("onClose")
  var onClose_Original: vscodeDashJsonrpcLib.libEventsMod.Event[scala.Unit] = js.native
  @JSName("onDispose")
  var onDispose_Original: vscodeDashJsonrpcLib.libEventsMod.Event[scala.Unit] = js.native
  @JSName("onError")
  var onError_Original: vscodeDashJsonrpcLib.libEventsMod.Event[
    js.Tuple3[
      nodeLib.Error, 
      js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.Message], 
      js.UndefOr[scala.Double]
    ]
  ] = js.native
  @JSName("onUnhandledNotification")
  var onUnhandledNotification_Original: vscodeDashJsonrpcLib.libEventsMod.Event[vscodeDashJsonrpcLib.libMessagesMod.NotificationMessage] = js.native
  def dispose(): scala.Unit = js.native
  def inspect(): scala.Unit = js.native
  def listen(): scala.Unit = js.native
  /**
    *
    * @param listener The listener function will be call when the event happens.
    * @param thisArgs The 'this' which will be used when calling the event listener.
    * @param disposables An array to which a {{IDisposable}} will be added. The
    * @return
    */
  def onClose(listener: js.Function1[/* e */ scala.Unit, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onClose(listener: js.Function1[/* e */ scala.Unit, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onClose(
    listener: js.Function1[/* e */ scala.Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
    *
    * @param listener The listener function will be call when the event happens.
    * @param thisArgs The 'this' which will be used when calling the event listener.
    * @param disposables An array to which a {{IDisposable}} will be added. The
    * @return
    */
  def onDispose(listener: js.Function1[/* e */ scala.Unit, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onDispose(listener: js.Function1[/* e */ scala.Unit, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onDispose(
    listener: js.Function1[/* e */ scala.Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
    *
    * @param listener The listener function will be call when the event happens.
    * @param thisArgs The 'this' which will be used when calling the event listener.
    * @param disposables An array to which a {{IDisposable}} will be added. The
    * @return
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
  def onNotification(handler: StarNotificationHandler): scala.Unit = js.native
  def onNotification(method: java.lang.String, handler: GenericNotificationHandler): scala.Unit = js.native
  def onNotification[RO](`type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType0[RO], handler: NotificationHandler0): scala.Unit = js.native
  def onNotification[P1, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType1[P1, RO],
    handler: NotificationHandler1[P1]
  ): scala.Unit = js.native
  def onNotification[P, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType[P, RO],
    handler: NotificationHandler[P]
  ): scala.Unit = js.native
  def onNotification[P1, P2, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType2[P1, P2, RO],
    handler: NotificationHandler2[P1, P2]
  ): scala.Unit = js.native
  def onNotification[P1, P2, P3, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType3[P1, P2, P3, RO],
    handler: NotificationHandler3[P1, P2, P3]
  ): scala.Unit = js.native
  def onNotification[P1, P2, P3, P4, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType4[P1, P2, P3, P4, RO],
    handler: NotificationHandler4[P1, P2, P3, P4]
  ): scala.Unit = js.native
  def onNotification[P1, P2, P3, P4, P5, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType5[P1, P2, P3, P4, P5, RO],
    handler: NotificationHandler5[P1, P2, P3, P4, P5]
  ): scala.Unit = js.native
  def onNotification[P1, P2, P3, P4, P5, P6, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType6[P1, P2, P3, P4, P5, P6, RO],
    handler: NotificationHandler6[P1, P2, P3, P4, P5, P6]
  ): scala.Unit = js.native
  def onNotification[P1, P2, P3, P4, P5, P6, P7, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType7[P1, P2, P3, P4, P5, P6, P7, RO],
    handler: NotificationHandler7[P1, P2, P3, P4, P5, P6, P7]
  ): scala.Unit = js.native
  def onNotification[P1, P2, P3, P4, P5, P6, P7, P8, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType8[P1, P2, P3, P4, P5, P6, P7, P8, RO],
    handler: NotificationHandler8[P1, P2, P3, P4, P5, P6, P7, P8]
  ): scala.Unit = js.native
  def onNotification[P1, P2, P3, P4, P5, P6, P7, P8, P9, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType9[P1, P2, P3, P4, P5, P6, P7, P8, P9, RO],
    handler: NotificationHandler9[P1, P2, P3, P4, P5, P6, P7, P8, P9]
  ): scala.Unit = js.native
  def onRequest(handler: StarRequestHandler): scala.Unit = js.native
  def onRequest[R, E](method: java.lang.String, handler: GenericRequestHandler[R, E]): scala.Unit = js.native
  def onRequest[R, E, RO](`type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType0[R, E, RO], handler: RequestHandler0[R, E]): scala.Unit = js.native
  def onRequest[P1, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType1[P1, R, E, RO],
    handler: RequestHandler1[P1, R, E]
  ): scala.Unit = js.native
  def onRequest[P, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType[P, R, E, RO],
    handler: RequestHandler[P, R, E]
  ): scala.Unit = js.native
  def onRequest[P1, P2, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType2[P1, P2, R, E, RO],
    handler: RequestHandler2[P1, P2, R, E]
  ): scala.Unit = js.native
  def onRequest[P1, P2, P3, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType3[P1, P2, P3, R, E, RO],
    handler: RequestHandler3[P1, P2, P3, R, E]
  ): scala.Unit = js.native
  def onRequest[P1, P2, P3, P4, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType4[P1, P2, P3, P4, R, E, RO],
    handler: RequestHandler4[P1, P2, P3, P4, R, E]
  ): scala.Unit = js.native
  def onRequest[P1, P2, P3, P4, P5, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType5[P1, P2, P3, P4, P5, R, E, RO],
    handler: RequestHandler5[P1, P2, P3, P4, P5, R, E]
  ): scala.Unit = js.native
  def onRequest[P1, P2, P3, P4, P5, P6, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType6[P1, P2, P3, P4, P5, P6, R, E, RO],
    handler: RequestHandler6[P1, P2, P3, P4, P5, P6, R, E]
  ): scala.Unit = js.native
  def onRequest[P1, P2, P3, P4, P5, P6, P7, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType7[P1, P2, P3, P4, P5, P6, P7, R, E, RO],
    handler: RequestHandler7[P1, P2, P3, P4, P5, P6, P7, R, E]
  ): scala.Unit = js.native
  def onRequest[P1, P2, P3, P4, P5, P6, P7, P8, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType8[P1, P2, P3, P4, P5, P6, P7, P8, R, E, RO],
    handler: RequestHandler8[P1, P2, P3, P4, P5, P6, P7, P8, R, E]
  ): scala.Unit = js.native
  def onRequest[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType9[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E, RO],
    handler: RequestHandler9[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E]
  ): scala.Unit = js.native
  /**
    *
    * @param listener The listener function will be call when the event happens.
    * @param thisArgs The 'this' which will be used when calling the event listener.
    * @param disposables An array to which a {{IDisposable}} will be added. The
    * @return
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
  def sendNotification(method: java.lang.String, params: js.Any*): scala.Unit = js.native
  def sendNotification[RO](`type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType0[RO]): scala.Unit = js.native
  def sendNotification[P, RO](`type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType[P, RO]): scala.Unit = js.native
  def sendNotification[P1, RO](`type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType1[P1, RO], p1: P1): scala.Unit = js.native
  def sendNotification[P, RO](`type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType[P, RO], params: P): scala.Unit = js.native
  def sendNotification[P1, P2, RO](`type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType2[P1, P2, RO], p1: P1, p2: P2): scala.Unit = js.native
  def sendNotification[P1, P2, P3, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType3[P1, P2, P3, RO],
    p1: P1,
    p2: P2,
    p3: P3
  ): scala.Unit = js.native
  def sendNotification[P1, P2, P3, P4, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType4[P1, P2, P3, P4, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4
  ): scala.Unit = js.native
  def sendNotification[P1, P2, P3, P4, P5, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType5[P1, P2, P3, P4, P5, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5
  ): scala.Unit = js.native
  def sendNotification[P1, P2, P3, P4, P5, P6, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType6[P1, P2, P3, P4, P5, P6, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6
  ): scala.Unit = js.native
  def sendNotification[P1, P2, P3, P4, P5, P6, P7, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType7[P1, P2, P3, P4, P5, P6, P7, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7
  ): scala.Unit = js.native
  def sendNotification[P1, P2, P3, P4, P5, P6, P7, P8, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType8[P1, P2, P3, P4, P5, P6, P7, P8, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8
  ): scala.Unit = js.native
  def sendNotification[P1, P2, P3, P4, P5, P6, P7, P8, P9, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.NotificationType9[P1, P2, P3, P4, P5, P6, P7, P8, P9, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9
  ): scala.Unit = js.native
  def sendRequest[R](method: java.lang.String, params: js.Any*): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[R, E, RO](`type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType0[R, E, RO]): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType0[R, E, RO],
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, R, E, RO](`type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType1[P1, R, E, RO], p1: P1): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType1[P1, R, E, RO],
    p1: P1,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P, R, E, RO](`type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType[P, R, E, RO], params: P): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType[P, R, E, RO],
    params: P,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, R, E, RO](`type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType2[P1, P2, R, E, RO], p1: P1, p2: P2): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType2[P1, P2, R, E, RO],
    p1: P1,
    p2: P2,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, P3, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType3[P1, P2, P3, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, P3, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType3[P1, P2, P3, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType4[P1, P2, P3, P4, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType4[P1, P2, P3, P4, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType5[P1, P2, P3, P4, P5, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType5[P1, P2, P3, P4, P5, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType6[P1, P2, P3, P4, P5, P6, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType6[P1, P2, P3, P4, P5, P6, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType7[P1, P2, P3, P4, P5, P6, P7, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType7[P1, P2, P3, P4, P5, P6, P7, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, P8, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType8[P1, P2, P3, P4, P5, P6, P7, P8, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, P8, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType8[P1, P2, P3, P4, P5, P6, P7, P8, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType9[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E, RO](
    `type`: vscodeDashJsonrpcLib.libMessagesMod.RequestType9[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E, RO],
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def trace(value: Trace, tracer: Tracer): scala.Unit = js.native
  def trace(value: Trace, tracer: Tracer, sendNotification: scala.Boolean): scala.Unit = js.native
  def trace(value: Trace, tracer: Tracer, traceOptions: TraceOptions): scala.Unit = js.native
}

