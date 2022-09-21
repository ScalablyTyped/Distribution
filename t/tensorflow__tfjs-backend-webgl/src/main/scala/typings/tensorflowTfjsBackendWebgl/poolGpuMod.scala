package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.avg
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poolGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/pool_gpu", "Pool2DProgram")
  @js.native
  open class Pool2DProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(convInfo: Conv2DInfo, poolType: max | avg, computePositions: Boolean) = this()
    def this(convInfo: Conv2DInfo, poolType: max | avg, computePositions: Boolean, flattenPositions: Boolean) = this()
    def this(
      convInfo: Conv2DInfo,
      poolType: max | avg,
      computePositions: Boolean,
      flattenPositions: Boolean,
      includeBatchInIndex: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      poolType: max | avg,
      computePositions: Boolean,
      flattenPositions: Unit,
      includeBatchInIndex: Boolean
    ) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/pool_gpu", "Pool3DProgram")
  @js.native
  open class Pool3DProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(convInfo: Conv3DInfo, poolType: max | avg, computePositions: Boolean) = this()
    def this(convInfo: Conv3DInfo, poolType: max | avg, computePositions: Boolean, flattenPositions: Boolean) = this()
    def this(
      convInfo: Conv3DInfo,
      poolType: max | avg,
      computePositions: Boolean,
      flattenPositions: Boolean,
      includeBatchInIndex: Boolean
    ) = this()
    def this(
      convInfo: Conv3DInfo,
      poolType: max | avg,
      computePositions: Boolean,
      flattenPositions: Unit,
      includeBatchInIndex: Boolean
    ) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
