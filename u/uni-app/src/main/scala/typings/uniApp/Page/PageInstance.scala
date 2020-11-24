package typings.uniApp.Page

import typings.uniApp.AnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageInstance[D /* <: AnyObject */, T /* <: AnyObject */] extends PageInstanceBaseProps[D] {
  
  /**
    * 监听页面返回
    * @param options tab 点击参数
    * @return 返回 `true` 时阻止页面返回
    */
  var onBackPress: js.UndefOr[js.Function1[/* options */ BackPressOption, _]] = js.native
  
  /**
    * 生命周期回调 监听页面隐藏
    *
    * 页面隐藏/切入后台时触发。 如 `navigateTo` 或底部 `tab` 切换到其他页面，应用切入后台等。
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 生命周期回调 监听页面加载
    *
    * 页面加载时触发。一个页面只会调用一次，可以在 onLoad 的参数中获取打开当前页面路径中的参数。
    * @param query 打开当前页面路径中的参数
    */
  var onLoad: js.UndefOr[js.Function1[/* query */ js.UndefOr[AnyObject], Unit]] = js.native
  
  /**
    * 监听原生标题栏按钮点击事件
    * @param options tab 点击参数
    */
  var onNavigationBarButtonTap: js.UndefOr[js.Function1[/* options */ NavigationBarButtonTapOption, Unit]] = js.native
  
  /**
    * 监听原生标题栏搜索输入框输入内容变化事件
    */
  var onNavigationBarSearchInputChanged: js.UndefOr[js.Function1[/* event */ NavigationBarSearchInputEvent, Unit]] = js.native
  
  /**
    * 监听原生标题栏搜索输入框点击事件
    */
  var onNavigationBarSearchInputClicked: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 监听原生标题栏搜索输入框搜索事件，用户点击软键盘上的“搜索”按钮时触发。
    */
  var onNavigationBarSearchInputConfirmed: js.UndefOr[js.Function1[/* event */ NavigationBarSearchInputEvent, Unit]] = js.native
  
  /**
    * 页面滚动触发事件的处理函数
    *
    * 监听用户滑动页面事件。
    * @param options 页面滚动参数
    */
  var onPageScroll: js.UndefOr[js.Function1[/* options */ PageScrollOption, Unit]] = js.native
  
  /**
    * 监听用户下拉动作
    * - 需要在 `pages.json` 的页面配置中开启 `enablePullDownRefresh` 。
    * - 可以通过 `uni.startPullDownRefresh` 触发下拉刷新，调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
    * - 当处理完数据刷新后，`uni.stopPullDownRefresh` 可以停止当前页面的下拉刷新。
    */
  var onPullDownRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 页面上拉触底事件的处理函数
    * - 可以在 `pages.json` 的页面配置中设置触发距离 `onReachBottomDistance` 。
    * - 在触发距离内滑动期间，本事件只会被触发一次。
    */
  var onReachBottom: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 生命周期回调 监听页面初次渲染完成
    *
    * 页面初次渲染完成时触发。一个页面只会调用一次，代表页面已经准备妥当，可以和视图层进行交互。
    */
  var onReady: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 页面尺寸改变时触发
    * @param options 页面滚动参数
    */
  var onResize: js.UndefOr[js.Function1[/* options */ PageScrollOption, Unit]] = js.native
  
  /**
    * 用户点击右上角转发
    *
    * 监听用户点击页面内转发按钮（`<button>` 组件 `open-type="share"`）或右上角菜单“转发”按钮的行为，并自定义转发内容。
    * @param options 分享发起来源参数
    * @return 转发内容
    */
  var onShareAppMessage: js.UndefOr[js.Function1[/* options */ ShareAppMessageOption, CustomShareContent]] = js.native
  
  /**
    * 生命周期回调 监听页面显示
    *
    * 页面显示/切入前台时触发。
    */
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 当前是 tab 页时，点击 tab 时触发
    * @param options tab 点击参数
    */
  var onTabItemTap: js.UndefOr[js.Function1[/* options */ TabItemTapOption, Unit]] = js.native
  
  /**
    * 生命周期回调 监听页面卸载
    *
    * 页面卸载时触发。如 `redirectTo` 或 `navigateBack` 到其他页面时。
    */
  var onUnload: js.UndefOr[js.Function0[Unit]] = js.native
}
object PageInstance {
  
  @scala.inline
  def apply[D /* <: AnyObject */, T /* <: AnyObject */](): PageInstance[D, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageInstance[D, T]]
  }
  
  @scala.inline
  implicit class PageInstanceOps[Self <: PageInstance[_, _], D /* <: AnyObject */, T /* <: AnyObject */] (val x: Self with (PageInstance[D, T])) extends AnyVal {
    
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
    def setOnBackPress(value: /* options */ BackPressOption => _): Self = this.set("onBackPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBackPress: Self = this.set("onBackPress", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* query */ js.UndefOr[AnyObject] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnNavigationBarButtonTap(value: /* options */ NavigationBarButtonTapOption => Unit): Self = this.set("onNavigationBarButtonTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNavigationBarButtonTap: Self = this.set("onNavigationBarButtonTap", js.undefined)
    
    @scala.inline
    def setOnNavigationBarSearchInputChanged(value: /* event */ NavigationBarSearchInputEvent => Unit): Self = this.set("onNavigationBarSearchInputChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNavigationBarSearchInputChanged: Self = this.set("onNavigationBarSearchInputChanged", js.undefined)
    
    @scala.inline
    def setOnNavigationBarSearchInputClicked(value: () => Unit): Self = this.set("onNavigationBarSearchInputClicked", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnNavigationBarSearchInputClicked: Self = this.set("onNavigationBarSearchInputClicked", js.undefined)
    
    @scala.inline
    def setOnNavigationBarSearchInputConfirmed(value: /* event */ NavigationBarSearchInputEvent => Unit): Self = this.set("onNavigationBarSearchInputConfirmed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNavigationBarSearchInputConfirmed: Self = this.set("onNavigationBarSearchInputConfirmed", js.undefined)
    
    @scala.inline
    def setOnPageScroll(value: /* options */ PageScrollOption => Unit): Self = this.set("onPageScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPageScroll: Self = this.set("onPageScroll", js.undefined)
    
    @scala.inline
    def setOnPullDownRefresh(value: () => Unit): Self = this.set("onPullDownRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPullDownRefresh: Self = this.set("onPullDownRefresh", js.undefined)
    
    @scala.inline
    def setOnReachBottom(value: () => Unit): Self = this.set("onReachBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnReachBottom: Self = this.set("onReachBottom", js.undefined)
    
    @scala.inline
    def setOnReady(value: () => Unit): Self = this.set("onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    
    @scala.inline
    def setOnResize(value: /* options */ PageScrollOption => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setOnShareAppMessage(value: /* options */ ShareAppMessageOption => CustomShareContent): Self = this.set("onShareAppMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShareAppMessage: Self = this.set("onShareAppMessage", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnTabItemTap(value: /* options */ TabItemTapOption => Unit): Self = this.set("onTabItemTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTabItemTap: Self = this.set("onTabItemTap", js.undefined)
    
    @scala.inline
    def setOnUnload(value: () => Unit): Self = this.set("onUnload", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnUnload: Self = this.set("onUnload", js.undefined)
  }
}
