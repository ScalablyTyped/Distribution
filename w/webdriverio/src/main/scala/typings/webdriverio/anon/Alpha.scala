package typings.webdriverio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alpha extends js.Object {
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

object Alpha {
  @scala.inline
  def apply(
    string: String,
    alpha: js.UndefOr[Double] = js.undefined,
    hex: String = null,
    rgba: String = null,
    `type`: String = null,
    unit: String = null,
    value: js.Any = null
  ): Alpha = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (hex != null) __obj.updateDynamic("hex")(hex.asInstanceOf[js.Any])
    if (rgba != null) __obj.updateDynamic("rgba")(rgba.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha]
  }
}

