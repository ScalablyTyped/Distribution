package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client extends StObject {
  
  var client: Any
  
  var debounceFn: js.UndefOr[FnCallFuncWaitOptions] = js.undefined
  
  var debounceMs: js.UndefOr[Double] = js.undefined
  
  var onError: Any
}
object Client {
  
  inline def apply(client: Any, onError: Any): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  extension [Self <: Client](x: Self) {
    
    inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setDebounceFn(value: FnCallFuncWaitOptions): Self = StObject.set(x, "debounceFn", value.asInstanceOf[js.Any])
    
    inline def setDebounceFnUndefined: Self = StObject.set(x, "debounceFn", js.undefined)
    
    inline def setDebounceMs(value: Double): Self = StObject.set(x, "debounceMs", value.asInstanceOf[js.Any])
    
    inline def setDebounceMsUndefined: Self = StObject.set(x, "debounceMs", js.undefined)
    
    inline def setOnError(value: Any): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
  }
}
