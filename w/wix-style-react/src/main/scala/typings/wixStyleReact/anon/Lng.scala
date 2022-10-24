package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lng extends StObject {
  
  var lat: Any
  
  var lng: Any
}
object Lng {
  
  inline def apply(lat: Any, lng: Any): Lng = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lng]
  }
  
  extension [Self <: Lng](x: Self) {
    
    inline def setLat(value: Any): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLng(value: Any): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}
