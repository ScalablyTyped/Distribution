package typings.vscode.mod

import typings.vscode.AnonNewUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileRenameEvent extends js.Object {
  /**
  		 * The files that got renamed.
  		 */
  val files: js.Array[AnonNewUri]
}

object FileRenameEvent {
  @scala.inline
  def apply(files: js.Array[AnonNewUri]): FileRenameEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileRenameEvent]
  }
}

