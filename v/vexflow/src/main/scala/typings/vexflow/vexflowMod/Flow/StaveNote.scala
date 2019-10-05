package typings.vexflow.vexflowMod.Flow

import typings.vexflow.Anon_AutostemClef
import typings.vexflow.Anon_Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.StaveNote")
@js.native
class StaveNote protected ()
  extends typings.vexflow.Vex.Flow.StaveNote {
  def this(note_struct: Anon_AutostemClef) = this()
}

/* static members */
@JSImport("vexflow", "Flow.StaveNote")
@js.native
object StaveNote extends js.Object {
  val CATEGORY: String = js.native
  var DEBUG: Boolean = js.native
  val STEM_DOWN: Double = js.native
  val STEM_UP: Double = js.native
  def format(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote], state: Anon_Leftshift): Boolean = js.native
  def formatByY(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote], state: Anon_Leftshift): Unit = js.native
  def postFormat(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote]): Boolean = js.native
}

