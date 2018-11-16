package typings
package webvrDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VRFrameData extends js.Object {
  val leftProjectionMatrix: stdLib.Float32Array
  val leftViewMatrix: stdLib.Float32Array
  val pose: VRPose
  val rightProjectionMatrix: stdLib.Float32Array
  val rightViewMatrix: stdLib.Float32Array
  val timestamp: scala.Double
}

@JSGlobal("VRFrameData")
@js.native
object VRFrameData
  extends ScalablyTyped.runtime.Instantiable0[VRFrameData]

