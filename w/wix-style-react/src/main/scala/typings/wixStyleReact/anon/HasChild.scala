package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasChild extends StObject {
  
  def hasChild(style: Any): Boolean
  
  def isEmpty(): Boolean
}
object HasChild {
  
  inline def apply(hasChild: Any => Boolean, isEmpty: () => Boolean): HasChild = {
    val __obj = js.Dynamic.literal(hasChild = js.Any.fromFunction1(hasChild), isEmpty = js.Any.fromFunction0(isEmpty))
    __obj.asInstanceOf[HasChild]
  }
  
  extension [Self <: HasChild](x: Self) {
    
    inline def setHasChild(value: Any => Boolean): Self = StObject.set(x, "hasChild", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
  }
}
