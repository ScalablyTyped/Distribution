package typings.vegaLite.channeldefMod

import typings.vegaLite.axisMod.Axis
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.scaleMod.Scale
import typings.vegaLite.srcImputeMod.ImputeParams
import typings.vegaLite.srcStackMod.StackOffset
import typings.vegaLite.srcTypeMod.Type
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/channeldef.PositionDatumDefBase<F> & vega-lite.vega-lite/build/src/channeldef.PositionMixins */
@js.native
trait PositionDatumDef[F /* <: Field */] extends StObject {
  
  /**
    * An object defining properties of axis's gridlines, ticks and labels.
    * If `null`, the axis for the encoding channel will be removed.
    *
    * __Default value:__ If undefined, default [axis properties](https://vega.github.io/vega-lite/docs/axis.html) are applied.
    *
    * __See also:__ [`axis`](https://vega.github.io/vega-lite/docs/axis.html) documentation.
    */
  var axis: js.UndefOr[(Axis[ExprRef | SignalRef]) | Null] = js.native
  
  /**
    * For rect-based marks (`rect`, `bar`, and `image`), mark size relative to bandwidth of [band scales](https://vega.github.io/vega-lite/docs/scale.html#band), bins or time units. If set to `1`, the mark size is set to the bandwidth, the bin interval, or the time unit interval. If set to `0.5`, the mark size is half of the bandwidth or the time unit interval.
    *
    * For other marks, relative position on a band of a stacked, binned, time unit or band scale. If set to `0`, the marks will be positioned at the beginning of the band. If set to `0.5`, the marks will be positioned in the middle of the band.
    *
    * @minimum 0
    * @maximum 1
    */
  var band: js.UndefOr[Double] = js.native
  
  /**
    * A constant value in data domain.
    */
  var datum: js.UndefOr[PrimitiveValue | DateTime | ExprRef | SignalRef | RepeatRef] = js.native
  
  /**
    * An object defining the properties of the Impute Operation to be applied.
    * The field value of the other positional channel is taken as `key` of the `Impute` Operation.
    * The field of the `color` channel if specified is used as `groupby` of the `Impute` Operation.
    *
    * __See also:__ [`impute`](https://vega.github.io/vega-lite/docs/impute.html) documentation.
    */
  var impute: js.UndefOr[ImputeParams | Null] = js.native
  
  /**
    * An object defining properties of the channel's scale, which is the function that transforms values in the data domain (numbers, dates, strings, etc) to visual values (pixels, colors, sizes) of the encoding channels.
    *
    * If `null`, the scale will be [disabled and the data value will be directly encoded](https://vega.github.io/vega-lite/docs/scale.html#disable).
    *
    * __Default value:__ If undefined, default [scale properties](https://vega.github.io/vega-lite/docs/scale.html) are applied.
    *
    * __See also:__ [`scale`](https://vega.github.io/vega-lite/docs/scale.html) documentation.
    */
  var scale: js.UndefOr[(Scale[ExprRef | SignalRef]) | Null] = js.native
  
  /**
    * Type of stacking offset if the field should be stacked.
    * `stack` is only applicable for `x`, `y`, `theta`, and `radius` channels with continuous domains.
    * For example, `stack` of `y` can be used to customize stacking for a vertical bar chart.
    *
    * `stack` can be one of the following values:
    * - `"zero"` or `true`: stacking with baseline offset at zero value of the scale (for creating typical stacked [bar](https://vega.github.io/vega-lite/docs/stack.html#bar) and [area](https://vega.github.io/vega-lite/docs/stack.html#area) chart).
    * - `"normalize"` - stacking with normalized domain (for creating [normalized stacked bar and area charts](https://vega.github.io/vega-lite/docs/stack.html#normalized). <br/>
    * -`"center"` - stacking with center baseline (for [streamgraph](https://vega.github.io/vega-lite/docs/stack.html#streamgraph)).
    * - `null` or `false` - No-stacking. This will produce layered [bar](https://vega.github.io/vega-lite/docs/stack.html#layered-bar-chart) and area chart.
    *
    * __Default value:__ `zero` for plots with all of the following conditions are true:
    * (1) the mark is `bar`, `area`, or `arc`;
    * (2) the stacked measure channel (x or y) has a linear scale;
    * (3) At least one of non-position channels mapped to an unaggregated field that is different from x and y. Otherwise, `null` by default.
    *
    * __See also:__ [`stack`](https://vega.github.io/vega-lite/docs/stack.html) documentation.
    */
  var stack: js.UndefOr[StackOffset | Null | Boolean] = js.native
  
  var `type`: js.UndefOr[Type] = js.native
}
object PositionDatumDef {
  
  @scala.inline
  def apply[F /* <: Field */](): PositionDatumDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionDatumDef[F]]
  }
  
  @scala.inline
  implicit class PositionDatumDefMutableBuilder[Self <: PositionDatumDef[_], F /* <: Field */] (val x: Self with PositionDatumDef[F]) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Axis[ExprRef | SignalRef]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisNull: Self = StObject.set(x, "axis", null)
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
    
    @scala.inline
    def setDatum(value: PrimitiveValue | DateTime | ExprRef | SignalRef | RepeatRef): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatumNull: Self = StObject.set(x, "datum", null)
    
    @scala.inline
    def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    @scala.inline
    def setImpute(value: ImputeParams): Self = StObject.set(x, "impute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImputeNull: Self = StObject.set(x, "impute", null)
    
    @scala.inline
    def setImputeUndefined: Self = StObject.set(x, "impute", js.undefined)
    
    @scala.inline
    def setScale(value: Scale[ExprRef | SignalRef]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleNull: Self = StObject.set(x, "scale", null)
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setStack(value: StackOffset | Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackNull: Self = StObject.set(x, "stack", null)
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
