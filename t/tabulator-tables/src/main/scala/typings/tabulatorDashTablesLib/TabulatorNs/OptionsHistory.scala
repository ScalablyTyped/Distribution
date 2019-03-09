package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsHistory extends js.Object {
  /** Enable user interaction history functionality	 */
  var history: js.UndefOr[scala.Boolean] = js.native
  /** The historyRedo event is triggered when the redo action is triggered. */
  def historyRedo(action: HistoryAction, component: CellComponent, data: js.Any): scala.Unit = js.native
  def historyRedo(action: HistoryAction, component: RowComponent, data: js.Any): scala.Unit = js.native
  /** The historyUndo event is triggered when the undo action is triggered. */
  def historyUndo(action: HistoryAction, component: CellComponent, data: js.Any): scala.Unit = js.native
  def historyUndo(action: HistoryAction, component: RowComponent, data: js.Any): scala.Unit = js.native
}

