package typings.viewportMercatorProject

import typings.viewportMercatorProject.mod.Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLngLat extends js.Object {
  var lngLat: Coordinates
  var pos: Coordinates
}

object AnonLngLat {
  @scala.inline
  def apply(lngLat: Coordinates, pos: Coordinates): AnonLngLat = {
    val __obj = js.Dynamic.literal(lngLat = lngLat.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLngLat]
  }
}

