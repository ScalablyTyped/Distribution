package typings
package tensorflowLib.tensorflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Types extends js.Object

// TODO: This is an initial stab - work in progress.
@JSImport("tensorflow", "Types")
@js.native
object Types extends js.Object {
  @js.native
  sealed trait float
    extends tensorflowLib.tensorflowMod.Types
  
  @js.native
  sealed trait int32
    extends tensorflowLib.tensorflowMod.Types
  
  /* 1 */ val float: float with scala.Double = js.native
  /* 3 */ val int32: int32 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[tensorflowLib.tensorflowMod.Types with scala.Double] = js.native
}

