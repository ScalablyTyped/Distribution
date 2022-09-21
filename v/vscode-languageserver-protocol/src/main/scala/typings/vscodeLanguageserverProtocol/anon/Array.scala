package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.protocolNotebookMod.NotebookCellArrayChange
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import typings.vscodeLanguageserverTypes.mod.TextDocumentItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Array extends StObject {
  
  /**
    * The change to the cell array.
    */
  var array: NotebookCellArrayChange
  
  /**
    * Additional closed cell text documents.
    */
  var didClose: js.UndefOr[js.Array[TextDocumentIdentifier]] = js.undefined
  
  /**
    * Additional opened cell text documents.
    */
  var didOpen: js.UndefOr[js.Array[TextDocumentItem]] = js.undefined
}
object Array {
  
  inline def apply(array: NotebookCellArrayChange): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  
  extension [Self <: Array](x: Self) {
    
    inline def setArray(value: NotebookCellArrayChange): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setDidClose(value: js.Array[TextDocumentIdentifier]): Self = StObject.set(x, "didClose", value.asInstanceOf[js.Any])
    
    inline def setDidCloseUndefined: Self = StObject.set(x, "didClose", js.undefined)
    
    inline def setDidCloseVarargs(value: TextDocumentIdentifier*): Self = StObject.set(x, "didClose", js.Array(value*))
    
    inline def setDidOpen(value: js.Array[TextDocumentItem]): Self = StObject.set(x, "didOpen", value.asInstanceOf[js.Any])
    
    inline def setDidOpenUndefined: Self = StObject.set(x, "didOpen", js.undefined)
    
    inline def setDidOpenVarargs(value: TextDocumentItem*): Self = StObject.set(x, "didOpen", js.Array(value*))
  }
}
