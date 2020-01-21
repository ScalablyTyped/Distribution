package typings.uniApp

import typings.uniApp.uniAppStrings.`0`
import typings.uniApp.uniAppStrings.`1`
import typings.uniApp.uniAppStrings.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiniProgramShareOptions extends js.Object {
  /**
    * 微信小程序原始id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * 点击链接进入的页面
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * 微信小程序版本类型，默认为0。
    * - 0: 正式版
    * - 1: 测试版
    * - 2: 体验版
    */
  var `type`: js.UndefOr[`0` | `1` | `2`] = js.undefined
  /**
    * 兼容低版本的网页链接
    */
  var webUrl: js.UndefOr[String] = js.undefined
}

object MiniProgramShareOptions {
  @scala.inline
  def apply(id: String = null, path: String = null, `type`: `0` | `1` | `2` = null, webUrl: String = null): MiniProgramShareOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiniProgramShareOptions]
  }
}

