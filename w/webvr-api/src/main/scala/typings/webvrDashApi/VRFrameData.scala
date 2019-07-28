package typings.webvrDashApi

import org.scalablytyped.runtime.Instantiable0
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRFrameData extends js.Object {
  val leftProjectionMatrix: Float32Array
  val leftViewMatrix: Float32Array
  val pose: VRPose
  val rightProjectionMatrix: Float32Array
  val rightViewMatrix: Float32Array
  val timestamp: Double
}

@JSGlobal("VRFrameData")
@js.native
class VRFrameDataCls () extends VRFrameData {
  /* CompleteClass */
  override val leftProjectionMatrix: Float32Array = js.native
  /* CompleteClass */
  override val leftViewMatrix: Float32Array = js.native
  /* CompleteClass */
  override val pose: VRPose = js.native
  /* CompleteClass */
  override val rightProjectionMatrix: Float32Array = js.native
  /* CompleteClass */
  override val rightViewMatrix: Float32Array = js.native
  /* CompleteClass */
  override val timestamp: Double = js.native
}

@JSGlobal("VRFrameData")
@js.native
object VRFrameData extends Instantiable0[VRFrameData]

