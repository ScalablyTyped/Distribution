package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.WechatMiniprogram.App.LaunchShowOption
import typings.wechatMiniprogram.WechatMiniprogram.App.PageNotFoundOption
import typings.wechatMiniprogram.WechatMiniprogram.OnThemeChangeCallback
import typings.wechatMiniprogram.WechatMiniprogram.OnThemeChangeCallbackResult
import typings.wechatMiniprogram.WechatMiniprogram.OnUnhandledRejectionCallback
import typings.wechatMiniprogram.WechatMiniprogram.OnUnhandledRejectionCallbackResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.App.Option> */
trait PartialOption extends StObject {
  
  var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onLaunch: js.UndefOr[js.Function1[/* options */ LaunchShowOption, Unit]] = js.undefined
  
  var onPageNotFound: js.UndefOr[js.Function1[/* options */ PageNotFoundOption, Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.Function1[/* options */ LaunchShowOption, Unit]] = js.undefined
  
  var onThemeChange: js.UndefOr[OnThemeChangeCallback] = js.undefined
  
  var onUnhandledRejection: js.UndefOr[OnUnhandledRejectionCallback] = js.undefined
}
object PartialOption {
  
  inline def apply(): PartialOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialOption] (val x: Self) extends AnyVal {
    
    inline def setOnError(value: /* error */ String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnLaunch(value: /* options */ LaunchShowOption => Unit): Self = StObject.set(x, "onLaunch", js.Any.fromFunction1(value))
    
    inline def setOnLaunchUndefined: Self = StObject.set(x, "onLaunch", js.undefined)
    
    inline def setOnPageNotFound(value: /* options */ PageNotFoundOption => Unit): Self = StObject.set(x, "onPageNotFound", js.Any.fromFunction1(value))
    
    inline def setOnPageNotFoundUndefined: Self = StObject.set(x, "onPageNotFound", js.undefined)
    
    inline def setOnShow(value: /* options */ LaunchShowOption => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnThemeChange(value: /* result */ OnThemeChangeCallbackResult => Unit): Self = StObject.set(x, "onThemeChange", js.Any.fromFunction1(value))
    
    inline def setOnThemeChangeUndefined: Self = StObject.set(x, "onThemeChange", js.undefined)
    
    inline def setOnUnhandledRejection(value: /* result */ OnUnhandledRejectionCallbackResult => Unit): Self = StObject.set(x, "onUnhandledRejection", js.Any.fromFunction1(value))
    
    inline def setOnUnhandledRejectionUndefined: Self = StObject.set(x, "onUnhandledRejection", js.undefined)
  }
}
