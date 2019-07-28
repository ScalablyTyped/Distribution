package typings.webvrDashApi

import org.scalablytyped.runtime.Instantiable0
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRPose extends js.Object {
  val angularAcceleration: Float32Array | Null
  val angularVelocity: Float32Array | Null
  val linearAcceleration: Float32Array | Null
  val linearVelocity: Float32Array | Null
  val orientation: Float32Array | Null
  val position: Float32Array | Null
  val timestamp: Double
}

@JSGlobal("VRPose")
@js.native
class VRPoseCls () extends VRPose {
  /* CompleteClass */
  override val angularAcceleration: Float32Array | Null = js.native
  /* CompleteClass */
  override val angularVelocity: Float32Array | Null = js.native
  /* CompleteClass */
  override val linearAcceleration: Float32Array | Null = js.native
  /* CompleteClass */
  override val linearVelocity: Float32Array | Null = js.native
  /* CompleteClass */
  override val orientation: Float32Array | Null = js.native
  /* CompleteClass */
  override val position: Float32Array | Null = js.native
  /* CompleteClass */
  override val timestamp: Double = js.native
}

@JSGlobal("VRPose")
@js.native
object VRPose extends Instantiable0[VRPose]

