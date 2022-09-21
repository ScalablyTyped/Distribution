package typings.vscodeLanguageserverProtocol.protocolNotebookMod

import typings.vscodeLanguageserverTypes.mod.uinteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookCellArrayChange extends StObject {
  
  /**
    * The new cells, if any
    */
  var cells: js.UndefOr[js.Array[NotebookCell]] = js.undefined
  
  /**
    * The deleted cells
    */
  var deleteCount: uinteger
  
  /**
    * The start oftest of the cell that changed.
    */
  var start: uinteger
}
object NotebookCellArrayChange {
  
  inline def apply(deleteCount: uinteger, start: uinteger): NotebookCellArrayChange = {
    val __obj = js.Dynamic.literal(deleteCount = deleteCount.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookCellArrayChange]
  }
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.notebook", "NotebookCellArrayChange")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(start: uinteger, deleteCount: uinteger): NotebookCellArrayChange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[NotebookCellArrayChange]
  inline def create(start: uinteger, deleteCount: uinteger, cells: js.Array[NotebookCell]): NotebookCellArrayChange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], cells.asInstanceOf[js.Any])).asInstanceOf[NotebookCellArrayChange]
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCellArrayChange */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.NotebookCellArrayChange */ Boolean]
  
  extension [Self <: NotebookCellArrayChange](x: Self) {
    
    inline def setCells(value: js.Array[NotebookCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setCellsVarargs(value: NotebookCell*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setDeleteCount(value: uinteger): Self = StObject.set(x, "deleteCount", value.asInstanceOf[js.Any])
    
    inline def setStart(value: uinteger): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
