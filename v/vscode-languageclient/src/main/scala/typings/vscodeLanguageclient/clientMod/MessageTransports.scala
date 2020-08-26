package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageTransports extends js.Object {
  var detached: js.UndefOr[Boolean] = js.native
  var reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader = js.native
  var writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter = js.native
}

@JSImport("vscode-languageclient/lib/client", "MessageTransports")
@js.native
object MessageTransports extends js.Object {
  def is(value: js.Any): /* is vscode-languageclient.vscode-languageclient/lib/client.MessageTransports */ Boolean = js.native
}

