package typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod

import typings.vscodeLanguageserverProtocol.anon.Cells
import typings.vscodeLanguageserverProtocol.anon.Notebook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookDocumentSyncOptions extends StObject {
  
  /**
    * The notebooks to be synced
    */
  var notebookSelector: js.Array[Cells | Notebook]
  
  /**
    * Whether save notification should be forwarded to
    * the server. Will only be honored if mode === `notebook`.
    */
  var save: js.UndefOr[Boolean] = js.undefined
}
object NotebookDocumentSyncOptions {
  
  inline def apply(notebookSelector: js.Array[Cells | Notebook]): NotebookDocumentSyncOptions = {
    val __obj = js.Dynamic.literal(notebookSelector = notebookSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookDocumentSyncOptions]
  }
  
  extension [Self <: NotebookDocumentSyncOptions](x: Self) {
    
    inline def setNotebookSelector(value: js.Array[Cells | Notebook]): Self = StObject.set(x, "notebookSelector", value.asInstanceOf[js.Any])
    
    inline def setNotebookSelectorVarargs(value: (Cells | Notebook)*): Self = StObject.set(x, "notebookSelector", js.Array(value*))
    
    inline def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
