package typings.vscodeLanguageclient.typeDefinitionMod

import typings.vscode.mod.TypeDefinitionProvider
import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.TextDocumentFeature
import typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionOptions
import typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/typeDefinition", "TypeDefinitionFeature")
@js.native
class TypeDefinitionFeature protected () extends TextDocumentFeature[
      Boolean | TypeDefinitionOptions, 
      TypeDefinitionRegistrationOptions, 
      TypeDefinitionProvider
    ] {
  def this(client: BaseLanguageClient) = this()
}

