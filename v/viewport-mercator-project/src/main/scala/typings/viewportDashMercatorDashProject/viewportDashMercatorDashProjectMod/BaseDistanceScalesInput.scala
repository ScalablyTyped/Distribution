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
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[BaseDistanceScalesInput]
  }
}

