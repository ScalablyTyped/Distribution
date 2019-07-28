package typings.vegaDashLite.buildSrcFielddefMod

import typings.vegaDashLite.buildSrcBinMod.BinParams
import typings.vegaDashLite.buildSrcLegendMod.Legend
import typings.vegaDashLite.buildSrcScaleMod.Scale
import typings.vegaDashLite.buildSrcSortMod.Sort
import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
import typings.vegaDashLite.buildSrcTypeMod.Type
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
  var legend: js.UndefOr[Legend | Null] = js.undefined
}

object MarkPropFieldDef {
  @scala.inline
  def apply[F](
    `type`: Type,
    aggregate: Aggregate = null,
    bin: Boolean | BinParams = null,
    field: F = null,
    legend: Legend = null,
    scale: Scale = null,
    sort: Sort[F] = null,
    timeUnit: TimeUnit = null,
    title: String = null
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

