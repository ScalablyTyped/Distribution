package typings.tensorflowTfjsBackendCpu

import typings.std.Float32Array
import typings.tensorflowTfjsBackendCpu.anon.Indices
import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu", "MathBackendCPU")
  @js.native
  class MathBackendCPU ()
    extends typings.tensorflowTfjsBackendCpu.baseMod.MathBackendCPU
  
  object shared {
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.addImpl")
    @js.native
    val addImpl: SimpleBinaryKernelImpl = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.ceilImpl")
    @js.native
    val ceilImpl: SimpleUnaryImpl = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.expImpl")
    @js.native
    val expImpl: SimpleUnaryImpl = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.expm1Impl")
    @js.native
    val expm1Impl: SimpleUnaryImpl = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.floorImpl")
    @js.native
    val floorImpl: SimpleUnaryImpl = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.logImpl")
    @js.native
    val logImpl: SimpleUnaryImpl = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.maxImpl")
    @js.native
    def maxImpl(aVals: TypedArray, reduceSize: Double, outShape: js.Array[Double], dtype: DataType): TypedArray = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.multiplyImpl")
    @js.native
    val multiplyImpl: SimpleBinaryKernelImpl = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.notEqualImpl")
    @js.native
    val notEqualImpl: SimpleBinaryKernelImpl = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.rsqrtImpl")
    @js.native
    val rsqrtImpl: SimpleUnaryImpl = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.simpleAbsImpl")
    @js.native
    def simpleAbsImpl(vals: TypedArray): Float32Array = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.sliceImpl")
    @js.native
    def sliceImpl(
      vals: TypedArray,
      begin: js.Array[Double],
      size: js.Array[Double],
      shape: js.Array[Double],
      dtype: DataType
    ): TypedArray = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.squaredDifferenceImpl")
    @js.native
    val squaredDifferenceImpl: SimpleBinaryKernelImpl = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.subImpl")
    @js.native
    val subImpl: SimpleBinaryKernelImpl = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.transposeImpl")
    @js.native
    def transposeImpl(
      xVals: TypedArray,
      xShape: js.Array[Double],
      dtype: DataType,
      perm: js.Array[Double],
      newShape: js.Array[Double]
    ): TypedArray = js.native
    
    @JSImport("@tensorflow/tfjs-backend-cpu", "shared.uniqueImpl")
    @js.native
    def uniqueImpl(values: BackendValues, axis: Double, shape: js.Array[Double], dtype: DataType): Indices = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-cpu", "version_cpu")
  @js.native
  val versionCpu: /* "2.7.0" */ String = js.native
}
