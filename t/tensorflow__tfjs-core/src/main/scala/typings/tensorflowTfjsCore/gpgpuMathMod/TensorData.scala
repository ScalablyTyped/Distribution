package typings.tensorflowTfjsCore.gpgpuMathMod

import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.texUtilMod.TextureData
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
    val __obj = js.Dynamic.literal(isUniform = isUniform.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], texData = texData.asInstanceOf[js.Any])
    if (uniformValues != null) __obj.updateDynamic("uniformValues")(uniformValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorData]
  }
}

