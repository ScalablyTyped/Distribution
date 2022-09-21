package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.protocolMod.NotebookDocumentFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notebook extends StObject {
  
  /**
    * The cells of the matching notebook to be synced.
    */
  var cells: js.Array[LanguageString]
  
  /**
    * The notebook to be synced If a string
    * value is provided it matches against the
    * notebook type. '*' matches every notebook.
    */
  var notebook: js.UndefOr[String | NotebookDocumentFilter] = js.undefined
}
object Notebook {
  
  inline def apply(cells: js.Array[LanguageString]): Notebook = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notebook]
  }
  
  extension [Self <: Notebook](x: Self) {
    
    inline def setCells(value: js.Array[LanguageString]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: LanguageString*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setNotebook(value: String | NotebookDocumentFilter): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
    
    inline def setNotebookUndefined: Self = StObject.set(x, "notebook", js.undefined)
  }
}
