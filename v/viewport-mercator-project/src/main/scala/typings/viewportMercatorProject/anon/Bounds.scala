package typings.viewportMercatorProject.anon

import typings.viewportMercatorProject.mod.Coordinates
import typings.viewportMercatorProject.mod.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  var bounds: typings.viewportMercatorProject.mod.Bounds
  var height: Double
  var offset: js.UndefOr[Coordinates] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var width: Double
}

object Bounds {
  @scala.inline
  def apply(
    bounds: typings.viewportMercatorProject.mod.Bounds,
    height: Double,
    width: Double,
    offset: Coordinates = null,
    padding: Padding = null
  ): Bounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
}

