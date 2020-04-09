package typings.tabulatorTables.Tabulator

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuObject extends MenuSeparator {
  var disabled: js.UndefOr[
    Boolean | (js.Function1[/* component */ RowComponent | CellComponent | ColumnComponent, Boolean])
  ] = js.native
  var label: String | HTMLElement | (js.Function1[
    /* component */ RowComponent | CellComponent | ColumnComponent, 
    String | HTMLElement
  ]) = js.native
  def action(e: js.Any, component: CellComponent): js.Any = js.native
  def action(e: js.Any, component: ColumnComponent): js.Any = js.native
  def action(e: js.Any, component: RowComponent): js.Any = js.native
}

