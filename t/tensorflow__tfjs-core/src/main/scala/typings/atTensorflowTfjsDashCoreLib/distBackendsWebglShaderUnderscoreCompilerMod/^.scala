package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglShaderUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/shader_compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCoordsDataType(rank: scala.Double): java.lang.String = js.native
  def makeShader(
    inputsInfo: js.Array[InputInfo],
    outputShape: ShapeInfo,
    userCode: java.lang.String,
    usesPackedTextures: scala.Boolean
  ): java.lang.String = js.native
}

