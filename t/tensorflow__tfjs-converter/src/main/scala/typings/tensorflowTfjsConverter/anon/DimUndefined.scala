package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimUndefined extends StObject {
  
  var dim: Unit
}
object DimUndefined {
  
  inline def apply(dim: Unit): DimUndefined = {
    val __obj = js.Dynamic.literal(dim = dim.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimUndefined] (val x: Self) extends AnyVal {
    
    inline def setDim(value: Unit): Self = StObject.set(x, "dim", value.asInstanceOf[js.Any])
  }
}
