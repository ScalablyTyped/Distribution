package typings.vexflow.mod.Flow

import typings.vexflow.AnonLeftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.GraceNoteGroup")
@js.native
class GraceNoteGroup protected ()
  extends typings.vexflow.Vex.Flow.GraceNoteGroup {
  def this(grace_notes: js.Array[typings.vexflow.Vex.Flow.GraceNote]) = this()
  def this(grace_notes: js.Array[typings.vexflow.Vex.Flow.GraceNote], show_slur: Boolean) = this()
}

/* static members */
@JSImport("vexflow", "Flow.GraceNoteGroup")
@js.native
object GraceNoteGroup extends js.Object {
  val CATEGORY: String = js.native
   //inconsistent name: 'show_slur' is called 'config', suggesting object (is boolean)
  var DEBUG: Boolean = js.native
  def format(gracenote_groups: js.Array[typings.vexflow.Vex.Flow.GraceNoteGroup], state: AnonLeftshift): Boolean = js.native
}

