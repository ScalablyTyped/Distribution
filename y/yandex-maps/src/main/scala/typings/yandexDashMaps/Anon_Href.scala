package typings.yandexDashMaps

import typings.yandexDashMaps.yandexDashMapsMod.IGeometryJson
import typings.yandexDashMaps.yandexDashMapsMod.IShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: String
  var ooffset: js.Array[Double]
  var shape: js.UndefOr[IShape | IGeometryJson] = js.undefined
  var size: js.Array[Double]
}

object Anon_Href {
  @scala.inline
  def apply(
    href: String,
    ooffset: js.Array[Double],
    size: js.Array[Double],
    shape: IShape | IGeometryJson = null
  ): Anon_Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], ooffset = ooffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Href]
  }
}

