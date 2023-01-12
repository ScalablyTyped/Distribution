package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringHashTable[T]
  extends StObject
     with IHashTable[T] {
  
  /* private */ var itemCount: Any
  
  def remove(key: String): Unit
  
  /* private */ var table: Any
}
object StringHashTable {
  
  inline def apply[T](
    add: (String, T) => Boolean,
    addOrUpdate: (String, T) => Boolean,
    count: () => Double,
    every: (js.Function3[/* k */ String, T, /* context */ Any, Unit], Any) => Boolean,
    getAllKeys: () => js.Array[String],
    itemCount: Any,
    lookup: String => T,
    map: (js.Function3[/* k */ String, T, /* context */ Any, Unit], Any) => Unit,
    remove: String => Unit,
    some: (js.Function3[/* k */ String, T, /* context */ Any, Unit], Any) => Boolean,
    table: Any
  ): StringHashTable[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addOrUpdate = js.Any.fromFunction2(addOrUpdate), count = js.Any.fromFunction0(count), every = js.Any.fromFunction2(every), getAllKeys = js.Any.fromFunction0(getAllKeys), itemCount = itemCount.asInstanceOf[js.Any], lookup = js.Any.fromFunction1(lookup), map = js.Any.fromFunction2(map), remove = js.Any.fromFunction1(remove), some = js.Any.fromFunction2(some), table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringHashTable[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringHashTable[?], T] (val x: Self & StringHashTable[T]) extends AnyVal {
    
    inline def setItemCount(value: Any): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setTable(value: Any): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
