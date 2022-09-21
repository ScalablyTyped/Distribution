package typings.vscodeLanguageserverProtocol.protocolNotebookMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookDocumentSyncClientCapabilities extends StObject {
  
  /**
    * Whether implementation supports dynamic registration. If this is
    * set to `true` the client supports the new
    * `(TextDocumentRegistrationOptions & StaticRegistrationOptions)`
    * return value for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client supports sending execution summary data per cell.
    */
  var executionSummarySupport: js.UndefOr[Boolean] = js.undefined
}
object NotebookDocumentSyncClientCapabilities {
  
  inline def apply(): NotebookDocumentSyncClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookDocumentSyncClientCapabilities]
  }
  
  extension [Self <: NotebookDocumentSyncClientCapabilities](x: Self) {
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    inline def setExecutionSummarySupport(value: Boolean): Self = StObject.set(x, "executionSummarySupport", value.asInstanceOf[js.Any])
    
    inline def setExecutionSummarySupportUndefined: Self = StObject.set(x, "executionSummarySupport", js.undefined)
  }
}
