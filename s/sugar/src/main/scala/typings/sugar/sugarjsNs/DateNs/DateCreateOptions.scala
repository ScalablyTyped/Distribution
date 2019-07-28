package typings.sugar.sugarjsNs.DateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateCreateOptions extends js.Object {
  @JSName("clone")
  var clone_FDateCreateOptions: js.UndefOr[Boolean] = js.undefined
  var fromUTC: js.UndefOr[Boolean] = js.undefined
  var future: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var past: js.UndefOr[Boolean] = js.undefined
  var setUTC: js.UndefOr[Boolean] = js.undefined
}

object DateCreateOptions {
  @scala.inline
  def apply(
    clone: js.UndefOr[Boolean] = js.undefined,
    fromUTC: js.UndefOr[Boolean] = js.undefined,
    future: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    params: js.Object = null,
    past: js.UndefOr[Boolean] = js.undefined,
    setUTC: js.UndefOr[Boolean] = js.undefined
  ): DateCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone)
    if (!js.isUndefined(fromUTC)) __obj.updateDynamic("fromUTC")(fromUTC)
    if (!js.isUndefined(future)) __obj.updateDynamic("future")(future)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (params != null) __obj.updateDynamic("params")(params)
    if (!js.isUndefined(past)) __obj.updateDynamic("past")(past)
    if (!js.isUndefined(setUTC)) __obj.updateDynamic("setUTC")(setUTC)
    __obj.asInstanceOf[DateCreateOptions]
  }
}

