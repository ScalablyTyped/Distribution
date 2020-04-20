package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoWithinOptions extends js.Object {
  var geometry: Polygon | MultiPolygon
}

object GeoWithinOptions {
  @scala.inline
  def apply(geometry: Polygon | MultiPolygon): GeoWithinOptions = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoWithinOptions]
  }
}

