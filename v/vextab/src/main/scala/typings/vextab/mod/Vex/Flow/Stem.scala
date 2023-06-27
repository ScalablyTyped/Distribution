package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Stemdirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Stem")
@js.native
open class Stem protected ()
  extends typings.vexflow.mod.Flow.Stem {
  def this(options: Stemdirection) = this()
}
object Stem {
  
  @JSImport("vextab", "Vex.Flow.Stem")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.Stem.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vextab", "Vex.Flow.Stem.DOWN")
  @js.native
  val DOWN: Double = js.native
  
  @JSImport("vextab", "Vex.Flow.Stem.UP")
  @js.native
  val UP: Double = js.native
}
