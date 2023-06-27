package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Autostem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.GraceNote")
@js.native
open class GraceNote protected ()
  extends typings.vexflow.mod.Flow.GraceNote {
  def this(note_struct: Autostem) = this()
}
object GraceNote {
  
  @JSImport("vextab", "Vex.Flow.GraceNote")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.GraceNote.LEDGER_LINE_OFFSET")
  @js.native
  def LEDGER_LINE_OFFSET: Double = js.native
  inline def LEDGER_LINE_OFFSET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEDGER_LINE_OFFSET")(x.asInstanceOf[js.Any])
  
  @JSImport("vextab", "Vex.Flow.GraceNote.SCALE")
  @js.native
  val SCALE: Double = js.native
}
