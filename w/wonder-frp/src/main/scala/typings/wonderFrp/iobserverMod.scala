package typings.wonderFrp

import typings.wonderFrp.idisposableMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iobserverMod {
  
  trait IObserver
    extends StObject
       with IDisposable {
    
    def completed(): js.Any
    
    def error(error: js.Any): js.Any
    
    def next(value: js.Any): js.Any
  }
  object IObserver {
    
    inline def apply(completed: () => js.Any, dispose: () => Unit, error: js.Any => js.Any, next: js.Any => js.Any): IObserver = {
      val __obj = js.Dynamic.literal(completed = js.Any.fromFunction0(completed), dispose = js.Any.fromFunction0(dispose), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[IObserver]
    }
    
    extension [Self <: IObserver](x: Self) {
      
      inline def setCompleted(value: () => js.Any): Self = StObject.set(x, "completed", js.Any.fromFunction0(value))
      
      inline def setError(value: js.Any => js.Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: js.Any => js.Any): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
}
