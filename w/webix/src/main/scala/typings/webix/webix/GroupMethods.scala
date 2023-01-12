package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupMethods extends StObject {
  
  def any(property: String, data: obj): Unit
  
  def count(property: String, data: obj): Unit
  
  def max(property: String, data: obj): Unit
  
  def min(property: String, data: obj): Unit
  
  def string(property: String, data: obj): Unit
  
  def sum(property: String, data: obj): Unit
}
object GroupMethods {
  
  inline def apply(
    any: (String, obj) => Unit,
    count: (String, obj) => Unit,
    max: (String, obj) => Unit,
    min: (String, obj) => Unit,
    string: (String, obj) => Unit,
    sum: (String, obj) => Unit
  ): GroupMethods = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction2(any), count = js.Any.fromFunction2(count), max = js.Any.fromFunction2(max), min = js.Any.fromFunction2(min), string = js.Any.fromFunction2(string), sum = js.Any.fromFunction2(sum))
    __obj.asInstanceOf[GroupMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupMethods] (val x: Self) extends AnyVal {
    
    inline def setAny(value: (String, obj) => Unit): Self = StObject.set(x, "any", js.Any.fromFunction2(value))
    
    inline def setCount(value: (String, obj) => Unit): Self = StObject.set(x, "count", js.Any.fromFunction2(value))
    
    inline def setMax(value: (String, obj) => Unit): Self = StObject.set(x, "max", js.Any.fromFunction2(value))
    
    inline def setMin(value: (String, obj) => Unit): Self = StObject.set(x, "min", js.Any.fromFunction2(value))
    
    inline def setString(value: (String, obj) => Unit): Self = StObject.set(x, "string", js.Any.fromFunction2(value))
    
    inline def setSum(value: (String, obj) => Unit): Self = StObject.set(x, "sum", js.Any.fromFunction2(value))
  }
}
