package typings.typescript.mod

import typings.typescript.anon.Done
import typings.typescript.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Iterator type. */
trait Iterator[T] extends StObject {
  
  def next(): Done[T] | `0`
}
object Iterator {
  
  inline def apply[T](next: () => Done[T] | `0`): Iterator[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Iterator[T]]
  }
  
  extension [Self <: Iterator[?], T](x: Self & Iterator[T]) {
    
    inline def setNext(value: () => Done[T] | `0`): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
