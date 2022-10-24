package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsBatchMatMulImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/BatchMatMul_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/BatchMatMul_impl", "MATMUL_SHARED_DIM_THRESHOLD")
  @js.native
  val MATMUL_SHARED_DIM_THRESHOLD: /* 1000 */ Double = js.native
  
  inline def batchMatMulImpl(param0: BatchMatMulConfig): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("batchMatMulImpl")(param0.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  trait BatchMatMulConfig extends StObject {
    
    var a: TensorInfo
    
    var activation: js.UndefOr[Activation] = js.undefined
    
    var b: TensorInfo
    
    var backend: MathBackendWebGL
    
    var bias: js.UndefOr[TensorInfo] = js.undefined
    
    var leakyreluAlpha: js.UndefOr[Double] = js.undefined
    
    var preluActivationWeights: js.UndefOr[TensorInfo] = js.undefined
    
    var transposeA: Boolean
    
    var transposeB: Boolean
  }
  object BatchMatMulConfig {
    
    inline def apply(a: TensorInfo, b: TensorInfo, backend: MathBackendWebGL, transposeA: Boolean, transposeB: Boolean): BatchMatMulConfig = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], transposeA = transposeA.asInstanceOf[js.Any], transposeB = transposeB.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchMatMulConfig]
    }
    
    extension [Self <: BatchMatMulConfig](x: Self) {
      
      inline def setA(value: TensorInfo): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setActivation(value: Activation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      inline def setB(value: TensorInfo): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setBias(value: TensorInfo): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setLeakyreluAlpha(value: Double): Self = StObject.set(x, "leakyreluAlpha", value.asInstanceOf[js.Any])
      
      inline def setLeakyreluAlphaUndefined: Self = StObject.set(x, "leakyreluAlpha", js.undefined)
      
      inline def setPreluActivationWeights(value: TensorInfo): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
      
      inline def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
      
      inline def setTransposeA(value: Boolean): Self = StObject.set(x, "transposeA", value.asInstanceOf[js.Any])
      
      inline def setTransposeB(value: Boolean): Self = StObject.set(x, "transposeB", value.asInstanceOf[js.Any])
    }
  }
}
