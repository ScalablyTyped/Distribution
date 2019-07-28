package typings.vorpal.vorpalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vorpal", "CommandInstance")
@js.native
class CommandInstance () extends js.Object {
  def delimiter(value: String): Unit = js.native
  def log(value: String, values: String*): Unit = js.native
  def prompt(prompt: js.Array[js.Object]): js.Promise[js.Object] = js.native
  def prompt(prompt: js.Object): js.Promise[js.Object] = js.native
}

