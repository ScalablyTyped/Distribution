package typings.viewportMercatorProject.anon

import typings.viewportMercatorProject.mod.DistanceScalesInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined viewport-mercator-project.viewport-mercator-project.BaseDistanceScalesInput & {  scale  :number} */
trait BaseDistanceScalesInputsc extends DistanceScalesInput {
  var latitude: Double
  var longitude: Double
  var scale: Double
}

object BaseDistanceScalesInputsc {
  @scala.inline
  def apply(latitude: Double, longitude: Double, scale: Double): BaseDistanceScalesInputsc = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDistanceScalesInputsc]
  }
}

