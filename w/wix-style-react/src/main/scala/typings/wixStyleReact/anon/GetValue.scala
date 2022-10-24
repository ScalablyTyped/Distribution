package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetValue extends StObject {
  
  def getValue(): Any
  
  def hasChild(style: Any): Boolean
  
  def isEmpty(): Boolean
}
object GetValue {
  
  inline def apply(getValue: () => Any, hasChild: Any => Boolean, isEmpty: () => Boolean): GetValue = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), hasChild = js.Any.fromFunction1(hasChild), isEmpty = js.Any.fromFunction0(isEmpty))
    __obj.asInstanceOf[GetValue]
  }
  
  extension [Self <: GetValue](x: Self) {
    
    inline def setGetValue(value: () => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setHasChild(value: Any => Boolean): Self = StObject.set(x, "hasChild", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
  }
}
