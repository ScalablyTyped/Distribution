package typings.three.anon

import typings.three.nodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DotVH extends StObject {
  
  var dotVH: default
  
  var f0: default
  
  var f90: default
}
object DotVH {
  
  inline def apply(dotVH: default, f0: default, f90: default): DotVH = {
    val __obj = js.Dynamic.literal(dotVH = dotVH.asInstanceOf[js.Any], f0 = f0.asInstanceOf[js.Any], f90 = f90.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotVH]
  }
  
  extension [Self <: DotVH](x: Self) {
    
    inline def setDotVH(value: default): Self = StObject.set(x, "dotVH", value.asInstanceOf[js.Any])
    
    inline def setF0(value: default): Self = StObject.set(x, "f0", value.asInstanceOf[js.Any])
    
    inline def setF90(value: default): Self = StObject.set(x, "f90", value.asInstanceOf[js.Any])
  }
}
