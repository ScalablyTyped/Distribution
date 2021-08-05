package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbacksWithType2[T, F] extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* res */ F, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ T, Unit]] = js.undefined
}
object CallbacksWithType2 {
  
  inline def apply[T, F](): CallbacksWithType2[T, F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbacksWithType2[T, F]]
  }
  
  extension [Self <: CallbacksWithType2[?, ?], T, F](x: Self & (CallbacksWithType2[T, F])) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ F => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ T => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
