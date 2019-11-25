package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Logger
import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.ProtocolConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "createProtocolConnection")
@js.native
object createProtocolConnection extends js.Object {
  def apply(
    reader: typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter,
    logger: Logger
  ): ProtocolConnection = js.native
  def apply(
    reader: typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter,
    logger: Logger,
    strategy: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
  ): ProtocolConnection = js.native
}

