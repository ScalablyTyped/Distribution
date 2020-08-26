package typings.wechatMiniprogram.WechatMiniprogram.Page

import typings.wechatMiniprogram.wechatMiniprogramStrings.button
import typings.wechatMiniprogram.wechatMiniprogramStrings.menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShareAppMessageOption extends js.Object {
  /** 转发事件来源。
    *
    * 可选值：
    * - `button`：页面内转发按钮；
    * - `menu`：右上角转发菜单。
    *
    * 最低基础库： `1.2.4`
    */
  var from: button | menu | String = js.native
  /** 如果 `from` 值是 `button`，则 `target` 是触发这次转发事件的 `button`，否则为 `undefined`
    *
    * 最低基础库： `1.2.4` */
  var target: js.Any = js.native
  /** 页面中包含`<web-view>`组件时，返回当前`<web-view>`的url
    *
    * 最低基础库： `1.6.4`
    */
  var webViewUrl: js.UndefOr[String] = js.native
}

object IShareAppMessageOption {
  @scala.inline
  def apply(from: button | menu | String, target: js.Any): IShareAppMessageOption = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShareAppMessageOption]
  }
  @scala.inline
  implicit class IShareAppMessageOptionOps[Self <: IShareAppMessageOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFrom(value: button | menu | String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebViewUrl(value: String): Self = this.set("webViewUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebViewUrl: Self = this.set("webViewUrl", js.undefined)
  }
  
}

