package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.avg
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/pool_gpu", JSImport.Namespace)
@js.native
object poolGpuMod extends js.Object {
  @js.native
  class Pool2DProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo, poolType: avg, computePositions: Boolean) = this()
    def this(convInfo: Conv2DInfo, poolType: max, computePositions: Boolean) = this()
    def this(convInfo: Conv2DInfo, poolType: avg, computePositions: Boolean, flattenPositions: Boolean) = this()
    def this(convInfo: Conv2DInfo, poolType: max, computePositions: Boolean, flattenPositions: Boolean) = this()
    def this(
      convInfo: Conv2DInfo,
      poolType: avg,
      computePositions: Boolean,
      flattenPositions: Boolean,
      includeBatchInIndex: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      poolType: max,
      computePositions: Boolean,
      flattenPositions: Boolean,
      includeBatchInIndex: Boolean
    ) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
  @js.native
  class Pool3DProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv3DInfo, poolType: avg, computePositions: Boolean) = this()
    def this(convInfo: Conv3DInfo, poolType: max, computePositions: Boolean) = this()
    def this(convInfo: Conv3DInfo, poolType: avg, computePositions: Boolean, flattenPositions: Boolean) = this()
    def this(convInfo: Conv3DInfo, poolType: max, computePositions: Boolean, flattenPositions: Boolean) = this()
    def this(
      convInfo: Conv3DInfo,
      poolType: avg,
      computePositions: Boolean,
      flattenPositions: Boolean,
      includeBatchInIndex: Boolean
    ) = this()
    def this(
      convInfo: Conv3DInfo,
      poolType: max,
      computePositions: Boolean,
      flattenPositions: Boolean,
      includeBatchInIndex: Boolean
    ) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

