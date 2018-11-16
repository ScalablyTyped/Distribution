package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorCommands extends js.Object {
  def addCommands(command_list: js.Object): scala.Unit = js.native
  def addCommands(command_list: js.Object, `type`: java.lang.String): scala.Unit = js.native
  def execCommand(command: java.lang.String): scala.Boolean = js.native
  def execCommand(command: java.lang.String, ui: scala.Boolean): scala.Boolean = js.native
  def execCommand(command: java.lang.String, ui: scala.Boolean, value: js.Object): scala.Boolean = js.native
  def execCommand(command: java.lang.String, ui: scala.Boolean, value: js.Object, args: js.Object): scala.Boolean = js.native
  def queryCommandState(command: java.lang.String): scala.Boolean | scala.Double = js.native
  def queryCommandSupported(command: java.lang.String): scala.Boolean = js.native
  def queryCommandValue(command: java.lang.String): js.Object = js.native
}

