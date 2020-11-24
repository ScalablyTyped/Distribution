package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.WechatMiniprogram.App.LaunchShowOption
import typings.wechatMiniprogram.WechatMiniprogram.App.PageNotFoundOption
import typings.wechatMiniprogram.WechatMiniprogram.OnThemeChangeCallback
import typings.wechatMiniprogram.WechatMiniprogram.OnThemeChangeCallbackResult
import typings.wechatMiniprogram.WechatMiniprogram.OnUnhandledRejectionCallback
import typings.wechatMiniprogram.WechatMiniprogram.OnUnhandledRejectionCallbackResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.App.Option> */
@js.native
trait PartialOption extends js.Object {
  
  var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.native
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onLaunch: js.UndefOr[js.Function1[/* options */ LaunchShowOption, Unit]] = js.native
  
  var onPageNotFound: js.UndefOr[js.Function1[/* options */ PageNotFoundOption, Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function1[/* options */ LaunchShowOption, Unit]] = js.native
  
  var onThemeChange: js.UndefOr[OnThemeChangeCallback] = js.native
  
  var onUnhandledRejection: js.UndefOr[OnUnhandledRejectionCallback] = js.native
}
object PartialOption {
  
  @scala.inline
  def apply(): PartialOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOption]
  }
  
  @scala.inline
  implicit class PartialOptionOps[Self <: PartialOption] (val x: Self) extends AnyVal {
    
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
    def setOnError(value: /* error */ String => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnLaunch(value: /* options */ LaunchShowOption => Unit): Self = this.set("onLaunch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLaunch: Self = this.set("onLaunch", js.undefined)
    
    @scala.inline
    def setOnPageNotFound(value: /* options */ PageNotFoundOption => Unit): Self = this.set("onPageNotFound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPageNotFound: Self = this.set("onPageNotFound", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* options */ LaunchShowOption => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnThemeChange(value: /* result */ OnThemeChangeCallbackResult => Unit): Self = this.set("onThemeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnThemeChange: Self = this.set("onThemeChange", js.undefined)
    
    @scala.inline
    def setOnUnhandledRejection(value: /* result */ OnUnhandledRejectionCallbackResult => Unit): Self = this.set("onUnhandledRejection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUnhandledRejection: Self = this.set("onUnhandledRejection", js.undefined)
  }
}
