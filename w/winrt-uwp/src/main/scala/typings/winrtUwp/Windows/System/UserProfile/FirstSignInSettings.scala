package typings.winrtUwp.Windows.System.UserProfile

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.anon.Second
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of settings that a user can opt-in to during the first run experience. */
trait FirstSignInSettings extends js.Object {
  /** Returns the number of elements in the map. */
  var size: Double
  /**
    * Returns an iterator for the items in the collection.
    * @return The iterator.
    */
  def first(): IIterator[IKeyValuePair[_, _]]
  /**
    * Determines whether the map view contains the specified key.
    * @param key The key to locate in the map view.
    * @return true if the key is found; otherwise, false.
    */
  def hasKey(key: String): Boolean
  /**
    * Returns the item in the map view with the specified key.
    * @param key The key to locate in the map view.
    * @return The item associated with the specified key.
    */
  def lookup(key: String): js.Any
  /**
    * Splits the map view into two views.
    */
  def split(): Second
}

object FirstSignInSettings {
  @scala.inline
  def apply(
    first: () => IIterator[IKeyValuePair[_, _]],
    hasKey: String => Boolean,
    lookup: String => js.Any,
    size: Double,
    split: () => Second
  ): FirstSignInSettings = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
    __obj.asInstanceOf[FirstSignInSettings]
  }
}

