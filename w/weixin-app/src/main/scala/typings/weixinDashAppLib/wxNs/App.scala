package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  /**
  		 * 获取当前页面
  		 */
  def getCurrentPage(): Page[js.Object, js.Object]
}

object App {
  @scala.inline
  def apply(getCurrentPage: js.Function0[Page[js.Object, js.Object]]): App = {
    val __obj = js.Dynamic.literal(getCurrentPage = getCurrentPage)
  
    __obj.asInstanceOf[App]
  }
}

