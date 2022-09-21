package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimArray extends StObject {
  
  var dim: js.Array[Size]
}
object DimArray {
  
  inline def apply(dim: js.Array[Size]): DimArray = {
    val __obj = js.Dynamic.literal(dim = dim.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimArray]
  }
  
  extension [Self <: DimArray](x: Self) {
    
    inline def setDim(value: js.Array[Size]): Self = StObject.set(x, "dim", value.asInstanceOf[js.Any])
    
    inline def setDimVarargs(value: Size*): Self = StObject.set(x, "dim", js.Array(value*))
  }
}
