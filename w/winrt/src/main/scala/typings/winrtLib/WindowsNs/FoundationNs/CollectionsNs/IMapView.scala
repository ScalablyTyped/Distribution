package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapView[K, V] extends IIterable[IKeyValuePair[K, V]] {
  var size: scala.Double
  def hasKey(key: K): scala.Boolean
  def lookup(key: K): V
  def split(): winrtLib.Anon_First[K, V]
}

object IMapView {
  @scala.inline
  def apply[K, V](
    first: js.Function0[IIterator[IKeyValuePair[K, V]]],
    hasKey: js.Function1[K, scala.Boolean],
    lookup: js.Function1[K, V],
    size: scala.Double,
    split: js.Function0[winrtLib.Anon_First[K, V]]
  ): IMapView[K, V] = {
    val __obj = js.Dynamic.literal(first = first, hasKey = hasKey, lookup = lookup, size = size, split = split)
  
    __obj.asInstanceOf[IMapView[K, V]]
  }
}

