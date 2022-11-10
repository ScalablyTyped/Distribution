package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait textFilter extends StObject {
  
  def beginsWith(a: Any, b: Any): Boolean
  
  def contains(a: Any, b: Any): Boolean
  
  def endsWith(a: Any, b: Any): Boolean
  
  def equal(a: Any, b: Any): Boolean
  
  def notBeginsWith(a: Any, b: Any): Boolean
  
  def notContains(a: Any, b: Any): Boolean
  
  def notEndsWith(a: Any, b: Any): Boolean
  
  def notEqual(a: Any, b: Any): Boolean
}
object textFilter {
  
  inline def apply(
    beginsWith: (Any, Any) => Boolean,
    contains: (Any, Any) => Boolean,
    endsWith: (Any, Any) => Boolean,
    equal: (Any, Any) => Boolean,
    notBeginsWith: (Any, Any) => Boolean,
    notContains: (Any, Any) => Boolean,
    notEndsWith: (Any, Any) => Boolean,
    notEqual: (Any, Any) => Boolean
  ): textFilter = {
    val __obj = js.Dynamic.literal(beginsWith = js.Any.fromFunction2(beginsWith), contains = js.Any.fromFunction2(contains), endsWith = js.Any.fromFunction2(endsWith), equal = js.Any.fromFunction2(equal), notBeginsWith = js.Any.fromFunction2(notBeginsWith), notContains = js.Any.fromFunction2(notContains), notEndsWith = js.Any.fromFunction2(notEndsWith), notEqual = js.Any.fromFunction2(notEqual))
    __obj.asInstanceOf[textFilter]
  }
  
  extension [Self <: textFilter](x: Self) {
    
    inline def setBeginsWith(value: (Any, Any) => Boolean): Self = StObject.set(x, "beginsWith", js.Any.fromFunction2(value))
    
    inline def setContains(value: (Any, Any) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
    
    inline def setEndsWith(value: (Any, Any) => Boolean): Self = StObject.set(x, "endsWith", js.Any.fromFunction2(value))
    
    inline def setEqual(value: (Any, Any) => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
    
    inline def setNotBeginsWith(value: (Any, Any) => Boolean): Self = StObject.set(x, "notBeginsWith", js.Any.fromFunction2(value))
    
    inline def setNotContains(value: (Any, Any) => Boolean): Self = StObject.set(x, "notContains", js.Any.fromFunction2(value))
    
    inline def setNotEndsWith(value: (Any, Any) => Boolean): Self = StObject.set(x, "notEndsWith", js.Any.fromFunction2(value))
    
    inline def setNotEqual(value: (Any, Any) => Boolean): Self = StObject.set(x, "notEqual", js.Any.fromFunction2(value))
  }
}
