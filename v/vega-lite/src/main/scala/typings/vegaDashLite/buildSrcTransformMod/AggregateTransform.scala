package typings.vegaDashLite.buildSrcTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateTransform extends Transform {
  /**
    * Array of objects that define fields to aggregate.
    */
  var aggregate: js.Array[AggregatedFieldDef]
  /**
    * The data fields to group by. If not specified, a single group containing all data objects will be used.
    */
  var groupby: js.UndefOr[js.Array[String]] = js.undefined
}

object AggregateTransform {
  @scala.inline
  def apply(aggregate: js.Array[AggregatedFieldDef], groupby: js.Array[String] = null): AggregateTransform = {
    val __obj = js.Dynamic.literal(aggregate = aggregate)
    if (groupby != null) __obj.updateDynamic("groupby")(groupby)
    __obj.asInstanceOf[AggregateTransform]
  }
}

