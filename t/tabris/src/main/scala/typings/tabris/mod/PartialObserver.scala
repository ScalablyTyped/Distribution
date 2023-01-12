package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialObserver[T] extends StObject {
  
  var complete: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* ex */ Any, Any]] = js.undefined
  
  var next: js.UndefOr[js.Function1[/* value */ T, Any]] = js.undefined
}
object PartialObserver {
  
  inline def apply[T](): PartialObserver[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialObserver[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialObserver[?], T] (val x: Self & PartialObserver[T]) extends AnyVal {
    
    inline def setComplete(value: () => Any): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setError(value: /* ex */ Any => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: /* value */ T => Any): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
