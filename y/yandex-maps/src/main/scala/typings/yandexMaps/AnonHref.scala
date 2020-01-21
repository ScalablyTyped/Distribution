package typings.yandexMaps

import typings.yandexMaps.mod.IGeometryJson
import typings.yandexMaps.mod.IShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHref extends js.Object {
  var href: String
  var ooffset: js.Array[Double]
  var shape: js.UndefOr[IShape | IGeometryJson] = js.undefined
  var size: js.Array[Double]
}

object AnonHref {
  @scala.inline
  def apply(
    href: String,
    ooffset: js.Array[Double],
    size: js.Array[Double],
    shape: IShape | IGeometryJson = null
  ): AnonHref = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], ooffset = ooffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHref]
  }
}

