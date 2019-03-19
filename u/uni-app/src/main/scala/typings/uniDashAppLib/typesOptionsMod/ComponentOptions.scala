package typings
package uniDashAppLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- uniDashAppLib.AppNs.AppInstance because var conflicts: onHide, onShow. Inlined onLaunch, onError, onPageNotFound */ trait ComponentOptions[V /* <: vueLib.typesVueMod.Vue */]
  extends uniDashAppLib.PageNs.PageInstance[js.Any, js.Any] {
  /**
    * 组件类型
    */
  var mpType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 错误监听函数
    * 应用发生脚本错误，或者 api
    */
  var onError: js.UndefOr[js.Function1[/* error */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /**
    * 生命周期回调—监听应用初始化
    * 应用初始化完成时触发，全局只触发一次。
    */
  var onLaunch: js.UndefOr[
    js.Function1[/* options */ js.UndefOr[uniDashAppLib.AppNs.LaunchShowOption], scala.Unit]
  ] = js.undefined
  /**
    * 页面不存在监听函数
    * 应用要打开的页面不存在时触发，会带上页面信息回调该函数
    *
    * **注意：**
    * 1. 如果开发者没有添加 `onPageNotFound` 监听，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
    * 2. 如果 `onPageNotFound` 回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再回调 `onPageNotFound`。
    *
    */
  var onPageNotFound: js.UndefOr[
    js.Function1[/* options */ js.UndefOr[uniDashAppLib.AppNs.PageNotFoundOption], scala.Unit]
  ] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: vueLib.typesVueMod.Vue */](
    mpType: java.lang.String = null,
    onError: /* error */ js.UndefOr[java.lang.String] => scala.Unit = null,
    onHide: () => scala.Unit = null,
    onLaunch: /* options */ js.UndefOr[uniDashAppLib.AppNs.LaunchShowOption] => scala.Unit = null,
    onLoad: /* query */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] => scala.Unit = null,
    onPageNotFound: /* options */ js.UndefOr[uniDashAppLib.AppNs.PageNotFoundOption] => scala.Unit = null,
    onPageScroll: /* options */ js.UndefOr[uniDashAppLib.PageNs.PageScrollOption] => scala.Unit = null,
    onPullDownRefresh: () => scala.Unit = null,
    onReachBottom: () => scala.Unit = null,
    onReady: () => scala.Unit = null,
    onShareAppMessage: /* options */ js.UndefOr[uniDashAppLib.PageNs.ShareAppMessageOption] => uniDashAppLib.PageNs.CustomShareContent = null,
    onShow: () => scala.Unit = null,
    onTabItemTap: /* options */ js.UndefOr[uniDashAppLib.PageNs.TabItemTapOption] => scala.Unit = null,
    onUnload: () => scala.Unit = null,
    route: java.lang.String = null
  ): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (mpType != null) __obj.updateDynamic("mpType")(mpType)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onLaunch != null) __obj.updateDynamic("onLaunch")(js.Any.fromFunction1(onLaunch))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onPageNotFound != null) __obj.updateDynamic("onPageNotFound")(js.Any.fromFunction1(onPageNotFound))
    if (onPageScroll != null) __obj.updateDynamic("onPageScroll")(js.Any.fromFunction1(onPageScroll))
    if (onPullDownRefresh != null) __obj.updateDynamic("onPullDownRefresh")(js.Any.fromFunction0(onPullDownRefresh))
    if (onReachBottom != null) __obj.updateDynamic("onReachBottom")(js.Any.fromFunction0(onReachBottom))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction0(onReady))
    if (onShareAppMessage != null) __obj.updateDynamic("onShareAppMessage")(js.Any.fromFunction1(onShareAppMessage))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (onTabItemTap != null) __obj.updateDynamic("onTabItemTap")(js.Any.fromFunction1(onTabItemTap))
    if (onUnload != null) __obj.updateDynamic("onUnload")(js.Any.fromFunction0(onUnload))
    if (route != null) __obj.updateDynamic("route")(route)
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

