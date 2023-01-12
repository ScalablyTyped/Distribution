package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoWithinCommandOptions extends StObject {
  
  var geometry: GeoPolygon | GeoMultiPolygon
}
object IGeoWithinCommandOptions {
  
  inline def apply(geometry: GeoPolygon | GeoMultiPolygon): IGeoWithinCommandOptions = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoWithinCommandOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGeoWithinCommandOptions] (val x: Self) extends AnyVal {
    
    inline def setGeometry(value: GeoPolygon | GeoMultiPolygon): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
  }
}
