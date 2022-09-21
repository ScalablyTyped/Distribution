package typings.vscodeJsonrpc.mod

import typings.vscodeJsonrpc.connectionMod.Logger
import typings.vscodeJsonrpc.connectionMod.MessageConnection
import typings.vscodeJsonrpc.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


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
