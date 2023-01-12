package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method[M /* <: MethodOption */, TIsPage /* <: Boolean */] extends StObject {
  
  /** 组件的方法，包括事件响应函数和任意的自定义方法，关于事件响应函数的使用，参见 [组件间通信与事件](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/events.html) */
  var methods: M & (/* import warning: importer.ImportType#apply Failed type conversion: TIsPage extends true ? / * Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Page.ILifetime> * /
  {  onHide :(): void | std.Promise<void> | undefined,   onPullDownRefresh :(): void | std.Promise<void> | undefined,   onShareTimeline :(): wechat-miniprogram.WechatMiniprogram.Page.ICustomTimelineContent | void | undefined,   onReady :(): void | std.Promise<void> | undefined,   onShareAppMessage :(options : wechat-miniprogram.WechatMiniprogram.Page.IShareAppMessageOption): wechat-miniprogram.WechatMiniprogram.Page.ICustomShareContent | void | undefined,   onLoad :(query : std.Record<string, string | undefined>): void | std.Promise<void> | undefined,   onReachBottom :(): void | std.Promise<void> | undefined,   onUnload :(): void | std.Promise<void> | undefined,   onShow :(): void | std.Promise<void> | undefined,   onPageScroll :(options : wechat-miniprogram.WechatMiniprogram.Page.IPageScrollOption): void | std.Promise<void> | undefined,   onTabItemTap :(options : wechat-miniprogram.WechatMiniprogram.Page.ITabItemTapOption): void | std.Promise<void> | undefined,   onResize :(options : wechat-miniprogram.WechatMiniprogram.Page.IResizeOption): void | std.Promise<void> | undefined,   onAddToFavorites :(options : wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesOption): wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesContent | undefined} : {} */ js.Any)
}
object Method {
  
  inline def apply[M /* <: MethodOption */, TIsPage /* <: Boolean */](
    methods: M & (/* import warning: importer.ImportType#apply Failed type conversion: TIsPage extends true ? / * Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Page.ILifetime> * /
  {  onHide :(): void | std.Promise<void> | undefined,   onPullDownRefresh :(): void | std.Promise<void> | undefined,   onShareTimeline :(): wechat-miniprogram.WechatMiniprogram.Page.ICustomTimelineContent | void | undefined,   onReady :(): void | std.Promise<void> | undefined,   onShareAppMessage :(options : wechat-miniprogram.WechatMiniprogram.Page.IShareAppMessageOption): wechat-miniprogram.WechatMiniprogram.Page.ICustomShareContent | void | undefined,   onLoad :(query : std.Record<string, string | undefined>): void | std.Promise<void> | undefined,   onReachBottom :(): void | std.Promise<void> | undefined,   onUnload :(): void | std.Promise<void> | undefined,   onShow :(): void | std.Promise<void> | undefined,   onPageScroll :(options : wechat-miniprogram.WechatMiniprogram.Page.IPageScrollOption): void | std.Promise<void> | undefined,   onTabItemTap :(options : wechat-miniprogram.WechatMiniprogram.Page.ITabItemTapOption): void | std.Promise<void> | undefined,   onResize :(options : wechat-miniprogram.WechatMiniprogram.Page.IResizeOption): void | std.Promise<void> | undefined,   onAddToFavorites :(options : wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesOption): wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesContent | undefined} : {} */ js.Any)
  ): Method[M, TIsPage] = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method[M, TIsPage]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Method[?, ?], M /* <: MethodOption */, TIsPage /* <: Boolean */] (val x: Self & (Method[M, TIsPage])) extends AnyVal {
    
    inline def setMethods(
      value: M & (/* import warning: importer.ImportType#apply Failed type conversion: TIsPage extends true ? / * Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Page.ILifetime> * /
    {  onHide :(): void | std.Promise<void> | undefined,   onPullDownRefresh :(): void | std.Promise<void> | undefined,   onShareTimeline :(): wechat-miniprogram.WechatMiniprogram.Page.ICustomTimelineContent | void | undefined,   onReady :(): void | std.Promise<void> | undefined,   onShareAppMessage :(options : wechat-miniprogram.WechatMiniprogram.Page.IShareAppMessageOption): wechat-miniprogram.WechatMiniprogram.Page.ICustomShareContent | void | undefined,   onLoad :(query : std.Record<string, string | undefined>): void | std.Promise<void> | undefined,   onReachBottom :(): void | std.Promise<void> | undefined,   onUnload :(): void | std.Promise<void> | undefined,   onShow :(): void | std.Promise<void> | undefined,   onPageScroll :(options : wechat-miniprogram.WechatMiniprogram.Page.IPageScrollOption): void | std.Promise<void> | undefined,   onTabItemTap :(options : wechat-miniprogram.WechatMiniprogram.Page.ITabItemTapOption): void | std.Promise<void> | undefined,   onResize :(options : wechat-miniprogram.WechatMiniprogram.Page.IResizeOption): void | std.Promise<void> | undefined,   onAddToFavorites :(options : wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesOption): wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesContent | undefined} : {} */ js.Any)
    ): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
  }
}
