package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.protocolNotebookMod.NotebookCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  /**
    * Changes to notebook cells properties like its
    * kind, execution summary or metadata.
    */
  var data: js.UndefOr[js.Array[NotebookCell]] = js.undefined
  
  /**
    * Changes to the cell structure to add or
    * remove cells.
    */
  var structure: js.UndefOr[Array] = js.undefined
  
  /**
    * Changes to the text content of notebook cells.
    */
  var textContent: js.UndefOr[js.Array[Changes]] = js.undefined
}
object Data {
  
  inline def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: js.Array[NotebookCell]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: NotebookCell*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setStructure(value: Array): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    inline def setStructureUndefined: Self = StObject.set(x, "structure", js.undefined)
    
    inline def setTextContent(value: js.Array[Changes]): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    
    inline def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
    
    inline def setTextContentVarargs(value: Changes*): Self = StObject.set(x, "textContent", js.Array(value*))
  }
}
