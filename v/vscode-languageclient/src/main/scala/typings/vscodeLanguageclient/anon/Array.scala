package typings.vscodeLanguageclient.anon

import typings.vscode.mod.NotebookCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Array extends StObject {
  
  /**
    * The change to the cell array.
    */
  var array: Cells
  
  /**
    * Additional closed cell text documents.
    */
  var didClose: js.UndefOr[js.Array[NotebookCell]] = js.undefined
  
  /**
    * Additional opened cell text documents.
    */
  var didOpen: js.UndefOr[js.Array[NotebookCell]] = js.undefined
}
object Array {
  
  inline def apply(array: Cells): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
    
    inline def setArray(value: Cells): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setDidClose(value: js.Array[NotebookCell]): Self = StObject.set(x, "didClose", value.asInstanceOf[js.Any])
    
    inline def setDidCloseUndefined: Self = StObject.set(x, "didClose", js.undefined)
    
    inline def setDidCloseVarargs(value: NotebookCell*): Self = StObject.set(x, "didClose", js.Array(value*))
    
    inline def setDidOpen(value: js.Array[NotebookCell]): Self = StObject.set(x, "didOpen", value.asInstanceOf[js.Any])
    
    inline def setDidOpenUndefined: Self = StObject.set(x, "didOpen", js.undefined)
    
    inline def setDidOpenVarargs(value: NotebookCell*): Self = StObject.set(x, "didOpen", js.Array(value*))
  }
}
