package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.all
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.any
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.max
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.min
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.prod
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.sum
import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import typings.atTensorflowTfjsDashCore.distOpsReduceUnderscoreUtilMod.ReduceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/reduce_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglReduceUnderscoreGpuMod extends js.Object {
  @js.native
  class ReduceProgram protected () extends GPGPUProgram {
    def this(reduceInfo: ReduceInfo, reduceType: all) = this()
    def this(reduceInfo: ReduceInfo, reduceType: any) = this()
    def this(reduceInfo: ReduceInfo, reduceType: max) = this()
    def this(reduceInfo: ReduceInfo, reduceType: min) = this()
    def this(reduceInfo: ReduceInfo, reduceType: prod) = this()
    def this(reduceInfo: ReduceInfo, reduceType: sum) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

