package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.develop
import typings.wechatMiniprogram.wechatMiniprogramStrings.release
import typings.wechatMiniprogram.wechatMiniprogramStrings.trial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigateToMiniProgramOption extends js.Object {
  /** 要打开的小程序 appId */
  var appId: String = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[NavigateToMiniProgramCompleteCallback] = js.native
  /** 要打开的小程序版本。仅在当前小程序为开发版或体验版时此参数有效。如果当前小程序是正式版，则打开的小程序必定是正式版。
    *
    * 可选值：
    * - 'develop': 开发版;
    * - 'trial': 体验版;
    * - 'release': 正式版; */
  var envVersion: js.UndefOr[develop | trial | release] = js.native
  /** 需要传递给目标小程序的数据，目标小程序可在 `App.onLaunch`，`App.onShow` 中获取到这份数据。如果跳转的是小游戏，可以在 [wx.onShow](#)、[wx.getLaunchOptionsSync](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/life-cycle/wx.getLaunchOptionsSync.html) 中可以获取到这份数据数据。 */
  var extraData: js.UndefOr[IAnyObject] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[NavigateToMiniProgramFailCallback] = js.native
  /** 打开的页面路径，如果为空则打开首页。path 中 ? 后面的部分会成为 query，在小程序的 `App.onLaunch`、`App.onShow` 和 `Page.onLoad` 的回调函数或小游戏的 [wx.onShow](#) 回调函数、[wx.getLaunchOptionsSync](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/life-cycle/wx.getLaunchOptionsSync.html) 中可以获取到 query 数据。对于小游戏，可以只传入 query 部分，来实现传参效果，如：传入 "?foo=bar"。 */
  var path: js.UndefOr[String] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[NavigateToMiniProgramSuccessCallback] = js.native
}

object NavigateToMiniProgramOption {
  @scala.inline
  def apply(appId: String): NavigateToMiniProgramOption = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToMiniProgramOption]
  }
  @scala.inline
  implicit class NavigateToMiniProgramOptionOps[Self <: NavigateToMiniProgramOption] (val x: Self) extends AnyVal {
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setEnvVersion(value: develop | trial | release): Self = this.set("envVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvVersion: Self = this.set("envVersion", js.undefined)
    @scala.inline
    def setExtraData(value: IAnyObject): Self = this.set("extraData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraData: Self = this.set("extraData", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

