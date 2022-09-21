package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.protocolNotebookMod.NotebookDocumentSyncClientCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookDocumentClientCapabilities extends StObject {
  
  /**
    * Capabilities specific to notebook document synchronization
    *
    * @since 3.17.0
    */
  var synchronization: NotebookDocumentSyncClientCapabilities
}
object NotebookDocumentClientCapabilities {
  
  inline def apply(synchronization: NotebookDocumentSyncClientCapabilities): NotebookDocumentClientCapabilities = {
    val __obj = js.Dynamic.literal(synchronization = synchronization.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookDocumentClientCapabilities]
  }
  
  extension [Self <: NotebookDocumentClientCapabilities](x: Self) {
    
    inline def setSynchronization(value: NotebookDocumentSyncClientCapabilities): Self = StObject.set(x, "synchronization", value.asInstanceOf[js.Any])
  }
}
