package typings.wechatMiniprogram.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoWithinCommandOptions extends js.Object {
  var geometry: GeoPolygon | GeoMultiPolygon = js.native
}

object IGeoWithinCommandOptions {
  @scala.inline
  def apply(geometry: GeoPolygon | GeoMultiPolygon): IGeoWithinCommandOptions = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoWithinCommandOptions]
  }
  @scala.inline
  implicit class IGeoWithinCommandOptionsOps[Self <: IGeoWithinCommandOptions] (val x: Self) extends AnyVal {
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
    def setGeometry(value: GeoPolygon | GeoMultiPolygon): Self = this.set("geometry", value.asInstanceOf[js.Any])
  }
  
}

