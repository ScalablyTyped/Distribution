package typings.vegaLite.buildSrcChanneldefMod

import typings.vegaLite.buildSrcAggregateMod.Aggregate
import typings.vegaLite.buildSrcBinMod.Bin
import typings.vegaLite.buildSrcTimeunitMod.TimeUnit
import typings.vegaLite.buildSrcTimeunitMod.TimeUnitParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldDefBase[F, B /* <: Bin */]
  extends StObject
     with BandMixins {
  
  /**
    * Aggregation function for the field
    * (e.g., `"mean"`, `"sum"`, `"median"`, `"min"`, `"max"`, `"count"`).
    *
    * __Default value:__ `undefined` (None)
    *
    * __See also:__ [`aggregate`](https://vega.github.io/vega-lite/docs/aggregate.html) documentation.
    */
  var aggregate: js.UndefOr[Aggregate | HiddenCompositeAggregate] = js.undefined
  
  /**
    * A flag for binning a `quantitative` field, [an object defining binning parameters](https://vega.github.io/vega-lite/docs/bin.html#bin-parameters), or indicating that the data for `x` or `y` channel are binned before they are imported into Vega-Lite (`"binned"`).
    *
    * - If `true`, default [binning parameters](https://vega.github.io/vega-lite/docs/bin.html#bin-parameters) will be applied.
    *
    * - If `"binned"`, this indicates that the data for the `x` (or `y`) channel are already binned. You can map the bin-start field to `x` (or `y`) and the bin-end field to `x2` (or `y2`). The scale and axis will be formatted similar to binning in Vega-Lite.  To adjust the axis ticks based on the bin step, you can also set the axis's [`tickMinStep`](https://vega.github.io/vega-lite/docs/axis.html#ticks) property.
    *
    * __Default value:__ `false`
    *
    * __See also:__ [`bin`](https://vega.github.io/vega-lite/docs/bin.html) documentation.
    */
  var bin: js.UndefOr[B] = js.undefined
  
  /**
    * __Required.__ A string defining the name of the field from which to pull a data value
    * or an object defining iterated values from the [`repeat`](https://vega.github.io/vega-lite/docs/repeat.html) operator.
    *
    * __See also:__ [`field`](https://vega.github.io/vega-lite/docs/field.html) documentation.
    *
    * __Notes:__
    * 1)  Dots (`.`) and brackets (`[` and `]`) can be used to access nested objects (e.g., `"field": "foo.bar"` and `"field": "foo['bar']"`).
    * If field names contain dots or brackets but are not nested, you can use `\\` to escape dots and brackets (e.g., `"a\\.b"` and `"a\\[0\\]"`).
    * See more details about escaping in the [field documentation](https://vega.github.io/vega-lite/docs/field.html).
    * 2) `field` is not required if `aggregate` is `count`.
    */
  var field: js.UndefOr[F] = js.undefined
  
  /**
    * Time unit (e.g., `year`, `yearmonth`, `month`, `hours`) for a temporal field.
    * or [a temporal field that gets casted as ordinal](https://vega.github.io/vega-lite/docs/type.html#cast).
    *
    * __Default value:__ `undefined` (None)
    *
    * __See also:__ [`timeUnit`](https://vega.github.io/vega-lite/docs/timeunit.html) documentation.
    */
  var timeUnit: js.UndefOr[TimeUnit | TimeUnitParams] = js.undefined
}
object FieldDefBase {
  
  inline def apply[F, B /* <: Bin */](): FieldDefBase[F, B] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldDefBase[F, B]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldDefBase[?, ?], F, B /* <: Bin */] (val x: Self & (FieldDefBase[F, B])) extends AnyVal {
    
    inline def setAggregate(value: Aggregate | HiddenCompositeAggregate): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    inline def setBin(value: B): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
    
    inline def setField(value: F): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setTimeUnit(value: TimeUnit | TimeUnitParams): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
  }
}
