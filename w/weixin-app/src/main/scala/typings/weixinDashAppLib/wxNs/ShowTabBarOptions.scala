package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowTabBarOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 是否需要动画效果，默认无 */
  var aniamtion: js.UndefOr[scala.Boolean] = js.undefined
}

object ShowTabBarOptions {
  @scala.inline
  def apply(
    aniamtion: js.UndefOr[scala.Boolean] = js.undefined,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): ShowTabBarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aniamtion)) __obj.updateDynamic("aniamtion")(aniamtion)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ShowTabBarOptions]
  }
}

