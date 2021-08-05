package typings.wixUiCore.clientsGoogleMapsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalAddressComponent extends StObject {
  
  var long: String
  
  var short: String
}
object InternalAddressComponent {
  
  inline def apply(long: String, short: String): InternalAddressComponent = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalAddressComponent]
  }
  
  extension [Self <: InternalAddressComponent](x: Self) {
    
    inline def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
