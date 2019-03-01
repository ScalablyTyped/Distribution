package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseDistanceScalesInput extends js.Object {
  var latitude: scala.Double
  var longitude: scala.Double
}

object BaseDistanceScalesInput {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): BaseDistanceScalesInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.asInstanceOf[BaseDistanceScalesInput]
  }
}

