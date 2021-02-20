package typings.vexflow.global.Vex.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Articulation")
@js.native
class Articulation protected ()
  extends typings.vexflow.Vex.Flow.Articulation {
  def this(`type`: String) = this()
}
object Articulation {
  
  @JSGlobal("Vex.Flow.Articulation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Vex.Flow.Articulation.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Articulation.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Vex.Flow.Articulation.format")
  @js.native
  def format(articulations: js.Array[typings.vexflow.Vex.Flow.Articulation], state: Leftshift): Boolean = js.native
}
