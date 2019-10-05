package typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod

import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreContextMod.GPGPUContext
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/gpgpu_math", "compileProgram")
@js.native
object compileProgram extends js.Object {
  def apply[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](gpgpu: GPGPUContext, program: GPGPUProgram, inputs: js.Array[TensorData], output: TensorData): GPGPUBinary = js.native
}

