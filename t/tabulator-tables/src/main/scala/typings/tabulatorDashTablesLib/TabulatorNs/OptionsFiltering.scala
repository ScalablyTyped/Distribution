package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsFiltering extends js.Object {
  /** The dataFiltered callback is triggered after the table dataset is filtered. */
  var dataFiltered: js.UndefOr[
    js.Function2[/* filters */ js.Array[Filter], /* rows */ js.Array[RowComponent], scala.Unit]
  ] = js.undefined
  /** The dataFiltering callback is triggered whenever a filter event occurs, before the filter happens. */
  var dataFiltering: js.UndefOr[js.Function1[/* filters */ js.Array[Filter], scala.Unit]] = js.undefined
  /** Array of filters to be applied on load.	 */
  var initialFilter: js.UndefOr[js.Array[Filter]] = js.undefined
  /** array of initial values for header filters.	 */
  var initialHeaderFilter: js.UndefOr[
    js.Array[
      stdLib.Pick[
        Filter, 
        tabulatorDashTablesLib.tabulatorDashTablesLibStrings.field | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.value
      ]
    ]
  ] = js.undefined
}

object OptionsFiltering {
  @scala.inline
  def apply(
    dataFiltered: (/* filters */ js.Array[Filter], /* rows */ js.Array[RowComponent]) => scala.Unit = null,
    dataFiltering: /* filters */ js.Array[Filter] => scala.Unit = null,
    initialFilter: js.Array[Filter] = null,
    initialHeaderFilter: js.Array[
      stdLib.Pick[
        Filter, 
        tabulatorDashTablesLib.tabulatorDashTablesLibStrings.field | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.value
      ]
    ] = null
  ): OptionsFiltering = {
    val __obj = js.Dynamic.literal()
    if (dataFiltered != null) __obj.updateDynamic("dataFiltered")(js.Any.fromFunction2(dataFiltered))
    if (dataFiltering != null) __obj.updateDynamic("dataFiltering")(js.Any.fromFunction1(dataFiltering))
    if (initialFilter != null) __obj.updateDynamic("initialFilter")(initialFilter)
    if (initialHeaderFilter != null) __obj.updateDynamic("initialHeaderFilter")(initialHeaderFilter)
    __obj.asInstanceOf[OptionsFiltering]
  }
}

