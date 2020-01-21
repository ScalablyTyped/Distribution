package typings.vexflow.Vex.Flow

import typings.vexflow.AnonLeftshift
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
  val CATEGORY: String = js.native
  def format(vibratos: js.Array[Vibrato], state: AnonLeftshift, context: ModifierContext): Boolean = js.native
}

