package typings
package winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a list entry that contains the identifier and metadata for a StorageFile or StorageFolder object in a list. */

trait AccessListEntry extends js.Object {
  /** Optional app-specified metadata associated with the StorageFile or StorageFolder in the list. */
  var metadata: java.lang.String
  /** The identifier of the StorageFile or StorageFolder in the list. */
  var token: java.lang.String
}

