package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.anon.SecondIMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An unchangeable view into a map of ResourceQualifier objects. */
trait ResourceQualifierMapView extends js.Object {
  /** Gets the number of ResourceQualifier objects in the map. */
  var size: Double
  /**
    * Returns an iterator to enumerate the items in the map view.
    * @return The iterator. The current position of the iterator is index 0, or the end of the map view if the map view is empty.
    */
  def first(): IIterator[IKeyValuePair[_, _]]
  /**
    * Determines whether the map view contains the specified key.
    * @param key The key to locate in the map view.
    * @return TRUE if the key is found, otherwise FALSE if it is not found.
    */
  def hasKey(key: String): Boolean
  /**
    * Returns the qualifier name at the specified key in the map view.
    * @param key The key to locate in the map view.
    * @return The qualifier name associated with the specified key.
    */
  def lookup(key: String): String
  /**
    * Splits the map view into two views.
    */
  def split(): SecondIMapView
}

object ResourceQualifierMapView {
  @scala.inline
  def apply(
    first: () => IIterator[IKeyValuePair[_, _]],
    hasKey: String => Boolean,
    lookup: String => String,
    size: Double,
    split: () => SecondIMapView
  ): ResourceQualifierMapView = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
    __obj.asInstanceOf[ResourceQualifierMapView]
  }
}

