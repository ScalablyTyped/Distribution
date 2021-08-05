package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mean extends StObject {
  
  var mean: Tensor[Rank]
  
  var variance: Tensor[Rank]
}
object Mean {
  
  inline def apply(mean: Tensor[Rank], variance: Tensor[Rank]): Mean = {
    val __obj = js.Dynamic.literal(mean = mean.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mean]
  }
  
  extension [Self <: Mean](x: Self) {
    
    inline def setMean(value: Tensor[Rank]): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    inline def setVariance(value: Tensor[Rank]): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
  }
}
