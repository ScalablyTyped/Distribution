package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.anon.FirstIMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An unchangeable view into a map of ResourceMap objects. */
trait ResourceMapMapView extends js.Object {
  /** Gets the number of ResourceMap objects in the map. */
  var size: Double
  /**
    * Returns an iterator to enumerate the items in the map view.
    * @return The iterator. The current position of the iterator is index 0, or the end of the map if the map is empty.
    */
  def first(): IIterator[IKeyValuePair[_, _]]
  /**
    * Determines whether the map view contains the specified key.
    * @param key The key to locate in the map view.
    * @return TRUE if the key is found, otherwise FALSE if it is not found.
    */
  def hasKey(key: String): Boolean
  /**
    * Returns the ResourceMap at the specified key in the map view.
    * @param key The key to locate in the map view.
    * @return The ResourceMap associated with the specified key.
    */
  def lookup(key: String): ResourceMap
  /**
    * Splits the map view into two views.
    */
  def split(): FirstIMapView
}

object ResourceMapMapView {
  @scala.inline
  def apply(
    first: () => IIterator[IKeyValuePair[_, _]],
    hasKey: String => Boolean,
    lookup: String => ResourceMap,
    size: Double,
    split: () => FirstIMapView
  ): ResourceMapMapView = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
    __obj.asInstanceOf[ResourceMapMapView]
  }
}

