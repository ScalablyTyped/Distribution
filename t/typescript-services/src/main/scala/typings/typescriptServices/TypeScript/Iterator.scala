package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iterator[T] extends StObject {
  
  def current(): T
  
  def moveNext(): Boolean
}
object Iterator {
  
  inline def apply[T](current: () => T, moveNext: () => Boolean): Iterator[T] = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction0(current), moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[Iterator[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Iterator[?], T] (val x: Self & Iterator[T]) extends AnyVal {
    
    inline def setCurrent(value: () => T): Self = StObject.set(x, "current", js.Any.fromFunction0(value))
    
    inline def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
  }
}
