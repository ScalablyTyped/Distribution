package typings.vscode.mod

import typings.vscode.anon.NewUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileRenameEvent extends js.Object {
  /**
    * The files that got renamed.
    */
  val files: js.Array[NewUri]
}

object FileRenameEvent {
  @scala.inline
  def apply(files: js.Array[NewUri]): FileRenameEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileRenameEvent]
  }
}

