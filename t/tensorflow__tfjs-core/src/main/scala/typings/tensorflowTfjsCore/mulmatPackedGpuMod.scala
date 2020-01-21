package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/mulmat_packed_gpu", JSImport.Namespace)
@js.native
object mulmatPackedGpuMod extends js.Object {
  @js.native
  class MatMulPackedProgram protected () extends GPGPUProgram {
    def this(aShape: js.Tuple3[Double, Double, Double], outputShape: js.Tuple3[Double, Double, Double]) = this()
    def this(
      aShape: js.Tuple3[Double, Double, Double],
      outputShape: js.Tuple3[Double, Double, Double],
      transposeA: Boolean
    ) = this()
    def this(
      aShape: js.Tuple3[Double, Double, Double],
      outputShape: js.Tuple3[Double, Double, Double],
      transposeA: Boolean,
      transposeB: Boolean
    ) = this()
    def this(
      aShape: js.Tuple3[Double, Double, Double],
      outputShape: js.Tuple3[Double, Double, Double],
      transposeA: Boolean,
      transposeB: Boolean,
      addBias: Boolean
    ) = this()
    def this(
      aShape: js.Tuple3[Double, Double, Double],
      outputShape: js.Tuple3[Double, Double, Double],
      transposeA: Boolean,
      transposeB: Boolean,
      addBias: Boolean,
      activation: String
    ) = this()
    def this(
      aShape: js.Tuple3[Double, Double, Double],
      outputShape: js.Tuple3[Double, Double, Double],
      transposeA: Boolean,
      transposeB: Boolean,
      addBias: Boolean,
      activation: String,
      hasPreluActivation: Boolean
    ) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_MatMulPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_MatMulPackedProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

