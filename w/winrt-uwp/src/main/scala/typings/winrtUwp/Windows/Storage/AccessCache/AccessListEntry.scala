package typings.winrtUwp.Windows.Storage.AccessCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a list entry that contains the identifier and metadata for a StorageFile or StorageFolder object in a list. */
@js.native
trait AccessListEntry extends js.Object {
  /** Optional app-specified metadata associated with the StorageFile or StorageFolder in the list. */
  var metadata: String = js.native
  /** The identifier of the StorageFile or StorageFolder in the list. */
  var token: String = js.native
}

object AccessListEntry {
  @scala.inline
  def apply(metadata: String, token: String): AccessListEntry = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessListEntry]
  }
  @scala.inline
  implicit class AccessListEntryOps[Self <: AccessListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

