package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTransports extends js.Object {
  var detached: js.UndefOr[Boolean] = js.undefined
  var reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader
  var writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter
}

@JSImport("vscode-languageclient/lib/client", "MessageTransports")
@js.native
object MessageTransports extends js.Object {
  def is(value: js.Any): /* is vscode-languageclient.vscode-languageclient/lib/client.MessageTransports */ Boolean = js.native
}

