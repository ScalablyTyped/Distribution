package typings.three.webGLCapabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLCapabilitiesParameters extends js.Object {
  var logarithmicDepthBuffer: js.UndefOr[Boolean] = js.undefined
  var precision: js.UndefOr[String] = js.undefined
}

object WebGLCapabilitiesParameters {
  @scala.inline
  def apply(logarithmicDepthBuffer: js.UndefOr[Boolean] = js.undefined, precision: String = null): WebGLCapabilitiesParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(logarithmicDepthBuffer)) __obj.updateDynamic("logarithmicDepthBuffer")(logarithmicDepthBuffer.get.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLCapabilitiesParameters]
  }
}

