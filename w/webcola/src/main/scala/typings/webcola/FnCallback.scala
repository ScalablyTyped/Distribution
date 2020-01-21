package typings.webcola

import typings.d3Timer.mod.Timer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallback extends js.Object {
  def apply(callback: js.Function1[/* elapsed */ Double, Unit]): Timer_ = js.native
  def apply(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer_ = js.native
  def apply(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer_ = js.native
}

