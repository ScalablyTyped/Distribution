package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the changed event of a vector. */

trait IVectorChangedEventArgs extends js.Object {
  /** Gets the type of change that occurred in the vector. */
  var collectionChange: CollectionChange
  /** Gets the position where the change occurred in the vector. */
  var index: scala.Double
}

