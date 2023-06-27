package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.GraceNoteGroup")
@js.native
open class GraceNoteGroup protected ()
  extends typings.vexflow.mod.Flow.GraceNoteGroup {
  def this(grace_notes: js.Array[typings.vexflow.Vex.Flow.GraceNote]) = this()
  def this(grace_notes: js.Array[typings.vexflow.Vex.Flow.GraceNote], show_slur: Boolean) = this()
}
object GraceNoteGroup {
  
  @JSImport("vextab", "Vex.Flow.GraceNoteGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vextab", "Vex.Flow.GraceNoteGroup.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  //inconsistent name: 'show_slur' is called 'config', suggesting object (is boolean)
  /* static member */
  @JSImport("vextab", "Vex.Flow.GraceNoteGroup.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def format(gracenote_groups: js.Array[typings.vexflow.Vex.Flow.GraceNoteGroup], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(gracenote_groups.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
