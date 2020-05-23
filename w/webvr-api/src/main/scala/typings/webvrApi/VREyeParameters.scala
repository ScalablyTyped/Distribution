package typings.webvrApi

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VREyeParameters extends js.Object {
  /** @deprecated */
  val fieldOfView: VRFieldOfView
  val offset: Float32Array
  val renderHeight: Double
  val renderWidth: Double
}

object VREyeParameters {
  @scala.inline
  def apply(fieldOfView: VRFieldOfView, offset: Float32Array, renderHeight: Double, renderWidth: Double): VREyeParameters = {
    val __obj = js.Dynamic.literal(fieldOfView = fieldOfView.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], renderHeight = renderHeight.asInstanceOf[js.Any], renderWidth = renderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VREyeParameters]
  }
}

