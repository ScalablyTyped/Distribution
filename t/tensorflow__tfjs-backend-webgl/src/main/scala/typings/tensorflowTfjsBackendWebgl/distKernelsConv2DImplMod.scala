package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distOpsConvUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsConv2DImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Conv2D_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv2dByMatMul(param0: Conv2DConfig): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2dByMatMul")(param0.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  inline def conv2dWithIm2Row(param0: Conv2DConfig): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithIm2Row")(param0.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  trait Conv2DConfig extends StObject {
    
    var activation: js.UndefOr[Activation] = js.undefined
    
    var backend: MathBackendWebGL
    
    var bias: js.UndefOr[TensorInfo] = js.undefined
    
    var convInfo: Conv2DInfo
    
    var filter: TensorInfo
    
    var leakyreluAlpha: js.UndefOr[Double] = js.undefined
    
    var preluActivationWeights: js.UndefOr[TensorInfo] = js.undefined
    
    var x: TensorInfo
  }
  object Conv2DConfig {
    
    inline def apply(backend: MathBackendWebGL, convInfo: Conv2DInfo, filter: TensorInfo, x: TensorInfo): Conv2DConfig = {
      val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], convInfo = convInfo.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[Conv2DConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Conv2DConfig] (val x: Self) extends AnyVal {
      
      inline def setActivation(value: Activation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setBias(value: TensorInfo): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setConvInfo(value: Conv2DInfo): Self = StObject.set(x, "convInfo", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: TensorInfo): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setLeakyreluAlpha(value: Double): Self = StObject.set(x, "leakyreluAlpha", value.asInstanceOf[js.Any])
      
      inline def setLeakyreluAlphaUndefined: Self = StObject.set(x, "leakyreluAlpha", js.undefined)
      
      inline def setPreluActivationWeights(value: TensorInfo): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
      
      inline def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
      
      inline def setX(value: TensorInfo): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
}
