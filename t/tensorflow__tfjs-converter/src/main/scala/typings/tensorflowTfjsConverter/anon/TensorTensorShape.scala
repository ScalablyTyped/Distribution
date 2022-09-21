package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TensorTensorShape extends StObject {
  
  var tensor: TensorShape
}
object TensorTensorShape {
  
  inline def apply(tensor: TensorShape): TensorTensorShape = {
    val __obj = js.Dynamic.literal(tensor = tensor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorTensorShape]
  }
  
  extension [Self <: TensorTensorShape](x: Self) {
    
    inline def setTensor(value: TensorShape): Self = StObject.set(x, "tensor", value.asInstanceOf[js.Any])
  }
}
