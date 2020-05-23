package typings.uniApp.mod

import typings.uniApp.AnyObject
import typings.uniApp.App.LaunchShowOption
import typings.uniApp.App.PageNotFoundOption
import typings.uniApp.Page.BackPressOption
import typings.uniApp.Page.CustomShareContent
import typings.uniApp.Page.NavigationBarButtonTapOption
import typings.uniApp.Page.NavigationBarSearchInputEvent
import typings.uniApp.Page.PageInstance
import typings.uniApp.Page.PageScrollOption
import typings.uniApp.Page.ShareAppMessageOption
import typings.uniApp.Page.TabItemTapOption
import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.uniApp.App.AppInstance because var conflicts: onHide, onShow. Inlined globalData, onLaunch, onError, onPageNotFound, onUniNViewMessage */ trait ComponentOptions[V /* <: Vue */]
  extends PageInstance[js.Any, js.Any] {
  /**
    * 全局对象
    */
  var globalData: js.UndefOr[AnyObject] = js.undefined
  /**
    * 组件类型
    */
  var mpType: js.UndefOr[String] = js.undefined
  /**
    * 错误监听函数
    * 小程序发生脚本错误或 API 调用报错时触发
    * @param error 错误信息，包含堆栈
    */
  var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
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
    * 监听 nvue 页面消息
    *
    * nvue 页面使用 `uni.postMessage` 发送消息时触发
    */
  var onUniNViewMessage: js.UndefOr[js.Function1[/* options */ AnyObject, Unit]] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V](
    globalData: AnyObject = null,
    mpType: String = null,
    onBackPress: /* options */ BackPressOption => _ = null,
    onError: /* error */ String => Unit = null,
    onHide: () => Unit = null,
    onLaunch: /* options */ js.UndefOr[LaunchShowOption] => Unit = null,
    onLoad: /* query */ js.UndefOr[AnyObject] => Unit = null,
    onNavigationBarButtonTap: /* options */ NavigationBarButtonTapOption => Unit = null,
    onNavigationBarSearchInputChanged: /* event */ NavigationBarSearchInputEvent => Unit = null,
    onNavigationBarSearchInputClicked: () => Unit = null,
    onNavigationBarSearchInputConfirmed: /* event */ NavigationBarSearchInputEvent => Unit = null,
    onPageNotFound: /* options */ PageNotFoundOption => Unit = null,
    onPageScroll: /* options */ PageScrollOption => Unit = null,
    onPullDownRefresh: () => Unit = null,
    onReachBottom: () => Unit = null,
    onReady: () => Unit = null,
    onResize: /* options */ PageScrollOption => Unit = null,
    onShareAppMessage: /* options */ ShareAppMessageOption => CustomShareContent = null,
    onShow: () => Unit = null,
    onTabItemTap: /* options */ TabItemTapOption => Unit = null,
    onUniNViewMessage: /* options */ AnyObject => Unit = null,
    onUnload: () => Unit = null,
    route: String = null
  ): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (globalData != null) __obj.updateDynamic("globalData")(globalData.asInstanceOf[js.Any])
    if (mpType != null) __obj.updateDynamic("mpType")(mpType.asInstanceOf[js.Any])
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
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

