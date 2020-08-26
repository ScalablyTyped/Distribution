package typings.wechatMiniprogram.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoNearCommandOptions extends js.Object {
  var geometry: GeoPoint = js.native
  var maxDistance: js.UndefOr[Double] = js.native
  var minDistance: js.UndefOr[Double] = js.native
}

object IGeoNearCommandOptions {
  @scala.inline
  def apply(geometry: GeoPoint): IGeoNearCommandOptions = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoNearCommandOptions]
  }
  @scala.inline
  implicit class IGeoNearCommandOptionsOps[Self <: IGeoNearCommandOptions] (val x: Self) extends AnyVal {
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
    def setGeometry(value: GeoPoint): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDistance(value: Double): Self = this.set("maxDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDistance: Self = this.set("maxDistance", js.undefined)
    @scala.inline
    def setMinDistance(value: Double): Self = this.set("minDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDistance: Self = this.set("minDistance", js.undefined)
  }
  
}

