package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.NotebookDocumentFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cells extends StObject {
  
  /**
    * The cells of the matching notebook to be synced.
    */
  var cells: js.UndefOr[js.Array[LanguageString]] = js.undefined
  
  /**
    * The notebook to be synced If a string
    * value is provided it matches against the
    * notebook type. '*' matches every notebook.
    */
  var notebook: String | NotebookDocumentFilter
}
object Cells {
  
  inline def apply(notebook: String | NotebookDocumentFilter): Cells = {
    val __obj = js.Dynamic.literal(notebook = notebook.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cells]
  }
  
  extension [Self <: Cells](x: Self) {
    
    inline def setCells(value: js.Array[LanguageString]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setCellsVarargs(value: LanguageString*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setNotebook(value: String | NotebookDocumentFilter): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
  }
}
