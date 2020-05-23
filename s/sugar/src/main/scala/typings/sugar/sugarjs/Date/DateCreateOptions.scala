package typings.sugar.sugarjs.Date

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
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fromUTC)) __obj.updateDynamic("fromUTC")(fromUTC.get.asInstanceOf[js.Any])
    if (!js.isUndefined(future)) __obj.updateDynamic("future")(future.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(past)) __obj.updateDynamic("past")(past.get.asInstanceOf[js.Any])
    if (!js.isUndefined(setUTC)) __obj.updateDynamic("setUTC")(setUTC.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateCreateOptions]
  }
}

