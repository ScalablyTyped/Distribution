package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An unchangeable view into a map of ResourceMap objects. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapView")
@js.native
abstract class ResourceMapMapView () extends js.Object {
  /** Gets the number of ResourceMap objects in the map. */
  var size: scala.Double = js.native
  /**
    * Returns an iterator to enumerate the items in the map view.
    * @return The iterator. The current position of the iterator is index 0, or the end of the map if the map is empty.
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]] = js.native
  /**
    * Determines whether the map view contains the specified key.
    * @param key The key to locate in the map view.
    * @return TRUE if the key is found, otherwise FALSE if it is not found.
    */
  def hasKey(key: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the ResourceMap at the specified key in the map view.
    * @param key The key to locate in the map view.
    * @return The ResourceMap associated with the specified key.
    */
  def lookup(key: java.lang.String): ResourceMap = js.native
  /**
    * Splits the map view into two views.
    */
  def split(): winrtDashUwpLib.Anon_FirstSecondIMapViewResourceMap = js.native
}

