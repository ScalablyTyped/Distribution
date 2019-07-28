package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Vibrato")
@js.native
class Vibrato () extends Modifier {
  def setHarsh(harsh: Boolean): Vibrato = js.native
  def setVibratoWidth(width: Double): Vibrato = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Vibrato")
@js.native
object Vibrato extends js.Object {
  def format(vibratos: js.Array[Vibrato], state: Anon_Leftshift, context: ModifierContext): Boolean = js.native
}

