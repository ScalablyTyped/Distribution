package typings.atTensorflowTfjsDashCore.distBackendsWebglShaderUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/shader_compiler", "makeShader")
@js.native
object makeShader extends js.Object {
  def apply(
    inputsInfo: js.Array[InputInfo],
    outputShape: ShapeInfo,
    userCode: String,
    usesPackedTextures: Boolean
  ): String = js.native
}

