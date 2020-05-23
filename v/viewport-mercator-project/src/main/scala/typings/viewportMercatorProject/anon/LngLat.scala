package typings.viewportMercatorProject.anon

import typings.viewportMercatorProject.mod.Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LngLat extends js.Object {
  var lngLat: Coordinates
  var pos: Coordinates
}

object LngLat {
  @scala.inline
  def apply(lngLat: Coordinates, pos: Coordinates): LngLat = {
    val __obj = js.Dynamic.literal(lngLat = lngLat.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LngLat]
  }
}

