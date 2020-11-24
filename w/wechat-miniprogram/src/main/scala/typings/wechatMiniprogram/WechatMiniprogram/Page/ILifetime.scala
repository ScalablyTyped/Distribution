package typings.wechatMiniprogram.WechatMiniprogram.Page

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILifetime extends js.Object {
  
  /**
    * 监听用户点击右上角菜单“收藏”按钮的行为，并自定义收藏内容。
    * 基础库 2.10.3，安卓 7.0.15 版本起支持，iOS 暂不支持
    */
  def onAddToFavorites(options: IAddToFavoritesOption): IAddToFavoritesContent = js.native
  
  /** 生命周期回调—监听页面隐藏
    *
    * 页面隐藏/切入后台时触发。 如 `navigateTo` 或底部 `tab` 切换到其他页面，小程序切入后台等。
    */
  def onHide(): Unit | js.Promise[Unit] = js.native
  
  /** 生命周期回调—监听页面加载
    *
    * 页面加载时触发。一个页面只会调用一次，可以在 onLoad 的参数中获取打开当前页面路径中的参数。
    */
  def onLoad(/** 打开当前页面路径中的参数 */
  query: Record[String, js.UndefOr[String]]): Unit | js.Promise[Unit] = js.native
  
  /** 页面滚动触发事件的处理函数
    *
    * 监听用户滑动页面事件。
    */
  def onPageScroll(/** 页面滚动参数 */
  options: IPageScrollOption): Unit | js.Promise[Unit] = js.native
  
  /** 监听用户下拉动作
    *
    * 监听用户下拉刷新事件。
    * - 需要在`app.json`的`window`选项中或页面配置中开启`enablePullDownRefresh`。
    * - 可以通过`wx.startPullDownRefresh`触发下拉刷新，调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
    * - 当处理完数据刷新后，`wx.stopPullDownRefresh`可以停止当前页面的下拉刷新。
    */
  def onPullDownRefresh(): Unit | js.Promise[Unit] = js.native
  
  /** 页面上拉触底事件的处理函数
    *
    * 监听用户上拉触底事件。
    * - 可以在`app.json`的`window`选项中或页面配置中设置触发距离`onReachBottomDistance`。
    * - 在触发距离内滑动期间，本事件只会被触发一次。
    */
  def onReachBottom(): Unit | js.Promise[Unit] = js.native
  
  /** 生命周期回调—监听页面初次渲染完成
    *
    * 页面初次渲染完成时触发。一个页面只会调用一次，代表页面已经准备妥当，可以和视图层进行交互。
    *
    * 注意：对界面内容进行设置的 API 如`wx.setNavigationBarTitle`，请在`onReady`之后进行。
    */
  def onReady(): Unit | js.Promise[Unit] = js.native
  
  /** 窗口尺寸改变时触发，最低基础库：`2.4.0` */
  def onResize(/** 窗口尺寸参数 */
  options: IResizeOption): Unit | js.Promise[Unit] = js.native
  
  /** 用户点击右上角转发
    *
    * 监听用户点击页面内转发按钮（`<button>` 组件 `open-type="share"`）或右上角菜单“转发”按钮的行为，并自定义转发内容。
    *
    * **注意：只有定义了此事件处理函数，右上角菜单才会显示“转发”按钮**
    *
    * 此事件需要 return 一个 Object，用于自定义转发内容
    */
  def onShareAppMessage(/** 分享发起来源参数 */
  options: IShareAppMessageOption): ICustomShareContent | Unit = js.native
  
  /**
    * 监听右上角菜单“分享到朋友圈”按钮的行为，并自定义分享内容
    *
    * 本接口为 Beta 版本，暂只在 Android 平台支持，详见 [分享到朋友圈 (Beta)](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share-timeline.html)
    *
    * 基础库 2.11.3 开始支持，低版本需做兼容处理。
    */
  def onShareTimeline(): ICustomTimelineContent | Unit = js.native
  
  /** 生命周期回调—监听页面显示
    *
    * 页面显示/切入前台时触发。
    */
  def onShow(): Unit | js.Promise[Unit] = js.native
  
  /** 当前是 tab 页时，点击 tab 时触发，最低基础库： `1.9.0` */
  def onTabItemTap(/** tab 点击参数 */
  options: ITabItemTapOption): Unit | js.Promise[Unit] = js.native
  
  /** 生命周期回调—监听页面卸载
    *
    * 页面卸载时触发。如`redirectTo`或`navigateBack`到其他页面时。
    */
  def onUnload(): Unit | js.Promise[Unit] = js.native
}
object ILifetime {
  
  @scala.inline
  def apply(
    onAddToFavorites: IAddToFavoritesOption => IAddToFavoritesContent,
    onHide: () => Unit | js.Promise[Unit],
    onLoad: Record[String, js.UndefOr[String]] => Unit | js.Promise[Unit],
    onPageScroll: IPageScrollOption => Unit | js.Promise[Unit],
    onPullDownRefresh: () => Unit | js.Promise[Unit],
    onReachBottom: () => Unit | js.Promise[Unit],
    onReady: () => Unit | js.Promise[Unit],
    onResize: IResizeOption => Unit | js.Promise[Unit],
    onShareAppMessage: IShareAppMessageOption => ICustomShareContent | Unit,
    onShareTimeline: () => ICustomTimelineContent | Unit,
    onShow: () => Unit | js.Promise[Unit],
    onTabItemTap: ITabItemTapOption => Unit | js.Promise[Unit],
    onUnload: () => Unit | js.Promise[Unit]
  ): ILifetime = {
    val __obj = js.Dynamic.literal(onAddToFavorites = js.Any.fromFunction1(onAddToFavorites), onHide = js.Any.fromFunction0(onHide), onLoad = js.Any.fromFunction1(onLoad), onPageScroll = js.Any.fromFunction1(onPageScroll), onPullDownRefresh = js.Any.fromFunction0(onPullDownRefresh), onReachBottom = js.Any.fromFunction0(onReachBottom), onReady = js.Any.fromFunction0(onReady), onResize = js.Any.fromFunction1(onResize), onShareAppMessage = js.Any.fromFunction1(onShareAppMessage), onShareTimeline = js.Any.fromFunction0(onShareTimeline), onShow = js.Any.fromFunction0(onShow), onTabItemTap = js.Any.fromFunction1(onTabItemTap), onUnload = js.Any.fromFunction0(onUnload))
    __obj.asInstanceOf[ILifetime]
  }
  
  @scala.inline
  implicit class ILifetimeOps[Self <: ILifetime] (val x: Self) extends AnyVal {
    
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
    def setOnAddToFavorites(value: IAddToFavoritesOption => IAddToFavoritesContent): Self = this.set("onAddToFavorites", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHide(value: () => Unit | js.Promise[Unit]): Self = this.set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLoad(value: Record[String, js.UndefOr[String]] => Unit | js.Promise[Unit]): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPageScroll(value: IPageScrollOption => Unit | js.Promise[Unit]): Self = this.set("onPageScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPullDownRefresh(value: () => Unit | js.Promise[Unit]): Self = this.set("onPullDownRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReachBottom(value: () => Unit | js.Promise[Unit]): Self = this.set("onReachBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReady(value: () => Unit | js.Promise[Unit]): Self = this.set("onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnResize(value: IResizeOption => Unit | js.Promise[Unit]): Self = this.set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShareAppMessage(value: IShareAppMessageOption => ICustomShareContent | Unit): Self = this.set("onShareAppMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShareTimeline(value: () => ICustomTimelineContent | Unit): Self = this.set("onShareTimeline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShow(value: () => Unit | js.Promise[Unit]): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTabItemTap(value: ITabItemTapOption => Unit | js.Promise[Unit]): Self = this.set("onTabItemTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUnload(value: () => Unit | js.Promise[Unit]): Self = this.set("onUnload", js.Any.fromFunction0(value))
  }
}
