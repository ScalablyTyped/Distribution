package typings.vegaDashLite.buildSrcTransformMod

import typings.vegaDashTypings.typesSpecTransformMod.AggregateOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowFieldDef extends js.Object {
  /**
    * The output name for the window operation.
    */
  var as: String
  /**
    * The data field for which to compute the aggregate or window function. This can be omitted for window functions that do not operate over a field such as `count`, `rank`, `dense_rank`.
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * The window or aggregation operations to apply within a window, including `rank`, `lead`, `sum`, `average` or `count`. See the list of all supported operations [here](https://vega.github.io/vega-lite/docs/window.html#ops).
    */
  var op: AggregateOp | WindowOnlyOp
  /**
    * Parameter values for the window functions. Parameter values can be omitted for operations that do not accept a parameter.
    *
    * See the list of all supported operations and their parameters [here](https://vega.github.io/vega-lite/docs/transforms/window.html).
    */
  var param: js.UndefOr[Double] = js.undefined
}

object WindowFieldDef {
  @scala.inline
  def apply(as: String, op: AggregateOp | WindowOnlyOp, field: String = null, param: Int | Double = null): WindowFieldDef = {
    val __obj = js.Dynamic.literal(as = as, op = op.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field)
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowFieldDef]
  }
}

