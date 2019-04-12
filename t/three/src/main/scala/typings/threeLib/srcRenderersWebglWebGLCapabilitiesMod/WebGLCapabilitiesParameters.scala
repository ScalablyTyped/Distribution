package typings
package threeLib.srcRenderersWebglWebGLCapabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLCapabilitiesParameters extends js.Object {
  var logarithmicDepthBuffer: js.UndefOr[js.Any] = js.undefined
  var precision: js.UndefOr[js.Any] = js.undefined
}

object WebGLCapabilitiesParameters {
  @scala.inline
  def apply(logarithmicDepthBuffer: js.Any = null, precision: js.Any = null): WebGLCapabilitiesParameters = {
    val __obj = js.Dynamic.literal()
    if (logarithmicDepthBuffer != null) __obj.updateDynamic("logarithmicDepthBuffer")(logarithmicDepthBuffer)
    if (precision != null) __obj.updateDynamic("precision")(precision)
    __obj.asInstanceOf[WebGLCapabilitiesParameters]
  }
}

