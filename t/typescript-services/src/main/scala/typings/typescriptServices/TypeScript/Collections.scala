package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collections {
  
  trait HashTable[TKey, TValue] extends StObject {
    
    def add(key: TKey, value: TValue): Unit
    
    /* private */ def addEntry(key: Any, value: Any, hashCode: Any): Any
    
    /* private */ def addOrSet(key: Any, value: Any, throwOnExistingEntry: Any): Any
    
    /* private */ def computeHashCode(key: Any): Any
    
    def containsKey(key: TKey): Boolean
    
    /* private */ var count: Any
    
    /* private */ var entries: Any
    
    /* private */ def findEntry(key: Any, hashCode: Any): Any
    
    def get(key: TKey): TValue
    
    /* private */ def grow(): Any
    
    /* private */ var hash: Any
    
    def set(key: TKey, value: TValue): Unit
  }
  object HashTable {
    
    inline def apply[TKey, TValue](
      add: (TKey, TValue) => Unit,
      addEntry: (Any, Any, Any) => Any,
      addOrSet: (Any, Any, Any) => Any,
      computeHashCode: Any => Any,
      containsKey: TKey => Boolean,
      count: Any,
      entries: Any,
      findEntry: (Any, Any) => Any,
      get: TKey => TValue,
      grow: () => Any,
      hash: Any,
      set: (TKey, TValue) => Unit
    ): HashTable[TKey, TValue] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addEntry = js.Any.fromFunction3(addEntry), addOrSet = js.Any.fromFunction3(addOrSet), computeHashCode = js.Any.fromFunction1(computeHashCode), containsKey = js.Any.fromFunction1(containsKey), count = count.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], findEntry = js.Any.fromFunction2(findEntry), get = js.Any.fromFunction1(get), grow = js.Any.fromFunction0(grow), hash = hash.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[HashTable[TKey, TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashTable[?, ?], TKey, TValue] (val x: Self & (HashTable[TKey, TValue])) extends AnyVal {
      
      inline def setAdd(value: (TKey, TValue) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setAddEntry(value: (Any, Any, Any) => Any): Self = StObject.set(x, "addEntry", js.Any.fromFunction3(value))
      
      inline def setAddOrSet(value: (Any, Any, Any) => Any): Self = StObject.set(x, "addOrSet", js.Any.fromFunction3(value))
      
      inline def setComputeHashCode(value: Any => Any): Self = StObject.set(x, "computeHashCode", js.Any.fromFunction1(value))
      
      inline def setContainsKey(value: TKey => Boolean): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
      
      inline def setCount(value: Any): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setEntries(value: Any): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setFindEntry(value: (Any, Any) => Any): Self = StObject.set(x, "findEntry", js.Any.fromFunction2(value))
      
      inline def setGet(value: TKey => TValue): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGrow(value: () => Any): Self = StObject.set(x, "grow", js.Any.fromFunction0(value))
      
      inline def setHash(value: Any): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setSet(value: (TKey, TValue) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait StringTable extends StObject {
    
    def addCharArray(key: js.Array[Double], start: Double, len: Double): String
    
    /* private */ def addEntry(text: Any, hashCode: Any): Any
    
    /* private */ var count: Any
    
    /* private */ var entries: Any
    
    /* private */ def findCharArrayEntry(key: Any, start: Any, len: Any, hashCode: Any): Any
    
    /* private */ def grow(): Any
  }
  object StringTable {
    
    inline def apply(
      addCharArray: (js.Array[Double], Double, Double) => String,
      addEntry: (Any, Any) => Any,
      count: Any,
      entries: Any,
      findCharArrayEntry: (Any, Any, Any, Any) => Any,
      grow: () => Any
    ): StringTable = {
      val __obj = js.Dynamic.literal(addCharArray = js.Any.fromFunction3(addCharArray), addEntry = js.Any.fromFunction2(addEntry), count = count.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], findCharArrayEntry = js.Any.fromFunction4(findCharArrayEntry), grow = js.Any.fromFunction0(grow))
      __obj.asInstanceOf[StringTable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringTable] (val x: Self) extends AnyVal {
      
      inline def setAddCharArray(value: (js.Array[Double], Double, Double) => String): Self = StObject.set(x, "addCharArray", js.Any.fromFunction3(value))
      
      inline def setAddEntry(value: (Any, Any) => Any): Self = StObject.set(x, "addEntry", js.Any.fromFunction2(value))
      
      inline def setCount(value: Any): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setEntries(value: Any): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setFindCharArrayEntry(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "findCharArrayEntry", js.Any.fromFunction4(value))
      
      inline def setGrow(value: () => Any): Self = StObject.set(x, "grow", js.Any.fromFunction0(value))
    }
  }
}
