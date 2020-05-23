package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains info about the service that stores files and folders. Files and folders may be stored either by the local file system or by a remote service like Microsoft OneDrive. */
trait StorageProvider extends js.Object {
  /** Gets a user-friendly name for the current provider of files and folders. */
  var displayName: String
  /** Gets an identifier for the current provider of files and folders. */
  var id: String
}

object StorageProvider {
  @scala.inline
  def apply(displayName: String, id: String): StorageProvider = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageProvider]
  }
}

