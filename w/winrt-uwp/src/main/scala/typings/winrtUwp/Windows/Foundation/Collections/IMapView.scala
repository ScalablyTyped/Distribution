package typings.winrtUwp.Windows.Foundation.Collections

import typings.winrtUwp.AnonFirst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an immutable view into a map. */
trait IMapView[K, V]
  extends IIterable[IKeyValuePair[js.Any, js.Any]] {
  /** Gets the number of elements in the map. */
  var size: Double
  /**
    * Determines whether the map view contains the specified key.
    * @param key The key to locate in the map view.
    * @return True if the key is found; otherwise, false.
    */
  def hasKey(key: K): Boolean
  /**
    * Returns the item at the specified key in the map view.
    * @param key The key to locate in the map view.
    * @return The item associated with the specified key.
    */
  def lookup(key: K): V
  /**
    * Splits the map view into two views.
    */
  def split(): AnonFirst[K, V]
}

object IMapView {
  @scala.inline
  def apply[K, V](
    first: () => IIterator[IKeyValuePair[js.Any, js.Any]],
    hasKey: K => Boolean,
    lookup: K => V,
    size: Double,
    split: () => AnonFirst[K, V]
  ): IMapView[K, V] = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
  
    __obj.asInstanceOf[IMapView[K, V]]
  }
}

