package typings.tensorflowTfjsCore.gpgpuMathMod

import typings.tensorflowTfjsCore.texUtilMod.PackingScheme
import typings.tensorflowTfjsCore.texUtilMod.TextureUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPGPUProgram extends js.Object {
  /**
    * The type of scheme to use when packing texels for the output values.
    * See `PackingScheme` for details. Defaults to `PackingScheme.SHARED_BATCH`.
    */
  var outPackingScheme: js.UndefOr[PackingScheme] = js.undefined
  /**
    * Affects what type of texture we allocate for the output. Defaults to
    * `TextureUsage.RENDER`.
    */
  var outTexUsage: js.UndefOr[TextureUsage] = js.undefined
  var outputShape: js.Array[Double]
  /** If true, this program expects packed input textures. Defaults to false. */
  var packedInputs: js.UndefOr[Boolean] = js.undefined
  /** If true, this program produces a packed texture. Defaults to false. */
  var packedOutput: js.UndefOr[Boolean] = js.undefined
  var userCode: String
  var variableNames: js.Array[String]
}

object GPGPUProgram {
  @scala.inline
  def apply(
    outputShape: js.Array[Double],
    userCode: String,
    variableNames: js.Array[String],
    outPackingScheme: PackingScheme = null,
    outTexUsage: TextureUsage = null,
    packedInputs: js.UndefOr[Boolean] = js.undefined,
    packedOutput: js.UndefOr[Boolean] = js.undefined
  ): GPGPUProgram = {
    val __obj = js.Dynamic.literal(outputShape = outputShape.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any], variableNames = variableNames.asInstanceOf[js.Any])
    if (outPackingScheme != null) __obj.updateDynamic("outPackingScheme")(outPackingScheme.asInstanceOf[js.Any])
    if (outTexUsage != null) __obj.updateDynamic("outTexUsage")(outTexUsage.asInstanceOf[js.Any])
    if (!js.isUndefined(packedInputs)) __obj.updateDynamic("packedInputs")(packedInputs.asInstanceOf[js.Any])
    if (!js.isUndefined(packedOutput)) __obj.updateDynamic("packedOutput")(packedOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPGPUProgram]
  }
}

