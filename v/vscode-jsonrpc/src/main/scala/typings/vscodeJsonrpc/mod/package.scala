package typings.vscodeJsonrpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def NullLogger: typings.vscodeJsonrpc.mod.Logger = typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NullLogger").asInstanceOf[typings.vscodeJsonrpc.mod.Logger]

inline def createClientPipeTransport(pipeName: java.lang.String): js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport] = typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport]]
inline def createClientPipeTransport(pipeName: java.lang.String, encoding: typings.node.BufferEncoding): js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport] = (typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport]]

inline def createClientSocketTransport(port: scala.Double): js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport] = typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport]]
inline def createClientSocketTransport(port: scala.Double, encoding: typings.node.BufferEncoding): js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport] = (typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport]]

inline def createMessageConnection(inputStream: typings.node.NodeJS.ReadableStream, outputStream: typings.node.NodeJS.WritableStream): typings.vscodeJsonrpc.mod.MessageConnection = (typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeJsonrpc.mod.MessageConnection]
inline def createMessageConnection(
  inputStream: typings.node.NodeJS.ReadableStream,
  outputStream: typings.node.NodeJS.WritableStream,
  logger: scala.Unit,
  strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
): typings.vscodeJsonrpc.mod.MessageConnection = (typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeJsonrpc.mod.MessageConnection]
inline def createMessageConnection(
  inputStream: typings.node.NodeJS.ReadableStream,
  outputStream: typings.node.NodeJS.WritableStream,
  logger: typings.vscodeJsonrpc.mod.Logger
): typings.vscodeJsonrpc.mod.MessageConnection = (typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeJsonrpc.mod.MessageConnection]
inline def createMessageConnection(
  inputStream: typings.node.NodeJS.ReadableStream,
  outputStream: typings.node.NodeJS.WritableStream,
  logger: typings.vscodeJsonrpc.mod.Logger,
  strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
): typings.vscodeJsonrpc.mod.MessageConnection = (typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeJsonrpc.mod.MessageConnection]
inline def createMessageConnection(
  reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter
): typings.vscodeJsonrpc.mod.MessageConnection = (typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeJsonrpc.mod.MessageConnection]
inline def createMessageConnection(
  reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: scala.Unit,
  strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
): typings.vscodeJsonrpc.mod.MessageConnection = (typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeJsonrpc.mod.MessageConnection]
inline def createMessageConnection(
  reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: typings.vscodeJsonrpc.mod.Logger
): typings.vscodeJsonrpc.mod.MessageConnection = (typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeJsonrpc.mod.MessageConnection]
inline def createMessageConnection(
  reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: typings.vscodeJsonrpc.mod.Logger,
  strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
): typings.vscodeJsonrpc.mod.MessageConnection = (typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeJsonrpc.mod.MessageConnection]

inline def createServerPipeTransport(pipeName: java.lang.String): js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter] = typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter]]
inline def createServerPipeTransport(pipeName: java.lang.String, encoding: typings.node.BufferEncoding): js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter] = (typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter]]

inline def createServerSocketTransport(port: scala.Double): js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter] = typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter]]
inline def createServerSocketTransport(port: scala.Double, encoding: typings.node.BufferEncoding): js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter] = (typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter]]

inline def generateRandomPipeName(): java.lang.String = typings.vscodeJsonrpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateRandomPipeName")().asInstanceOf[java.lang.String]

type GenericNotificationHandler = js.Function1[/* repeated */ js.Any, scala.Unit]

type GenericRequestHandler[R, E] = js.Function1[/* repeated */ js.Any, typings.vscodeJsonrpc.mod.HandlerResult[R, E]]

type HandlerResult[R, E] = R | typings.vscodeJsonrpc.messagesMod.ResponseError[E] | (typings.vscodeJsonrpc.Thenable[R | typings.vscodeJsonrpc.messagesMod.ResponseError[E]])

type MessageQueue = typings.vscodeJsonrpc.linkedMapMod.LinkedMap[java.lang.String, typings.vscodeJsonrpc.messagesMod.Message]

type NotificationHandler[P] = js.Function1[/* params */ P, scala.Unit]

type NotificationHandler0 = js.Function0[scala.Unit]

type NotificationHandler1[P1] = js.Function1[/* p1 */ P1, scala.Unit]

type NotificationHandler2[P1, P2] = js.Function2[/* p1 */ P1, /* p2 */ P2, scala.Unit]

type NotificationHandler3[P1, P2, P3] = js.Function3[/* p1 */ P1, /* p2 */ P2, /* p3 */ P3, scala.Unit]

type NotificationHandler4[P1, P2, P3, P4] = js.Function4[/* p1 */ P1, /* p2 */ P2, /* p3 */ P3, /* p4 */ P4, scala.Unit]

type NotificationHandler5[P1, P2, P3, P4, P5] = js.Function5[/* p1 */ P1, /* p2 */ P2, /* p3 */ P3, /* p4 */ P4, /* p5 */ P5, scala.Unit]

type NotificationHandler6[P1, P2, P3, P4, P5, P6] = js.Function6[/* p1 */ P1, /* p2 */ P2, /* p3 */ P3, /* p4 */ P4, /* p5 */ P5, /* p6 */ P6, scala.Unit]

type NotificationHandler7[P1, P2, P3, P4, P5, P6, P7] = js.Function7[
/* p1 */ P1, 
/* p2 */ P2, 
/* p3 */ P3, 
/* p4 */ P4, 
/* p5 */ P5, 
/* p6 */ P6, 
/* p7 */ P7, 
scala.Unit]

type NotificationHandler8[P1, P2, P3, P4, P5, P6, P7, P8] = js.Function8[
/* p1 */ P1, 
/* p2 */ P2, 
/* p3 */ P3, 
/* p4 */ P4, 
/* p5 */ P5, 
/* p6 */ P6, 
/* p7 */ P7, 
/* p8 */ P8, 
scala.Unit]

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
scala.Unit]

type ProgressToken = scala.Double | java.lang.String

type RequestHandler[P, R, E] = js.Function2[
/* params */ P, 
/* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
typings.vscodeJsonrpc.mod.HandlerResult[R, E]]

type RequestHandler0[R, E] = js.Function1[
/* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
typings.vscodeJsonrpc.mod.HandlerResult[R, E]]

type RequestHandler1[P1, R, E] = js.Function2[
/* p1 */ P1, 
/* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
typings.vscodeJsonrpc.mod.HandlerResult[R, E]]

type RequestHandler2[P1, P2, R, E] = js.Function3[
/* p1 */ P1, 
/* p2 */ P2, 
/* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
typings.vscodeJsonrpc.mod.HandlerResult[R, E]]

type RequestHandler3[P1, P2, P3, R, E] = js.Function4[
/* p1 */ P1, 
/* p2 */ P2, 
/* p3 */ P3, 
/* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
typings.vscodeJsonrpc.mod.HandlerResult[R, E]]

type RequestHandler4[P1, P2, P3, P4, R, E] = js.Function5[
/* p1 */ P1, 
/* p2 */ P2, 
/* p3 */ P3, 
/* p4 */ P4, 
/* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
typings.vscodeJsonrpc.mod.HandlerResult[R, E]]

type RequestHandler5[P1, P2, P3, P4, P5, R, E] = js.Function6[
/* p1 */ P1, 
/* p2 */ P2, 
/* p3 */ P3, 
/* p4 */ P4, 
/* p5 */ P5, 
/* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
typings.vscodeJsonrpc.mod.HandlerResult[R, E]]

type RequestHandler6[P1, P2, P3, P4, P5, P6, R, E] = js.Function7[
/* p1 */ P1, 
/* p2 */ P2, 
/* p3 */ P3, 
/* p4 */ P4, 
/* p5 */ P5, 
/* p6 */ P6, 
/* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
typings.vscodeJsonrpc.mod.HandlerResult[R, E]]

type RequestHandler7[P1, P2, P3, P4, P5, P6, P7, R, E] = js.Function8[
/* p1 */ P1, 
/* p2 */ P2, 
/* p3 */ P3, 
/* p4 */ P4, 
/* p5 */ P5, 
/* p6 */ P6, 
/* p7 */ P7, 
/* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
typings.vscodeJsonrpc.mod.HandlerResult[R, E]]

type RequestHandler8[P1, P2, P3, P4, P5, P6, P7, P8, R, E] = js.Function9[
/* p1 */ P1, 
/* p2 */ P2, 
/* p3 */ P3, 
/* p4 */ P4, 
/* p5 */ P5, 
/* p6 */ P6, 
/* p7 */ P7, 
/* p8 */ P8, 
/* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
typings.vscodeJsonrpc.mod.HandlerResult[R, E]]

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
/* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
typings.vscodeJsonrpc.mod.HandlerResult[R, E]]

type StarNotificationHandler = js.Function2[/* method */ java.lang.String, /* repeated */ js.Any, scala.Unit]

type StarRequestHandler = js.Function2[
/* method */ java.lang.String, 
/* repeated */ js.Any, 
typings.vscodeJsonrpc.mod.HandlerResult[js.Any, js.Any]]
