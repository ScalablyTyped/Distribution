package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoWithinOptions extends js.Object {
  var geometry: Polygon | MultiPolygon = js.native
}

object GeoWithinOptions {
  @scala.inline
  def apply(geometry: Polygon | MultiPolygon): GeoWithinOptions = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoWithinOptions]
  }
  @scala.inline
  implicit class GeoWithinOptionsOps[Self <: GeoWithinOptions] (val x: Self) extends AnyVal {
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
    def setGeometry(value: Polygon | MultiPolygon): Self = this.set("geometry", value.asInstanceOf[js.Any])
  }
  
}

