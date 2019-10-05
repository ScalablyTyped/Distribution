package typings.winrtDashUwp.Windows.ApplicationModel.Resources.Core

import typings.winrtDashUwp.Anon_FirstSecondIMapViewString
import typings.winrtDashUwp.Windows.Foundation.Collections.IIterator
import typings.winrtDashUwp.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An unchangeable view into a map of ResourceQualifier objects. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView")
@js.native
abstract class ResourceQualifierMapView () extends js.Object {
  /** Gets the number of ResourceQualifier objects in the map. */
  var size: Double = js.native
  /**
    * Returns an iterator to enumerate the items in the map view.
    * @return The iterator. The current position of the iterator is index 0, or the end of the map view if the map view is empty.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Determines whether the map view contains the specified key.
    * @param key The key to locate in the map view.
    * @return TRUE if the key is found, otherwise FALSE if it is not found.
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * Returns the qualifier name at the specified key in the map view.
    * @param key The key to locate in the map view.
    * @return The qualifier name associated with the specified key.
    */
  def lookup(key: String): String = js.native
  /**
    * Splits the map view into two views.
    */
  def split(): Anon_FirstSecondIMapViewString = js.native
}

