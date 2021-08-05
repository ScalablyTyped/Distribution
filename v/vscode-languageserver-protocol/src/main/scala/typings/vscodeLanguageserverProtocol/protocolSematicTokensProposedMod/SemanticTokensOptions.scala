package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.anon.Edits
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensOptions
  extends StObject
     with WorkDoneProgressOptions {
  
  /**
    * Server supports providing semantic tokens for a full document.
    */
  var documentProvider: js.UndefOr[Boolean | Edits] = js.undefined
  
  /**
    * The legend used by the server
    */
  var legend: SemanticTokensLegend
  
  /**
    * Server supports providing semantic tokens for a sepcific range
    * of a document.
    */
  var rangeProvider: js.UndefOr[Boolean] = js.undefined
}
object SemanticTokensOptions {
  
  inline def apply(legend: SemanticTokensLegend): SemanticTokensOptions = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensOptions]
  }
  
  extension [Self <: SemanticTokensOptions](x: Self) {
    
    inline def setDocumentProvider(value: Boolean | Edits): Self = StObject.set(x, "documentProvider", value.asInstanceOf[js.Any])
    
    inline def setDocumentProviderUndefined: Self = StObject.set(x, "documentProvider", js.undefined)
    
    inline def setLegend(value: SemanticTokensLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setRangeProvider(value: Boolean): Self = StObject.set(x, "rangeProvider", value.asInstanceOf[js.Any])
    
    inline def setRangeProviderUndefined: Self = StObject.set(x, "rangeProvider", js.undefined)
  }
}
