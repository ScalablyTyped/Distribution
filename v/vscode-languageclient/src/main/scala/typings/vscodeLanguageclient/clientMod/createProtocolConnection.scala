package typings.vscodeLanguageclient.clientMod

import typings.vscodeJsonrpc.mod.Logger
import typings.vscodeLanguageserverProtocol.mod.ProtocolConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "createProtocolConnection")
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
