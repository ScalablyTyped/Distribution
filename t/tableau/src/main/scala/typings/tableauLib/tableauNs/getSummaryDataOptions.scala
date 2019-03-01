package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait getSummaryDataOptions extends js.Object {
  /** Do not use aliases specified in the data source in Tableau. Default is false. */
  var ignoreAliases: js.UndefOr[scala.Boolean] = js.undefined
  /** Only return data for the currently selected marks. Default is false. */
  var ignoreSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** The number of rows of data that you want to return. Enter 0 to return all rows. */
  var maxRows: scala.Double
}

object getSummaryDataOptions {
  @scala.inline
  def apply(
    maxRows: scala.Double,
    ignoreAliases: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreSelection: js.UndefOr[scala.Boolean] = js.undefined
  ): getSummaryDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxRows")(maxRows)
    if (!js.isUndefined(ignoreAliases)) __obj.updateDynamic("ignoreAliases")(ignoreAliases)
    if (!js.isUndefined(ignoreSelection)) __obj.updateDynamic("ignoreSelection")(ignoreSelection)
    __obj.asInstanceOf[getSummaryDataOptions]
  }
}

