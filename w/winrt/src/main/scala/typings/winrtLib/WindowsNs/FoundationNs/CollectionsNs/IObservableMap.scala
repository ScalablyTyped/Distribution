package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableMap[K, V] extends IMap[K, V] {
  var onmapchanged: js.Any
}

object IObservableMap {
  @scala.inline
  def apply[K, V](
    clear: js.Function0[scala.Unit],
    first: js.Function0[IIterator[IKeyValuePair[K, V]]],
    getView: js.Function0[IMapView[K, V]],
    hasKey: js.Function1[K, scala.Boolean],
    insert: js.Function2[K, V, scala.Boolean],
    lookup: js.Function1[K, V],
    onmapchanged: js.Any,
    remove: js.Function1[K, scala.Unit],
    size: scala.Double
  ): IObservableMap[K, V] = {
    val __obj = js.Dynamic.literal(clear = clear, first = first, getView = getView, hasKey = hasKey, insert = insert, lookup = lookup, onmapchanged = onmapchanged, remove = remove, size = size)
  
    __obj.asInstanceOf[IObservableMap[K, V]]
  }
}

