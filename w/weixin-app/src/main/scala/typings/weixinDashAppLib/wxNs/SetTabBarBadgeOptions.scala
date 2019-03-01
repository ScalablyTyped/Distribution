package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTabBarBadgeOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * tabBar的哪一项，从左边算起
  		 */
  var index: scala.Double
  /**
  		 * 显示的文本，超过 3 个字符则显示成“…”
  		 */
  var text: java.lang.String
}

object SetTabBarBadgeOptions {
  @scala.inline
  def apply(
    index: scala.Double,
    text: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): SetTabBarBadgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("text")(text)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SetTabBarBadgeOptions]
  }
}

