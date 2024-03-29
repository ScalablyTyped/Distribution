package typings.wonderFrp

import typings.wonderFrp.distEs2015DisposableIdisposableMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ObserverIobserverMod {
  
  trait IObserver
    extends StObject
       with IDisposable {
    
    def completed(): Any
    
    def error(error: Any): Any
    
    def next(value: Any): Any
  }
  object IObserver {
    
    inline def apply(completed: () => Any, dispose: () => Unit, error: Any => Any, next: Any => Any): IObserver = {
      val __obj = js.Dynamic.literal(completed = js.Any.fromFunction0(completed), dispose = js.Any.fromFunction0(dispose), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[IObserver]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IObserver] (val x: Self) extends AnyVal {
      
      inline def setCompleted(value: () => Any): Self = StObject.set(x, "completed", js.Any.fromFunction0(value))
      
      inline def setError(value: Any => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: Any => Any): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
}
