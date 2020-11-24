package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeJsonrpc.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "createProtocolConnection")
@js.native
object createProtocolConnection extends js.Object {
  
  def apply(
    reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: Logger
  ): ProtocolConnection = js.native
  def apply(
    reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: Logger,
    strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
  ): ProtocolConnection = js.native
}
