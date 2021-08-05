package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cloak extends StObject {
  
  var cloak: scala.Double
  
  var map: scala.Double
}
object Cloak {
  
  inline def apply(cloak: scala.Double, map: scala.Double): Cloak = {
    val __obj = js.Dynamic.literal(cloak = cloak.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cloak]
  }
  
  extension [Self <: Cloak](x: Self) {
    
    inline def setCloak(value: scala.Double): Self = StObject.set(x, "cloak", value.asInstanceOf[js.Any])
    
    inline def setMap(value: scala.Double): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
