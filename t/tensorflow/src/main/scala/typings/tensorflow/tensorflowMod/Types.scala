package typings.tensorflow.tensorflowMod

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
  sealed trait float extends Types
  
  @js.native
  sealed trait int32 extends Types
  
  /* 1 */ val float: typings.tensorflow.tensorflowMod.Types.float with Double = js.native
  /* 3 */ val int32: typings.tensorflow.tensorflowMod.Types.int32 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Types with Double] = js.native
}

