package typings.vscodeLanguageclient.anon

import typings.vscode.mod.NotebookCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cells extends StObject {
  
  var cells: js.UndefOr[js.Array[NotebookCell]] = js.undefined
  
  var deleteCount: Double
  
  var start: Double
}
object Cells {
  
  inline def apply(deleteCount: Double, start: Double): Cells = {
    val __obj = js.Dynamic.literal(deleteCount = deleteCount.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cells]
  }
  
  extension [Self <: Cells](x: Self) {
    
    inline def setCells(value: js.Array[NotebookCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setCellsVarargs(value: NotebookCell*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setDeleteCount(value: Double): Self = StObject.set(x, "deleteCount", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
