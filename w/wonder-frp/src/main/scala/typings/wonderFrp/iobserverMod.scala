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
    
    @scala.inline
    def apply(completed: () => js.Any, dispose: () => Unit, error: js.Any => js.Any, next: js.Any => js.Any): IObserver = {
      val __obj = js.Dynamic.literal(completed = js.Any.fromFunction0(completed), dispose = js.Any.fromFunction0(dispose), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[IObserver]
    }
    
    @scala.inline
    implicit class IObserverMutableBuilder[Self <: IObserver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompleted(value: () => js.Any): Self = StObject.set(x, "completed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setError(value: js.Any => js.Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNext(value: js.Any => js.Any): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
}
