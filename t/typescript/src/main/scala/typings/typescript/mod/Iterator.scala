package typings.typescript.mod

import typings.typescript.anon.Done
import typings.typescript.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Iterator type. */
@js.native
trait Iterator[T] extends StObject {
  
  def next(): Done[T] | `0` = js.native
}
object Iterator {
  
  @scala.inline
  def apply[T](next: () => Done[T] | `0`): Iterator[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Iterator[T]]
  }
  
  @scala.inline
  implicit class IteratorMutableBuilder[Self <: Iterator[_], T] (val x: Self with Iterator[T]) extends AnyVal {
    
    @scala.inline
    def setNext(value: () => Done[T] | `0`): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
