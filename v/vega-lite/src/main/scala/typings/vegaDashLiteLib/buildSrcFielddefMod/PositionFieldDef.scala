package typings
package vegaDashLiteLib.buildSrcFielddefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionFieldDef[F] extends ScaleFieldDef[F] {
  /**
    * An object defining properties of axis's gridlines, ticks and labels.
    * If `null`, the axis for the encoding channel will be removed.
    *
    * __Default value:__ If undefined, default [axis properties](https://vega.github.io/vega-lite/docs/axis.html) are applied.
    */
  var axis: js.UndefOr[vegaDashLiteLib.buildSrcAxisMod.Axis | scala.Null] = js.undefined
  /**
    * Type of stacking offset if the field should be stacked.
    * `stack` is only applicable for `x` and `y` channels with continuous domains.
    * For example, `stack` of `y` can be used to customize stacking for a vertical bar chart.
    *
    * `stack` can be one of the following values:
    * - `"zero"`: stacking with baseline offset at zero value of the scale (for creating typical stacked [bar](https://vega.github.io/vega-lite/docs/stack.html#bar) and [area](https://vega.github.io/vega-lite/docs/stack.html#area) chart).
    * - `"normalize"` - stacking with normalized domain (for creating [normalized stacked bar and area charts](https://vega.github.io/vega-lite/docs/stack.html#normalized). <br/>
    * -`"center"` - stacking with center baseline (for [streamgraph](https://vega.github.io/vega-lite/docs/stack.html#streamgraph)).
    * - `null` - No-stacking. This will produce layered [bar](https://vega.github.io/vega-lite/docs/stack.html#layered-bar-chart) and area chart.
    *
    * __Default value:__ `zero` for plots with all of the following conditions are true:
    * (1) the mark is `bar` or `area`;
    * (2) the stacked measure channel (x or y) has a linear scale;
    * (3) At least one of non-position channels mapped to an unaggregated field that is different from x and y.  Otherwise, `null` by default.
    */
  var stack: js.UndefOr[vegaDashLiteLib.buildSrcStackMod.StackOffset | scala.Null] = js.undefined
}

object PositionFieldDef {
  @scala.inline
  def apply[F](
    `type`: vegaDashLiteLib.buildSrcTypeMod.Type,
    aggregate: Aggregate = null,
    axis: vegaDashLiteLib.buildSrcAxisMod.Axis = null,
    bin: scala.Boolean | vegaDashLiteLib.buildSrcBinMod.BinParams = null,
    field: F = null,
    scale: vegaDashLiteLib.buildSrcScaleMod.Scale = null,
    sort: vegaDashLiteLib.buildSrcSortMod.Sort[F] = null,
    stack: vegaDashLiteLib.buildSrcStackMod.StackOffset = null,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null,
    title: java.lang.String = null
  ): PositionFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PositionFieldDef[F]]
  }
}

