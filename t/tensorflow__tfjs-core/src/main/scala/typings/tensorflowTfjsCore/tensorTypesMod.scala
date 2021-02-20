package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Variable
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorTypesMod {
  
  type GradSaveFunc = js.Function1[/* save */ js.Array[Tensor[Rank]], Unit]
  
  @js.native
  trait NamedTensor extends StObject {
    
    var name: String = js.native
    
    var tensor: Tensor[Rank] = js.native
  }
  object NamedTensor {
    
    @scala.inline
    def apply(name: String, tensor: Tensor[Rank]): NamedTensor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tensor = tensor.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedTensor]
    }
    
    @scala.inline
    implicit class NamedTensorMutableBuilder[Self <: NamedTensor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTensor(value: Tensor[Rank]): Self = StObject.set(x, "tensor", value.asInstanceOf[js.Any])
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
    - typings.tensorflowTfjsCore.tensorTypesMod.TensorContainerObject
    - typings.tensorflowTfjsCore.tensorTypesMod.TensorContainerArray
    - typings.std.Float32Array
    - typings.std.Int32Array
    - typings.std.Uint8Array
  */
  type TensorContainer = _TensorContainer | Tensor[Rank] | Unit | String | Double | Boolean | Float32Array | Int32Array | Uint8Array
  
  @js.native
  trait TensorContainerArray
    extends Array[TensorContainer]
       with _TensorContainer
  
  @js.native
  trait TensorContainerObject
    extends /* x */ StringDictionary[TensorContainer]
       with _TensorContainer
  object TensorContainerObject {
    
    @scala.inline
    def apply(): TensorContainerObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TensorContainerObject]
    }
  }
  
  trait _TensorContainer extends StObject
}
