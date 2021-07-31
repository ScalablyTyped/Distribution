package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Observer[T] extends StObject {
  
  def complete(): Unit
  
  def error(err: js.Any): Unit
  
  def next(value: T): Unit
}
object Observer {
  
  @scala.inline
  def apply[T](complete: () => Unit, error: js.Any => Unit, next: T => Unit): Observer[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[Observer[T]]
  }
  
  @scala.inline
  implicit class ObserverMutableBuilder[Self <: Observer[?], T] (val x: Self & Observer[T]) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
  }
}
