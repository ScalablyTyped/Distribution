package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.LineText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.TextDynamics")
@js.native
open class TextDynamics protected ()
  extends typings.vexflow.mod.Flow.TextDynamics {
  def this(text_struct: LineText) = this()
}
object TextDynamics {
  
  @JSImport("vextab", "Vex.Flow.TextDynamics")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.TextDynamics.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
}
