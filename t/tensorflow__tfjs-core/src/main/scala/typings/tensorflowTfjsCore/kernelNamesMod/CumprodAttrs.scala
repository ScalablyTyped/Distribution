package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CumprodAttrs extends StObject {
  
  var axis: Double
  
  var exclusive: Boolean
  
  var reverse: Boolean
}
object CumprodAttrs {
  
  inline def apply(axis: Double, exclusive: Boolean, reverse: Boolean): CumprodAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CumprodAttrs]
  }
  
  extension [Self <: CumprodAttrs](x: Self) {
    
    inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
  }
}
