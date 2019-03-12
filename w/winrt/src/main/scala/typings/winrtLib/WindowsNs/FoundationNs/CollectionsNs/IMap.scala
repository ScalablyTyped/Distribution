package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMap[K, V] extends IIterable[IKeyValuePair[K, V]] {
  var size: scala.Double
  def clear(): scala.Unit
  def getView(): IMapView[K, V]
  def hasKey(key: K): scala.Boolean
  def insert(key: K, value: V): scala.Boolean
  def lookup(key: K): V
  def remove(key: K): scala.Unit
}

object IMap {
  @scala.inline
  def apply[K, V](
    clear: () => scala.Unit,
    first: () => IIterator[IKeyValuePair[K, V]],
    getView: () => IMapView[K, V],
    hasKey: K => scala.Boolean,
    insert: (K, V) => scala.Boolean,
    lookup: K => V,
    remove: K => scala.Unit,
    size: scala.Double
  ): IMap[K, V] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size)
  
    __obj.asInstanceOf[IMap[K, V]]
  }
}

