package typings.winrt.Windows.Foundation.Collections

import typings.winrt.AnonFirst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapView[K, V] extends IIterable[IKeyValuePair[K, V]] {
  var size: Double
  def hasKey(key: K): Boolean
  def lookup(key: K): V
  def split(): AnonFirst[K, V]
}

object IMapView {
  @scala.inline
  def apply[K, V](
    first: () => IIterator[IKeyValuePair[K, V]],
    hasKey: K => Boolean,
    lookup: K => V,
    size: Double,
    split: () => AnonFirst[K, V]
  ): IMapView[K, V] = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
    __obj.asInstanceOf[IMapView[K, V]]
  }
}

