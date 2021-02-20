package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeCallbacksHash extends StObject {
  
  var onError: js.UndefOr[ErrorCallback] = js.native
  
  var onEvent: js.UndefOr[EventCallback] = js.native
  
  var onSuccess: js.UndefOr[Callback] = js.native
}
object SubscribeCallbacksHash {
  
  @scala.inline
  def apply(): SubscribeCallbacksHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeCallbacksHash]
  }
  
  @scala.inline
  implicit class SubscribeCallbacksHashMutableBuilder[Self <: SubscribeCallbacksHash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnError(value: /* args */ ErrorArgs => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnEvent(value: /* args */ DataArgs => Unit): Self = StObject.set(x, "onEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
