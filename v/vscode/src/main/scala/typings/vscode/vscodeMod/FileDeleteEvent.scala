package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDeleteEvent extends js.Object {
  /**
  		 * The files that got deleted.
  		 */
  val files: js.Array[Uri]
}

object FileDeleteEvent {
  @scala.inline
  def apply(files: js.Array[Uri]): FileDeleteEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileDeleteEvent]
  }
}

