package typings.wechatMiniprogram.anon

import typings.std.Record
import typings.wechatMiniprogram.WechatMiniprogram.Page.IAddToFavoritesContent
import typings.wechatMiniprogram.WechatMiniprogram.Page.IAddToFavoritesOption
import typings.wechatMiniprogram.WechatMiniprogram.Page.ICustomShareContent
import typings.wechatMiniprogram.WechatMiniprogram.Page.ICustomTimelineContent
import typings.wechatMiniprogram.WechatMiniprogram.Page.IPageScrollOption
import typings.wechatMiniprogram.WechatMiniprogram.Page.IResizeOption
import typings.wechatMiniprogram.WechatMiniprogram.Page.IShareAppMessageOption
import typings.wechatMiniprogram.WechatMiniprogram.Page.ITabItemTapOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Page.ILifetime> */
@js.native
trait PartialILifetime extends js.Object {
  
  var onAddToFavorites: js.UndefOr[js.Function1[/* options */ IAddToFavoritesOption, IAddToFavoritesContent]] = js.native
  
  var onHide: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
  
  var onLoad: js.UndefOr[
    js.Function1[/* query */ Record[String, js.UndefOr[String]], Unit | js.Promise[Unit]]
  ] = js.native
  
  var onPageScroll: js.UndefOr[js.Function1[/* options */ IPageScrollOption, Unit | js.Promise[Unit]]] = js.native
  
  var onPullDownRefresh: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
  
  var onReachBottom: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
  
  var onReady: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
  
  var onResize: js.UndefOr[js.Function1[/* options */ IResizeOption, Unit | js.Promise[Unit]]] = js.native
  
  var onShareAppMessage: js.UndefOr[js.Function1[/* options */ IShareAppMessageOption, ICustomShareContent | Unit]] = js.native
  
  var onShareTimeline: js.UndefOr[js.Function0[ICustomTimelineContent | Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
  
  var onTabItemTap: js.UndefOr[js.Function1[/* options */ ITabItemTapOption, Unit | js.Promise[Unit]]] = js.native
  
  var onUnload: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
}
object PartialILifetime {
  
  @scala.inline
  def apply(): PartialILifetime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialILifetime]
  }
  
  @scala.inline
  implicit class PartialILifetimeOps[Self <: PartialILifetime] (val x: Self) extends AnyVal {
    
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
    def setOnAddToFavorites(value: /* options */ IAddToFavoritesOption => IAddToFavoritesContent): Self = this.set("onAddToFavorites", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAddToFavorites: Self = this.set("onAddToFavorites", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit | js.Promise[Unit]): Self = this.set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* query */ Record[String, js.UndefOr[String]] => Unit | js.Promise[Unit]): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnPageScroll(value: /* options */ IPageScrollOption => Unit | js.Promise[Unit]): Self = this.set("onPageScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPageScroll: Self = this.set("onPageScroll", js.undefined)
    
    @scala.inline
    def setOnPullDownRefresh(value: () => Unit | js.Promise[Unit]): Self = this.set("onPullDownRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPullDownRefresh: Self = this.set("onPullDownRefresh", js.undefined)
    
    @scala.inline
    def setOnReachBottom(value: () => Unit | js.Promise[Unit]): Self = this.set("onReachBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnReachBottom: Self = this.set("onReachBottom", js.undefined)
    
    @scala.inline
    def setOnReady(value: () => Unit | js.Promise[Unit]): Self = this.set("onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    
    @scala.inline
    def setOnResize(value: /* options */ IResizeOption => Unit | js.Promise[Unit]): Self = this.set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setOnShareAppMessage(value: /* options */ IShareAppMessageOption => ICustomShareContent | Unit): Self = this.set("onShareAppMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShareAppMessage: Self = this.set("onShareAppMessage", js.undefined)
    
    @scala.inline
    def setOnShareTimeline(value: () => ICustomTimelineContent | Unit): Self = this.set("onShareTimeline", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShareTimeline: Self = this.set("onShareTimeline", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit | js.Promise[Unit]): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnTabItemTap(value: /* options */ ITabItemTapOption => Unit | js.Promise[Unit]): Self = this.set("onTabItemTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTabItemTap: Self = this.set("onTabItemTap", js.undefined)
    
    @scala.inline
    def setOnUnload(value: () => Unit | js.Promise[Unit]): Self = this.set("onUnload", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnUnload: Self = this.set("onUnload", js.undefined)
  }
}
