package typings.uniDashApp.Page

import typings.uniDashApp.uniDashAppStrings.backbutton
import typings.uniDashApp.uniDashAppStrings.navigateBack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackPressOption extends js.Object {
  /**
    * - backbutton 顶部导航栏左边的返回按钮或 Android 实体返回键
    * - navigateBack 返回 API，即 uni.navigateBack()
    */
  var from: backbutton | navigateBack
}

object BackPressOption {
  @scala.inline
  def apply(from: backbutton | navigateBack): BackPressOption = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BackPressOption]
  }
}

