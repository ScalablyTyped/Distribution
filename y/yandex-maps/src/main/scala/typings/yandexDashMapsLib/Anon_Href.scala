package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: java.lang.String
  var ooffset: js.Array[scala.Double]
  var shape: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsMod.IShape | yandexDashMapsLib.yandexDashMapsMod.IGeometryJson
  ] = js.undefined
  var size: js.Array[scala.Double]
}

object Anon_Href {
  @scala.inline
  def apply(
    href: java.lang.String,
    ooffset: js.Array[scala.Double],
    size: js.Array[scala.Double],
    shape: yandexDashMapsLib.yandexDashMapsMod.IShape | yandexDashMapsLib.yandexDashMapsMod.IGeometryJson = null
  ): Anon_Href = {
    val __obj = js.Dynamic.literal(href = href, ooffset = ooffset, size = size)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Href]
  }
}

