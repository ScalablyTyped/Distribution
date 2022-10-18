package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DtypeTensorShape extends StObject {
  
  var dtype: String
  
  var tensorShape: Dim
}
object DtypeTensorShape {
  
  inline def apply(dtype: String, tensorShape: Dim): DtypeTensorShape = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], tensorShape = tensorShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtypeTensorShape]
  }
  
  extension [Self <: DtypeTensorShape](x: Self) {
    
    inline def setDtype(value: String): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setTensorShape(value: Dim): Self = StObject.set(x, "tensorShape", value.asInstanceOf[js.Any])
  }
}
