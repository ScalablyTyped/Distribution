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
  
  @scala.inline
  def apply(
    onAddToFavorites: js.UndefOr[js.Any | (/* options */ IAddToFavoritesOption)] => js.Any | IAddToFavoritesContent,
    onHide: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onLoad: js.UndefOr[js.Any | (/* query */ Record[String, js.UndefOr[String]])] => js.Any | js.Promise[Unit] | Unit,
    onPageScroll: js.UndefOr[js.Any | (/* options */ IPageScrollOption)] => js.Any | js.Promise[Unit] | Unit,
    onPullDownRefresh: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onReachBottom: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onReady: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onResize: js.UndefOr[js.Any | (/* options */ IResizeOption)] => js.Any | js.Promise[Unit] | Unit,
    onShareAppMessage: js.UndefOr[js.Any | (/* options */ IShareAppMessageOption)] => js.Any | ICustomShareContent | Unit,
    onShareTimeline: Optional[js.Function0[ICustomTimelineContent | Unit]],
    onShow: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onTabItemTap: js.UndefOr[js.Any | (/* options */ ITabItemTapOption)] => js.Any | js.Promise[Unit] | Unit,
    onUnload: Optional[js.Function0[Unit | js.Promise[Unit]]]
  ): OptionalInterfaceILifetim = {
    val __obj = js.Dynamic.literal(onAddToFavorites = js.Any.fromFunction1(onAddToFavorites), onHide = onHide.asInstanceOf[js.Any], onLoad = js.Any.fromFunction1(onLoad), onPageScroll = js.Any.fromFunction1(onPageScroll), onPullDownRefresh = onPullDownRefresh.asInstanceOf[js.Any], onReachBottom = onReachBottom.asInstanceOf[js.Any], onReady = onReady.asInstanceOf[js.Any], onResize = js.Any.fromFunction1(onResize), onShareAppMessage = js.Any.fromFunction1(onShareAppMessage), onShareTimeline = onShareTimeline.asInstanceOf[js.Any], onShow = onShow.asInstanceOf[js.Any], onTabItemTap = js.Any.fromFunction1(onTabItemTap), onUnload = onUnload.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalInterfaceILifetim]
  }
  
  @scala.inline
  implicit class OptionalInterfaceILifetimMutableBuilder[Self <: OptionalInterfaceILifetim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnAddToFavorites(
      value: js.UndefOr[js.Any | (/* options */ IAddToFavoritesOption)] => js.Any | IAddToFavoritesContent
    ): Self = StObject.set(x, "onAddToFavorites", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHide(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHideFunction0(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideFunction1(value: /* arg */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoad(
      value: js.UndefOr[js.Any | (/* query */ Record[String, js.UndefOr[String]])] => js.Any | js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPageScroll(value: js.UndefOr[js.Any | (/* options */ IPageScrollOption)] => js.Any | js.Promise[Unit] | Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPullDownRefresh(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onPullDownRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPullDownRefreshFunction0(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPullDownRefreshFunction1(value: /* arg */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReachBottom(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onReachBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReachBottomFunction0(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReachBottomFunction1(value: /* arg */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReady(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReadyFunction0(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReadyFunction1(value: /* arg */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResize(value: js.UndefOr[js.Any | (/* options */ IResizeOption)] => js.Any | js.Promise[Unit] | Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShareAppMessage(
      value: js.UndefOr[js.Any | (/* options */ IShareAppMessageOption)] => js.Any | ICustomShareContent | Unit
    ): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShareTimeline(value: Optional[js.Function0[ICustomTimelineContent | Unit]]): Self = StObject.set(x, "onShareTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShareTimelineFunction0(value: () => ICustomTimelineContent | Unit): Self = StObject.set(x, "onShareTimeline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShareTimelineFunction1(value: /* arg */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "onShareTimeline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShow(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShowFunction0(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowFunction1(value: /* arg */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTabItemTap(value: js.UndefOr[js.Any | (/* options */ ITabItemTapOption)] => js.Any | js.Promise[Unit] | Unit): Self = StObject.set(x, "onTabItemTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUnload(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onUnload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUnloadFunction0(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onUnload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnUnloadFunction1(value: /* arg */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "onUnload", js.Any.fromFunction1(value))
  }
}
