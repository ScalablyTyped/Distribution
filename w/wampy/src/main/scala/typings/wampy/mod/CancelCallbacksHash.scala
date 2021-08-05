package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelCallbacksHash extends StObject {
  
  var onError: js.UndefOr[Callback] = js.undefined
  
  var onSuccess: js.UndefOr[Callback] = js.undefined
}
object CancelCallbacksHash {
  
  inline def apply(): CancelCallbacksHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelCallbacksHash]
  }
  
  extension [Self <: CancelCallbacksHash](x: Self) {
    
    inline def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
