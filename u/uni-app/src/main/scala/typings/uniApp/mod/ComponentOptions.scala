package typings.uniApp.mod

import typings.uniApp.AnyObject
import typings.uniApp.App.LaunchShowOption
import typings.uniApp.App.PageNotFoundOption
import typings.uniApp.Page.PageInstance
import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.uniApp.App.AppInstance because var conflicts: onHide, onShow. Inlined globalData, onLaunch, onError, onPageNotFound, onUniNViewMessage */ @js.native
trait ComponentOptions[V /* <: Vue */]
  extends PageInstance[js.Any, js.Any] {
  /**
    * 全局对象
    */
  var globalData: js.UndefOr[AnyObject] = js.native
  /**
    * 组件类型
    */
  var mpType: js.UndefOr[String] = js.native
  /**
    * 错误监听函数
    * 小程序发生脚本错误或 API 调用报错时触发
    * @param error 错误信息，包含堆栈
    */
  var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.native
  /**
    * 生命周期回调 监听应用初始化
    *
    * 应用初始化完成时触发，全局只触发一次。
    */
  var onLaunch: js.UndefOr[js.Function1[/* options */ js.UndefOr[LaunchShowOption], Unit]] = js.native
  /**
    * 页面不存在监听函数
    *
    * 应用要打开的页面不存在时触发，会带上页面信息回调该函数
    *
    * **注意：**
    * 1. 如果开发者没有添加 `onPageNotFound` 监听，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
    * 2. 如果 `onPageNotFound` 回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再回调 `onPageNotFound`。
    */
  var onPageNotFound: js.UndefOr[js.Function1[/* options */ PageNotFoundOption, Unit]] = js.native
  /**
    * 监听 nvue 页面消息
    *
    * nvue 页面使用 `uni.postMessage` 发送消息时触发
    */
  var onUniNViewMessage: js.UndefOr[js.Function1[/* options */ AnyObject, Unit]] = js.native
}

object ComponentOptions {
  @scala.inline
  def apply[/* <: typings.vue.vueMod.Vue */ V](): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[V]]
  }
  @scala.inline
  implicit class ComponentOptionsOps[Self <: ComponentOptions[_], /* <: typings.vue.vueMod.Vue */ V] (val x: Self with ComponentOptions[V]) extends AnyVal {
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
    def setGlobalData(value: AnyObject): Self = this.set("globalData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalData: Self = this.set("globalData", js.undefined)
    @scala.inline
    def setMpType(value: String): Self = this.set("mpType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpType: Self = this.set("mpType", js.undefined)
    @scala.inline
    def setOnError(value: /* error */ String => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnLaunch(value: /* options */ js.UndefOr[LaunchShowOption] => Unit): Self = this.set("onLaunch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLaunch: Self = this.set("onLaunch", js.undefined)
    @scala.inline
    def setOnPageNotFound(value: /* options */ PageNotFoundOption => Unit): Self = this.set("onPageNotFound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageNotFound: Self = this.set("onPageNotFound", js.undefined)
    @scala.inline
    def setOnUniNViewMessage(value: /* options */ AnyObject => Unit): Self = this.set("onUniNViewMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUniNViewMessage: Self = this.set("onUniNViewMessage", js.undefined)
  }
  
}

