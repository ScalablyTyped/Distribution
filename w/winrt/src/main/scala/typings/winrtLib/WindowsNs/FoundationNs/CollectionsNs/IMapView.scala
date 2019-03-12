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
    first: () => IIterator[IKeyValuePair[K, V]],
    hasKey: K => scala.Boolean,
    lookup: K => V,
    size: scala.Double,
    split: () => winrtLib.Anon_First[K, V]
  ): IMapView[K, V] = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size, split = js.Any.fromFunction0(split))
  
    __obj.asInstanceOf[IMapView[K, V]]
  }
}

