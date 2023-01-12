package typings.typescriptServices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enumerator extends StObject {
  
  def atEnd(): Boolean
  
  def item(): Any
  
  def moveNext(): Boolean
}
object Enumerator {
  
  inline def apply(atEnd: () => Boolean, item: () => Any, moveNext: () => Boolean): Enumerator = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), item = js.Any.fromFunction0(item), moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[Enumerator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enumerator] (val x: Self) extends AnyVal {
    
    inline def setAtEnd(value: () => Boolean): Self = StObject.set(x, "atEnd", js.Any.fromFunction0(value))
    
    inline def setItem(value: () => Any): Self = StObject.set(x, "item", js.Any.fromFunction0(value))
    
    inline def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
  }
}
