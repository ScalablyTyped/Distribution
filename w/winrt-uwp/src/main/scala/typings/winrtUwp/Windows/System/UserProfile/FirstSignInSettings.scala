package typings.winrtUwp.Windows.System.UserProfile

import typings.winrtUwp.AnonFirstSecond
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of settings that a user can opt-in to during the first run experience. */
@JSGlobal("Windows.System.UserProfile.FirstSignInSettings")
@js.native
abstract class FirstSignInSettings () extends js.Object {
  /** Returns the number of elements in the map. */
  var size: Double = js.native
  /**
    * Returns an iterator for the items in the collection.
    * @return The iterator.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Determines whether the map view contains the specified key.
    * @param key The key to locate in the map view.
    * @return true if the key is found; otherwise, false.
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * Returns the item in the map view with the specified key.
    * @param key The key to locate in the map view.
    * @return The item associated with the specified key.
    */
  def lookup(key: String): js.Any = js.native
  /**
    * Splits the map view into two views.
    */
  def split(): AnonFirstSecond = js.native
}

/* static members */
@JSGlobal("Windows.System.UserProfile.FirstSignInSettings")
@js.native
object FirstSignInSettings extends js.Object {
  /**
    * Gets the default instance of the settings.
    * @return The default instance of the settings.
    */
  def getDefault(): FirstSignInSettings = js.native
}

