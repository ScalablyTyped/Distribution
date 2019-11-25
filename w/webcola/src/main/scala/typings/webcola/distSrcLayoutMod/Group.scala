package typings.webcola.distSrcLayoutMod

import typings.webcola.distSrcRectangleMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var bounds: js.UndefOr[Rectangle] = js.undefined
  var groups: js.UndefOr[js.Array[Group]] = js.undefined
  var leaves: js.UndefOr[js.Array[Node]] = js.undefined
  var padding: Double
}

object Group {
  @scala.inline
  def apply(
    padding: Double,
    bounds: Rectangle = null,
    groups: js.Array[Group] = null,
    leaves: js.Array[Node] = null
  ): Group = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (leaves != null) __obj.updateDynamic("leaves")(leaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

