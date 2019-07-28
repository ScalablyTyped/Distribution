package typings.vegaDashLite.buildSrcFielddefMod

import typings.vegaDashLite.buildSrcBinMod.BinParams
import typings.vegaDashLite.buildSrcGuideMod.TitleMixins
import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
import typings.vegaDashLite.buildSrcTypeMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldDef[F]
  extends FieldDefBase[F]
     with TitleMixins {
  /**
    * The encoded field's type of measurement (`"quantitative"`, `"temporal"`, `"ordinal"`, or `"nominal"`).
    * It can also be a `"geojson"` type for encoding ['geoshape'](https://vega.github.io/vega-lite/docs/geoshape.html).
    */
  var `type`: Type
}

object FieldDef {
  @scala.inline
  def apply[F](
    `type`: Type,
    aggregate: Aggregate = null,
    bin: Boolean | BinParams = null,
    field: F = null,
    timeUnit: TimeUnit = null,
    title: String = null
  ): FieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[FieldDef[F]]
  }
}

