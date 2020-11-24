package typings.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "TextDocumentFeature")
@js.native
abstract class TextDocumentFeature[PO, RO /* <: typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions with PO */, PR] protected ()
  extends typings.vscodeLanguageclient.clientMod.TextDocumentFeature[PO, RO, PR] {
  def this(
    _client: typings.vscodeLanguageclient.clientMod.BaseLanguageClient,
    _message: typings.vscodeJsonrpc.messagesMod.MessageType
  ) = this()
}
