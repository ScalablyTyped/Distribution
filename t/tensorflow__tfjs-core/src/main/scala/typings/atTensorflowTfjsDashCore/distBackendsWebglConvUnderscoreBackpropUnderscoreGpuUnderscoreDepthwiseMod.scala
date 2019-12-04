package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import typings.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod.Conv2DInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/conv_backprop_gpu_depthwise", JSImport.Namespace)
@js.native
object distBackendsWebglConvUnderscoreBackpropUnderscoreGpuUnderscoreDepthwiseMod extends js.Object {
  @js.native
  class DepthwiseConv2DDerFilterProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
  @js.native
  class DepthwiseConv2DDerInputProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

