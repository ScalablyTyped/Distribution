package typings.uniApp.App

import typings.uniApp.AnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInstance[T /* <: AnyObject */] extends js.Object {
  
  /**
    * 全局对象
    */
  var globalData: js.UndefOr[AnyObject] = js.native
  
  /**
    * 错误监听函数
    * 小程序发生脚本错误或 API 调用报错时触发
    * @param error 错误信息，包含堆栈
    */
  var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.native
  
  /**
    * 生命周期回调 监听应用隐藏
    *
    * 应用从前台进入后台时触发
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  
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
    * 生命周期回调 监听应用显示
    *
    * 应用启动，或从后台进入前台显示时触发
    */
  var onShow: js.UndefOr[js.Function1[/* options */ js.UndefOr[LaunchShowOption], Unit]] = js.native
  
  /**
    * 监听 nvue 页面消息
    *
    * nvue 页面使用 `uni.postMessage` 发送消息时触发
    */
  var onUniNViewMessage: js.UndefOr[js.Function1[/* options */ AnyObject, Unit]] = js.native
}
object AppInstance {
  
  @scala.inline
  def apply[T /* <: AnyObject */](): AppInstance[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstance[T]]
  }
  
  @scala.inline
  implicit class AppInstanceOps[Self <: AppInstance[_], T /* <: AnyObject */] (val x: Self with AppInstance[T]) extends AnyVal {
    
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
    def setOnError(value: /* error */ String => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnLaunch(value: /* options */ js.UndefOr[LaunchShowOption] => Unit): Self = this.set("onLaunch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLaunch: Self = this.set("onLaunch", js.undefined)
    
    @scala.inline
    def setOnPageNotFound(value: /* options */ PageNotFoundOption => Unit): Self = this.set("onPageNotFound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPageNotFound: Self = this.set("onPageNotFound", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* options */ js.UndefOr[LaunchShowOption] => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnUniNViewMessage(value: /* options */ AnyObject => Unit): Self = this.set("onUniNViewMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUniNViewMessage: Self = this.set("onUniNViewMessage", js.undefined)
  }
}
