package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TensorDtypeString extends StObject {
  
  var tensor: DtypeString
}
object TensorDtypeString {
  
  inline def apply(tensor: DtypeString): TensorDtypeString = {
    val __obj = js.Dynamic.literal(tensor = tensor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorDtypeString]
  }
  
  extension [Self <: TensorDtypeString](x: Self) {
    
    inline def setTensor(value: DtypeString): Self = StObject.set(x, "tensor", value.asInstanceOf[js.Any])
  }
}
