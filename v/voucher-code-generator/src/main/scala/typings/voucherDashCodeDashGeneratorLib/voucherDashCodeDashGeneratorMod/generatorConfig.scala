package typings
package voucherDashCodeDashGeneratorLib.voucherDashCodeDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait generatorConfig extends js.Object {
  var charset: js.UndefOr[java.lang.String] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var postfix: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object generatorConfig {
  @scala.inline
  def apply(
    charset: java.lang.String = null,
    count: scala.Int | scala.Double = null,
    length: scala.Int | scala.Double = null,
    pattern: java.lang.String = null,
    postfix: java.lang.String = null,
    prefix: java.lang.String = null
  ): generatorConfig = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (postfix != null) __obj.updateDynamic("postfix")(postfix)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[generatorConfig]
  }
}

