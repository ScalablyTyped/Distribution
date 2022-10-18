package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeakyReluAttrs extends StObject {
  
  var alpha: Double
}
object LeakyReluAttrs {
  
  inline def apply(alpha: Double): LeakyReluAttrs = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeakyReluAttrs]
  }
  
  extension [Self <: LeakyReluAttrs](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
  }
}
