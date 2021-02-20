package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Iterator[T] extends StObject {
  
  def current(): T = js.native
  
  def moveNext(): Boolean = js.native
}
object Iterator {
  
  @scala.inline
  def apply[T](current: () => T, moveNext: () => Boolean): Iterator[T] = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction0(current), moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[Iterator[T]]
  }
  
  @scala.inline
  implicit class IteratorMutableBuilder[Self <: Iterator[_], T] (val x: Self with Iterator[T]) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: () => T): Self = StObject.set(x, "current", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
  }
}
