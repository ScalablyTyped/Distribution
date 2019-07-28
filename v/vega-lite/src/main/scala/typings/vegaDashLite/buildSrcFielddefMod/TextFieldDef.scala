package typings.vegaDashLite.buildSrcFielddefMod

import typings.vegaDashLite.buildSrcBinMod.BinParams
import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
import typings.vegaDashLite.buildSrcTypeMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFieldDef[F] extends FieldDef[F] {
  /**
    * The [formatting pattern](https://vega.github.io/vega-lite/docs/format.html) for a text field. If not defined, this will be determined automatically.
    */
  var format: js.UndefOr[String] = js.undefined
}

object TextFieldDef {
  @scala.inline
  def apply[F](
    `type`: Type,
    aggregate: Aggregate = null,
    bin: Boolean | BinParams = null,
    field: F = null,
    format: String = null,
    timeUnit: TimeUnit = null,
    title: String = null
  ): TextFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TextFieldDef[F]]
  }
}

