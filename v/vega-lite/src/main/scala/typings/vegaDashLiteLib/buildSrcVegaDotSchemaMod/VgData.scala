package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgData extends js.Object {
  var format: js.UndefOr[vegaDashLiteLib.Anon_Feature] = js.undefined
  var name: java.lang.String
  var source: js.UndefOr[java.lang.String] = js.undefined
  var transform: js.UndefOr[js.Array[VgTransform]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var values: js.UndefOr[js.Any] = js.undefined
}

object VgData {
  @scala.inline
  def apply(
    name: java.lang.String,
    format: vegaDashLiteLib.Anon_Feature = null,
    source: java.lang.String = null,
    transform: js.Array[VgTransform] = null,
    url: java.lang.String = null,
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

