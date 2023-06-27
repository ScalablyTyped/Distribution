package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.DurationLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Crescendo")
@js.native
open class Crescendo protected ()
  extends typings.vexflow.mod.Flow.Crescendo {
  def this(note_struct: DurationLine) = this()
}
object Crescendo {
  
  @JSImport("vextab", "Vex.Flow.Crescendo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.Crescendo.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
}
