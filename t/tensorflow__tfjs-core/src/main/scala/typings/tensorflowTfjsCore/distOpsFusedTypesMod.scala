package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distOpsConvUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsFusedTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.linear
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.prelu
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.elu
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu6
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.leakyrelu
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.sigmoid
  */
  trait Activation extends StObject
  object Activation {
    
    inline def elu: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.elu = "elu".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.elu]
    
    inline def leakyrelu: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.leakyrelu = "leakyrelu".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.leakyrelu]
    
    inline def linear: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.linear = "linear".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.linear]
    
    inline def prelu: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.prelu = "prelu".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.prelu]
    
    inline def relu: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu = "relu".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu]
    
    inline def relu6: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu6 = "relu6".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu6]
    
    inline def sigmoid: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.sigmoid = "sigmoid".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.sigmoid]
  }
  
  trait FusedBatchMatMulConfig extends StObject {
    
    var a: Tensor3D
    
    var activation: js.UndefOr[Activation] = js.undefined
    
    var b: Tensor3D
    
    var bias: js.UndefOr[Tensor[Rank]] = js.undefined
    
    var leakyreluAlpha: js.UndefOr[Double] = js.undefined
    
    var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.undefined
    
    var transposeA: Boolean
    
    var transposeB: Boolean
  }
  object FusedBatchMatMulConfig {
    
    inline def apply(a: Tensor3D, b: Tensor3D, transposeA: Boolean, transposeB: Boolean): FusedBatchMatMulConfig = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], transposeA = transposeA.asInstanceOf[js.Any], transposeB = transposeB.asInstanceOf[js.Any])
      __obj.asInstanceOf[FusedBatchMatMulConfig]
    }
    
    extension [Self <: FusedBatchMatMulConfig](x: Self) {
      
      inline def setA(value: Tensor3D): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setActivation(value: Activation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      inline def setB(value: Tensor3D): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBias(value: Tensor[Rank]): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setLeakyreluAlpha(value: Double): Self = StObject.set(x, "leakyreluAlpha", value.asInstanceOf[js.Any])
      
      inline def setLeakyreluAlphaUndefined: Self = StObject.set(x, "leakyreluAlpha", js.undefined)
      
      inline def setPreluActivationWeights(value: Tensor[Rank]): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
      
      inline def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
      
      inline def setTransposeA(value: Boolean): Self = StObject.set(x, "transposeA", value.asInstanceOf[js.Any])
      
      inline def setTransposeB(value: Boolean): Self = StObject.set(x, "transposeB", value.asInstanceOf[js.Any])
    }
  }
  
  trait FusedConv2DConfig extends StObject {
    
    var activation: js.UndefOr[Activation] = js.undefined
    
    var bias: js.UndefOr[Tensor[Rank]] = js.undefined
    
    var convInfo: Conv2DInfo
    
    var filter: Tensor4D
    
    var input: Tensor4D
    
    var leakyreluAlpha: js.UndefOr[Double] = js.undefined
    
    var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.undefined
  }
  object FusedConv2DConfig {
    
    inline def apply(convInfo: Conv2DInfo, filter: Tensor4D, input: Tensor4D): FusedConv2DConfig = {
      val __obj = js.Dynamic.literal(convInfo = convInfo.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[FusedConv2DConfig]
    }
    
    extension [Self <: FusedConv2DConfig](x: Self) {
      
      inline def setActivation(value: Activation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      inline def setBias(value: Tensor[Rank]): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      inline def setConvInfo(value: Conv2DInfo): Self = StObject.set(x, "convInfo", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: Tensor4D): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setInput(value: Tensor4D): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLeakyreluAlpha(value: Double): Self = StObject.set(x, "leakyreluAlpha", value.asInstanceOf[js.Any])
      
      inline def setLeakyreluAlphaUndefined: Self = StObject.set(x, "leakyreluAlpha", js.undefined)
      
      inline def setPreluActivationWeights(value: Tensor[Rank]): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
      
      inline def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
    }
  }
}
