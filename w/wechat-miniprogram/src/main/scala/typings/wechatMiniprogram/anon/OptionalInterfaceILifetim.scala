package typings.wechatMiniprogram.anon

import typings.std.Record
import typings.wechatMiniprogram.WechatMiniprogram.Optional
import typings.wechatMiniprogram.WechatMiniprogram.Page.IAddToFavoritesContent
import typings.wechatMiniprogram.WechatMiniprogram.Page.IAddToFavoritesOption
import typings.wechatMiniprogram.WechatMiniprogram.Page.ICustomShareContent
import typings.wechatMiniprogram.WechatMiniprogram.Page.IPageScrollOption
import typings.wechatMiniprogram.WechatMiniprogram.Page.IResizeOption
import typings.wechatMiniprogram.WechatMiniprogram.Page.IShareAppMessageOption
import typings.wechatMiniprogram.WechatMiniprogram.Page.ITabItemTapOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined wechat-miniprogram.WechatMiniprogram.OptionalInterface<wechat-miniprogram.WechatMiniprogram.Page.ILifetime> */
@js.native
trait OptionalInterfaceILifetim extends js.Object {
  var onAddToFavorites: Optional[js.Function1[/* options */ IAddToFavoritesOption, IAddToFavoritesContent]] = js.native
  var onHide: Optional[js.Function0[Unit]] = js.native
  var onLoad: Optional[js.Function1[/* query */ Record[String, js.UndefOr[String]], Unit]] = js.native
  var onPageScroll: Optional[js.Function1[/* options */ IPageScrollOption, Unit]] = js.native
  var onPullDownRefresh: Optional[js.Function0[Unit]] = js.native
  var onReachBottom: Optional[js.Function0[Unit]] = js.native
  var onReady: Optional[js.Function0[Unit]] = js.native
  var onResize: Optional[js.Function1[/* options */ IResizeOption, Unit]] = js.native
  var onShareAppMessage: Optional[js.Function1[/* options */ IShareAppMessageOption, ICustomShareContent | Unit]] = js.native
  var onShow: Optional[js.Function0[Unit]] = js.native
  var onTabItemTap: Optional[js.Function1[/* options */ ITabItemTapOption, Unit]] = js.native
  var onUnload: Optional[js.Function0[Unit]] = js.native
}

object OptionalInterfaceILifetim {
  @scala.inline
  def apply(
    onAddToFavorites: js.UndefOr[js.Any | (/* options */ IAddToFavoritesOption)] => js.Any | IAddToFavoritesContent,
    onHide: Optional[js.Function0[Unit]],
    onLoad: js.UndefOr[js.Any | (/* query */ Record[String, js.UndefOr[String]])] => js.Any | Unit,
    onPageScroll: js.UndefOr[js.Any | (/* options */ IPageScrollOption)] => js.Any | Unit,
    onPullDownRefresh: Optional[js.Function0[Unit]],
    onReachBottom: Optional[js.Function0[Unit]],
    onReady: Optional[js.Function0[Unit]],
    onResize: js.UndefOr[js.Any | (/* options */ IResizeOption)] => js.Any | Unit,
    onShareAppMessage: js.UndefOr[js.Any | (/* options */ IShareAppMessageOption)] => js.Any | ICustomShareContent | Unit,
    onShow: Optional[js.Function0[Unit]],
    onTabItemTap: js.UndefOr[js.Any | (/* options */ ITabItemTapOption)] => js.Any | Unit,
    onUnload: Optional[js.Function0[Unit]]
  ): OptionalInterfaceILifetim = {
    val __obj = js.Dynamic.literal(onAddToFavorites = js.Any.fromFunction1(onAddToFavorites), onHide = onHide.asInstanceOf[js.Any], onLoad = js.Any.fromFunction1(onLoad), onPageScroll = js.Any.fromFunction1(onPageScroll), onPullDownRefresh = onPullDownRefresh.asInstanceOf[js.Any], onReachBottom = onReachBottom.asInstanceOf[js.Any], onReady = onReady.asInstanceOf[js.Any], onResize = js.Any.fromFunction1(onResize), onShareAppMessage = js.Any.fromFunction1(onShareAppMessage), onShow = onShow.asInstanceOf[js.Any], onTabItemTap = js.Any.fromFunction1(onTabItemTap), onUnload = onUnload.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalInterfaceILifetim]
  }
  @scala.inline
  implicit class OptionalInterfaceILifetimOps[Self <: OptionalInterfaceILifetim] (val x: Self) extends AnyVal {
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
    def setOnAddToFavorites(
      value: js.UndefOr[js.Any | (/* options */ IAddToFavoritesOption)] => js.Any | IAddToFavoritesContent
    ): Self = this.set("onAddToFavorites", js.Any.fromFunction1(value))
    @scala.inline
    def setOnHideFunction1(value: /* arg */ js.UndefOr[js.Any] => js.Any): Self = this.set("onHide", js.Any.fromFunction1(value))
    @scala.inline
    def setOnHideFunction0(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    @scala.inline
    def setOnHide(value: Optional[js.Function0[Unit]]): Self = this.set("onHide", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnLoad(value: js.UndefOr[js.Any | (/* query */ Record[String, js.UndefOr[String]])] => js.Any | Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def setOnPageScroll(value: js.UndefOr[js.Any | (/* options */ IPageScrollOption)] => js.Any | Unit): Self = this.set("onPageScroll", js.Any.fromFunction1(value))
    @scala.inline
    def setOnPullDownRefreshFunction1(value: /* arg */ js.UndefOr[js.Any] => js.Any): Self = this.set("onPullDownRefresh", js.Any.fromFunction1(value))
    @scala.inline
    def setOnPullDownRefreshFunction0(value: () => Unit): Self = this.set("onPullDownRefresh", js.Any.fromFunction0(value))
    @scala.inline
    def setOnPullDownRefresh(value: Optional[js.Function0[Unit]]): Self = this.set("onPullDownRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnReachBottomFunction1(value: /* arg */ js.UndefOr[js.Any] => js.Any): Self = this.set("onReachBottom", js.Any.fromFunction1(value))
    @scala.inline
    def setOnReachBottomFunction0(value: () => Unit): Self = this.set("onReachBottom", js.Any.fromFunction0(value))
    @scala.inline
    def setOnReachBottom(value: Optional[js.Function0[Unit]]): Self = this.set("onReachBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnReadyFunction1(value: /* arg */ js.UndefOr[js.Any] => js.Any): Self = this.set("onReady", js.Any.fromFunction1(value))
    @scala.inline
    def setOnReadyFunction0(value: () => Unit): Self = this.set("onReady", js.Any.fromFunction0(value))
    @scala.inline
    def setOnReady(value: Optional[js.Function0[Unit]]): Self = this.set("onReady", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnResize(value: js.UndefOr[js.Any | (/* options */ IResizeOption)] => js.Any | Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def setOnShareAppMessage(
      value: js.UndefOr[js.Any | (/* options */ IShareAppMessageOption)] => js.Any | ICustomShareContent | Unit
    ): Self = this.set("onShareAppMessage", js.Any.fromFunction1(value))
    @scala.inline
    def setOnShowFunction1(value: /* arg */ js.UndefOr[js.Any] => js.Any): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def setOnShowFunction0(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def setOnShow(value: Optional[js.Function0[Unit]]): Self = this.set("onShow", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTabItemTap(value: js.UndefOr[js.Any | (/* options */ ITabItemTapOption)] => js.Any | Unit): Self = this.set("onTabItemTap", js.Any.fromFunction1(value))
    @scala.inline
    def setOnUnloadFunction1(value: /* arg */ js.UndefOr[js.Any] => js.Any): Self = this.set("onUnload", js.Any.fromFunction1(value))
    @scala.inline
    def setOnUnloadFunction0(value: () => Unit): Self = this.set("onUnload", js.Any.fromFunction0(value))
    @scala.inline
    def setOnUnload(value: Optional[js.Function0[Unit]]): Self = this.set("onUnload", value.asInstanceOf[js.Any])
  }
  
}

