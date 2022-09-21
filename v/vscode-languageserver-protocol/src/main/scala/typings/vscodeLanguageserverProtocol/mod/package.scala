package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeJsonrpc.connectionMod.Logger
import typings.vscodeJsonrpc.connectionMod.MessageConnection
import typings.vscodeLanguageserverProtocol.connectionMod.ProtocolConnection
import typings.vscodeLanguageserverProtocol.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def EOL: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("EOL").asInstanceOf[js.Array[String]]

type LSPErrorCodes = typings.vscodeLanguageserverTypes.mod.integer

inline def NullLogger: Logger = ^.asInstanceOf[js.Dynamic].selectDynamic("NullLogger").asInstanceOf[Logger]

inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.messageWriterMod.MessageWriter
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  _logger: Unit,
  options: typings.vscodeJsonrpc.connectionMod.ConnectionOptions
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  _logger: Logger
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  _logger: Logger,
  options: typings.vscodeJsonrpc.connectionMod.ConnectionOptions
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]

inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.messageWriterMod.MessageWriter
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: Unit,
  options: typings.vscodeJsonrpc.connectionMod.ConnectionOptions
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: Unit,
  options: typings.vscodeJsonrpc.connectionMod.ConnectionStrategy
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: Logger
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: Logger,
  options: typings.vscodeJsonrpc.connectionMod.ConnectionOptions
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: Logger,
  options: typings.vscodeJsonrpc.connectionMod.ConnectionStrategy
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
