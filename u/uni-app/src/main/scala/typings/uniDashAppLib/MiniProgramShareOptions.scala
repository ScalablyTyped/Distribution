package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiniProgramShareOptions extends js.Object {
  /**
    * 微信小程序原始id
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 点击链接进入的页面
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 微信小程序版本类型，默认为0。
    * - 0: 正式版
    * - 1: 测试版
    * - 2: 体验版
    */
  var `type`: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.`0` | uniDashAppLib.uniDashAppLibStrings.`1` | uniDashAppLib.uniDashAppLibStrings.`2`
  ] = js.undefined
  /**
    * 兼容低版本的网页链接
    */
  var webUrl: js.UndefOr[java.lang.String] = js.undefined
}

object MiniProgramShareOptions {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    path: java.lang.String = null,
    `type`: uniDashAppLib.uniDashAppLibStrings.`0` | uniDashAppLib.uniDashAppLibStrings.`1` | uniDashAppLib.uniDashAppLibStrings.`2` = null,
    webUrl: java.lang.String = null
  ): MiniProgramShareOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[MiniProgramShareOptions]
  }
}

