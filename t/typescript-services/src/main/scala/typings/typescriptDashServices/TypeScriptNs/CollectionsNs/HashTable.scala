package typings.typescriptDashServices.TypeScriptNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Collections.HashTable")
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

