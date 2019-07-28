package typings.vegaDashLite.buildSrcTransformMod

import typings.vegaDashTypings.typesSpecTransformMod.AggregateOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedFieldDef extends js.Object {
  /**
    * The output field names to use for each aggregated field.
    */
  var as: String
  /**
    * The data field for which to compute aggregate function. This is required for all aggregation operations except `"count"`.
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * The aggregation operations to apply to the fields, such as sum, average or count.
    * See the [full list of supported aggregation operations](https://vega.github.io/vega-lite/docs/aggregate.html#ops)
    * for more information.
    */
  var op: AggregateOp
}

object AggregatedFieldDef {
  @scala.inline
  def apply(as: String, op: AggregateOp, field: String = null): AggregatedFieldDef = {
    val __obj = js.Dynamic.literal(as = as, op = op)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[AggregatedFieldDef]
  }
}

