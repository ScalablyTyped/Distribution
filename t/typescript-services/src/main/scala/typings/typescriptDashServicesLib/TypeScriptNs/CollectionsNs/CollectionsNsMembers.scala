package typings
package typescriptDashServicesLib.TypeScriptNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Collections")
@js.native
object CollectionsNsMembers extends js.Object {
  var DefaultHashTableCapacity: scala.Double = js.native
  var DefaultStringTable: StringTable = js.native
  var DefaultStringTableCapacity: scala.Double = js.native
  def createHashTable[TKey, TValue](): HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: scala.Double): HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: scala.Double, hash: js.Function1[/* k */ TKey, scala.Double]): HashTable[TKey, TValue] = js.native
  def identityHashCode(value: js.Any): scala.Double = js.native
}

