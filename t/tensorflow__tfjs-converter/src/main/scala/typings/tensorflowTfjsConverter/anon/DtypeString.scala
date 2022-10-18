package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DtypeString extends StObject {
  
  var dtype: String
  
  var tensorShape: DimUndefined
}
object DtypeString {
  
  inline def apply(dtype: String, tensorShape: DimUndefined): DtypeString = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], tensorShape = tensorShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtypeString]
  }
  
  extension [Self <: DtypeString](x: Self) {
    
    inline def setDtype(value: String): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setTensorShape(value: DimUndefined): Self = StObject.set(x, "tensorShape", value.asInstanceOf[js.Any])
  }
}
