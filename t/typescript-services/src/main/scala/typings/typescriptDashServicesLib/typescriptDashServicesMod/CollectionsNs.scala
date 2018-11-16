package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Collections")
@js.native
object CollectionsNs extends js.Object {
  @js.native
  class HashTable[TKey, TValue] protected ()
    extends typescriptDashServicesLib.TypeScriptNs.CollectionsNs.HashTable[TKey, TValue] {
    def this(capacity: scala.Double, hash: js.Function1[/* k */ TKey, scala.Double]) = this()
  }
  
  @js.native
  class StringTable protected ()
    extends typescriptDashServicesLib.TypeScriptNs.CollectionsNs.StringTable {
    def this(capacity: scala.Double) = this()
  }
  
  var DefaultHashTableCapacity: scala.Double = js.native
  var DefaultStringTable: typescriptDashServicesLib.TypeScriptNs.CollectionsNs.StringTable = js.native
  var DefaultStringTableCapacity: scala.Double = js.native
  def createHashTable[TKey, TValue](): typescriptDashServicesLib.TypeScriptNs.CollectionsNs.HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: scala.Double): typescriptDashServicesLib.TypeScriptNs.CollectionsNs.HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: scala.Double, hash: js.Function1[/* k */ TKey, scala.Double]): typescriptDashServicesLib.TypeScriptNs.CollectionsNs.HashTable[TKey, TValue] = js.native
  def identityHashCode(value: js.Any): scala.Double = js.native
  @js.native
  object StringTable extends js.Object {
    /* private */ def textCharArrayEquals(text: js.Any, array: js.Any, start: js.Any, length: js.Any): js.Any = js.native
  }
  
}

