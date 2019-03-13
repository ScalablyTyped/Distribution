package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsHistory extends js.Object {
  /** Enable user interaction history functionality	 */
  var history: js.UndefOr[scala.Boolean] = js.undefined
  /** The historyRedo event is triggered when the redo action is triggered. */
  var historyRedo: js.UndefOr[
    js.Function3[
      /* action */ HistoryAction, 
      /* component */ CellComponent | RowComponent, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  /** The historyUndo event is triggered when the undo action is triggered. */
  var historyUndo: js.UndefOr[
    js.Function3[
      /* action */ HistoryAction, 
      /* component */ CellComponent | RowComponent, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
}

object OptionsHistory {
  @scala.inline
  def apply(
    history: js.UndefOr[scala.Boolean] = js.undefined,
    historyRedo: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => scala.Unit = null,
    historyUndo: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => scala.Unit = null
  ): OptionsHistory = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history)
    if (historyRedo != null) __obj.updateDynamic("historyRedo")(js.Any.fromFunction3(historyRedo))
    if (historyUndo != null) __obj.updateDynamic("historyUndo")(js.Any.fromFunction3(historyUndo))
    __obj.asInstanceOf[OptionsHistory]
  }
}

