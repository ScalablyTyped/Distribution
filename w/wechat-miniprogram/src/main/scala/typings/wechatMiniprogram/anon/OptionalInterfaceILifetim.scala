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
    onAddToFavorites: Optional[js.Function1[/* options */ IAddToFavoritesOption, IAddToFavoritesContent]],
    onHide: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onLoad: Optional[
      js.Function1[/* query */ Record[String, js.UndefOr[String]], Unit | js.Promise[Unit]]
    ],
    onPageScroll: Optional[js.Function1[/* options */ IPageScrollOption, Unit | js.Promise[Unit]]],
    onPullDownRefresh: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onReachBottom: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onReady: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onResize: Optional[js.Function1[/* options */ IResizeOption, Unit | js.Promise[Unit]]],
    onShareAppMessage: Optional[js.Function1[/* options */ IShareAppMessageOption, ICustomShareContent | Unit]],
    onShareTimeline: Optional[js.Function0[ICustomTimelineContent | Unit]],
    onShow: Optional[js.Function0[Unit | js.Promise[Unit]]],
    onTabItemTap: Optional[js.Function1[/* options */ ITabItemTapOption, Unit | js.Promise[Unit]]],
    onUnload: Optional[js.Function0[Unit | js.Promise[Unit]]]
  ): OptionalInterfaceILifetim = {
    val __obj = js.Dynamic.literal(onAddToFavorites = onAddToFavorites.asInstanceOf[js.Any], onHide = onHide.asInstanceOf[js.Any], onLoad = onLoad.asInstanceOf[js.Any], onPageScroll = onPageScroll.asInstanceOf[js.Any], onPullDownRefresh = onPullDownRefresh.asInstanceOf[js.Any], onReachBottom = onReachBottom.asInstanceOf[js.Any], onReady = onReady.asInstanceOf[js.Any], onResize = onResize.asInstanceOf[js.Any], onShareAppMessage = onShareAppMessage.asInstanceOf[js.Any], onShareTimeline = onShareTimeline.asInstanceOf[js.Any], onShow = onShow.asInstanceOf[js.Any], onTabItemTap = onTabItemTap.asInstanceOf[js.Any], onUnload = onUnload.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalInterfaceILifetim]
  }
  
  extension [Self <: OptionalInterfaceILifetim](x: Self) {
    
    inline def setOnAddToFavorites(value: Optional[js.Function1[/* options */ IAddToFavoritesOption, IAddToFavoritesContent]]): Self = StObject.set(x, "onAddToFavorites", value.asInstanceOf[js.Any])
    
    inline def setOnHide(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    inline def setOnLoad(
      value: Optional[
          js.Function1[/* query */ Record[String, js.UndefOr[String]], Unit | js.Promise[Unit]]
        ]
    ): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    inline def setOnPageScroll(value: Optional[js.Function1[/* options */ IPageScrollOption, Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onPageScroll", value.asInstanceOf[js.Any])
    
    inline def setOnPullDownRefresh(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onPullDownRefresh", value.asInstanceOf[js.Any])
    
    inline def setOnReachBottom(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onReachBottom", value.asInstanceOf[js.Any])
    
    inline def setOnReady(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
    
    inline def setOnResize(value: Optional[js.Function1[/* options */ IResizeOption, Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
    
    inline def setOnShareAppMessage(value: Optional[js.Function1[/* options */ IShareAppMessageOption, ICustomShareContent | Unit]]): Self = StObject.set(x, "onShareAppMessage", value.asInstanceOf[js.Any])
    
    inline def setOnShareTimeline(value: Optional[js.Function0[ICustomTimelineContent | Unit]]): Self = StObject.set(x, "onShareTimeline", value.asInstanceOf[js.Any])
    
    inline def setOnShow(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    inline def setOnTabItemTap(value: Optional[js.Function1[/* options */ ITabItemTapOption, Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onTabItemTap", value.asInstanceOf[js.Any])
    
    inline def setOnUnload(value: Optional[js.Function0[Unit | js.Promise[Unit]]]): Self = StObject.set(x, "onUnload", value.asInstanceOf[js.Any])
  }
}
