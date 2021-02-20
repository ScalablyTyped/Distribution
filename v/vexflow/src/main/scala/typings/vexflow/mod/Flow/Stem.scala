package typings.vexflow.mod.Flow

import typings.vexflow.anon.Stemdirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Stem")
@js.native
class Stem protected ()
  extends typings.vexflow.Vex.Flow.Stem {
  def this(options: Stemdirection) = this()
}
object Stem {
  
  @JSImport("vexflow", "Flow.Stem")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.Stem.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.Stem.DOWN")
  @js.native
  val DOWN: Double = js.native
  
  @JSImport("vexflow", "Flow.Stem.UP")
  @js.native
  val UP: Double = js.native
}
