package typings.vegaLite.anon

import typings.vegaLite.aggregateMod.ArgmaxDef
import typings.vegaLite.aggregateMod.ArgminDef
import typings.vegaLite.binMod.BinParams
import typings.vegaLite.srcTypeMod.StandardType
import typings.vegaLite.vegaLiteStrings.average
import typings.vegaLite.vegaLiteStrings.boxplot
import typings.vegaLite.vegaLiteStrings.ci0
import typings.vegaLite.vegaLiteStrings.ci1
import typings.vegaLite.vegaLiteStrings.count
import typings.vegaLite.vegaLiteStrings.distinct
import typings.vegaLite.vegaLiteStrings.errorband
import typings.vegaLite.vegaLiteStrings.errorbar
import typings.vegaLite.vegaLiteStrings.max
import typings.vegaLite.vegaLiteStrings.mean
import typings.vegaLite.vegaLiteStrings.median
import typings.vegaLite.vegaLiteStrings.min
import typings.vegaLite.vegaLiteStrings.missing
import typings.vegaLite.vegaLiteStrings.product
import typings.vegaLite.vegaLiteStrings.q1
import typings.vegaLite.vegaLiteStrings.q3
import typings.vegaLite.vegaLiteStrings.stderr
import typings.vegaLite.vegaLiteStrings.stdev
import typings.vegaLite.vegaLiteStrings.stdevp
import typings.vegaLite.vegaLiteStrings.sum
import typings.vegaLite.vegaLiteStrings.valid
import typings.vegaLite.vegaLiteStrings.values
import typings.vegaLite.vegaLiteStrings.variance
import typings.vegaLite.vegaLiteStrings.variancep
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  /**
    * Aggregation function for the field
    * (e.g., `"mean"`, `"sum"`, `"median"`, `"min"`, `"max"`, `"count"`).
    *
    * __Default value:__ `undefined` (None)
    *
    * __See also:__ [`aggregate`](https://vega.github.io/vega-lite/docs/aggregate.html) documentation.
    */
  var aggregate: js.UndefOr[
    max | values | count | min | average | distinct | mean | median | missing | product | q1 | q3 | ci0 | ci1 | stderr | stdev | stdevp | sum | valid | variance | variancep | ArgminDef | ArgmaxDef | boxplot | errorbar | errorband
  ] = js.undefined
  
  /**
    * For rect-based marks (`rect`, `bar`, and `image`), mark size relative to bandwidth of [band scales](https://vega.github.io/vega-lite/docs/scale.html#band), bins or time units. If set to `1`, the mark size is set to the bandwidth, the bin interval, or the time unit interval. If set to `0.5`, the mark size is half of the bandwidth or the time unit interval.
    *
    * For other marks, relative position on a band of a stacked, binned, time unit or band scale. If set to `0`, the marks will be positioned at the beginning of the band. If set to `0.5`, the marks will be positioned in the middle of the band.
    *
    * @minimum 0
    * @maximum 1
    */
  var band: js.UndefOr[Double] = js.undefined
  
  /**
    * A flag for binning a `quantitative` field, [an object defining binning parameters](https://vega.github.io/vega-lite/docs/bin.html#params), or indicating that the data for `x` or `y` channel are binned before they are imported into Vega-Lite (`"binned"`).
    *
    * - If `true`, default [binning parameters](https://vega.github.io/vega-lite/docs/bin.html) will be applied.
    *
    * - If `"binned"`, this indicates that the data for the `x` (or `y`) channel are already binned. You can map the bin-start field to `x` (or `y`) and the bin-end field to `x2` (or `y2`). The scale and axis will be formatted similar to binning in Vega-Lite.  To adjust the axis ticks based on the bin step, you can also set the axis's [`tickMinStep`](https://vega.github.io/vega-lite/docs/axis.html#ticks) property.
    *
    * __Default value:__ `false`
    *
    * __See also:__ [`bin`](https://vega.github.io/vega-lite/docs/bin.html) documentation.
    */
  var bin: js.UndefOr[Boolean | BinParams] = js.undefined
  
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
  var field: js.UndefOr[String] = js.undefined
  
  var sort: Order
  
  /**
    * Time unit (e.g., `year`, `yearmonth`, `month`, `hours`) for a temporal field.
    * or [a temporal field that gets casted as ordinal](https://vega.github.io/vega-lite/docs/type.html#cast).
    *
    * __Default value:__ `undefined` (None)
    *
    * __See also:__ [`timeUnit`](https://vega.github.io/vega-lite/docs/timeunit.html) documentation.
    */
  var timeUnit: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any
  ] = js.undefined
  
  var title: js.UndefOr[String | js.Array[String] | SignalRef] = js.undefined
  
  /**
    * The type of measurement (`"quantitative"`, `"temporal"`, `"ordinal"`, or `"nominal"`) for the encoded field or constant value (`datum`).
    * It can also be a `"geojson"` type for encoding ['geoshape'](https://vega.github.io/vega-lite/docs/geoshape.html).
    *
    * Vega-Lite automatically infers data types in many cases as discussed below. However, type is required for a field if:
    * (1) the field is not nominal and the field encoding has no specified `aggregate` (except `argmin` and `argmax`), `bin`, scale type, custom `sort` order, nor `timeUnit`
    * or (2) if you wish to use an ordinal scale for a field with `bin` or `timeUnit`.
    *
    * __Default value:__
    *
    * 1) For a data `field`, `"nominal"` is the default data type unless the field encoding has `aggregate`, `channel`, `bin`, scale type, `sort`, or `timeUnit` that satisfies the following criteria:
    * - `"quantitative"` is the default type if (1) the encoded field contains `bin` or `aggregate` except `"argmin"` and `"argmax"`, (2) the encoding channel is `latitude` or `longitude` channel or (3) if the specified scale type is [a quantitative scale](https://vega.github.io/vega-lite/docs/scale.html#type).
    * - `"temporal"` is the default type if (1) the encoded field contains `timeUnit` or (2) the specified scale type is a time or utc scale
    * - `ordinal""` is the default type if (1) the encoded field contains a [custom `sort` order](https://vega.github.io/vega-lite/docs/sort.html#specifying-custom-sort-order), (2) the specified scale type is an ordinal/point/band scale, or (3) the encoding channel is `order`.
    *
    * 2) For a constant value in data domain (`datum`):
    * - `"quantitative"` if the datum is a number
    * - `"nominal"` if the datum is a string
    * - `"temporal"` if the datum is [a date time object](https://vega.github.io/vega-lite/docs/datetime.html)
    *
    * __Note:__
    * - Data `type` describes the semantics of the data rather than the primitive data types (number, string, etc.). The same primitive data type can have different types of measurement. For example, numeric data can represent quantitative, ordinal, or nominal data.
    * - Data values for a temporal field can be either a date-time string (e.g., `"2015-03-07 12:32:17"`, `"17:01"`, `"2015-03-16"`. `"2015"`) or a timestamp number (e.g., `1552199579097`).
    * - When using with [`bin`](https://vega.github.io/vega-lite/docs/bin.html), the `type` property can be either `"quantitative"` (for using a linear bin scale) or [`"ordinal"` (for using an ordinal bin scale)](https://vega.github.io/vega-lite/docs/type.html#cast-bin).
    * - When using with [`timeUnit`](https://vega.github.io/vega-lite/docs/timeunit.html), the `type` property can be either `"temporal"` (default, for using a temporal scale) or [`"ordinal"` (for using an ordinal scale)](https://vega.github.io/vega-lite/docs/type.html#cast-bin).
    * - When using with [`aggregate`](https://vega.github.io/vega-lite/docs/aggregate.html), the `type` property refers to the post-aggregation data type. For example, we can calculate count `distinct` of a categorical field `"cat"` using `{"aggregate": "distinct", "field": "cat"}`. The `"type"` of the aggregate output is `"quantitative"`.
    * - Secondary channels (e.g., `x2`, `y2`, `xError`, `yError`) do not have `type` as they must have exactly the same type as their primary channels (e.g., `x`, `y`).
    *
    * __See also:__ [`type`](https://vega.github.io/vega-lite/docs/type.html) documentation.
    */
  var `type`: js.UndefOr[StandardType] = js.undefined
}
object Field {
  
  @scala.inline
  def apply(sort: Order): Field = {
    val __obj = js.Dynamic.literal(sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregate(
      value: max | values | count | min | average | distinct | mean | median | missing | product | q1 | q3 | ci0 | ci1 | stderr | stdev | stdevp | sum | valid | variance | variancep | ArgminDef | ArgmaxDef | boxplot | errorbar | errorband
    ): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    @scala.inline
    def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
    
    @scala.inline
    def setBin(value: Boolean | BinParams): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setSort(value: Order): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnit(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
    
    @scala.inline
    def setTitle(value: String | js.Array[String] | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
    
    @scala.inline
    def setType(value: StandardType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
