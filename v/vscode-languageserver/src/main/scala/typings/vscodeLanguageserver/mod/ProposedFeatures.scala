package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.Instantiable0
import typings.vscodeLanguageserver.callHierarchyProposedMod.CallHierarchy
import typings.vscodeLanguageserver.sematicTokensProposedMod.SemanticTokens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "ProposedFeatures")
@js.native
object ProposedFeatures extends js.Object {
  val SemanticTokensBuilder: Instantiable0[typings.vscodeLanguageserver.sematicTokensProposedMod.SemanticTokensBuilder] = js.native
  val all: Features[
    _underscore, 
    _underscore, 
    _underscore, 
    _underscore, 
    _underscore, 
    _underscore, 
    CallHierarchy with SemanticTokens
  ] = js.native
  type SemanticTokensBuilder = typings.vscodeLanguageserver.sematicTokensProposedMod.SemanticTokensBuilder
}

