package typings.unsplashJs.anon

import typings.unsplashJs.typescriptMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Latitude extends StObject {
  
  var latitude: Nullable[Double]
  
  var longitude: Nullable[Double]
}
object Latitude {
  
  inline def apply(): Latitude = {
    val __obj = js.Dynamic.literal(latitude = null, longitude = null)
    __obj.asInstanceOf[Latitude]
  }
  
  extension [Self <: Latitude](x: Self) {
    
    inline def setLatitude(value: Nullable[Double]): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeNull: Self = StObject.set(x, "latitude", null)
    
    inline def setLongitude(value: Nullable[Double]): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeNull: Self = StObject.set(x, "longitude", null)
  }
}
