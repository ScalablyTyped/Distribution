package typings.three.anon

import typings.three.nodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait F0 extends StObject {
  
  var f0: default
  
  var f90: default
  
  var lightDirection: default
  
  var roughness: default
}
object F0 {
  
  inline def apply(f0: default, f90: default, lightDirection: default, roughness: default): F0 = {
    val __obj = js.Dynamic.literal(f0 = f0.asInstanceOf[js.Any], f90 = f90.asInstanceOf[js.Any], lightDirection = lightDirection.asInstanceOf[js.Any], roughness = roughness.asInstanceOf[js.Any])
    __obj.asInstanceOf[F0]
  }
  
  extension [Self <: F0](x: Self) {
    
    inline def setF0(value: default): Self = StObject.set(x, "f0", value.asInstanceOf[js.Any])
    
    inline def setF90(value: default): Self = StObject.set(x, "f90", value.asInstanceOf[js.Any])
    
    inline def setLightDirection(value: default): Self = StObject.set(x, "lightDirection", value.asInstanceOf[js.Any])
    
    inline def setRoughness(value: default): Self = StObject.set(x, "roughness", value.asInstanceOf[js.Any])
  }
}
