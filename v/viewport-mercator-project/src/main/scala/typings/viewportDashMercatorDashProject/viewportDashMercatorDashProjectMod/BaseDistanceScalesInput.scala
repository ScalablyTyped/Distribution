package typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseDistanceScalesInput extends js.Object {
  var latitude: Double
  var longitude: Double
}

object BaseDistanceScalesInput {
  @scala.inline
  def apply(latitude: Double, longitude: Double): BaseDistanceScalesInput = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseDistanceScalesInput]
  }
}

