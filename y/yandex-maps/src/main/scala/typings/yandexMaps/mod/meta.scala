package typings.yandexMaps.mod

import typings.yandexMaps.anon.TypeofyandexMaps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait meta extends StObject {
  
  var coordinatesOrder: "latlong" | "longlat"
  
  var countryCode: String
  
  var languageCode: String
  
  var mode: "release" | "debug"
  
  var ns: TypeofyandexMaps
  
  var version: String
}
object meta {
  
  inline def apply(
    coordinatesOrder: "latlong" | "longlat",
    countryCode: String,
    languageCode: String,
    mode: "release" | "debug",
    ns: TypeofyandexMaps,
    version: String
  ): meta = {
    val __obj = js.Dynamic.literal(coordinatesOrder = coordinatesOrder.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], languageCode = languageCode.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[meta]
  }
  
  extension [Self <: meta](x: Self) {
    
    inline def setCoordinatesOrder(value: "latlong" | "longlat"): Self = StObject.set(x, "coordinatesOrder", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setMode(value: "release" | "debug"): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setNs(value: TypeofyandexMaps): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
