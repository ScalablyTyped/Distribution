package typings.viewportDashMercatorDashProject

import typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod.Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LngLat extends js.Object {
  var lngLat: Coordinates
  var pos: Coordinates
}

object Anon_LngLat {
  @scala.inline
  def apply(lngLat: Coordinates, pos: Coordinates): Anon_LngLat = {
    val __obj = js.Dynamic.literal(lngLat = lngLat, pos = pos)
  
    __obj.asInstanceOf[Anon_LngLat]
  }
}

