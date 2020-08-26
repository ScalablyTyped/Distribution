package typings.viewportMercatorProject.anon

import typings.viewportMercatorProject.mod.HighPrecisionDistanceScalesInput
import typings.viewportMercatorProject.viewportMercatorProjectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined viewport-mercator-project.viewport-mercator-project.BaseHighPrecisionDistanceScalesInput & {  zoom :number} */
@js.native
trait BaseHighPrecisionDistance extends HighPrecisionDistanceScalesInput {
  var highPrecision: `true` = js.native
  var latitude: Double = js.native
  var longitude: Double = js.native
  var zoom: Double = js.native
}

object BaseHighPrecisionDistance {
  @scala.inline
  def apply(highPrecision: `true`, latitude: Double, longitude: Double, zoom: Double): BaseHighPrecisionDistance = {
    val __obj = js.Dynamic.literal(highPrecision = highPrecision.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHighPrecisionDistance]
  }
  @scala.inline
  implicit class BaseHighPrecisionDistanceOps[Self <: BaseHighPrecisionDistance] (val x: Self) extends AnyVal {
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
    def setHighPrecision(value: `true`): Self = this.set("highPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
  
}

