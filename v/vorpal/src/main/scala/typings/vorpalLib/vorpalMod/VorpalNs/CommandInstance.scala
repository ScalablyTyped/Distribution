package typings
package vorpalLib.vorpalMod.VorpalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandInstance extends js.Object {
  def delimiter(value: java.lang.String): scala.Unit = js.native
  def log(value: java.lang.String, values: java.lang.String*): scala.Unit = js.native
  def prompt(prompt: js.Array[js.Object]): stdLib.Promise[js.Object] = js.native
  def prompt(prompt: js.Object): stdLib.Promise[js.Object] = js.native
}

