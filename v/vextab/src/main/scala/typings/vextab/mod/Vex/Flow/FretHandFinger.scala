package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.FretHandFinger")
@js.native
open class FretHandFinger protected ()
  extends typings.vexflow.mod.Flow.FretHandFinger {
  def this(number: String) = this()
  def this(number: Double) = this()
}
object FretHandFinger {
  
  @JSImport("vextab", "Vex.Flow.FretHandFinger")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vextab", "Vex.Flow.FretHandFinger.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  inline def format(nums: js.Array[typings.vexflow.Vex.Flow.FretHandFinger], state: Leftshift): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(nums.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
