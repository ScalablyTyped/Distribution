package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreMathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/gpgpu_math", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compileProgram[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, K /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    gpgpu: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreContextMod.GPGPUContext,
    program: GPGPUProgram,
    inputs: js.Array[TensorData],
    output: TensorData
  ): GPGPUBinary = js.native
  def makeShaderKey(program: GPGPUProgram, inputs: js.Array[TensorData], output: TensorData): java.lang.String = js.native
  def runProgram[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, K /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    gpgpu: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreContextMod.GPGPUContext,
    binary: GPGPUBinary,
    inputs: js.Array[TensorData],
    output: TensorData
  ): scala.Unit = js.native
  def runProgram[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, K /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    gpgpu: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreContextMod.GPGPUContext,
    binary: GPGPUBinary,
    inputs: js.Array[TensorData],
    output: TensorData,
    customSetup: js.Function2[
      /* gpgpu */ atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreContextMod.GPGPUContext, 
      /* webGLProgram */ stdLib.WebGLProgram, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

