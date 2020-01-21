package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCreateEvent extends js.Object {
  /**
  		 * The files that got created.
  		 */
  val files: js.Array[Uri]
}

object FileCreateEvent {
  @scala.inline
  def apply(files: js.Array[Uri]): FileCreateEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileCreateEvent]
  }
}

