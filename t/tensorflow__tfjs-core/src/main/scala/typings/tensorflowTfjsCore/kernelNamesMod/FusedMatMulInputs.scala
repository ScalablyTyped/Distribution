package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.kernelRegistryMod.NamedTensorInfoMap
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FusedMatMulInputs
  extends StObject
     with NamedTensorInfoMap {
  
  var a: TensorInfo
  
  var b: TensorInfo
  
  var bias: js.UndefOr[TensorInfo] = js.undefined
  
  var preluActivationWeights: js.UndefOr[TensorInfo] = js.undefined
}
object FusedMatMulInputs {
  
  @scala.inline
  def apply(a: TensorInfo, b: TensorInfo): FusedMatMulInputs = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedMatMulInputs]
  }
  
  @scala.inline
  implicit class FusedMatMulInputsMutableBuilder[Self <: FusedMatMulInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: TensorInfo): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: TensorInfo): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBias(value: TensorInfo): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    @scala.inline
    def setPreluActivationWeights(value: TensorInfo): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
  }
}
