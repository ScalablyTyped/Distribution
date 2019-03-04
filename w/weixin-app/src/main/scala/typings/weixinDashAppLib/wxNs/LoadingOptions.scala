package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 是否显示透明蒙层，防止触摸穿透，默认：false
  		 */
  var mask: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * 提示的内容
  		 */
  var title: java.lang.String
}

object LoadingOptions {
  @scala.inline
  def apply(
    title: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    mask: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function1[js.Any, scala.Unit] = null
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal(title = title)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[LoadingOptions]
  }
}

