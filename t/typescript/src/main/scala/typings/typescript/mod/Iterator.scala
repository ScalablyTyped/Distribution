package typings.typescript.mod

import typings.typescript.anon.Done
import typings.typescript.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Iterator type. */
trait Iterator[T] extends StObject {
  
  def next(): Done[T] | Value
}
object Iterator {
  
  inline def apply[T](next: () => Done[T] | Value): Iterator[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Iterator[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Iterator[?], T] (val x: Self & Iterator[T]) extends AnyVal {
    
    inline def setNext(value: () => Done[T] | Value): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
