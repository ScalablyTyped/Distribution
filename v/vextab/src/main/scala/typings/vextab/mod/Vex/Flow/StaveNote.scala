package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.StaveNote")
@js.native
open class StaveNote protected ()
  extends typings.vexflow.mod.Flow.StaveNote {
  def this(note_struct: typings.vexflow.anon.Clef) = this()
}
object StaveNote {
  
  @JSImport("vextab", "Vex.Flow.StaveNote")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vextab", "Vex.Flow.StaveNote.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.StaveNote.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vextab", "Vex.Flow.StaveNote.STEM_DOWN")
  @js.native
  val STEM_DOWN: Double = js.native
  
  @JSImport("vextab", "Vex.Flow.StaveNote.STEM_UP")
  @js.native
  val STEM_UP: Double = js.native
  
  /* static member */
  inline def format(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(notes.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def formatByY(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote], state: Leftshift): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("formatByY")(notes.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def postFormat(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("postFormat")(notes.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
