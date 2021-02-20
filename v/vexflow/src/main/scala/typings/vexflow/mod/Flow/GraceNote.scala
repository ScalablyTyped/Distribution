package typings.vexflow.mod.Flow

import typings.vexflow.anon.Autostem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.GraceNote")
@js.native
class GraceNote protected ()
  extends typings.vexflow.Vex.Flow.GraceNote {
  def this(note_struct: Autostem) = this()
}
object GraceNote {
  
  @JSImport("vexflow", "Flow.GraceNote")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.GraceNote.LEDGER_LINE_OFFSET")
  @js.native
  def LEDGER_LINE_OFFSET: Double = js.native
  @scala.inline
  def LEDGER_LINE_OFFSET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEDGER_LINE_OFFSET")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.GraceNote.SCALE")
  @js.native
  val SCALE: Double = js.native
}
