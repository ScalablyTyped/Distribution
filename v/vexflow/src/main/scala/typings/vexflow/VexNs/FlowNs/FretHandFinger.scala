package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.FretHandFinger")
@js.native
class FretHandFinger protected () extends Modifier {
  def this(number: String) = this()
  def this(number: Double) = this()
  var finger: Double | String = js.native
  def setFretHandFinger(number: Double): FretHandFinger = js.native
  def setOffsetX(x: Double): FretHandFinger = js.native
  def setOffsetY(y: Double): FretHandFinger = js.native
}

/* static members */
@JSGlobal("Vex.Flow.FretHandFinger")
@js.native
object FretHandFinger extends js.Object {
  def format(nums: js.Array[FretHandFinger], state: Anon_Leftshift): Unit = js.native
}

