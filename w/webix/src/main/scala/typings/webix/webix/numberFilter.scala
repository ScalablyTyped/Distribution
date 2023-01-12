package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait numberFilter extends StObject {
  
  def contains(a: Any, b: Any): Boolean
  
  def equal(a: Any, b: Any): Boolean
  
  def greater(a: Any, b: Any): Boolean
  
  def greaterOrEqual(a: Any, b: Any): Boolean
  
  def less(a: Any, b: Any): Boolean
  
  def lessOrEqual(a: Any, b: Any): Boolean
  
  def notContains(a: Any, b: Any): Boolean
  
  def notEqual(a: Any, b: Any): Boolean
}
object numberFilter {
  
  inline def apply(
    contains: (Any, Any) => Boolean,
    equal: (Any, Any) => Boolean,
    greater: (Any, Any) => Boolean,
    greaterOrEqual: (Any, Any) => Boolean,
    less: (Any, Any) => Boolean,
    lessOrEqual: (Any, Any) => Boolean,
    notContains: (Any, Any) => Boolean,
    notEqual: (Any, Any) => Boolean
  ): numberFilter = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), equal = js.Any.fromFunction2(equal), greater = js.Any.fromFunction2(greater), greaterOrEqual = js.Any.fromFunction2(greaterOrEqual), less = js.Any.fromFunction2(less), lessOrEqual = js.Any.fromFunction2(lessOrEqual), notContains = js.Any.fromFunction2(notContains), notEqual = js.Any.fromFunction2(notEqual))
    __obj.asInstanceOf[numberFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: numberFilter] (val x: Self) extends AnyVal {
    
    inline def setContains(value: (Any, Any) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
    
    inline def setEqual(value: (Any, Any) => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
    
    inline def setGreater(value: (Any, Any) => Boolean): Self = StObject.set(x, "greater", js.Any.fromFunction2(value))
    
    inline def setGreaterOrEqual(value: (Any, Any) => Boolean): Self = StObject.set(x, "greaterOrEqual", js.Any.fromFunction2(value))
    
    inline def setLess(value: (Any, Any) => Boolean): Self = StObject.set(x, "less", js.Any.fromFunction2(value))
    
    inline def setLessOrEqual(value: (Any, Any) => Boolean): Self = StObject.set(x, "lessOrEqual", js.Any.fromFunction2(value))
    
    inline def setNotContains(value: (Any, Any) => Boolean): Self = StObject.set(x, "notContains", js.Any.fromFunction2(value))
    
    inline def setNotEqual(value: (Any, Any) => Boolean): Self = StObject.set(x, "notEqual", js.Any.fromFunction2(value))
  }
}
