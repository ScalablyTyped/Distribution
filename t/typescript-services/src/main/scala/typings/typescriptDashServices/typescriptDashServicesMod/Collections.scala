package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Collections")
@js.native
object Collections extends js.Object {
  @js.native
  class HashTable[TKey, TValue] protected ()
    extends typings.typescriptDashServices.TypeScript.Collections.HashTable[TKey, TValue] {
    def this(capacity: Double, hash: js.Function1[/* k */ TKey, Double]) = this()
  }
  
  @js.native
  class StringTable protected ()
    extends typings.typescriptDashServices.TypeScript.Collections.StringTable {
    def this(capacity: Double) = this()
  }
  
  var DefaultHashTableCapacity: Double = js.native
  var DefaultStringTable: typings.typescriptDashServices.TypeScript.Collections.StringTable = js.native
  var DefaultStringTableCapacity: Double = js.native
  def createHashTable[TKey, TValue](): typings.typescriptDashServices.TypeScript.Collections.HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: Double): typings.typescriptDashServices.TypeScript.Collections.HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: Double, hash: js.Function1[/* k */ TKey, Double]): typings.typescriptDashServices.TypeScript.Collections.HashTable[TKey, TValue] = js.native
  def identityHashCode(value: js.Any): Double = js.native
  /* static members */
  @js.native
  object StringTable extends js.Object {
    /* private */ def textCharArrayEquals(text: js.Any, array: js.Any, start: js.Any, length: js.Any): js.Any = js.native
  }
  
}

