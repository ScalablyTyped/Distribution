package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Latitude extends StObject {
  
  var latitude: js.Any
  
  var longitude: js.Any
}
object Latitude {
  
  inline def apply(latitude: js.Any, longitude: js.Any): Latitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Latitude]
  }
  
  extension [Self <: Latitude](x: Self) {
    
    inline def setLatitude(value: js.Any): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: js.Any): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
