package typings.tablesorter.tablesorterConfigBaseMod

import typings.tablesorter.sortOrderMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TablesorterConfigBase extends js.Object {
  /**
    * The date-format for dates inside the table.
    */
  var dateFormat: js.UndefOr[String] = js.undefined
  /**
    * The order which will be applied when clicking on the heading the first time.
    */
  var sortInitialOrder: js.UndefOr[SortOrder] = js.undefined
}

object TablesorterConfigBase {
  @scala.inline
  def apply(dateFormat: String = null, sortInitialOrder: SortOrder = null): TablesorterConfigBase = {
    val __obj = js.Dynamic.literal()
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (sortInitialOrder != null) __obj.updateDynamic("sortInitialOrder")(sortInitialOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablesorterConfigBase]
  }
}

