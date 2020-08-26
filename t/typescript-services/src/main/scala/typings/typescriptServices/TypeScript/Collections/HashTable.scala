package typings.typescriptServices.TypeScript.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashTable[TKey, TValue] extends js.Object {
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
  @scala.inline
  implicit class HashTableOps[Self <: HashTable[_, _], TKey, TValue] (val x: Self with (HashTable[TKey, TValue])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: (TKey, TValue) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def setAddEntry(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("addEntry", js.Any.fromFunction3(value))
    @scala.inline
    def setAddOrSet(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("addOrSet", js.Any.fromFunction3(value))
    @scala.inline
    def setComputeHashCode(value: js.Any => js.Any): Self = this.set("computeHashCode", js.Any.fromFunction1(value))
    @scala.inline
    def setContainsKey(value: TKey => Boolean): Self = this.set("containsKey", js.Any.fromFunction1(value))
    @scala.inline
    def setCount(value: js.Any): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntries(value: js.Any): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindEntry(value: (js.Any, js.Any) => js.Any): Self = this.set("findEntry", js.Any.fromFunction2(value))
    @scala.inline
    def setGet(value: TKey => TValue): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGrow(value: () => js.Any): Self = this.set("grow", js.Any.fromFunction0(value))
    @scala.inline
    def setHash(value: js.Any): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: (TKey, TValue) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

