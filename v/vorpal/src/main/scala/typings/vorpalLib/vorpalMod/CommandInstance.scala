package typings
package vorpalLib.vorpalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vorpal", "CommandInstance")
@js.native
class CommandInstance () extends js.Object {
  def delimiter(value: java.lang.String): scala.Unit = js.native
  def log(value: java.lang.String, values: java.lang.String*): scala.Unit = js.native
  def prompt(prompt: js.Array[js.Object]): js.Promise[js.Object] = js.native
  def prompt(prompt: js.Object): js.Promise[js.Object] = js.native
}

