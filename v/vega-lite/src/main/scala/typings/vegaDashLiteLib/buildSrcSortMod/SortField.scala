package typings
package vegaDashLiteLib.buildSrcSortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortField extends js.Object {
  /**
    * The name of the field to sort.
    */
  var field: java.lang.String
  /**
    * Whether to sort the field in ascending or descending order.
    */
  var order: js.UndefOr[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgComparatorOrder] = js.undefined
}

object SortField {
  @scala.inline
  def apply(field: java.lang.String, order: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgComparatorOrder = null): SortField = {
    val __obj = js.Dynamic.literal(field = field)
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[SortField]
  }
}

