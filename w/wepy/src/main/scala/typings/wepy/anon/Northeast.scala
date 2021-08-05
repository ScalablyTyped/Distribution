package typings.wepy.anon

import typings.wepy.wxEnhancedMod.LagLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Northeast extends StObject {
  
  var northeast: LagLng
  
  var southwest: LagLng
}
object Northeast {
  
  inline def apply(northeast: LagLng, southwest: LagLng): Northeast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Northeast]
  }
  
  extension [Self <: Northeast](x: Self) {
    
    inline def setNortheast(value: LagLng): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    inline def setSouthwest(value: LagLng): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
  }
}
