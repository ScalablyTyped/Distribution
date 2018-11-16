package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Vibrato")
@js.native
class Vibrato () extends Modifier {
  def setHarsh(harsh: scala.Boolean): Vibrato = js.native
  def setVibratoWidth(width: scala.Double): Vibrato = js.native
}

@JSGlobal("Vex.Flow.Vibrato")
@js.native
object Vibrato extends js.Object {
  def format(
    vibratos: js.Array[vexflowLib.VexNs.FlowNs.Vibrato],
    state: vexflowLib.Anon_Rightshift,
    context: vexflowLib.VexNs.FlowNs.ModifierContext
  ): scala.Boolean = js.native
}

