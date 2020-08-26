package typings.wechatMiniprogram.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMultiPolygon extends GeoInstance {
  var polygons: js.Array[GeoPolygon] = js.native
  def toJSON(): IGeoJSONMultiPolygon = js.native
}

object GeoMultiPolygon {
  @scala.inline
  def apply(polygons: js.Array[GeoPolygon], toJSON: () => IGeoJSONMultiPolygon): GeoMultiPolygon = {
    val __obj = js.Dynamic.literal(polygons = polygons.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoMultiPolygon]
  }
  @scala.inline
  implicit class GeoMultiPolygonOps[Self <: GeoMultiPolygon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPolygonsVarargs(value: GeoPolygon*): Self = this.set("polygons", js.Array(value :_*))
    @scala.inline
    def setPolygons(value: js.Array[GeoPolygon]): Self = this.set("polygons", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => IGeoJSONMultiPolygon): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

