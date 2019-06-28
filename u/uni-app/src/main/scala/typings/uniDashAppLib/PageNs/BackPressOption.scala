package typings
package uniDashAppLib.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackPressOption extends js.Object {
  /**
    * - backbutton 顶部导航栏左边的返回按钮或 Android 实体返回键
    * - navigateBack 返回 API，即 uni.navigateBack()
    */
  var from: uniDashAppLib.uniDashAppLibStrings.backbutton | uniDashAppLib.uniDashAppLibStrings.navigateBack
}

object BackPressOption {
  @scala.inline
  def apply(
    from: uniDashAppLib.uniDashAppLibStrings.backbutton | uniDashAppLib.uniDashAppLibStrings.navigateBack
  ): BackPressOption = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BackPressOption]
  }
}

