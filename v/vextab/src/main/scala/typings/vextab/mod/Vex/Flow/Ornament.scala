package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Ornament")
@js.native
open class Ornament protected ()
  extends typings.vexflow.mod.Flow.Ornament {
  def this(`type`: String) = this()
}
object Ornament {
  
  @JSImport("vextab", "Vex.Flow.Ornament")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vextab", "Vex.Flow.Ornament.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.Ornament.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def format(ornaments: js.Array[typings.vexflow.Vex.Flow.Ornament], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(ornaments.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
