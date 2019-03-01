package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseViewportProps extends js.Object {
  var height: scala.Double
  var latitude: scala.Double
  var longitude: scala.Double
  var width: scala.Double
  var zoom: scala.Double
}

object BaseViewportProps {
  @scala.inline
  def apply(
    height: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    width: scala.Double,
    zoom: scala.Double
  ): BaseViewportProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[BaseViewportProps]
  }
}

