package typings.vexflow.mod.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.StaveNote")
@js.native
class StaveNote protected ()
  extends typings.vexflow.Vex.Flow.StaveNote {
  def this(note_struct: typings.vexflow.anon.Clef) = this()
}
object StaveNote {
  
  @JSImport("vexflow", "Flow.StaveNote")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vexflow", "Flow.StaveNote.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.StaveNote.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.StaveNote.STEM_DOWN")
  @js.native
  val STEM_DOWN: Double = js.native
  
  @JSImport("vexflow", "Flow.StaveNote.STEM_UP")
  @js.native
  val STEM_UP: Double = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.StaveNote.format")
  @js.native
  def format(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote], state: Leftshift): Boolean = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.StaveNote.formatByY")
  @js.native
  def formatByY(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote], state: Leftshift): Unit = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.StaveNote.postFormat")
  @js.native
  def postFormat(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote]): Boolean = js.native
}
