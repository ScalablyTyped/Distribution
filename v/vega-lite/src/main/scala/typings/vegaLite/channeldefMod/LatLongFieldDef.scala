package typings.vegaLite.channeldefMod

import typings.vegaLite.aggregateMod.Aggregate
import typings.vegaLite.srcTimeunitMod.TimeUnit
import typings.vegaLite.srcTimeunitMod.TimeUnitParams
import typings.vegaLite.vegaLiteStrings.quantitative
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/channeldef.FieldDefBase<F, null> & vega-lite.vega-lite/build/src/guide.TitleMixins & std.Partial<vega-lite.vega-lite/build/src/channeldef.TypeMixins<'quantitative'>> */
trait LatLongFieldDef[F /* <: Field */] extends StObject {
  
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
  var bin: js.UndefOr[Null] = js.undefined
  
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
  
  /**
    * A title for the field. If `null`, the title will be removed.
    *
    * __Default value:__  derived from the field's name and transformation function (`aggregate`, `bin` and `timeUnit`). If the field has an aggregate function, the function is displayed as part of the title (e.g., `"Sum of Profit"`). If the field is binned or has a time unit applied, the applied function is shown in parentheses (e.g., `"Profit (binned)"`, `"Transaction Date (year-month)"`). Otherwise, the title is simply the field name.
    *
    * __Notes__:
    *
    * 1) You can customize the default field title format by providing the [`fieldTitle`](https://vega.github.io/vega-lite/docs/config.html#top-level-config) property in the [config](https://vega.github.io/vega-lite/docs/config.html) or [`fieldTitle` function via the `compile` function's options](https://vega.github.io/vega-lite/docs/compile.html#field-title).
    *
    * 2) If both field definition's `title` and axis, header, or legend `title` are defined, axis/header/legend title will be used.
    */
  var title: js.UndefOr[Text | Null | SignalRef] = js.undefined
  
  var `type`: js.UndefOr[quantitative] = js.undefined
}
object LatLongFieldDef {
  
  @scala.inline
  def apply[F /* <: Field */](): LatLongFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LatLongFieldDef[F]]
  }
  
  @scala.inline
  implicit class LatLongFieldDefMutableBuilder[Self <: LatLongFieldDef[?], F /* <: Field */] (val x: Self & LatLongFieldDef[F]) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: Aggregate | HiddenCompositeAggregate): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    @scala.inline
    def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
    
    @scala.inline
    def setField(value: F): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setTimeUnit(value: TimeUnit | TimeUnitParams): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
    
    @scala.inline
    def setTitle(value: Text | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
    
    @scala.inline
    def setType(value: quantitative): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
