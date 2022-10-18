package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait HasShape extends StObject {
    
    var shape: Shape
  }
  object HasShape {
    
    inline def apply(shape: Shape): HasShape = {
      val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasShape]
    }
    
    extension [Self <: HasShape](x: Self) {
      
      inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "shape", js.Array(value*))
    }
  }
  
  type Kwargs = StringDictionary[Any]
  
  type LossOrMetricFn = js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]]
  
  trait NamedTensor extends StObject {
    
    var name: String
    
    var tensor: Tensor[Rank]
  }
  object NamedTensor {
    
    inline def apply(name: String, tensor: Tensor[Rank]): NamedTensor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tensor = tensor.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedTensor]
    }
    
    extension [Self <: NamedTensor](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTensor(value: Tensor[Rank]): Self = StObject.set(x, "tensor", value.asInstanceOf[js.Any])
    }
  }
  
  type RegularizerFn = js.Function0[Scalar]
  
  type RnnStepFunction = js.Function2[
    /* inputs */ Tensor[Rank], 
    /* states */ js.Array[Tensor[Rank]], 
    js.Tuple2[Tensor[Rank], js.Array[Tensor[Rank]]]
  ]
  
  type TensorOrArrayOrMap = Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap
}
