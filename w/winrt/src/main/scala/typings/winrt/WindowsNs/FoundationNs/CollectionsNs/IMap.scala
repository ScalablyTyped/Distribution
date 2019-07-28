package typings.winrt.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMap[K, V] extends IIterable[IKeyValuePair[K, V]] {
  var size: Double
  def clear(): Unit
  def getView(): IMapView[K, V]
  def hasKey(key: K): Boolean
  def insert(key: K, value: V): Boolean
  def lookup(key: K): V
  def remove(key: K): Unit
}

object IMap {
  @scala.inline
  def apply[K, V](
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[K, V]],
    getView: () => IMapView[K, V],
    hasKey: K => Boolean,
    insert: (K, V) => Boolean,
    lookup: K => V,
    remove: K => Unit,
    size: Double
  ): IMap[K, V] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size)
  
    __obj.asInstanceOf[IMap[K, V]]
  }
}

