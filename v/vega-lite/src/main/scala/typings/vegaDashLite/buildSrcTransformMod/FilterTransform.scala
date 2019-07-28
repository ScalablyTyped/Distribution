package typings.vegaDashLite.buildSrcTransformMod

import typings.vegaDashLite.buildSrcLogicalMod.LogicalOperand
import typings.vegaDashLite.buildSrcPredicateMod.Predicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterTransform extends Transform {
  /**
    * The `filter` property must be one of the predicate definitions:
    *
    * 1) an [expression](https://vega.github.io/vega-lite/docs/types.html#expression) string,
    * where `datum` can be used to refer to the current data object
    *
    * 2) one of the field predicates: [`equal`](https://vega.github.io/vega-lite/docs/filter.html#equal-predicate),
    * [`lt`](https://vega.github.io/vega-lite/docs/filter.html#lt-predicate),
    * [`lte`](https://vega.github.io/vega-lite/docs/filter.html#lte-predicate),
    * [`gt`](https://vega.github.io/vega-lite/docs/filter.html#gt-predicate),
    * [`gte`](https://vega.github.io/vega-lite/docs/filter.html#gte-predicate),
    * [`range`](https://vega.github.io/vega-lite/docs/filter.html#range-predicate),
    * or [`oneOf`](https://vega.github.io/vega-lite/docs/filter.html#one-of-predicate).
    *
    * 3) a [selection predicate](https://vega.github.io/vega-lite/docs/filter.html#selection-predicate)
    *
    * 4) a logical operand that combines (1), (2), or (3).
    */
  var filter: LogicalOperand[Predicate]
}

object FilterTransform {
  @scala.inline
  def apply(filter: LogicalOperand[Predicate]): FilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FilterTransform]
  }
}

