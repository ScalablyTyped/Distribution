package typings
package vegaDashLiteLib.buildSrcFielddefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldDef[F]
  extends FieldDefBase[F]
     with vegaDashLiteLib.buildSrcGuideMod.TitleMixins {
  /**
    * The encoded field's type of measurement (`"quantitative"`, `"temporal"`, `"ordinal"`, or `"nominal"`).
    * It can also be a `"geojson"` type for encoding ['geoshape'](https://vega.github.io/vega-lite/docs/geoshape.html).
    */
  var `type`: vegaDashLiteLib.buildSrcTypeMod.Type
}

object FieldDef {
  @scala.inline
  def apply[F](
    `type`: vegaDashLiteLib.buildSrcTypeMod.Type,
    aggregate: Aggregate = null,
    bin: scala.Boolean | vegaDashLiteLib.buildSrcBinMod.BinParams = null,
    field: F = null,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null,
    title: java.lang.String = null
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

