package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFolder extends js.Object {
  /**
  		 * The ordinal number of this workspace folder.
  		 */
  val index: scala.Double
  /**
  		 * The name of this workspace folder. Defaults to
  		 * the basename of its [uri-path](#Uri.path)
  		 */
  val name: java.lang.String
  /**
  		 * The associated uri for this workspace folder.
  		 *
  		 * *Note:* The [Uri](#Uri)-type was intentionally chosen such that future releases of the editor can support
  		 * workspace folders that are not stored on the local disk, e.g. `ftp://server/workspaces/foo`.
  		 */
  val uri: Uri
}

object WorkspaceFolder {
  @scala.inline
  def apply(index: scala.Double, name: java.lang.String, uri: Uri): WorkspaceFolder = {
    val __obj = js.Dynamic.literal(index = index, name = name, uri = uri)
  
    __obj.asInstanceOf[WorkspaceFolder]
  }
}

