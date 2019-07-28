package typings.vscodeDashLanguageclient.libDeclarationMod

import typings.vscodeDashLanguageclient.libClientMod.BaseLanguageClient
import typings.vscodeDashLanguageclient.libClientMod.TextDocumentFeature
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/declaration", "DeclarationFeature")
@js.native
class DeclarationFeature protected () extends TextDocumentFeature[TextDocumentRegistrationOptions] {
  def this(client: BaseLanguageClient) = this()
}

