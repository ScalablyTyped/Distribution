package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgMaxAttrs extends StObject {
  
  var axis: Double
}
object ArgMaxAttrs {
  
  inline def apply(axis: Double): ArgMaxAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgMaxAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgMaxAttrs] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
  }
}
