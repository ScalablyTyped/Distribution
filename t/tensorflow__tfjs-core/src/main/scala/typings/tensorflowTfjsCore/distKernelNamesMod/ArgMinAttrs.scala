package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgMinAttrs extends StObject {
  
  var axis: Double
}
object ArgMinAttrs {
  
  inline def apply(axis: Double): ArgMinAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgMinAttrs]
  }
  
  extension [Self <: ArgMinAttrs](x: Self) {
    
    inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
  }
}
