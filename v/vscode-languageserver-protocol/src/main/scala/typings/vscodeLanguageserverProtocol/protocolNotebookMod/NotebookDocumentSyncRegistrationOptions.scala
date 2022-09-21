package typings.vscodeLanguageserverProtocol.protocolNotebookMod

import typings.vscodeLanguageserverProtocol.anon.Cells
import typings.vscodeLanguageserverProtocol.anon.Notebook
import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookDocumentSyncRegistrationOptions
  extends StObject
     with NotebookDocumentSyncOptions
     with StaticRegistrationOptions
object NotebookDocumentSyncRegistrationOptions {
  
  inline def apply(notebookSelector: js.Array[Cells | Notebook]): NotebookDocumentSyncRegistrationOptions = {
    val __obj = js.Dynamic.literal(notebookSelector = notebookSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookDocumentSyncRegistrationOptions]
  }
}
