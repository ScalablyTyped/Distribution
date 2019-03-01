package typings
package viewportDashMercatorDashProjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  var offset: js.UndefOr[
    viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates
  ] = js.undefined
  var padding: js.UndefOr[viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Padding] = js.undefined
}

object Anon_Offset {
  @scala.inline
  def apply(
    offset: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Coordinates = null,
    padding: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.Padding = null
  ): Anon_Offset = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Offset]
  }
}

