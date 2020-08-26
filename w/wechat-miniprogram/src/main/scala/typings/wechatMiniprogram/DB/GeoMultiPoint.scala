package typings.wechatMiniprogram.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMultiPoint extends GeoInstance {
  var points: js.Array[GeoPoint] = js.native
  def toJSON(): IGeoJSONMultiPoint = js.native
}

object GeoMultiPoint {
  @scala.inline
  def apply(points: js.Array[GeoPoint], toJSON: () => IGeoJSONMultiPoint): GeoMultiPoint = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoMultiPoint]
  }
  @scala.inline
  implicit class GeoMultiPointOps[Self <: GeoMultiPoint] (val x: Self) extends AnyVal {
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
    def setPointsVarargs(value: GeoPoint*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[GeoPoint]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => IGeoJSONMultiPoint): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

