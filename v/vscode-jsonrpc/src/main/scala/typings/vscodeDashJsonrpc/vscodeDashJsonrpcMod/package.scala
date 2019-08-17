package typings.vscodeDashJsonrpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vscodeDashJsonrpcMod {
  import typings.vscodeDashJsonrpc.Thenable
  import typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
  import typings.vscodeDashJsonrpc.libLinkedMapMod.LinkedMap
  import typings.vscodeDashJsonrpc.libMessagesMod.Message

  type GenericNotificationHandler = js.Function1[/* repeated */ js.Any, Unit]
  type GenericRequestHandler[R, E] = js.Function1[/* repeated */ js.Any, HandlerResult[R, E]]
  type HandlerResult[R, E] = R | typings.vscodeDashJsonrpc.libMessagesMod.ResponseError[E] | (Thenable[R | typings.vscodeDashJsonrpc.libMessagesMod.ResponseError[E]])
  type MessageQueue = LinkedMap[String, Message]
  type NotificationHandler[P] = js.Function1[/* params */ P, Unit]
  type NotificationHandler0 = js.Function0[Unit]
  type NotificationHandler1[P1] = js.Function1[/* p1 */ P1, Unit]
  type NotificationHandler2[P1, P2] = js.Function2[/* p1 */ P1, /* p2 */ P2, Unit]
  type NotificationHandler3[P1, P2, P3] = js.Function3[/* p1 */ P1, /* p2 */ P2, /* p3 */ P3, Unit]
  type NotificationHandler4[P1, P2, P3, P4] = js.Function4[/* p1 */ P1, /* p2 */ P2, /* p3 */ P3, /* p4 */ P4, Unit]
  type NotificationHandler5[P1, P2, P3, P4, P5] = js.Function5[/* p1 */ P1, /* p2 */ P2, /* p3 */ P3, /* p4 */ P4, /* p5 */ P5, Unit]
  type NotificationHandler6[P1, P2, P3, P4, P5, P6] = js.Function6[/* p1 */ P1, /* p2 */ P2, /* p3 */ P3, /* p4 */ P4, /* p5 */ P5, /* p6 */ P6, Unit]
  type NotificationHandler7[P1, P2, P3, P4, P5, P6, P7] = js.Function7[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* p6 */ P6, 
    /* p7 */ P7, 
    Unit
  ]
  type NotificationHandler8[P1, P2, P3, P4, P5, P6, P7, P8] = js.Function8[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* p6 */ P6, 
    /* p7 */ P7, 
    /* p8 */ P8, 
    Unit
  ]
  type NotificationHandler9[P1, P2, P3, P4, P5, P6, P7, P8, P9] = js.Function9[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* p6 */ P6, 
    /* p7 */ P7, 
    /* p8 */ P8, 
    /* p9 */ P9, 
    Unit
  ]
  type RequestHandler[P, R, E] = js.Function2[/* params */ P, /* token */ CancellationToken, HandlerResult[R, E]]
  type RequestHandler0[R, E] = js.Function1[/* token */ CancellationToken, HandlerResult[R, E]]
  type RequestHandler1[P1, R, E] = js.Function2[/* p1 */ P1, /* token */ CancellationToken, HandlerResult[R, E]]
  type RequestHandler2[P1, P2, R, E] = js.Function3[/* p1 */ P1, /* p2 */ P2, /* token */ CancellationToken, HandlerResult[R, E]]
  type RequestHandler3[P1, P2, P3, R, E] = js.Function4[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* token */ CancellationToken, 
    HandlerResult[R, E]
  ]
  type RequestHandler4[P1, P2, P3, P4, R, E] = js.Function5[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* token */ CancellationToken, 
    HandlerResult[R, E]
  ]
  type RequestHandler5[P1, P2, P3, P4, P5, R, E] = js.Function6[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* token */ CancellationToken, 
    HandlerResult[R, E]
  ]
  type RequestHandler6[P1, P2, P3, P4, P5, P6, R, E] = js.Function7[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* p6 */ P6, 
    /* token */ CancellationToken, 
    HandlerResult[R, E]
  ]
  type RequestHandler7[P1, P2, P3, P4, P5, P6, P7, R, E] = js.Function8[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* p6 */ P6, 
    /* p7 */ P7, 
    /* token */ CancellationToken, 
    HandlerResult[R, E]
  ]
  type RequestHandler8[P1, P2, P3, P4, P5, P6, P7, P8, R, E] = js.Function9[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* p6 */ P6, 
    /* p7 */ P7, 
    /* p8 */ P8, 
    /* token */ CancellationToken, 
    HandlerResult[R, E]
  ]
  type RequestHandler9[P1, P2, P3, P4, P5, P6, P7, P8, P9, R, E] = js.Function10[
    /* p1 */ P1, 
    /* p2 */ P2, 
    /* p3 */ P3, 
    /* p4 */ P4, 
    /* p5 */ P5, 
    /* p6 */ P6, 
    /* p7 */ P7, 
    /* p8 */ P8, 
    /* p9 */ P9, 
    /* token */ CancellationToken, 
    HandlerResult[R, E]
  ]
  type StarNotificationHandler = js.Function2[/* method */ String, /* repeated */ js.Any, Unit]
  type StarRequestHandler = js.Function2[/* method */ String, /* repeated */ js.Any, HandlerResult[js.Any, js.Any]]
}
