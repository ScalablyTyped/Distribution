package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Collections")
@js.native
object Collections extends js.Object {
  @js.native
  class HashTable[TKey, TValue] protected ()
    extends typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] {
    def this(capacity: Double, hash: js.Function1[/* k */ TKey, Double]) = this()
    /* CompleteClass */
    override var count: js.Any = js.native
    /* CompleteClass */
    override var entries: js.Any = js.native
    /* CompleteClass */
    override var hash: js.Any = js.native
    /* CompleteClass */
    override def add(key: TKey, value: TValue): Unit = js.native
    /* CompleteClass */
    /* private */ override def addEntry(key: js.Any, value: js.Any, hashCode: js.Any): js.Any = js.native
    /* CompleteClass */
    /* private */ override def addOrSet(key: js.Any, value: js.Any, throwOnExistingEntry: js.Any): js.Any = js.native
    /* CompleteClass */
    /* private */ override def computeHashCode(key: js.Any): js.Any = js.native
    /* CompleteClass */
    override def containsKey(key: TKey): Boolean = js.native
    /* CompleteClass */
    /* private */ override def findEntry(key: js.Any, hashCode: js.Any): js.Any = js.native
    /* CompleteClass */
    override def get(key: TKey): TValue = js.native
    /* CompleteClass */
    /* private */ override def grow(): js.Any = js.native
    /* CompleteClass */
    override def set(key: TKey, value: TValue): Unit = js.native
  }
  
  @js.native
  class StringTable protected ()
    extends typings.typescriptServices.TypeScript.Collections.StringTable {
    def this(capacity: Double) = this()
    /* CompleteClass */
    override var count: js.Any = js.native
    /* CompleteClass */
    override var entries: js.Any = js.native
    /* CompleteClass */
    override def addCharArray(key: js.Array[Double], start: Double, len: Double): String = js.native
    /* CompleteClass */
    /* private */ override def addEntry(text: js.Any, hashCode: js.Any): js.Any = js.native
    /* CompleteClass */
    /* private */ override def findCharArrayEntry(key: js.Any, start: js.Any, len: js.Any, hashCode: js.Any): js.Any = js.native
    /* CompleteClass */
    /* private */ override def grow(): js.Any = js.native
  }
  
  var DefaultHashTableCapacity: Double = js.native
  var DefaultStringTable: typings.typescriptServices.TypeScript.Collections.StringTable = js.native
  var DefaultStringTableCapacity: Double = js.native
  def createHashTable[TKey, TValue](): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: Double): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: Double, hash: js.Function1[/* k */ TKey, Double]): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = js.native
  def identityHashCode(value: js.Any): Double = js.native
  /* static members */
  @js.native
  object StringTable extends js.Object {
    /* private */ def textCharArrayEquals(text: js.Any, array: js.Any, start: js.Any, length: js.Any): js.Any = js.native
  }
  
}

