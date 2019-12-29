package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Collections")
@js.native
object Collections extends js.Object {
  @js.native
  class HashTable[TKey, TValue] protected () extends js.Object {
    def this(capacity: Double, hash: js.Function1[/* k */ TKey, Double]) = this()
    var count: js.Any = js.native
    var entries: js.Any = js.native
    var hash: js.Any = js.native
    def add(key: TKey, value: TValue): Unit = js.native
    /* private */ def addEntry(key: js.Any, value: js.Any, hashCode: js.Any): js.Any = js.native
    /* private */ def addOrSet(key: js.Any, value: js.Any, throwOnExistingEntry: js.Any): js.Any = js.native
    /* private */ def computeHashCode(key: js.Any): js.Any = js.native
    def containsKey(key: TKey): Boolean = js.native
    /* private */ def findEntry(key: js.Any, hashCode: js.Any): js.Any = js.native
    def get(key: TKey): TValue = js.native
    /* private */ def grow(): js.Any = js.native
    def set(key: TKey, value: TValue): Unit = js.native
  }
  
  @js.native
  class StringTable protected () extends js.Object {
    def this(capacity: Double) = this()
    var count: js.Any = js.native
    var entries: js.Any = js.native
    def addCharArray(key: js.Array[Double], start: Double, len: Double): String = js.native
    /* private */ def addEntry(text: js.Any, hashCode: js.Any): js.Any = js.native
    /* private */ def findCharArrayEntry(key: js.Any, start: js.Any, len: js.Any, hashCode: js.Any): js.Any = js.native
    /* private */ def grow(): js.Any = js.native
  }
  
  var DefaultHashTableCapacity: Double = js.native
  var DefaultStringTable: StringTable = js.native
  var DefaultStringTableCapacity: Double = js.native
  def createHashTable[TKey, TValue](): HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: Double): HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: Double, hash: js.Function1[/* k */ TKey, Double]): HashTable[TKey, TValue] = js.native
  def identityHashCode(value: js.Any): Double = js.native
  /* static members */
  @js.native
  object StringTable extends js.Object {
    /* private */ def textCharArrayEquals(text: js.Any, array: js.Any, start: js.Any, length: js.Any): js.Any = js.native
  }
  
}

