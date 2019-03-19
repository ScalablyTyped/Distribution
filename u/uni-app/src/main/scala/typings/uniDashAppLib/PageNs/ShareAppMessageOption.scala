package typings
package uniDashAppLib.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareAppMessageOption extends js.Object {
  /**
    * 转发事件来源。
    * 可选值：
    * - `button`：页面内转发按钮；
    * - `menu`：右上角转发菜单。
    *
    */
  var from: uniDashAppLib.uniDashAppLibStrings.button | uniDashAppLib.uniDashAppLibStrings.menu | java.lang.String
  /**
    * 如果 `from` 值是 `button`，则 `target` 是触发这次转发事件的 `button`，否则为 `undefined`
    */
  var target: js.Any
  /**
    * 页面中包含`<web-view>`组件时，返回当前`<web-view>`的url
    */
  var webViewUrl: js.UndefOr[java.lang.String] = js.undefined
}

object ShareAppMessageOption {
  @scala.inline
  def apply(
    from: uniDashAppLib.uniDashAppLibStrings.button | uniDashAppLib.uniDashAppLibStrings.menu | java.lang.String,
    target: js.Any,
    webViewUrl: java.lang.String = null
  ): ShareAppMessageOption = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], target = target)
    if (webViewUrl != null) __obj.updateDynamic("webViewUrl")(webViewUrl)
    __obj.asInstanceOf[ShareAppMessageOption]
  }
}

