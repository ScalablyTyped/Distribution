package typings.woosmapMap.woosmap.map

import typings.woosmapMap.woosmapMapStrings.Feature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONFeature extends StObject {
  
  var geometry: GeoJSONGeometry
  
  var id: js.UndefOr[Double | String] = js.undefined
  
  var `type`: Feature
}
object GeoJSONFeature {
  
  inline def apply(geometry: GeoJSONGeometry): GeoJSONFeature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Feature")
    __obj.asInstanceOf[GeoJSONFeature]
  }
  
  extension [Self <: GeoJSONFeature](x: Self) {
    
    inline def setGeometry(value: GeoJSONGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: Feature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
