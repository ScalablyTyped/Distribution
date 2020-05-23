package typings.victory.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CornerRadius extends js.Object {
  var cornerRadius: js.UndefOr[Double] = js.undefined
  var flyoutStyle: js.UndefOr[CSSProperties] = js.undefined
  var pointerLength: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CornerRadius {
  @scala.inline
  def apply(
    cornerRadius: js.UndefOr[Double] = js.undefined,
    flyoutStyle: CSSProperties = null,
    pointerLength: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null
  ): CornerRadius = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cornerRadius)) __obj.updateDynamic("cornerRadius")(cornerRadius.get.asInstanceOf[js.Any])
    if (flyoutStyle != null) __obj.updateDynamic("flyoutStyle")(flyoutStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(pointerLength)) __obj.updateDynamic("pointerLength")(pointerLength.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CornerRadius]
  }
}

