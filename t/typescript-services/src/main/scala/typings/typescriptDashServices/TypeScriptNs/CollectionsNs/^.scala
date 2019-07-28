package typings.typescriptDashServices.TypeScriptNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Collections")
@js.native
object ^ extends js.Object {
  var DefaultHashTableCapacity: Double = js.native
  var DefaultStringTable: StringTable = js.native
  var DefaultStringTableCapacity: Double = js.native
  def createHashTable[TKey, TValue](): HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: Double): HashTable[TKey, TValue] = js.native
  def createHashTable[TKey, TValue](capacity: Double, hash: js.Function1[/* k */ TKey, Double]): HashTable[TKey, TValue] = js.native
  def identityHashCode(value: js.Any): Double = js.native
}

