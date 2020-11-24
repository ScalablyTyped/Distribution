package typings.tensorflow.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Types extends js.Object
// TODO: This is an initial stab - work in progress.
@JSImport("tensorflow", "Types")
@js.native
object Types extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Types with Double] = js.native
  
  @js.native
  sealed trait float extends Types
  /* 1 */ @js.native
  object float extends TopLevel[float with Double]
  
  @js.native
  sealed trait int32 extends Types
  /* 3 */ @js.native
  object int32 extends TopLevel[int32 with Double]
}
