package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Accidental")
@js.native
class Accidental protected () extends Modifier {
  def this(`type`: java.lang.String) = this()
  def setAsCautionary(): Accidental = js.native
  def setNote(note: StaveNote): scala.Unit = js.native
}

@JSGlobal("Vex.Flow.Accidental")
@js.native
object Accidental extends js.Object {
  var DEBUG: scala.Boolean = js.native
  def applyAccidentals(voices: js.Array[vexflowLib.VexNs.FlowNs.Voice]): scala.Unit = js.native
  def applyAccidentals(voices: js.Array[vexflowLib.VexNs.FlowNs.Voice], keySignature: java.lang.String): scala.Unit = js.native
  def format(accidentals: js.Array[vexflowLib.VexNs.FlowNs.Accidental], state: vexflowLib.Anon_Leftshift): scala.Unit = js.native
}

