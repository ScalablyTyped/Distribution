package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addresscomponents extends StObject {
  
  var address_components: js.Array[Longname]
  
  var formatted_address: String
  
  var geometry: Location
}
object Addresscomponents {
  
  inline def apply(address_components: js.Array[Longname], formatted_address: String, geometry: Location): Addresscomponents = {
    val __obj = js.Dynamic.literal(address_components = address_components.asInstanceOf[js.Any], formatted_address = formatted_address.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addresscomponents]
  }
  
  extension [Self <: Addresscomponents](x: Self) {
    
    inline def setAddress_components(value: js.Array[Longname]): Self = StObject.set(x, "address_components", value.asInstanceOf[js.Any])
    
    inline def setAddress_componentsVarargs(value: Longname*): Self = StObject.set(x, "address_components", js.Array(value*))
    
    inline def setFormatted_address(value: String): Self = StObject.set(x, "formatted_address", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: Location): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
  }
}
