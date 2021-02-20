package typings.vexflow.mod.Flow

import typings.vexflow.anon.LineText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.TextDynamics")
@js.native
class TextDynamics protected ()
  extends typings.vexflow.Vex.Flow.TextDynamics {
  def this(text_struct: LineText) = this()
}
object TextDynamics {
  
  @JSImport("vexflow", "Flow.TextDynamics")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.TextDynamics.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
}
