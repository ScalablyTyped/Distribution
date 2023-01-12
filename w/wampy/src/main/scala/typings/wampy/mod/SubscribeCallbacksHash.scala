package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeCallbacksHash extends StObject {
  
  var onError: js.UndefOr[ErrorCallback] = js.undefined
  
  var onEvent: js.UndefOr[EventCallback] = js.undefined
  
  var onSuccess: js.UndefOr[Callback] = js.undefined
}
object SubscribeCallbacksHash {
  
  inline def apply(): SubscribeCallbacksHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeCallbacksHash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscribeCallbacksHash] (val x: Self) extends AnyVal {
    
    inline def setOnError(value: /* args */ ErrorArgs => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnEvent(value: /* args */ DataArgs => Unit): Self = StObject.set(x, "onEvent", js.Any.fromFunction1(value))
    
    inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
    
    inline def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
