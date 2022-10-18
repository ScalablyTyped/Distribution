package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackAttrs extends StObject {
  
  var axis: Double
}
object PackAttrs {
  
  inline def apply(axis: Double): PackAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackAttrs]
  }
  
  extension [Self <: PackAttrs](x: Self) {
    
    inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
  }
}
