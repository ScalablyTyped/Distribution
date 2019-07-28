package typings.webcola

import typings.d3DashTimer.d3DashTimerMod.Timer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Callback extends js.Object {
  def apply(callback: js.Function1[/* elapsed */ Double, Unit]): Timer = js.native
  def apply(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer = js.native
  def apply(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer = js.native
}

