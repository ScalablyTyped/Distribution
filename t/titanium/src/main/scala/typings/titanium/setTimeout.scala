package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setTimeout")
@js.native
object setTimeout extends js.Object {
  /**
    * Executes code or a function after a delay.
    */
  def apply(func: js.Function1[/* repeated */ js.Any, Unit]): Double = js.native
  def apply(func: js.Function1[/* repeated */ js.Any, Unit], delay: Double): Double = js.native
}

