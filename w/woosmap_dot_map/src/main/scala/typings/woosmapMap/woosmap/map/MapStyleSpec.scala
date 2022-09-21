package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapStyleSpec extends StObject {
  
  /**
    * The group of elements, to which stylers will be applied.
    * default value: "all"
    */
  var elementType: js.UndefOr[String] = js.undefined
  
  /**
    * The group of feature, to which stylers will be applied.
    * default value: "all"
    */
  var featureType: js.UndefOr[String] = js.undefined
  
  /**
    * The rules to apply to the selected features.
    */
  var stylers: js.Array[MapStyler]
}
object MapStyleSpec {
  
  inline def apply(stylers: js.Array[MapStyler]): MapStyleSpec = {
    val __obj = js.Dynamic.literal(stylers = stylers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStyleSpec]
  }
  
  extension [Self <: MapStyleSpec](x: Self) {
    
    inline def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
    
    inline def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
    
    inline def setStylers(value: js.Array[MapStyler]): Self = StObject.set(x, "stylers", value.asInstanceOf[js.Any])
    
    inline def setStylersVarargs(value: MapStyler*): Self = StObject.set(x, "stylers", js.Array(value*))
  }
}
