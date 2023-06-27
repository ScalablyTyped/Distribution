package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Vibrato")
@js.native
open class Vibrato ()
  extends typings.vexflow.mod.Flow.Vibrato
object Vibrato {
  
  @JSImport("vextab", "Vex.Flow.Vibrato")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vextab", "Vex.Flow.Vibrato.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  inline def format(
    vibratos: js.Array[typings.vexflow.Vex.Flow.Vibrato],
    state: Leftshift,
    context: typings.vexflow.Vex.Flow.ModifierContext
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(vibratos.asInstanceOf[js.Any], state.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
