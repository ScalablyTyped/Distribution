package typings.vegaDashLite.buildSrcFielddefMod

import typings.vegaDashLite.buildSrcBinMod.BinParams
import typings.vegaDashLite.buildSrcScaleMod.Scale
import typings.vegaDashLite.buildSrcSortMod.Sort
import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
import typings.vegaDashLite.buildSrcTypeMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleFieldDef[F] extends SortableFieldDef[F] {
  /**
    * An object defining properties of the channel's scale, which is the function that transforms values in the data domain (numbers, dates, strings, etc) to visual values (pixels, colors, sizes) of the encoding channels.
    *
    * If `null`, the scale will be [disabled and the data value will be directly encoded](https://vega.github.io/vega-lite/docs/scale.html#disable).
    *
    * __Default value:__ If undefined, default [scale properties](https://vega.github.io/vega-lite/docs/scale.html) are applied.
    */
  var scale: js.UndefOr[Scale | Null] = js.undefined
}

object ScaleFieldDef {
  @scala.inline
  def apply[F](
    `type`: Type,
    aggregate: Aggregate = null,
    bin: Boolean | BinParams = null,
    field: F = null,
    scale: Scale = null,
    sort: Sort[F] = null,
    timeUnit: TimeUnit = null,
    title: String = null
  ): ScaleFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ScaleFieldDef[F]]
  }
}

