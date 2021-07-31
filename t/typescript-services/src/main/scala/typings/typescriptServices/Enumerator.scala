package typings.typescriptServices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enumerator extends StObject {
  
  def atEnd(): Boolean
  
  def item(): js.Any
  
  def moveNext(): Boolean
}
object Enumerator {
  
  @scala.inline
  def apply(atEnd: () => Boolean, item: () => js.Any, moveNext: () => Boolean): Enumerator = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), item = js.Any.fromFunction0(item), moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[Enumerator]
  }
  
  @scala.inline
  implicit class EnumeratorMutableBuilder[Self <: Enumerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtEnd(value: () => Boolean): Self = StObject.set(x, "atEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItem(value: () => js.Any): Self = StObject.set(x, "item", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
  }
}
