package typings.vscodeLanguageclient.declarationMod

import typings.vscode.mod.DeclarationProvider
import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.TextDocumentFeature
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationOptions
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/declaration", "DeclarationFeature")
@js.native
class DeclarationFeature protected () extends TextDocumentFeature[Boolean | DeclarationOptions, DeclarationRegistrationOptions, DeclarationProvider] {
  def this(client: BaseLanguageClient) = this()
}

