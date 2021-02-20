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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Page.ILifetime> */
@js.native
trait PartialILifetime extends StObject {
  
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
  implicit class PartialILifetimeMutableBuilder[Self <: PartialILifetime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnAddToFavorites(value: /* options */ IAddToFavoritesOption => IAddToFavoritesContent): Self = StObject.set(x, "onAddToFavorites", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAddToFavoritesUndefined: Self = StObject.set(x, "onAddToFavorites", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* query */ Record[String, js.UndefOr[String]] => Unit | js.Promise[Unit]): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnPageScroll(value: /* options */ IPageScrollOption => Unit | js.Promise[Unit]): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
    
    @scala.inline
    def setOnPullDownRefresh(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
    
    @scala.inline
    def setOnReachBottom(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReachBottomUndefined: Self = StObject.set(x, "onReachBottom", js.undefined)
    
    @scala.inline
    def setOnReady(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    @scala.inline
    def setOnResize(value: /* options */ IResizeOption => Unit | js.Promise[Unit]): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    @scala.inline
    def setOnShareAppMessage(value: /* options */ IShareAppMessageOption => ICustomShareContent | Unit): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShareAppMessageUndefined: Self = StObject.set(x, "onShareAppMessage", js.undefined)
    
    @scala.inline
    def setOnShareTimeline(value: () => ICustomTimelineContent | Unit): Self = StObject.set(x, "onShareTimeline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShareTimelineUndefined: Self = StObject.set(x, "onShareTimeline", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnTabItemTap(value: /* options */ ITabItemTapOption => Unit | js.Promise[Unit]): Self = StObject.set(x, "onTabItemTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTabItemTapUndefined: Self = StObject.set(x, "onTabItemTap", js.undefined)
    
    @scala.inline
    def setOnUnload(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onUnload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
  }
}
