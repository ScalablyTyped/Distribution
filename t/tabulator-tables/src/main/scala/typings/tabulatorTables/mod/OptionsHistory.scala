package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsHistory extends StObject {
  
  /** Enable user interaction history functionality */
  var history: js.UndefOr[Boolean] = js.undefined
  
  /** The historyRedo event is triggered when the redo action is triggered. */
  var historyRedo: js.UndefOr[
    js.Function3[
      /* action */ HistoryAction, 
      /* component */ CellComponent | RowComponent, 
      /* data */ Any, 
      Unit
    ]
  ] = js.undefined
  
  /** The historyUndo event is triggered when the undo action is triggered. */
  var historyUndo: js.UndefOr[
    js.Function3[
      /* action */ HistoryAction, 
      /* component */ CellComponent | RowComponent, 
      /* data */ Any, 
      Unit
    ]
  ] = js.undefined
}
object OptionsHistory {
  
  inline def apply(): OptionsHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsHistory] (val x: Self) extends AnyVal {
    
    inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryRedo(
      value: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ Any) => Unit
    ): Self = StObject.set(x, "historyRedo", js.Any.fromFunction3(value))
    
    inline def setHistoryRedoUndefined: Self = StObject.set(x, "historyRedo", js.undefined)
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryUndo(
      value: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ Any) => Unit
    ): Self = StObject.set(x, "historyUndo", js.Any.fromFunction3(value))
    
    inline def setHistoryUndoUndefined: Self = StObject.set(x, "historyUndo", js.undefined)
  }
}
