package typings.voucherDashCodeDashGenerator.voucherDashCodeDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait generatorConfig extends js.Object {
  var charset: js.UndefOr[String] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var postfix: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object generatorConfig {
  @scala.inline
  def apply(
    charset: String = null,
    count: Int | Double = null,
    length: Int | Double = null,
    pattern: String = null,
    postfix: String = null,
    prefix: String = null
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

