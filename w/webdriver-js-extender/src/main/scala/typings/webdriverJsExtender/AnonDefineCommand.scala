package typings.webdriverJsExtender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefineCommand extends js.Object {
  def defineCommand(name: String, method: String, path: String): Unit
}

object AnonDefineCommand {
  @scala.inline
  def apply(defineCommand: (String, String, String) => Unit): AnonDefineCommand = {
    val __obj = js.Dynamic.literal(defineCommand = js.Any.fromFunction3(defineCommand))
    __obj.asInstanceOf[AnonDefineCommand]
  }
}

