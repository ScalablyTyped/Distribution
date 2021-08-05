package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collections {
  
  trait HashTable[TKey, TValue] extends StObject {
    
    def add(key: TKey, value: TValue): Unit
    
    /* private */ def addEntry(key: js.Any, value: js.Any, hashCode: js.Any): js.Any
    
    /* private */ def addOrSet(key: js.Any, value: js.Any, throwOnExistingEntry: js.Any): js.Any
    
    /* private */ def computeHashCode(key: js.Any): js.Any
    
    def containsKey(key: TKey): Boolean
    
    /* private */ var count: js.Any
    
    /* private */ var entries: js.Any
    
    /* private */ def findEntry(key: js.Any, hashCode: js.Any): js.Any
    
    def get(key: TKey): TValue
    
    /* private */ def grow(): js.Any
    
    /* private */ var hash: js.Any
    
    def set(key: TKey, value: TValue): Unit
  }
  object HashTable {
    
    inline def apply[TKey, TValue](
      add: (TKey, TValue) => Unit,
      addEntry: (js.Any, js.Any, js.Any) => js.Any,
      addOrSet: (js.Any, js.Any, js.Any) => js.Any,
      computeHashCode: js.Any => js.Any,
      containsKey: TKey => Boolean,
      count: js.Any,
      entries: js.Any,
      findEntry: (js.Any, js.Any) => js.Any,
      get: TKey => TValue,
      grow: () => js.Any,
      hash: js.Any,
      set: (TKey, TValue) => Unit
    ): HashTable[TKey, TValue] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addEntry = js.Any.fromFunction3(addEntry), addOrSet = js.Any.fromFunction3(addOrSet), computeHashCode = js.Any.fromFunction1(computeHashCode), containsKey = js.Any.fromFunction1(containsKey), count = count.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], findEntry = js.Any.fromFunction2(findEntry), get = js.Any.fromFunction1(get), grow = js.Any.fromFunction0(grow), hash = hash.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[HashTable[TKey, TValue]]
    }
    
    extension [Self <: HashTable[?, ?], TKey, TValue](x: Self & (HashTable[TKey, TValue])) {
      
      inline def setAdd(value: (TKey, TValue) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setAddEntry(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "addEntry", js.Any.fromFunction3(value))
      
      inline def setAddOrSet(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "addOrSet", js.Any.fromFunction3(value))
      
      inline def setComputeHashCode(value: js.Any => js.Any): Self = StObject.set(x, "computeHashCode", js.Any.fromFunction1(value))
      
      inline def setContainsKey(value: TKey => Boolean): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
      
      inline def setCount(value: js.Any): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setEntries(value: js.Any): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setFindEntry(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "findEntry", js.Any.fromFunction2(value))
      
      inline def setGet(value: TKey => TValue): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGrow(value: () => js.Any): Self = StObject.set(x, "grow", js.Any.fromFunction0(value))
      
      inline def setHash(value: js.Any): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setSet(value: (TKey, TValue) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait StringTable extends StObject {
    
    def addCharArray(key: js.Array[Double], start: Double, len: Double): String
    
    /* private */ def addEntry(text: js.Any, hashCode: js.Any): js.Any
    
    /* private */ var count: js.Any
    
    /* private */ var entries: js.Any
    
    /* private */ def findCharArrayEntry(key: js.Any, start: js.Any, len: js.Any, hashCode: js.Any): js.Any
    
    /* private */ def grow(): js.Any
  }
  object StringTable {
    
    inline def apply(
      addCharArray: (js.Array[Double], Double, Double) => String,
      addEntry: (js.Any, js.Any) => js.Any,
      count: js.Any,
      entries: js.Any,
      findCharArrayEntry: (js.Any, js.Any, js.Any, js.Any) => js.Any,
      grow: () => js.Any
    ): StringTable = {
      val __obj = js.Dynamic.literal(addCharArray = js.Any.fromFunction3(addCharArray), addEntry = js.Any.fromFunction2(addEntry), count = count.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], findCharArrayEntry = js.Any.fromFunction4(findCharArrayEntry), grow = js.Any.fromFunction0(grow))
      __obj.asInstanceOf[StringTable]
    }
    
    extension [Self <: StringTable](x: Self) {
      
      inline def setAddCharArray(value: (js.Array[Double], Double, Double) => String): Self = StObject.set(x, "addCharArray", js.Any.fromFunction3(value))
      
      inline def setAddEntry(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "addEntry", js.Any.fromFunction2(value))
      
      inline def setCount(value: js.Any): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setEntries(value: js.Any): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setFindCharArrayEntry(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "findCharArrayEntry", js.Any.fromFunction4(value))
      
      inline def setGrow(value: () => js.Any): Self = StObject.set(x, "grow", js.Any.fromFunction0(value))
    }
  }
}
