package typings.wechatMiniprogram.anon

import typings.std.Record
import typings.wechatMiniprogram.WechatMiniprogram.Optional
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.WechatMiniprogram.OptionalInterface<wechat-miniprogram.WechatMiniprogram.Page.ILifetime> */
trait OptionalInterfaceILifetim extends StObject {
  
  var onAddToFavorites: Optional[js.Function1[/* options */ IAddToFavoritesOption, IAddToFavoritesContent]]
  
  var onHide: Optional[js.Function0[Unit | js.Promise[Unit]]]
  
  var onLoad: Optional[
    js.Function1[/* query */ Record[String, js.UndefOr[String]], Unit | js.Promise[Unit]]
  ]
  
  var onPageScroll: Optional[js.Function1[/* options */ IPageScrollOption, Unit | js.Promise[Unit]]]
  
  var onPullDownRefresh: Optional[js.Function0[Unit | js.Promise[Unit]]]
  
  var onReachBottom: Optional[js.Function0[Unit | js.Promise[Unit]]]
  
  var onReady: Optional[js.Function0[Unit | js.Promise[Unit]]]
  
  var onResize: Optional[js.Function1[/* options */ IResizeOption, Unit | js.Promise[Unit]]]
  
  var onShareAppMessage: Optional[js.Function1[/* options */ IShareAppMessageOption, ICustomShareContent | Unit]]
  
  var onShareTimeline: Optional[js.Function0[ICustomTimelineContent | Unit]]
  
  var onShow: Optional[js.Function0[Unit | js.Promise[Unit]]]
  
  var onTabItemTap: Optional[js.Function1[/* options */ ITabItemTapOption, Unit | js.Promise[Unit]]]
  
  var onUnload: Optional[js.Function0[Unit | js.Promise[Unit]]]
}
object OptionalInterfaceILifetim {
  
  inline def apply(
    onAddToFavorites: /* options */ IAddToFavoritesOption => IAddToFavoritesContent,
    onHide: () => Unit | js.Promise[Unit],
    onLoad: /* query */ Record[String, js.UndefOr[String]] => Unit | js.Promise[Unit],
    onPageScroll: /* options */ IPageScrollOption => Unit | js.Promise[Unit],
    onPullDownRefresh: () => Unit | js.Promise[Unit],
    onReachBottom: () => Unit | js.Promise[Unit],
    onReady: () => Unit | js.Promise[Unit],
    onResize: /* options */ IResizeOption => Unit | js.Promise[Unit],
    onShareAppMessage: /* options */ IShareAppMessageOption => ICustomShareContent | Unit,
    onShareTimeline: () => ICustomTimelineContent | Unit,
    onShow: () => Unit | js.Promise[Unit],
    onTabItemTap: /* options */ ITabItemTapOption => Unit | js.Promise[Unit],
    onUnload: () => Unit | js.Promise[Unit]
  ): OptionalInterfaceILifetim = {
    val __obj = js.Dynamic.literal(onAddToFavorites = js.Any.fromFunction1(onAddToFavorites), onHide = js.Any.fromFunction0(onHide), onLoad = js.Any.fromFunction1(onLoad), onPageScroll = js.Any.fromFunction1(onPageScroll), onPullDownRefresh = js.Any.fromFunction0(onPullDownRefresh), onReachBottom = js.Any.fromFunction0(onReachBottom), onReady = js.Any.fromFunction0(onReady), onResize = js.Any.fromFunction1(onResize), onShareAppMessage = js.Any.fromFunction1(onShareAppMessage), onShareTimeline = js.Any.fromFunction0(onShareTimeline), onShow = js.Any.fromFunction0(onShow), onTabItemTap = js.Any.fromFunction1(onTabItemTap), onUnload = js.Any.fromFunction0(onUnload))
    __obj.asInstanceOf[OptionalInterfaceILifetim]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionalInterfaceILifetim] (val x: Self) extends AnyVal {
    
    inline def setOnAddToFavorites(value: /* options */ IAddToFavoritesOption => IAddToFavoritesContent): Self = StObject.set(x, "onAddToFavorites", js.Any.fromFunction1(value))
    
    inline def setOnHide(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnLoad(value: /* query */ Record[String, js.UndefOr[String]] => Unit | js.Promise[Unit]): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnPageScroll(value: /* options */ IPageScrollOption => Unit | js.Promise[Unit]): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
    
    inline def setOnPullDownRefresh(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction0(value))
    
    inline def setOnReachBottom(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction0(value))
    
    inline def setOnReady(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    inline def setOnResize(value: /* options */ IResizeOption => Unit | js.Promise[Unit]): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
    
    inline def setOnShareAppMessage(value: /* options */ IShareAppMessageOption => ICustomShareContent | Unit): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
    
    inline def setOnShareTimeline(value: () => ICustomTimelineContent | Unit): Self = StObject.set(x, "onShareTimeline", js.Any.fromFunction0(value))
    
    inline def setOnShow(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnTabItemTap(value: /* options */ ITabItemTapOption => Unit | js.Promise[Unit]): Self = StObject.set(x, "onTabItemTap", js.Any.fromFunction1(value))
    
    inline def setOnUnload(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onUnload", js.Any.fromFunction0(value))
  }
}
