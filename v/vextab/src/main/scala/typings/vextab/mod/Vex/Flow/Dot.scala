package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Dot")
@js.native
open class Dot ()
  extends typings.vexflow.mod.Flow.Dot
object Dot {
  
  @JSImport("vextab", "Vex.Flow.Dot")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vextab", "Vex.Flow.Dot.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  inline def format(dots: Double, state: Leftshift): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dots.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
