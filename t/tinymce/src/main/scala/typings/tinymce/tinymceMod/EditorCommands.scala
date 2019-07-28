package typings.tinymce.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorCommands extends js.Object {
  def addCommands(command_list: js.Object): Unit = js.native
  def addCommands(command_list: js.Object, `type`: String): Unit = js.native
  def execCommand(command: String): Boolean = js.native
  def execCommand(command: String, ui: Boolean): Boolean = js.native
  def execCommand(command: String, ui: Boolean, value: js.Object): Boolean = js.native
  def execCommand(command: String, ui: Boolean, value: js.Object, args: js.Object): Boolean = js.native
  def queryCommandState(command: String): Boolean | Double = js.native
  def queryCommandSupported(command: String): Boolean = js.native
  def queryCommandValue(command: String): js.Object = js.native
}

