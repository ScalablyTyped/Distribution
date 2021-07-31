package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensServerCapabilities extends StObject {
  
  var semanticTokensProvider: SemanticTokensOptions | SemanticTokensRegistrationOptions
}
object SemanticTokensServerCapabilities {
  
  @scala.inline
  def apply(semanticTokensProvider: SemanticTokensOptions | SemanticTokensRegistrationOptions): SemanticTokensServerCapabilities = {
    val __obj = js.Dynamic.literal(semanticTokensProvider = semanticTokensProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensServerCapabilities]
  }
  
  @scala.inline
  implicit class SemanticTokensServerCapabilitiesMutableBuilder[Self <: SemanticTokensServerCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSemanticTokensProvider(value: SemanticTokensOptions | SemanticTokensRegistrationOptions): Self = StObject.set(x, "semanticTokensProvider", value.asInstanceOf[js.Any])
  }
}
