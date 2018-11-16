package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the changed event of a map collection. */

trait IMapChangedEventArgs[K] extends js.Object {
  /** Gets the type of change that occurred in the map. */
  var collectionChange: CollectionChange
  /** Gets the key of the item that changed. */
  var key: K
}

