package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CastAttrs extends StObject {
  
  var dtype: DataType
}
object CastAttrs {
  
  inline def apply(dtype: DataType): CastAttrs = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CastAttrs] (val x: Self) extends AnyVal {
    
    inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
  }
}
