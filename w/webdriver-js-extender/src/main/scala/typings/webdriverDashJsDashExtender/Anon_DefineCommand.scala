package typings.webdriverDashJsDashExtender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefineCommand extends js.Object {
  def defineCommand(name: String, method: String, path: String): Unit
}

object Anon_DefineCommand {
  @scala.inline
  def apply(defineCommand: (String, String, String) => Unit): Anon_DefineCommand = {
    val __obj = js.Dynamic.literal(defineCommand = js.Any.fromFunction3(defineCommand))
  
    __obj.asInstanceOf[Anon_DefineCommand]
  }
}

