package typings.winrtDashUwp.Windows.Media.Core

import typings.winrtDashUwp.Windows.Foundation.Collections.IIterator
import typings.winrtDashUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties for the MediaStreamSample . */
@JSGlobal("Windows.Media.Core.MediaStreamSamplePropertySet")
@js.native
abstract class MediaStreamSamplePropertySet () extends js.Object {
  /** Gets the number of items contained in the property set. */
  var size: Double = js.native
  /** Removes all items from the property set. */
  def clear(): Unit = js.native
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The iterator. The current position of the iterator is index 0, or the end of the property set if the property set is empty.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Gets an immutable view of the property set.
    * @return The immutable view.
    */
  def getView(): IMapView[String, _] = js.native
  /**
    * Indicates if the specified key exists in the property set.
    * @param key The key to check.
    * @return true if the key exists; otherwise, false.
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * Adds the specified key and value to the property set.
    * @param key The key to add.
    * @param value The value of the key.
    * @return True if the method replaces a value that already exists for the key; false if this is a new key.
    */
  def insert(key: String, value: js.Any): Boolean = js.native
  /**
    * Retrieves the value for the specified key.
    * @param key The key to retrieve the value for.
    * @return The value, if an item with the specified key exists; otherwise, null.
    */
  def lookup(key: String): js.Any = js.native
  /**
    * Removes an item from the property set.
    * @param key The key to remove.
    */
  def remove(key: String): Unit = js.native
}

