package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReLaunchOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要跳转的应用内页面路径 , 路径后可以带参数。
  		 * 参数与路径之间使用?分隔，参数键与参数值用=相连，不同参数用&分隔
  		 * 如 'path?key=value&key2=value2'，如果跳转的页面路径是 tabBar 页面则不能带参数
  		 */
  var url: java.lang.String
}

object ReLaunchOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): ReLaunchOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ReLaunchOptions]
  }
}

