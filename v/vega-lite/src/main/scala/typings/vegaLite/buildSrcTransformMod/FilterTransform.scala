package typings.vegaLite.buildSrcTransformMod

import typings.vegaLite.buildSrcLogicalMod.LogicalComposition
import typings.vegaLite.buildSrcPredicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterTransform
  extends StObject
     with Transform {
  
  /**
    * The `filter` property must be a predication definition, which can take one of the following forms:
    *
    * 1) an [expression](https://vega.github.io/vega-lite/docs/types.html#expression) string,
    * where `datum` can be used to refer to the current data object.
    * For example, `{filter: "datum.b2 > 60"}` would make the output data includes only items that have values in the field `b2` over 60.
    *
    * 2) one of the [field predicates](https://vega.github.io/vega-lite/docs/predicate.html#field-predicate):
    * [`equal`](https://vega.github.io/vega-lite/docs/predicate.html#field-equal-predicate),
    * [`lt`](https://vega.github.io/vega-lite/docs/predicate.html#lt-predicate),
    * [`lte`](https://vega.github.io/vega-lite/docs/predicate.html#lte-predicate),
    * [`gt`](https://vega.github.io/vega-lite/docs/predicate.html#gt-predicate),
    * [`gte`](https://vega.github.io/vega-lite/docs/predicate.html#gte-predicate),
    * [`range`](https://vega.github.io/vega-lite/docs/predicate.html#range-predicate),
    * [`oneOf`](https://vega.github.io/vega-lite/docs/predicate.html#one-of-predicate),
    * or [`valid`](https://vega.github.io/vega-lite/docs/predicate.html#valid-predicate),
    
    * 3) a [selection predicate](https://vega.github.io/vega-lite/docs/predicate.html#selection-predicate), which define the names of a selection that the data point should belong to (or a logical composition of selections).
    *
    * 4) a [logical composition](https://vega.github.io/vega-lite/docs/predicate.html#composition) of (1), (2), or (3).
    */
  var filter: LogicalComposition[Predicate]
}
object FilterTransform {
  
  inline def apply(filter: LogicalComposition[Predicate]): FilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterTransform]
  }
  
  extension [Self <: FilterTransform](x: Self) {
    
    inline def setFilter(value: LogicalComposition[Predicate]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
