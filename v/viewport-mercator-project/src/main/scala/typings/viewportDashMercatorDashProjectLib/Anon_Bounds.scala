package typings
package viewportDashMercatorDashProjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bounds extends js.Object {
  var bounds: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Bounds
  var height: scala.Double
  var offset: js.UndefOr[
    viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates
  ] = js.undefined
  var padding: js.UndefOr[viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Padding] = js.undefined
  var width: scala.Double
}

object Anon_Bounds {
  @scala.inline
  def apply(
    bounds: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Bounds,
    height: scala.Double,
    width: scala.Double,
    offset: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates = null,
    padding: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Padding = null
  ): Anon_Bounds = {
    val __obj = js.Dynamic.literal(bounds = bounds, height = height, width = width)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bounds]
  }
}

