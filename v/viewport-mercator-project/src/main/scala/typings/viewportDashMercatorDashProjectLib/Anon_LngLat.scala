package typings
package viewportDashMercatorDashProjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LngLat extends js.Object {
  var lngLat: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates
  var pos: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates
}

object Anon_LngLat {
  @scala.inline
  def apply(
    lngLat: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates,
    pos: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates
  ): Anon_LngLat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lngLat")(lngLat)
    __obj.updateDynamic("pos")(pos)
    __obj.asInstanceOf[Anon_LngLat]
  }
}

