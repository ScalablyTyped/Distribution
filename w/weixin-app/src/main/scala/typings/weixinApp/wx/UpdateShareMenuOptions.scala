package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateShareMenuOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 是否使用带 shareTicket 的转发详情 */
  var withShareTicket: js.UndefOr[Boolean] = js.undefined
}

object UpdateShareMenuOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null,
    withShareTicket: js.UndefOr[Boolean] = js.undefined
  ): UpdateShareMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(withShareTicket)) __obj.updateDynamic("withShareTicket")(withShareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateShareMenuOptions]
  }
}

