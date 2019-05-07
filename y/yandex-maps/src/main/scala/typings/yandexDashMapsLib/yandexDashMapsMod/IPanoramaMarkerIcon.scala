package typings
package yandexDashMapsLib.yandexDashMapsMod

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
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], offset = offset)
  
    __obj.asInstanceOf[IPanoramaMarkerIcon]
  }
}

