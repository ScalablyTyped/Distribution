package typings.viewportDashMercatorDashProject

import typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod.Coordinates
import typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  var offset: js.UndefOr[Coordinates] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
}

object Anon_Offset {
  @scala.inline
  def apply(offset: Coordinates = null, padding: Padding = null): Anon_Offset = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Offset]
  }
}

