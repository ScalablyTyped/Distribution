package typings.uniDashApp.AppNs

import typings.uniDashApp.AnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppInstance[T /* <: AnyObject */] extends js.Object {
  /**
    * 全局对象
    */
  var globalData: js.UndefOr[AnyObject] = js.undefined
  /**
    * 错误监听函数
    * 小程序发生脚本错误或 API 调用报错时触发
    * @param error 错误信息，包含堆栈
    */
  var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
  /**
    * 生命周期回调 监听应用隐藏
    *
    * 应用从前台进入后台时触发
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 生命周期回调 监听应用初始化
    *
    * 应用初始化完成时触发，全局只触发一次。
    */
  var onLaunch: js.UndefOr[js.Function1[/* options */ js.UndefOr[LaunchShowOption], Unit]] = js.undefined
  /**
    * 页面不存在监听函数
    *
    * 应用要打开的页面不存在时触发，会带上页面信息回调该函数
    *
    * **注意：**
    * 1. 如果开发者没有添加 `onPageNotFound` 监听，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
    * 2. 如果 `onPageNotFound` 回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再回调 `onPageNotFound`。
    */
  var onPageNotFound: js.UndefOr[js.Function1[/* options */ PageNotFoundOption, Unit]] = js.undefined
  /**
    * 生命周期回调 监听应用显示
    *
    * 应用启动，或从后台进入前台显示时触发
    */
  var onShow: js.UndefOr[js.Function1[/* options */ js.UndefOr[LaunchShowOption], Unit]] = js.undefined
  /**
    * 监听 nvue 页面消息
    *
    * nvue 页面使用 `uni.postMessage` 发送消息时触发
    */
  var onUniNViewMessage: js.UndefOr[js.Function1[/* options */ AnyObject, Unit]] = js.undefined
}

object AppInstance {
  @scala.inline
  def apply[T /* <: AnyObject */](
    globalData: AnyObject = null,
    onError: /* error */ String => Unit = null,
    onHide: () => Unit = null,
    onLaunch: /* options */ js.UndefOr[LaunchShowOption] => Unit = null,
    onPageNotFound: /* options */ PageNotFoundOption => Unit = null,
    onShow: /* options */ js.UndefOr[LaunchShowOption] => Unit = null,
    onUniNViewMessage: /* options */ AnyObject => Unit = null
  ): AppInstance[T] = {
    val __obj = js.Dynamic.literal()
    if (globalData != null) __obj.updateDynamic("globalData")(globalData)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onLaunch != null) __obj.updateDynamic("onLaunch")(js.Any.fromFunction1(onLaunch))
    if (onPageNotFound != null) __obj.updateDynamic("onPageNotFound")(js.Any.fromFunction1(onPageNotFound))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (onUniNViewMessage != null) __obj.updateDynamic("onUniNViewMessage")(js.Any.fromFunction1(onUniNViewMessage))
    __obj.asInstanceOf[AppInstance[T]]
  }
}

