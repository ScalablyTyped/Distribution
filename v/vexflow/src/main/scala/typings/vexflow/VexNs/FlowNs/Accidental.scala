package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Accidental")
@js.native
class Accidental protected () extends Modifier {
  def this(`type`: String) = this()
  def setAsCautionary(): Accidental = js.native
  def setNote(note: StaveNote): Unit = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Accidental")
@js.native
object Accidental extends js.Object {
  var DEBUG: Boolean = js.native
  def applyAccidentals(voices: js.Array[Voice]): Unit = js.native
  def applyAccidentals(voices: js.Array[Voice], keySignature: String): Unit = js.native
  def format(accidentals: js.Array[Accidental], state: Anon_Leftshift): Unit = js.native
}

