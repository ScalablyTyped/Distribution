package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsHistory extends js.Object {
  
  /** Enable user interaction history functionality     */
  var history: js.UndefOr[Boolean] = js.native
  
  /** The historyRedo event is triggered when the redo action is triggered. */
  var historyRedo: js.UndefOr[
    js.Function3[
      /* action */ HistoryAction, 
      /* component */ CellComponent | RowComponent, 
      /* data */ js.Any, 
      Unit
    ]
  ] = js.native
  
  /** The historyUndo event is triggered when the undo action is triggered. */
  var historyUndo: js.UndefOr[
    js.Function3[
      /* action */ HistoryAction, 
      /* component */ CellComponent | RowComponent, 
      /* data */ js.Any, 
      Unit
    ]
  ] = js.native
}
object OptionsHistory {
  
  @scala.inline
  def apply(): OptionsHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsHistory]
  }
  
  @scala.inline
  implicit class OptionsHistoryOps[Self <: OptionsHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHistory(value: Boolean): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setHistoryRedo(
      value: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => Unit
    ): Self = this.set("historyRedo", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHistoryRedo: Self = this.set("historyRedo", js.undefined)
    
    @scala.inline
    def setHistoryUndo(
      value: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => Unit
    ): Self = this.set("historyUndo", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHistoryUndo: Self = this.set("historyUndo", js.undefined)
  }
}
