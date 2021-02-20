package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.WechatMiniprogram.App.LaunchShowOption
import typings.wechatMiniprogram.WechatMiniprogram.App.PageNotFoundOption
import typings.wechatMiniprogram.WechatMiniprogram.OnThemeChangeCallback
import typings.wechatMiniprogram.WechatMiniprogram.OnThemeChangeCallbackResult
import typings.wechatMiniprogram.WechatMiniprogram.OnUnhandledRejectionCallback
import typings.wechatMiniprogram.WechatMiniprogram.OnUnhandledRejectionCallbackResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.App.Option> */
@js.native
trait PartialOption extends StObject {
  
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
  implicit class PartialOptionMutableBuilder[Self <: PartialOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnError(value: /* error */ String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnLaunch(value: /* options */ LaunchShowOption => Unit): Self = StObject.set(x, "onLaunch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLaunchUndefined: Self = StObject.set(x, "onLaunch", js.undefined)
    
    @scala.inline
    def setOnPageNotFound(value: /* options */ PageNotFoundOption => Unit): Self = StObject.set(x, "onPageNotFound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPageNotFoundUndefined: Self = StObject.set(x, "onPageNotFound", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* options */ LaunchShowOption => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnThemeChange(value: /* result */ OnThemeChangeCallbackResult => Unit): Self = StObject.set(x, "onThemeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnThemeChangeUndefined: Self = StObject.set(x, "onThemeChange", js.undefined)
    
    @scala.inline
    def setOnUnhandledRejection(value: /* result */ OnUnhandledRejectionCallbackResult => Unit): Self = StObject.set(x, "onUnhandledRejection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUnhandledRejectionUndefined: Self = StObject.set(x, "onUnhandledRejection", js.undefined)
  }
}
