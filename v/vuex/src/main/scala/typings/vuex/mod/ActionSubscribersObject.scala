package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSubscribersObject[P, S] extends StObject {
  
  var after: js.UndefOr[ActionSubscriber[P, S]] = js.undefined
  
  var before: js.UndefOr[ActionSubscriber[P, S]] = js.undefined
  
  var error: js.UndefOr[ActionErrorSubscriber[P, S]] = js.undefined
}
object ActionSubscribersObject {
  
  inline def apply[P, S](): ActionSubscribersObject[P, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionSubscribersObject[P, S]]
  }
  
  extension [Self <: ActionSubscribersObject[?, ?], P, S](x: Self & (ActionSubscribersObject[P, S])) {
    
    inline def setAfter(value: (P, S) => Any): Self = StObject.set(x, "after", js.Any.fromFunction2(value))
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: (P, S) => Any): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setError(value: (P, S, /* error */ js.Error) => Any): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
