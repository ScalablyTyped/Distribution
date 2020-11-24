package typings.wechatMiniprogram.WechatMiniprogram.App

import typings.wechatMiniprogram.WechatMiniprogram.OnThemeChangeCallback
import typings.wechatMiniprogram.WechatMiniprogram.OnThemeChangeCallbackResult
import typings.wechatMiniprogram.WechatMiniprogram.OnUnhandledRejectionCallback
import typings.wechatMiniprogram.WechatMiniprogram.OnUnhandledRejectionCallbackResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends js.Object {
  
  /** 错误监听函数
    *
    * 小程序发生脚本错误，或者 api
    */
  def onError(/** 错误信息，包含堆栈 */ error: String): Unit = js.native
  
  /** 生命周期回调—监听小程序隐藏
    *
    * 小程序从前台进入后台时
    */
  def onHide(): Unit = js.native
  
  /** 生命周期回调—监听小程序初始化
    *
    * 小程序初始化完成时触发，全局只触发一次。
    */
  def onLaunch(options: LaunchShowOption): Unit = js.native
  
  /** 页面不存在监听函数
    *
    * 小程序要打开的页面不存在时触发，会带上页面信息回调该函数
    *
    * **注意：**
    * 1. 如果开发者没有添加 `onPageNotFound` 监听，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
    * 2. 如果 `onPageNotFound` 回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再回调 `onPageNotFound`。
    *
    * 最低基础库： 1.9.90
    */
  def onPageNotFound(options: PageNotFoundOption): Unit = js.native
  
  /** 生命周期回调—监听小程序显示
    *
    * 小程序启动，或从后台进入前台显示时
    */
  def onShow(options: LaunchShowOption): Unit = js.native
  
  /**
    * 系统切换主题时触发。也可以使用 wx.onThemeChange 绑定监听。
    *
    * 最低基础库： 2.11.0
    */
  def onThemeChange(result: OnThemeChangeCallbackResult): Unit = js.native
  /**
    * 系统切换主题时触发。也可以使用 wx.onThemeChange 绑定监听。
    *
    * 最低基础库： 2.11.0
    */
  @JSName("onThemeChange")
  var onThemeChange_Original: OnThemeChangeCallback = js.native
  
  /**
    * 小程序有未处理的 Promise 拒绝时触发。也可以使用 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 绑定监听。注意事项请参考 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html)。
    * **参数**：与 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 一致
    */
  def onUnhandledRejection(result: OnUnhandledRejectionCallbackResult): Unit = js.native
  /**
    * 小程序有未处理的 Promise 拒绝时触发。也可以使用 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 绑定监听。注意事项请参考 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html)。
    * **参数**：与 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 一致
    */
  @JSName("onUnhandledRejection")
  var onUnhandledRejection_Original: OnUnhandledRejectionCallback = js.native
}
