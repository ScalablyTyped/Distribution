package typings
package tetherLib.tetherMod.TetherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITetherConstraint extends js.Object {
  var attachment: js.UndefOr[java.lang.String] = js.undefined
  var outOfBoundsClass: js.UndefOr[java.lang.String] = js.undefined
  var pin: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var pinnedClass: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String | stdLib.HTMLElement | js.Array[scala.Double]] = js.undefined
}

object ITetherConstraint {
  @scala.inline
  def apply(
    attachment: java.lang.String = null,
    outOfBoundsClass: java.lang.String = null,
    pin: scala.Boolean | js.Array[java.lang.String] = null,
    pinnedClass: java.lang.String = null,
    to: java.lang.String | stdLib.HTMLElement | js.Array[scala.Double] = null
  ): ITetherConstraint = {
    val __obj = js.Dynamic.literal()
    if (attachment != null) __obj.updateDynamic("attachment")(attachment)
    if (outOfBoundsClass != null) __obj.updateDynamic("outOfBoundsClass")(outOfBoundsClass)
    if (pin != null) __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
    if (pinnedClass != null) __obj.updateDynamic("pinnedClass")(pinnedClass)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITetherConstraint]
  }
}

