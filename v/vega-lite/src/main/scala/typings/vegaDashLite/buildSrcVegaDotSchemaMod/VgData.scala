package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.Anon_Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgData extends js.Object {
  var format: js.UndefOr[Anon_Feature] = js.undefined
  var name: String
  var source: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[js.Array[VgTransform]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Any] = js.undefined
}

object VgData {
  @scala.inline
  def apply(
    name: String,
    format: Anon_Feature = null,
    source: String = null,
    transform: js.Array[VgTransform] = null,
    url: String = null,
    values: js.Any = null
  ): VgData = {
    val __obj = js.Dynamic.literal(name = name)
    if (format != null) __obj.updateDynamic("format")(format)
    if (source != null) __obj.updateDynamic("source")(source)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (url != null) __obj.updateDynamic("url")(url)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[VgData]
  }
}

