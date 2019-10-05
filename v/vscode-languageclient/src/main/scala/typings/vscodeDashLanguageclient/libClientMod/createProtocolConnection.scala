package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader
import typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Logger
import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.ProtocolConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "createProtocolConnection")
@js.native
object createProtocolConnection extends js.Object {
  def apply(reader: MessageReader, writer: MessageWriter, logger: Logger): ProtocolConnection = js.native
  def apply(reader: MessageReader, writer: MessageWriter, logger: Logger, strategy: ConnectionStrategy): ProtocolConnection = js.native
}

