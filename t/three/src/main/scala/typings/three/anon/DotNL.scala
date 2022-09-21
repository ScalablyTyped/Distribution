package typings.three.anon

import typings.three.nodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DotNL extends StObject {
  
  var alpha: default
  
  var dotNL: default
  
  var dotNV: default
}
object DotNL {
  
  inline def apply(alpha: default, dotNL: default, dotNV: default): DotNL = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], dotNL = dotNL.asInstanceOf[js.Any], dotNV = dotNV.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotNL]
  }
  
  extension [Self <: DotNL](x: Self) {
    
    inline def setAlpha(value: default): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setDotNL(value: default): Self = StObject.set(x, "dotNL", value.asInstanceOf[js.Any])
    
    inline def setDotNV(value: default): Self = StObject.set(x, "dotNV", value.asInstanceOf[js.Any])
  }
}
