package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.callHierarchyProposedMod.CallHierarchy
import typings.vscodeLanguageserver.sematicTokensProposedMod.SemanticTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProposedFeatures {
  
  /* was `typeof st.SemanticTokensBuilder` */
  @JSImport("vscode-languageserver", "ProposedFeatures.SemanticTokensBuilder")
  @js.native
  class SemanticTokensBuilder ()
    extends typings.vscodeLanguageserver.sematicTokensProposedMod.SemanticTokensBuilder
  
  @JSImport("vscode-languageserver", "ProposedFeatures.all")
  @js.native
  val all: Features[
    _underscore, 
    _underscore, 
    _underscore, 
    _underscore, 
    _underscore, 
    _underscore, 
    CallHierarchy with SemanticTokens
  ] = js.native
}
