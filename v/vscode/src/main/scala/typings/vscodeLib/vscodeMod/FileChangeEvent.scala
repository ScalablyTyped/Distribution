package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileChangeEvent extends js.Object {
  /**
  		 * The type of change.
  		 */
  var `type`: FileChangeType
  /**
  		 * The uri of the file that has changed.
  		 */
  var uri: Uri
}

object FileChangeEvent {
  @scala.inline
  def apply(`type`: FileChangeType, uri: Uri): FileChangeEvent = {
    val __obj = js.Dynamic.literal(uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FileChangeEvent]
  }
}

