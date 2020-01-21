package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoIntersectsOptions extends js.Object {
  var geometry: Point | LineString | MultiPoint | MultiLineString | Polygon | MultiPolygon
}

object GeoIntersectsOptions {
  @scala.inline
  def apply(geometry: Point | LineString | MultiPoint | MultiLineString | Polygon | MultiPolygon): GeoIntersectsOptions = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeoIntersectsOptions]
  }
}

