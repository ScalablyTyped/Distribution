package typings.titanium.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setInterval")
@js.native
object setInterval extends js.Object {
  /**
    * Executes a function repeatedly with a fixed time delay between each call to that function.
    */
  def apply(func: js.Function1[/* repeated */ js.Any, Unit]): Double = js.native
  def apply(func: js.Function1[/* repeated */ js.Any, Unit], delay: Double): Double = js.native
}

