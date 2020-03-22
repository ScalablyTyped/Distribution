package typings.vscodeLanguageclient.semanticTokensProposedMod

import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.TextDocumentFeature
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensOptions
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/semanticTokens.proposed", "SemanticTokensFeature")
@js.native
class SemanticTokensFeature protected () extends TextDocumentFeature[
      Boolean | SemanticTokensOptions, 
      SemanticTokensRegistrationOptions, 
      SemanticTokensProviders
    ] {
  def this(client: BaseLanguageClient) = this()
}

