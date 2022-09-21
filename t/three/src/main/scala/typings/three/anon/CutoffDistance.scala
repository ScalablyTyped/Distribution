package typings.three.anon

import typings.three.nodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CutoffDistance extends StObject {
  
  var cutoffDistance: default
  
  var decayExponent: default
  
  var lightDistance: default
}
object CutoffDistance {
  
  inline def apply(cutoffDistance: default, decayExponent: default, lightDistance: default): CutoffDistance = {
    val __obj = js.Dynamic.literal(cutoffDistance = cutoffDistance.asInstanceOf[js.Any], decayExponent = decayExponent.asInstanceOf[js.Any], lightDistance = lightDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CutoffDistance]
  }
  
  extension [Self <: CutoffDistance](x: Self) {
    
    inline def setCutoffDistance(value: default): Self = StObject.set(x, "cutoffDistance", value.asInstanceOf[js.Any])
    
    inline def setDecayExponent(value: default): Self = StObject.set(x, "decayExponent", value.asInstanceOf[js.Any])
    
    inline def setLightDistance(value: default): Self = StObject.set(x, "lightDistance", value.asInstanceOf[js.Any])
  }
}
