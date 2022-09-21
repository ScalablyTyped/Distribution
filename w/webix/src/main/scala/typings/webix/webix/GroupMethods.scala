package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupMethods extends StObject {
  
  def any(property: String, data: Any): Unit
  
  def count(property: String, data: Any): Unit
  
  def max(property: String, data: Any): Unit
  
  def min(property: String, data: Any): Unit
  
  def string(property: String, data: Any): Unit
  
  def sum(property: String, data: Any): Unit
}
object GroupMethods {
  
  inline def apply(
    any: (String, Any) => Unit,
    count: (String, Any) => Unit,
    max: (String, Any) => Unit,
    min: (String, Any) => Unit,
    string: (String, Any) => Unit,
    sum: (String, Any) => Unit
  ): GroupMethods = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction2(any), count = js.Any.fromFunction2(count), max = js.Any.fromFunction2(max), min = js.Any.fromFunction2(min), string = js.Any.fromFunction2(string), sum = js.Any.fromFunction2(sum))
    __obj.asInstanceOf[GroupMethods]
  }
  
  extension [Self <: GroupMethods](x: Self) {
    
    inline def setAny(value: (String, Any) => Unit): Self = StObject.set(x, "any", js.Any.fromFunction2(value))
    
    inline def setCount(value: (String, Any) => Unit): Self = StObject.set(x, "count", js.Any.fromFunction2(value))
    
    inline def setMax(value: (String, Any) => Unit): Self = StObject.set(x, "max", js.Any.fromFunction2(value))
    
    inline def setMin(value: (String, Any) => Unit): Self = StObject.set(x, "min", js.Any.fromFunction2(value))
    
    inline def setString(value: (String, Any) => Unit): Self = StObject.set(x, "string", js.Any.fromFunction2(value))
    
    inline def setSum(value: (String, Any) => Unit): Self = StObject.set(x, "sum", js.Any.fromFunction2(value))
  }
}
