package typings.vexflow.Vex.Flow

import typings.vexflow.AnonLeftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.GraceNoteGroup")
@js.native
class GraceNoteGroup protected () extends Modifier {
  def this(grace_notes: js.Array[GraceNote]) = this()
  def this(grace_notes: js.Array[GraceNote], show_slur: Boolean) = this()
  def beamNotes(): GraceNoteGroup = js.native
  def preFormat(): Unit = js.native
  def setNote(note: StaveNote): Modifier = js.native
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes or type inconsistencies mentioned below are fixed
  @JSName("setWidth")
  def setWidth_Modifier(width: Double): Modifier = js.native
}

/* static members */
@JSGlobal("Vex.Flow.GraceNoteGroup")
@js.native
object GraceNoteGroup extends js.Object {
  val CATEGORY: String = js.native
   //inconsistent name: 'show_slur' is called 'config', suggesting object (is boolean)
  var DEBUG: Boolean = js.native
  def format(gracenote_groups: js.Array[GraceNoteGroup], state: AnonLeftshift): Boolean = js.native
}

