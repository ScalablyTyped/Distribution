package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandDimsAttrs extends StObject {
  
  var dim: Double
}
object ExpandDimsAttrs {
  
  inline def apply(dim: Double): ExpandDimsAttrs = {
    val __obj = js.Dynamic.literal(dim = dim.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandDimsAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpandDimsAttrs] (val x: Self) extends AnyVal {
    
    inline def setDim(value: Double): Self = StObject.set(x, "dim", value.asInstanceOf[js.Any])
  }
}
