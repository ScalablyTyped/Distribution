package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.GraceNoteGroup")
@js.native
class GraceNoteGroup protected () extends Modifier {
  def this(grace_notes: js.Array[GraceNote]) = this()
  def this(grace_notes: js.Array[GraceNote], show_slur: scala.Boolean) = this()
  def beamNotes(): GraceNoteGroup = js.native
  def preFormat(): scala.Unit = js.native
  def setNote(note: StaveNote): Modifier = js.native
   //inconsistent type: void -> GraceNoteGroup
  @JSName("setWidth")
  def setWidth_Unit(width: scala.Double): scala.Unit = js.native
}

@JSGlobal("Vex.Flow.GraceNoteGroup")
@js.native
object GraceNoteGroup extends js.Object {
   //inconsistent name: 'show_slur' is called 'config', suggesting object (is boolean)
  var DEBUG: scala.Boolean = js.native
  def format(
    gracenote_groups: js.Array[vexflowLib.VexNs.FlowNs.GraceNoteGroup],
    state: vexflowLib.Anon_Leftshift
  ): scala.Boolean = js.native
}

