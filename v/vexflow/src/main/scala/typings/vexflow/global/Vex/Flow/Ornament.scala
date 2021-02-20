package typings.vexflow.global.Vex.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Ornament")
@js.native
class Ornament protected ()
  extends typings.vexflow.Vex.Flow.Ornament {
  def this(`type`: String) = this()
}
object Ornament {
  
  @JSGlobal("Vex.Flow.Ornament")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Vex.Flow.Ornament.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Ornament.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Vex.Flow.Ornament.format")
  @js.native
  def format(ornaments: js.Array[typings.vexflow.Vex.Flow.Ornament], state: Leftshift): Boolean = js.native
}
