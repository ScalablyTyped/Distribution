package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.FretHandFinger")
@js.native
class FretHandFinger protected () extends Modifier {
  def this(number: java.lang.String) = this()
  def this(number: scala.Double) = this()
  var finger: scala.Double | java.lang.String = js.native
  def setFretHandFinger(number: scala.Double): FretHandFinger = js.native
  def setOffsetX(x: scala.Double): FretHandFinger = js.native
  def setOffsetY(y: scala.Double): FretHandFinger = js.native
}

/* static members */
@JSGlobal("Vex.Flow.FretHandFinger")
@js.native
object FretHandFinger extends js.Object {
  def format(nums: js.Array[vexflowLib.VexNs.FlowNs.FretHandFinger], state: vexflowLib.Anon_Leftshift): scala.Unit = js.native
}

