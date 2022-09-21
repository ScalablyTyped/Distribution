package typings.unsplashJs.anon

import typings.unsplashJs.typescriptMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait City extends StObject {
  
  var city: Nullable[String]
  
  var country: Nullable[String]
  
  /** full string representation of the location, including `city` and `country` if they exist. */
  var name: Nullable[String]
  
  var position: Latitude
}
object City {
  
  inline def apply(position: Latitude): City = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], city = null, country = null, name = null)
    __obj.asInstanceOf[City]
  }
  
  extension [Self <: City](x: Self) {
    
    inline def setCity(value: Nullable[String]): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityNull: Self = StObject.set(x, "city", null)
    
    inline def setCountry(value: Nullable[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setName(value: Nullable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setPosition(value: Latitude): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
