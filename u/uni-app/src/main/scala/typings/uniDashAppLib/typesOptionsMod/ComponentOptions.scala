package typings
package uniDashAppLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- uniDashAppLib.AppNs.AppInstance because var conflicts: onHide, onShow. Inlined onLaunch, onError, onPageNotFound, onUniNViewMessage */ trait ComponentOptions[V /* <: vueLib.typesVueMod.Vue */]
  extends uniDashAppLib.PageNs.PageInstance[js.Any, js.Any] {
  /**
    * 组件类型
    */
  var mpType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 错误监听函数
    * 小程序发生脚本错误或 API 调用报错时触发
    * @param error 错误信息，包含堆栈
    */
  var onError: js.UndefOr[js.Function1[/* error */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * 生命周期回调 监听应用初始化
    *
    * 应用初始化完成时触发，全局只触发一次。
    */
  var onLaunch: js.UndefOr[
    js.Function1[/* options */ js.UndefOr[uniDashAppLib.AppNs.LaunchShowOption], scala.Unit]
  ] = js.undefined
  /**
    * 页面不存在监听函数
    *
    * 应用要打开的页面不存在时触发，会带上页面信息回调该函数
    *
    * **注意：**
    * 1. 如果开发者没有添加 `onPageNotFound` 监听，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
    * 2. 如果 `onPageNotFound` 回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再回调 `onPageNotFound`。
    */
  var onPageNotFound: js.UndefOr[js.Function1[/* options */ uniDashAppLib.AppNs.PageNotFoundOption, scala.Unit]] = js.undefined
  /**
    * 监听 nvue 页面消息
    *
    * nvue 页面使用 `uni.postMessage` 发送消息时触发
    */
  var onUniNViewMessage: js.UndefOr[js.Function1[/* options */ uniDashAppLib.AnyObject, scala.Unit]] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: vueLib.typesVueMod.Vue */](
    mpType: java.lang.String = null,
    onBackPress: /* options */ uniDashAppLib.PageNs.BackPressOption => _ = null,
    onError: /* error */ java.lang.String => scala.Unit = null,
    onHide: () => scala.Unit = null,
    onLaunch: /* options */ js.UndefOr[uniDashAppLib.AppNs.LaunchShowOption] => scala.Unit = null,
    onLoad: /* query */ js.UndefOr[uniDashAppLib.AnyObject] => scala.Unit = null,
    onNavigationBarButtonTap: /* options */ uniDashAppLib.PageNs.NavigationBarButtonTapOption => scala.Unit = null,
    onNavigationBarSearchInputChanged: /* event */ uniDashAppLib.PageNs.NavigationBarSearchInputEvent => scala.Unit = null,
    onNavigationBarSearchInputClicked: () => scala.Unit = null,
    onNavigationBarSearchInputConfirmed: /* event */ uniDashAppLib.PageNs.NavigationBarSearchInputEvent => scala.Unit = null,
    onPageNotFound: /* options */ uniDashAppLib.AppNs.PageNotFoundOption => scala.Unit = null,
    onPageScroll: /* options */ uniDashAppLib.PageNs.PageScrollOption => scala.Unit = null,
    onPullDownRefresh: () => scala.Unit = null,
    onReachBottom: () => scala.Unit = null,
    onReady: () => scala.Unit = null,
    onResize: /* options */ uniDashAppLib.PageNs.PageScrollOption => scala.Unit = null,
    onShareAppMessage: /* options */ uniDashAppLib.PageNs.ShareAppMessageOption => uniDashAppLib.PageNs.CustomShareContent = null,
    onShow: () => scala.Unit = null,
    onTabItemTap: /* options */ uniDashAppLib.PageNs.TabItemTapOption => scala.Unit = null,
    onUniNViewMessage: /* options */ uniDashAppLib.AnyObject => scala.Unit = null,
    onUnload: () => scala.Unit = null,
    route: java.lang.String = null
  ): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (mpType != null) __obj.updateDynamic("mpType")(mpType)
    if (onBackPress != null) __obj.updateDynamic("onBackPress")(js.Any.fromFunction1(onBackPress))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onLaunch != null) __obj.updateDynamic("onLaunch")(js.Any.fromFunction1(onLaunch))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onNavigationBarButtonTap != null) __obj.updateDynamic("onNavigationBarButtonTap")(js.Any.fromFunction1(onNavigationBarButtonTap))
    if (onNavigationBarSearchInputChanged != null) __obj.updateDynamic("onNavigationBarSearchInputChanged")(js.Any.fromFunction1(onNavigationBarSearchInputChanged))
    if (onNavigationBarSearchInputClicked != null) __obj.updateDynamic("onNavigationBarSearchInputClicked")(js.Any.fromFunction0(onNavigationBarSearchInputClicked))
    if (onNavigationBarSearchInputConfirmed != null) __obj.updateDynamic("onNavigationBarSearchInputConfirmed")(js.Any.fromFunction1(onNavigationBarSearchInputConfirmed))
    if (onPageNotFound != null) __obj.updateDynamic("onPageNotFound")(js.Any.fromFunction1(onPageNotFound))
    if (onPageScroll != null) __obj.updateDynamic("onPageScroll")(js.Any.fromFunction1(onPageScroll))
    if (onPullDownRefresh != null) __obj.updateDynamic("onPullDownRefresh")(js.Any.fromFunction0(onPullDownRefresh))
    if (onReachBottom != null) __obj.updateDynamic("onReachBottom")(js.Any.fromFunction0(onReachBottom))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction0(onReady))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onShareAppMessage != null) __obj.updateDynamic("onShareAppMessage")(js.Any.fromFunction1(onShareAppMessage))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (onTabItemTap != null) __obj.updateDynamic("onTabItemTap")(js.Any.fromFunction1(onTabItemTap))
    if (onUniNViewMessage != null) __obj.updateDynamic("onUniNViewMessage")(js.Any.fromFunction1(onUniNViewMessage))
    if (onUnload != null) __obj.updateDynamic("onUnload")(js.Any.fromFunction0(onUnload))
    if (route != null) __obj.updateDynamic("route")(route)
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

