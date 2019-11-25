package typings.winrtDashUwp.Windows.Storage.AccessCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a list entry that contains the identifier and metadata for a StorageFile or StorageFolder object in a list. */
trait AccessListEntry extends js.Object {
  /** Optional app-specified metadata associated with the StorageFile or StorageFolder in the list. */
  var metadata: String
  /** The identifier of the StorageFile or StorageFolder in the list. */
  var token: String
}

object AccessListEntry {
  @scala.inline
  def apply(metadata: String, token: String): AccessListEntry = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccessListEntry]
  }
}

