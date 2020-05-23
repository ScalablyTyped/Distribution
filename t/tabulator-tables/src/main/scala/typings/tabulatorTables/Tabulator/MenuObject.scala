package typings.tabulatorTables.Tabulator

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuObject[T /* <: RowComponent | CellComponent | ColumnComponent */] extends js.Object {
  var disabled: js.UndefOr[Boolean | (js.Function1[/* component */ T, Boolean])] = js.undefined
  var label: String | HTMLElement | (js.Function1[/* component */ T, String | HTMLElement])
  def action(e: js.Any, component: T): js.Any
}

object MenuObject {
  @scala.inline
  def apply[T](
    action: (js.Any, T) => js.Any,
    label: String | HTMLElement | (js.Function1[/* component */ T, String | HTMLElement]),
    disabled: Boolean | (js.Function1[/* component */ T, Boolean]) = null
  ): MenuObject[T] = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction2(action), label = label.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuObject[T]]
  }
}

