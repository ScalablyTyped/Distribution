package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreMathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPGPUProgram extends js.Object {
  var outputShape: js.Array[scala.Double]
  var userCode: java.lang.String
  var usesPackedTextures: js.UndefOr[scala.Boolean] = js.undefined
  var variableNames: js.Array[java.lang.String]
}

object GPGPUProgram {
  @scala.inline
  def apply(
    outputShape: js.Array[scala.Double],
    userCode: java.lang.String,
    variableNames: js.Array[java.lang.String],
    usesPackedTextures: js.UndefOr[scala.Boolean] = js.undefined
  ): GPGPUProgram = {
    val __obj = js.Dynamic.literal(outputShape = outputShape, userCode = userCode, variableNames = variableNames)
    if (!js.isUndefined(usesPackedTextures)) __obj.updateDynamic("usesPackedTextures")(usesPackedTextures)
    __obj.asInstanceOf[GPGPUProgram]
  }
}

