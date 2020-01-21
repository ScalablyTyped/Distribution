package typings.vexflow.Vex.Flow

import typings.vexflow.AnonLeftshift
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
  val CATEGORY: String = js.native
  def format(nums: js.Array[FretHandFinger], state: AnonLeftshift): Unit = js.native
}

