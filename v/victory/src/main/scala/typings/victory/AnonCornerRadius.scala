package typings.victory

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCornerRadius extends js.Object {
  var cornerRadius: js.UndefOr[Double] = js.undefined
  var flyoutStyle: js.UndefOr[CSSProperties] = js.undefined
  var pointerLength: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object AnonCornerRadius {
  @scala.inline
  def apply(
    cornerRadius: Int | Double = null,
    flyoutStyle: CSSProperties = null,
    pointerLength: Int | Double = null,
    style: CSSProperties = null
  ): AnonCornerRadius = {
    val __obj = js.Dynamic.literal()
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (flyoutStyle != null) __obj.updateDynamic("flyoutStyle")(flyoutStyle.asInstanceOf[js.Any])
    if (pointerLength != null) __obj.updateDynamic("pointerLength")(pointerLength.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCornerRadius]
  }
}

