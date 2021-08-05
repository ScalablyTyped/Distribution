package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.WechatMiniprogram.Page.IResizeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Component.PageLifetimes> */
trait PartialPageLifetimes extends StObject {
  
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var resize: js.UndefOr[js.Function1[/* size */ IResizeOption, Unit]] = js.undefined
  
  var show: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object PartialPageLifetimes {
  
  inline def apply(): PartialPageLifetimes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageLifetimes]
  }
  
  extension [Self <: PartialPageLifetimes](x: Self) {
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setResize(value: /* size */ IResizeOption => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
