package typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPGPUProgram extends js.Object {
  var outputShape: js.Array[Double]
  var userCode: String
  var usesPackedTextures: js.UndefOr[Boolean] = js.undefined
  var variableNames: js.Array[String]
}

object GPGPUProgram {
  @scala.inline
  def apply(
    outputShape: js.Array[Double],
    userCode: String,
    variableNames: js.Array[String],
    usesPackedTextures: js.UndefOr[Boolean] = js.undefined
  ): GPGPUProgram = {
    val __obj = js.Dynamic.literal(outputShape = outputShape, userCode = userCode, variableNames = variableNames)
    if (!js.isUndefined(usesPackedTextures)) __obj.updateDynamic("usesPackedTextures")(usesPackedTextures)
    __obj.asInstanceOf[GPGPUProgram]
  }
}

