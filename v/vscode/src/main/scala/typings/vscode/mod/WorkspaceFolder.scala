package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFolder extends js.Object {
  /**
  		 * The ordinal number of this workspace folder.
  		 */
  val index: Double
  /**
  		 * The name of this workspace folder. Defaults to
  		 * the basename of its [uri-path](#Uri.path)
  		 */
  val name: String
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
  def apply(index: Double, name: String, uri: Uri): WorkspaceFolder = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkspaceFolder]
  }
}

