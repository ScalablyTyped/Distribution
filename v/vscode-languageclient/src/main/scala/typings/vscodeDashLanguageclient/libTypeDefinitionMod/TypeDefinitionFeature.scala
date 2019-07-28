package typings.vscodeDashLanguageclient.libTypeDefinitionMod

import typings.vscodeDashLanguageclient.libClientMod.BaseLanguageClient
import typings.vscodeDashLanguageclient.libClientMod.TextDocumentFeature
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/typeDefinition", "TypeDefinitionFeature")
@js.native
class TypeDefinitionFeature protected () extends TextDocumentFeature[TextDocumentRegistrationOptions] {
  def this(client: BaseLanguageClient) = this()
}

