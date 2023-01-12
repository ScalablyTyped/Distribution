package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncMethodOptionLike extends StObject {
  
  var success: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
}
object AsyncMethodOptionLike {
  
  inline def apply(): AsyncMethodOptionLike = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncMethodOptionLike]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncMethodOptionLike] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: /* repeated */ Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
