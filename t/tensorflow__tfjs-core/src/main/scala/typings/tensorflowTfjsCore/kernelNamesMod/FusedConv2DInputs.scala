package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.kernelRegistryMod.NamedTensorInfoMap
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FusedConv2DInputs extends NamedTensorInfoMap {
  
  var bias: js.UndefOr[TensorInfo] = js.native
  
  var filter: TensorInfo = js.native
  
  var preluActivationWeights: js.UndefOr[TensorInfo] = js.native
  
  var x: TensorInfo = js.native
}
object FusedConv2DInputs {
  
  @scala.inline
  def apply(filter: TensorInfo, x: TensorInfo): FusedConv2DInputs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedConv2DInputs]
  }
  
  @scala.inline
  implicit class FusedConv2DInputsMutableBuilder[Self <: FusedConv2DInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBias(value: TensorInfo): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    @scala.inline
    def setFilter(value: TensorInfo): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreluActivationWeights(value: TensorInfo): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
    
    @scala.inline
    def setX(value: TensorInfo): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
