package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileChangeEvent extends js.Object {
  /**
  		 * The type of change.
  		 */
  val `type`: FileChangeType
  /**
  		 * The uri of the file that has changed.
  		 */
  val uri: Uri
}

object FileChangeEvent {
  @scala.inline
  def apply(`type`: FileChangeType, uri: Uri): FileChangeEvent = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileChangeEvent]
  }
}

