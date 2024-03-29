package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Cps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Curve")
@js.native
open class Curve protected ()
  extends typings.vexflow.mod.Flow.Curve {
  def this(from: typings.vexflow.Vex.Flow.Note, to: typings.vexflow.Vex.Flow.Note) = this()
  def this(from: typings.vexflow.Vex.Flow.Note, to: typings.vexflow.Vex.Flow.Note, options: Cps) = this()
}
object Curve {
  
  @JSImport("vextab", "Vex.Flow.Curve")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.Curve.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vextab", "Vex.Flow.Curve.Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Curve.Position & Double] = js.native
    
    /* 1 */ val NEAR_HEAD: typings.vexflow.Vex.Flow.Curve.Position.NEAR_HEAD & Double = js.native
    
    /* 0 */ val NEAR_TOP: typings.vexflow.Vex.Flow.Curve.Position.NEAR_TOP & Double = js.native
  }
}
