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
    onAddToFavorites: js.UndefOr[Any | (/* options */ IAddToFavoritesOption)] => Any | IAddToFavoritesContent,
    onHide: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onLoad: js.UndefOr[Any | (/* query */ Record[String, js.UndefOr[String]])] => Any | js.Promise[Unit] | Unit,
    onPageScroll: js.UndefOr[Any | (/* options */ IPageScrollOption)] => Any | js.Promise[Unit] | Unit,
    onPullDownRefresh: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onReachBottom: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onReady: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onResize: js.UndefOr[Any | (/* options */ IResizeOption)] => Any | js.Promise[Unit] | Unit,
    onShareAppMessage: js.UndefOr[Any | (/* options */ IShareAppMessageOption)] => Any | ICustomShareContent | Unit,
    onShareTimeline: Optional[js.Function0[ICustomTimelineContent | Unit]],
    onShow: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onTabItemTap: js.UndefOr[Any | (/* options */ ITabItemTapOption)] => Any | js.Promise[Unit] | Unit,
    onUnload: Optional[js.Function0[Unit | js.Promise[Unit]]]
  ): OptionalInterfaceILifetim = {
    val __obj = js.Dynamic.literal(onAddToFavorites = js.Any.fromFunction1(onAddToFavorites), onHide = onHide.asInstanceOf[js.Any], onLoad = js.Any.fromFunction1(onLoad), onPageScroll = js.Any.fromFunction1(onPageScroll), onPullDownRefresh = onPullDownRefresh.asInstanceOf[js.Any], onReachBottom = onReachBottom.asInstanceOf[js.Any], onReady = onReady.asInstanceOf[js.Any], onResize = js.Any.fromFunction1(onResize), onShareAppMessage = js.Any.fromFunction1(onShareAppMessage), onShareTimeline = onShareTimeline.asInstanceOf[js.Any], onShow = onShow.asInstanceOf[js.Any], onTabItemTap = js.Any.fromFunction1(onTabItemTap), onUnload = onUnload.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalInterfaceILifetim]
  }
  
  extension [Self <: OptionalInterfaceILifetim](x: Self) {
    
    inline def setOnAddToFavorites(value: js.UndefOr[Any | (/* options */ IAddToFavoritesOption)] => Any | IAddToFavoritesContent): Self = StObject.set(x, "onAddToFavorites", js.Any.fromFunction1(value))
    
    inline def setOnHide(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    inline def setOnHideFunction0(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideFunction1(value: /* arg */ js.UndefOr[Any] => Any): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
    
    inline def setOnLoad(
      value: js.UndefOr[Any | (/* query */ Record[String, js.UndefOr[String]])] => Any | js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnPageScroll(value: js.UndefOr[Any | (/* options */ IPageScrollOption)] => Any | js.Promise[Unit] | Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
    
    inline def setOnPullDownRefresh(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onPullDownRefresh", value.asInstanceOf[js.Any])
    
    inline def setOnPullDownRefreshFunction0(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction0(value))
    
    inline def setOnPullDownRefreshFunction1(value: /* arg */ js.UndefOr[Any] => Any): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction1(value))
    
    inline def setOnReachBottom(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onReachBottom", value.asInstanceOf[js.Any])
    
    inline def setOnReachBottomFunction0(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction0(value))
    
    inline def setOnReachBottomFunction1(value: /* arg */ js.UndefOr[Any] => Any): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction1(value))
    
    inline def setOnReady(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
    
    inline def setOnReadyFunction0(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    inline def setOnReadyFunction1(value: /* arg */ js.UndefOr[Any] => Any): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    inline def setOnResize(value: js.UndefOr[Any | (/* options */ IResizeOption)] => Any | js.Promise[Unit] | Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
    
    inline def setOnShareAppMessage(
      value: js.UndefOr[Any | (/* options */ IShareAppMessageOption)] => Any | ICustomShareContent | Unit
    ): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
    
    inline def setOnShareTimeline(value: Optional[js.Function0[ICustomTimelineContent | Unit]]): Self = StObject.set(x, "onShareTimeline", value.asInstanceOf[js.Any])
    
    inline def setOnShareTimelineFunction0(value: () => ICustomTimelineContent | Unit): Self = StObject.set(x, "onShareTimeline", js.Any.fromFunction0(value))
    
    inline def setOnShareTimelineFunction1(value: /* arg */ js.UndefOr[Any] => Any): Self = StObject.set(x, "onShareTimeline", js.Any.fromFunction1(value))
    
    inline def setOnShow(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    inline def setOnShowFunction0(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnShowFunction1(value: /* arg */ js.UndefOr[Any] => Any): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    inline def setOnTabItemTap(value: js.UndefOr[Any | (/* options */ ITabItemTapOption)] => Any | js.Promise[Unit] | Unit): Self = StObject.set(x, "onTabItemTap", js.Any.fromFunction1(value))
    
    inline def setOnUnload(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onUnload", value.asInstanceOf[js.Any])
    
    inline def setOnUnloadFunction0(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onUnload", js.Any.fromFunction0(value))
    
    inline def setOnUnloadFunction1(value: /* arg */ js.UndefOr[Any] => Any): Self = StObject.set(x, "onUnload", js.Any.fromFunction1(value))
  }
}
