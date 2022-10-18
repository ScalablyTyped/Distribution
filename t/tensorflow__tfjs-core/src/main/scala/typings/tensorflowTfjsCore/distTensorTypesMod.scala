package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Variable
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTensorTypesMod {
  
  type GradSaveFunc = js.Function1[/* save */ js.Array[Tensor[Rank]], Unit]
  
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
  
  type NamedTensorMap = StringDictionary[Tensor[Rank]]
  
  type NamedVariableMap = StringDictionary[Variable[Rank]]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.tensorflowTfjsCore.distTensorTypesMod.TensorContainerObject
    - typings.tensorflowTfjsCore.distTensorTypesMod.TensorContainerArray
    - js.typedarray.Float32Array
    - js.typedarray.Int32Array
    - js.typedarray.Uint8Array
  */
  type TensorContainer = _TensorContainer | Tensor[Rank] | Unit | String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array
  
  @js.native
  trait TensorContainerArray
    extends StObject
       with Array[TensorContainer]
       with _TensorContainer
  
  trait TensorContainerObject
    extends StObject
       with /* x */ StringDictionary[TensorContainer]
       with _TensorContainer
  object TensorContainerObject {
    
    inline def apply(): TensorContainerObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TensorContainerObject]
    }
  }
  
  trait _TensorContainer extends StObject
}
