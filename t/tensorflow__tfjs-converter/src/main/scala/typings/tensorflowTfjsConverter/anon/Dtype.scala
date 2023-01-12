package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dtype extends StObject {
  
  var dtype: String
}
object Dtype {
  
  inline def apply(dtype: String): Dtype = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dtype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dtype] (val x: Self) extends AnyVal {
    
    inline def setDtype(value: String): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
  }
}
