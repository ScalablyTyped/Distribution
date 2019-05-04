package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgComparator extends js.Object {
  var field: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var order: js.UndefOr[VgComparatorOrder | js.Array[VgComparatorOrder]] = js.undefined
}

object VgComparator {
  @scala.inline
  def apply(
    field: java.lang.String | js.Array[java.lang.String] = null,
    order: VgComparatorOrder | js.Array[VgComparatorOrder] = null
  ): VgComparator = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgComparator]
  }
}

