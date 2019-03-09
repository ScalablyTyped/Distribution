package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsSorting extends js.Object {
  /** Array of sorters to be applied on load.	 */
  var initialSort: js.UndefOr[js.Array[Sorter]] = js.undefined
  /** reverse the order that multiple sorters are applied to the table.	 */
  var sortOrderReverse: js.UndefOr[scala.Boolean] = js.undefined
}

object OptionsSorting {
  @scala.inline
  def apply(initialSort: js.Array[Sorter] = null, sortOrderReverse: js.UndefOr[scala.Boolean] = js.undefined): OptionsSorting = {
    val __obj = js.Dynamic.literal()
    if (initialSort != null) __obj.updateDynamic("initialSort")(initialSort)
    if (!js.isUndefined(sortOrderReverse)) __obj.updateDynamic("sortOrderReverse")(sortOrderReverse)
    __obj.asInstanceOf[OptionsSorting]
  }
}

