package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHashTable[T] extends StObject {
  
  def add(key: String, data: T): Boolean
  
  def addOrUpdate(key: String, data: T): Boolean
  
  def count(): Double
  
  def every(fn: js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], context: Any): Boolean
  
  def getAllKeys(): js.Array[String]
  
  def lookup(key: String): T
  
  def map(fn: js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], context: Any): Unit
  
  def some(fn: js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], context: Any): Boolean
}
object IHashTable {
  
  inline def apply[T](
    add: (String, T) => Boolean,
    addOrUpdate: (String, T) => Boolean,
    count: () => Double,
    every: (js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], Any) => Boolean,
    getAllKeys: () => js.Array[String],
    lookup: String => T,
    map: (js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], Any) => Unit,
    some: (js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], Any) => Boolean
  ): IHashTable[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addOrUpdate = js.Any.fromFunction2(addOrUpdate), count = js.Any.fromFunction0(count), every = js.Any.fromFunction2(every), getAllKeys = js.Any.fromFunction0(getAllKeys), lookup = js.Any.fromFunction1(lookup), map = js.Any.fromFunction2(map), some = js.Any.fromFunction2(some))
    __obj.asInstanceOf[IHashTable[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHashTable[?], T] (val x: Self & IHashTable[T]) extends AnyVal {
    
    inline def setAdd(value: (String, T) => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setAddOrUpdate(value: (String, T) => Boolean): Self = StObject.set(x, "addOrUpdate", js.Any.fromFunction2(value))
    
    inline def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    inline def setEvery(value: (js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], Any) => Boolean): Self = StObject.set(x, "every", js.Any.fromFunction2(value))
    
    inline def setGetAllKeys(value: () => js.Array[String]): Self = StObject.set(x, "getAllKeys", js.Any.fromFunction0(value))
    
    inline def setLookup(value: String => T): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
    
    inline def setMap(value: (js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], Any) => Unit): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    inline def setSome(value: (js.Function3[/* k */ String, /* value */ T, /* context */ Any, Unit], Any) => Boolean): Self = StObject.set(x, "some", js.Any.fromFunction2(value))
  }
}
