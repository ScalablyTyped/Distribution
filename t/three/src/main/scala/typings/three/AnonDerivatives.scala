package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDerivatives extends js.Object {
  var derivatives: js.UndefOr[Boolean] = js.undefined
  var drawBuffers: js.UndefOr[Boolean] = js.undefined
  var fragDepth: js.UndefOr[Boolean] = js.undefined
  var shaderTextureLOD: js.UndefOr[Boolean] = js.undefined
}

object AnonDerivatives {
  @scala.inline
  def apply(
    derivatives: js.UndefOr[Boolean] = js.undefined,
    drawBuffers: js.UndefOr[Boolean] = js.undefined,
    fragDepth: js.UndefOr[Boolean] = js.undefined,
    shaderTextureLOD: js.UndefOr[Boolean] = js.undefined
  ): AnonDerivatives = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(derivatives)) __obj.updateDynamic("derivatives")(derivatives.asInstanceOf[js.Any])
    if (!js.isUndefined(drawBuffers)) __obj.updateDynamic("drawBuffers")(drawBuffers.asInstanceOf[js.Any])
    if (!js.isUndefined(fragDepth)) __obj.updateDynamic("fragDepth")(fragDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(shaderTextureLOD)) __obj.updateDynamic("shaderTextureLOD")(shaderTextureLOD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDerivatives]
  }
}

