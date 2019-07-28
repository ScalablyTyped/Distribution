package typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod

import typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod.TextureData
import typings.atTensorflowTfjsDashCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorData extends js.Object {
  var isUniform: Boolean
  var shape: js.Array[Double]
  var texData: TextureData
  var uniformValues: js.UndefOr[TypedArray] = js.undefined
}

object TensorData {
  @scala.inline
  def apply(
    isUniform: Boolean,
    shape: js.Array[Double],
    texData: TextureData,
    uniformValues: TypedArray = null
  ): TensorData = {
    val __obj = js.Dynamic.literal(isUniform = isUniform, shape = shape, texData = texData)
    if (uniformValues != null) __obj.updateDynamic("uniformValues")(uniformValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorData]
  }
}

