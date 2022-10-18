package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TensorShape extends StObject {
  
  var dtype: String
  
  var name: String
  
  var tensorShape: Dim
}
object TensorShape {
  
  inline def apply(dtype: String, name: String, tensorShape: Dim): TensorShape = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tensorShape = tensorShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorShape]
  }
  
  extension [Self <: TensorShape](x: Self) {
    
    inline def setDtype(value: String): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTensorShape(value: Dim): Self = StObject.set(x, "tensorShape", value.asInstanceOf[js.Any])
  }
}
