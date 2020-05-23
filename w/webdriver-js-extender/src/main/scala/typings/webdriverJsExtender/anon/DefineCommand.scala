package typings.webdriverJsExtender.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineCommand extends js.Object {
  def defineCommand(name: String, method: String, path: String): Unit
}

object DefineCommand {
  @scala.inline
  def apply(defineCommand: (String, String, String) => Unit): DefineCommand = {
    val __obj = js.Dynamic.literal(defineCommand = js.Any.fromFunction3(defineCommand))
    __obj.asInstanceOf[DefineCommand]
  }
}

