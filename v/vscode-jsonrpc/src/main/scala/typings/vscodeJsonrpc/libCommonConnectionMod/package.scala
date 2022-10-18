package typings.vscodeJsonrpc.libCommonConnectionMod

import typings.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typings.vscodeJsonrpc.libCommonConnectionMod.^
import typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader
import typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter
import typings.vscodeJsonrpc.libCommonMessagesMod.ResponseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def NullLogger: Logger = ^.asInstanceOf[js.Dynamic].selectDynamic("NullLogger").asInstanceOf[Logger]

type ProgressToken = Double | String

inline def createMessageConnection(messageReader: MessageReader, messageWriter: MessageWriter): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: MessageReader,
  messageWriter: MessageWriter,
  _logger: Unit,
  options: ConnectionOptions
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(messageReader: MessageReader, messageWriter: MessageWriter, _logger: Logger): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: MessageReader,
  messageWriter: MessageWriter,
  _logger: Logger,
  options: ConnectionOptions
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]

type CancellationId = Double | String

type GenericNotificationHandler = js.Function1[/* repeated */ Any, Unit]

type GenericRequestHandler[R, E] = js.Function1[/* repeated */ Any, HandlerResult[R, E]]

type HandlerResult[R, E] = R | ResponseError[E] | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Thenable<R> */ Any)

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
Unit]

type NotificationHandler8[P1, P2, P3, P4, P5, P6, P7, P8] = js.Function8[
/* p1 */ P1, 
/* p2 */ P2, 
/* p3 */ P3, 
/* p4 */ P4, 
/* p5 */ P5, 
/* p6 */ P6, 
/* p7 */ P7, 
/* p8 */ P8, 
Unit]

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
Unit]

type RequestHandler[P, R, E] = js.Function2[/* params */ P, /* token */ CancellationToken, HandlerResult[R, E]]

type RequestHandler0[R, E] = js.Function1[/* token */ CancellationToken, HandlerResult[R, E]]

type RequestHandler1[P1, R, E] = js.Function2[/* p1 */ P1, /* token */ CancellationToken, HandlerResult[R, E]]

type RequestHandler2[P1, P2, R, E] = js.Function3[/* p1 */ P1, /* p2 */ P2, /* token */ CancellationToken, HandlerResult[R, E]]

type RequestHandler3[P1, P2, P3, R, E] = js.Function4[
/* p1 */ P1, 
/* p2 */ P2, 
/* p3 */ P3, 
/* token */ CancellationToken, 
HandlerResult[R, E]]

type RequestHandler4[P1, P2, P3, P4, R, E] = js.Function5[
/* p1 */ P1, 
/* p2 */ P2, 
/* p3 */ P3, 
/* p4 */ P4, 
/* token */ CancellationToken, 
HandlerResult[R, E]]

type RequestHandler5[P1, P2, P3, P4, P5, R, E] = js.Function6[
/* p1 */ P1, 
/* p2 */ P2, 
/* p3 */ P3, 
/* p4 */ P4, 
/* p5 */ P5, 
/* token */ CancellationToken, 
HandlerResult[R, E]]

type RequestHandler6[P1, P2, P3, P4, P5, P6, R, E] = js.Function7[
/* p1 */ P1, 
/* p2 */ P2, 
/* p3 */ P3, 
/* p4 */ P4, 
/* p5 */ P5, 
/* p6 */ P6, 
/* token */ CancellationToken, 
HandlerResult[R, E]]

type RequestHandler7[P1, P2, P3, P4, P5, P6, P7, R, E] = js.Function8[
/* p1 */ P1, 
/* p2 */ P2, 
/* p3 */ P3, 
/* p4 */ P4, 
/* p5 */ P5, 
/* p6 */ P6, 
/* p7 */ P7, 
/* token */ CancellationToken, 
HandlerResult[R, E]]

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
HandlerResult[R, E]]

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
HandlerResult[R, E]]

type StarNotificationHandler = js.Function2[/* method */ String, /* params */ js.UndefOr[js.Array[Any] | js.Object], Unit]

type StarRequestHandler = js.Function3[
/* method */ String, 
/* params */ js.UndefOr[js.Array[Any] | js.Object], 
/* token */ CancellationToken, 
HandlerResult[Any, Any]]
