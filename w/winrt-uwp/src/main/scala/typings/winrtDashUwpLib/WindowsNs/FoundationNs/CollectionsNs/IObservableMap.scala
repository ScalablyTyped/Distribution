package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Notifies listeners of dynamic changes to a map, such as when items are added or removed. */
trait IObservableMap[K, V] extends IMap[K, V]

object IObservableMap {
  @scala.inline
  def apply[K, V](
    clear: js.Function0[scala.Unit],
    first: js.Function0[IIterator[IKeyValuePair[js.Any, js.Any]]],
    getView: js.Function0[IMapView[K, V]],
    hasKey: js.Function1[K, scala.Boolean],
    insert: js.Function2[K, V, scala.Boolean],
    lookup: js.Function1[K, V],
    remove: js.Function1[K, scala.Unit],
    size: scala.Double
  ): IObservableMap[K, V] = {
    val __obj = js.Dynamic.literal(clear = clear, first = first, getView = getView, hasKey = hasKey, insert = insert, lookup = lookup, remove = remove, size = size)
  
    __obj.asInstanceOf[IObservableMap[K, V]]
  }
}

