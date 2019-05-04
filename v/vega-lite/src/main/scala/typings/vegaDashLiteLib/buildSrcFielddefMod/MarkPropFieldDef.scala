package typings
package vegaDashLiteLib.buildSrcFielddefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkPropFieldDef[F] extends ScaleFieldDef[F] {
  /**
    * An object defining properties of the legend.
    * If `null`, the legend for the encoding channel will be removed.
    *
    * __Default value:__ If undefined, default [legend properties](https://vega.github.io/vega-lite/docs/legend.html) are applied.
    */
  var legend: js.UndefOr[vegaDashLiteLib.buildSrcLegendMod.Legend | scala.Null] = js.undefined
}

object MarkPropFieldDef {
  @scala.inline
  def apply[F](
    `type`: vegaDashLiteLib.buildSrcTypeMod.Type,
    aggregate: Aggregate = null,
    bin: scala.Boolean | vegaDashLiteLib.buildSrcBinMod.BinParams = null,
    field: F = null,
    legend: vegaDashLiteLib.buildSrcLegendMod.Legend = null,
    scale: vegaDashLiteLib.buildSrcScaleMod.Scale = null,
    sort: vegaDashLiteLib.buildSrcSortMod.Sort[F] = null,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null,
    title: java.lang.String = null
  ): MarkPropFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MarkPropFieldDef[F]]
  }
}

