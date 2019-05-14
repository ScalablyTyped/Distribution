package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgSort extends js.Object {
  var field: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var order: js.UndefOr[js.Array[VgComparatorOrder] | VgComparatorOrder] = js.undefined
}

object VgSort {
  @scala.inline
  def apply(field: java.lang.String = null, order: VgComparatorOrder = null): VgSort = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[VgSort]
  }
}

