package typings
package webdriverioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alpha extends js.Object {
  var alpha: js.UndefOr[scala.Double] = js.undefined
  // color
  var hex: js.UndefOr[java.lang.String] = js.undefined
  var rgba: js.UndefOr[java.lang.String] = js.undefined
  var string: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  // other
  var unit: js.UndefOr[java.lang.String] = js.undefined
  // font-family
  var value: js.UndefOr[js.Any] = js.undefined
}

object Anon_Alpha {
  @scala.inline
  def apply(
    string: java.lang.String,
    alpha: scala.Int | scala.Double = null,
    hex: java.lang.String = null,
    rgba: java.lang.String = null,
    `type`: java.lang.String = null,
    unit: java.lang.String = null,
    value: js.Any = null
  ): Anon_Alpha = {
    val __obj = js.Dynamic.literal(string = string)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (hex != null) __obj.updateDynamic("hex")(hex)
    if (rgba != null) __obj.updateDynamic("rgba")(rgba)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Alpha]
  }
}

