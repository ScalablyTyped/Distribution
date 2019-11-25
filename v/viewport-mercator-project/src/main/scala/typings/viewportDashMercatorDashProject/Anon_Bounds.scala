package typings.viewportDashMercatorDashProject

import typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod.Bounds
import typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod.Coordinates
import typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bounds extends js.Object {
  var bounds: Bounds
  var height: Double
  var offset: js.UndefOr[Coordinates] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var width: Double
}

object Anon_Bounds {
  @scala.inline
  def apply(bounds: Bounds, height: Double, width: Double, offset: Coordinates = null, padding: Padding = null): Anon_Bounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bounds]
  }
}

