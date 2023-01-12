package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoIntersectsCommandOptions extends StObject {
  
  var geometry: GeoPoint | GeoMultiPoint | GeoLineString | GeoMultiLineString | GeoPolygon | GeoMultiPolygon
}
object IGeoIntersectsCommandOptions {
  
  inline def apply(
    geometry: GeoPoint | GeoMultiPoint | GeoLineString | GeoMultiLineString | GeoPolygon | GeoMultiPolygon
  ): IGeoIntersectsCommandOptions = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoIntersectsCommandOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGeoIntersectsCommandOptions] (val x: Self) extends AnyVal {
    
    inline def setGeometry(
      value: GeoPoint | GeoMultiPoint | GeoLineString | GeoMultiLineString | GeoPolygon | GeoMultiPolygon
    ): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
  }
}
