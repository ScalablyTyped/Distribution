package typings.viewportMercatorProject.anon

import typings.viewportMercatorProject.mod.Coordinates
import typings.viewportMercatorProject.mod.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var offset: js.UndefOr[Coordinates] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
}

object Offset {
  @scala.inline
  def apply(offset: Coordinates = null, padding: Padding = null): Offset = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

