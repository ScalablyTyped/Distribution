package typings
package vegaDashLiteLib.buildSrcSortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingSortField[F] extends js.Object {
  /**
    * The data [field](https://vega.github.io/vega-lite/docs/field.html) to sort by.
    *
    * __Default value:__ If unspecified, defaults to the field specified in the outer data reference.
    */
  var field: js.UndefOr[F] = js.undefined
  /**
    * An [aggregate operation](https://vega.github.io/vega-lite/docs/aggregate.html#ops) to perform on the field prior to sorting (e.g., `"count"`, `"mean"` and `"median"`).
    * This property is required in cases where the sort field and the data reference field do not match.
    * The input data objects will be aggregated, grouped by the encoded data field.
    *
    * For a full list of operations, please see the documentation for [aggregate](https://vega.github.io/vega-lite/docs/aggregate.html#ops).
    */
  var op: vegaDashTypingsLib.typesSpecTransformMod.AggregateOp
  /**
    * The sort order. One of `"ascending"` (default), `"descending"`, or `null` (no not sort).
    */
  var order: js.UndefOr[SortOrder] = js.undefined
}

object EncodingSortField {
  @scala.inline
  def apply[F](op: vegaDashTypingsLib.typesSpecTransformMod.AggregateOp, field: F = null, order: SortOrder = null): EncodingSortField[F] = {
    val __obj = js.Dynamic.literal(op = op)
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingSortField[F]]
  }
}

