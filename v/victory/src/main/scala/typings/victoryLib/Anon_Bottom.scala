package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var bottom: js.UndefOr[scala.Double | victoryLib.victoryMod.NumberOrCallback] = js.undefined
  var bottomLeft: js.UndefOr[scala.Double | victoryLib.victoryMod.NumberOrCallback] = js.undefined
  var bottomRight: js.UndefOr[scala.Double | victoryLib.victoryMod.NumberOrCallback] = js.undefined
  var top: js.UndefOr[scala.Double | victoryLib.victoryMod.NumberOrCallback] = js.undefined
  var topLeft: js.UndefOr[scala.Double | victoryLib.victoryMod.NumberOrCallback] = js.undefined
  var topRight: js.UndefOr[scala.Double | victoryLib.victoryMod.NumberOrCallback] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    bottom: scala.Double | victoryLib.victoryMod.NumberOrCallback = null,
    bottomLeft: scala.Double | victoryLib.victoryMod.NumberOrCallback = null,
    bottomRight: scala.Double | victoryLib.victoryMod.NumberOrCallback = null,
    top: scala.Double | victoryLib.victoryMod.NumberOrCallback = null,
    topLeft: scala.Double | victoryLib.victoryMod.NumberOrCallback = null,
    topRight: scala.Double | victoryLib.victoryMod.NumberOrCallback = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft.asInstanceOf[js.Any])
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft.asInstanceOf[js.Any])
    if (topRight != null) __obj.updateDynamic("topRight")(topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

