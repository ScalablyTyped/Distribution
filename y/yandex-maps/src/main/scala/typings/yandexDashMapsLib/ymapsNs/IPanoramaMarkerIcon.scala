package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaMarkerIcon extends js.Object {
  var image: stdLib.HTMLCanvasElement | stdLib.HTMLImageElement
  var offset: js.Array[scala.Double]
}

object IPanoramaMarkerIcon {
  @scala.inline
  def apply(image: stdLib.HTMLCanvasElement | stdLib.HTMLImageElement, offset: js.Array[scala.Double]): IPanoramaMarkerIcon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[IPanoramaMarkerIcon]
  }
}

