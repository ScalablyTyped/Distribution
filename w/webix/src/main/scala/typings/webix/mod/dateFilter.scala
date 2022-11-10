package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dateFilter extends StObject {
  
  def between(a: Any, b: Any): Boolean
  
  def equal(a: Any, b: Any): Boolean
  
  def greater(a: Any, b: Any): Boolean
  
  def greaterOrEqual(a: Any, b: Any): Boolean
  
  def less(a: Any, b: Any): Boolean
  
  def lessOrEqual(a: Any, b: Any): Boolean
  
  def notBetween(a: Any, b: Any): Boolean
  
  def notEqual(a: Any, b: Any): Boolean
}
object dateFilter {
  
  inline def apply(
    between: (Any, Any) => Boolean,
    equal: (Any, Any) => Boolean,
    greater: (Any, Any) => Boolean,
    greaterOrEqual: (Any, Any) => Boolean,
    less: (Any, Any) => Boolean,
    lessOrEqual: (Any, Any) => Boolean,
    notBetween: (Any, Any) => Boolean,
    notEqual: (Any, Any) => Boolean
  ): dateFilter = {
    val __obj = js.Dynamic.literal(between = js.Any.fromFunction2(between), equal = js.Any.fromFunction2(equal), greater = js.Any.fromFunction2(greater), greaterOrEqual = js.Any.fromFunction2(greaterOrEqual), less = js.Any.fromFunction2(less), lessOrEqual = js.Any.fromFunction2(lessOrEqual), notBetween = js.Any.fromFunction2(notBetween), notEqual = js.Any.fromFunction2(notEqual))
    __obj.asInstanceOf[dateFilter]
  }
  
  extension [Self <: dateFilter](x: Self) {
    
    inline def setBetween(value: (Any, Any) => Boolean): Self = StObject.set(x, "between", js.Any.fromFunction2(value))
    
    inline def setEqual(value: (Any, Any) => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
    
    inline def setGreater(value: (Any, Any) => Boolean): Self = StObject.set(x, "greater", js.Any.fromFunction2(value))
    
    inline def setGreaterOrEqual(value: (Any, Any) => Boolean): Self = StObject.set(x, "greaterOrEqual", js.Any.fromFunction2(value))
    
    inline def setLess(value: (Any, Any) => Boolean): Self = StObject.set(x, "less", js.Any.fromFunction2(value))
    
    inline def setLessOrEqual(value: (Any, Any) => Boolean): Self = StObject.set(x, "lessOrEqual", js.Any.fromFunction2(value))
    
    inline def setNotBetween(value: (Any, Any) => Boolean): Self = StObject.set(x, "notBetween", js.Any.fromFunction2(value))
    
    inline def setNotEqual(value: (Any, Any) => Boolean): Self = StObject.set(x, "notEqual", js.Any.fromFunction2(value))
  }
}
