package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeJsonrpc.libCommonConnectionMod.Logger
import typings.vscodeJsonrpc.libCommonConnectionMod.MessageConnection
import typings.vscodeLanguageserverProtocol.libCommonConnectionMod.ProtocolConnection
import typings.vscodeLanguageserverProtocol.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def EOL: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("EOL").asInstanceOf[js.Array[String]]

type LSPErrorCodes = typings.vscodeLanguageserverTypes.mod.integer

inline def NullLogger: Logger = ^.asInstanceOf[js.Dynamic].selectDynamic("NullLogger").asInstanceOf[Logger]

inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  _logger: Unit,
  options: typings.vscodeJsonrpc.libCommonConnectionMod.ConnectionOptions
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  _logger: Logger
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  _logger: Logger,
  options: typings.vscodeJsonrpc.libCommonConnectionMod.ConnectionOptions
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]

inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Unit,
  options: typings.vscodeJsonrpc.libCommonConnectionMod.ConnectionOptions
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Unit,
  options: typings.vscodeJsonrpc.libCommonConnectionMod.ConnectionStrategy
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Logger
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Logger,
  options: typings.vscodeJsonrpc.libCommonConnectionMod.ConnectionOptions
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Logger,
  options: typings.vscodeJsonrpc.libCommonConnectionMod.ConnectionStrategy
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
