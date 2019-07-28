package typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod

import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreContextMod.GPGPUContext
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.std.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/gpgpu_math", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compileProgram[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](gpgpu: GPGPUContext, program: GPGPUProgram, inputs: js.Array[TensorData], output: TensorData): GPGPUBinary = js.native
  def makeShaderKey(program: GPGPUProgram, inputs: js.Array[TensorData], output: TensorData): String = js.native
  def runProgram[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](gpgpu: GPGPUContext, binary: GPGPUBinary, inputs: js.Array[TensorData], output: TensorData): Unit = js.native
  def runProgram[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](
    gpgpu: GPGPUContext,
    binary: GPGPUBinary,
    inputs: js.Array[TensorData],
    output: TensorData,
    customSetup: js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit]
  ): Unit = js.native
}

