package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions
     with SemanticTokensOptions
     with StaticRegistrationOptions
object SemanticTokensRegistrationOptions {
  
  @scala.inline
  def apply(legend: SemanticTokensLegend): SemanticTokensRegistrationOptions = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any], documentSelector = null)
    __obj.asInstanceOf[SemanticTokensRegistrationOptions]
  }
}
