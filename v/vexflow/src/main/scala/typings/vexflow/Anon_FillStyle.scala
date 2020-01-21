package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FillStyle extends js.Object {
  var fillStyle: js.UndefOr[String] = js.undefined
  var shadowBlur: js.UndefOr[String] = js.undefined
  var shadowColor: js.UndefOr[String] = js.undefined
  var strokeStyle: js.UndefOr[String] = js.undefined
}

object Anon_FillStyle {
  @scala.inline
  def apply(
    fillStyle: String = null,
    shadowBlur: String = null,
    shadowColor: String = null,
    strokeStyle: String = null
  ): Anon_FillStyle = {
    val __obj = js.Dynamic.literal()
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FillStyle]
  }
}

