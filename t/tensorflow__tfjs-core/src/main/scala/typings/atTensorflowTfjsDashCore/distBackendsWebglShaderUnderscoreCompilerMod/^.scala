package typings.atTensorflowTfjsDashCore.distBackendsWebglShaderUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/shader_compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCoordsDataType(rank: Double): String = js.native
  def makeShader(
    inputsInfo: js.Array[InputInfo],
    outputShape: ShapeInfo,
    userCode: String,
    usesPackedTextures: Boolean
  ): String = js.native
}

