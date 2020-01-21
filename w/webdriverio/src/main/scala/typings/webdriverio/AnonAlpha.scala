package typings.webdriverio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlpha extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  // color
  var hex: js.UndefOr[String] = js.undefined
  var rgba: js.UndefOr[String] = js.undefined
  var string: String
  var `type`: js.UndefOr[String] = js.undefined
  // other
  var unit: js.UndefOr[String] = js.undefined
  // font-family
  var value: js.UndefOr[js.Any] = js.undefined
}

object AnonAlpha {
  @scala.inline
  def apply(
    string: String,
    alpha: Int | Double = null,
    hex: String = null,
    rgba: String = null,
    `type`: String = null,
    unit: String = null,
    value: js.Any = null
  ): AnonAlpha = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (hex != null) __obj.updateDynamic("hex")(hex.asInstanceOf[js.Any])
    if (rgba != null) __obj.updateDynamic("rgba")(rgba.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlpha]
  }
}

