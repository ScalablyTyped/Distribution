package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreMathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorData extends js.Object {
  var isUniform: scala.Boolean
  var shape: js.Array[scala.Double]
  var texData: atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.TextureData
  var uniformValues: js.UndefOr[atTensorflowTfjsDashCoreLib.distTypesMod.TypedArray] = js.undefined
}

object TensorData {
  @scala.inline
  def apply(
    isUniform: scala.Boolean,
    shape: js.Array[scala.Double],
    texData: atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.TextureData,
    uniformValues: atTensorflowTfjsDashCoreLib.distTypesMod.TypedArray = null
  ): TensorData = {
    val __obj = js.Dynamic.literal(isUniform = isUniform, shape = shape, texData = texData)
    if (uniformValues != null) __obj.updateDynamic("uniformValues")(uniformValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorData]
  }
}

