package typings.vexflow.mod.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Ornament")
@js.native
class Ornament protected ()
  extends typings.vexflow.Vex.Flow.Ornament {
  def this(`type`: String) = this()
}
object Ornament {
  
  @JSImport("vexflow", "Flow.Ornament")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vexflow", "Flow.Ornament.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.Ornament.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vexflow", "Flow.Ornament.format")
  @js.native
  def format(ornaments: js.Array[typings.vexflow.Vex.Flow.Ornament], state: Leftshift): Boolean = js.native
}
