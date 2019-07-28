package typings.vegaDashLite.buildSrcFielddefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionValueDefMixins extends js.Object {
  /**
    * One or more value definition(s) with a selection predicate.
    *
    * __Note:__ A field definition's `condition` property can only contain [value definitions](https://vega.github.io/vega-lite/docs/encoding.html#value-def)
    * since Vega-Lite only allows at most one encoded field per encoding channel.
    */
  var condition: js.UndefOr[Conditional[ValueDef] | js.Array[Conditional[ValueDef]]] = js.undefined
}

object ConditionValueDefMixins {
  @scala.inline
  def apply(condition: Conditional[ValueDef] | js.Array[Conditional[ValueDef]] = null): ConditionValueDefMixins = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionValueDefMixins]
  }
}

