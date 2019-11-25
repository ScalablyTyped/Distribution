package typings.uniDashApp.Page

import typings.uniDashApp.uniDashAppStrings.button
import typings.uniDashApp.uniDashAppStrings.menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareAppMessageOption extends js.Object {
  /**
    * 转发事件来源。
    * 可选值：
    * - `button`：页面内转发按钮；
    * - `menu`：右上角转发菜单。
    */
  var from: button | menu
  /**
    * 如果 `from` 值是 `button`，则 `target` 是触发这次转发事件的 `button`，否则为 `undefined`
    */
  var target: js.Any
  /**
    * 页面中包含 `<web-view>` 组件时，返回当前 `<web-view>` 的url
    */
  var webViewUrl: js.UndefOr[String] = js.undefined
}

object ShareAppMessageOption {
  @scala.inline
  def apply(from: button | menu, target: js.Any, webViewUrl: String = null): ShareAppMessageOption = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (webViewUrl != null) __obj.updateDynamic("webViewUrl")(webViewUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareAppMessageOption]
  }
}

