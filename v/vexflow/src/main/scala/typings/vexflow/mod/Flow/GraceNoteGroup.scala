package typings.vexflow.mod.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.GraceNoteGroup")
@js.native
class GraceNoteGroup protected ()
  extends typings.vexflow.Vex.Flow.GraceNoteGroup {
  def this(grace_notes: js.Array[typings.vexflow.Vex.Flow.GraceNote]) = this()
  def this(grace_notes: js.Array[typings.vexflow.Vex.Flow.GraceNote], show_slur: Boolean) = this()
}
object GraceNoteGroup {
  
  @JSImport("vexflow", "Flow.GraceNoteGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vexflow", "Flow.GraceNoteGroup.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  //inconsistent name: 'show_slur' is called 'config', suggesting object (is boolean)
  /* static member */
  @JSImport("vexflow", "Flow.GraceNoteGroup.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vexflow", "Flow.GraceNoteGroup.format")
  @js.native
  def format(gracenote_groups: js.Array[typings.vexflow.Vex.Flow.GraceNoteGroup], state: Leftshift): Boolean = js.native
}
