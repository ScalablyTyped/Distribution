package typings.typescriptServices.TypeScript.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashTable[TKey, TValue] extends js.Object {
  var count: js.Any
  var entries: js.Any
  var hash: js.Any
  def add(key: TKey, value: TValue): Unit
  /* private */ def addEntry(key: js.Any, value: js.Any, hashCode: js.Any): js.Any
  /* private */ def addOrSet(key: js.Any, value: js.Any, throwOnExistingEntry: js.Any): js.Any
  /* private */ def computeHashCode(key: js.Any): js.Any
  def containsKey(key: TKey): Boolean
  /* private */ def findEntry(key: js.Any, hashCode: js.Any): js.Any
  def get(key: TKey): TValue
  /* private */ def grow(): js.Any
  def set(key: TKey, value: TValue): Unit
}

object HashTable {
  @scala.inline
  def apply[TKey, TValue](
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
}

