package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "TextDocumentFeature")
@js.native
abstract class TextDocumentFeature[T /* <: TextDocumentRegistrationOptions */] protected ()
  extends typings.vscodeLanguageclient.clientMod.TextDocumentFeature[T] {
  def this(
    _client: typings.vscodeLanguageclient.clientMod.BaseLanguageClient,
    _message: typings.vscodeJsonrpc.messagesMod.MessageType
  ) = this()
}

