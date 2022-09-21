package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EinsumAttrs extends StObject {
  
  var equation: String
}
object EinsumAttrs {
  
  inline def apply(equation: String): EinsumAttrs = {
    val __obj = js.Dynamic.literal(equation = equation.asInstanceOf[js.Any])
    __obj.asInstanceOf[EinsumAttrs]
  }
  
  extension [Self <: EinsumAttrs](x: Self) {
    
    inline def setEquation(value: String): Self = StObject.set(x, "equation", value.asInstanceOf[js.Any])
  }
}
