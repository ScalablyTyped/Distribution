package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscriber[T]
  extends StObject
     with Observer[T] {
  
  val closed: Boolean
}
object Subscriber {
  
  inline def apply[T](closed: Boolean, complete: () => Unit, error: /* value */ Any => Unit, next: T => Unit): Subscriber[T] = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[Subscriber[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subscriber[?], T] (val x: Self & Subscriber[T]) extends AnyVal {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
  }
}
