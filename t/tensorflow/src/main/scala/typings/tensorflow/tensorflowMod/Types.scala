package typings.tensorflow.tensorflowMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflow.tensorflowMod.Types.float
import typings.tensorflow.tensorflowMod.Types.int32
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Types with Double] = js.native
  /* 1 */ @js.native
  object float extends TopLevel[float with Double]
  
  /* 3 */ @js.native
  object int32 extends TopLevel[int32 with Double]
  
}

