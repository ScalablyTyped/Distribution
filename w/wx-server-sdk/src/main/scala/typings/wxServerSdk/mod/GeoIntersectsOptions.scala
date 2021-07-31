package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoIntersectsOptions extends StObject {
  
  var geometry: Point | LineString | MultiPoint | MultiLineString | Polygon | MultiPolygon
}
object GeoIntersectsOptions {
  
  @scala.inline
  def apply(geometry: Point | LineString | MultiPoint | MultiLineString | Polygon | MultiPolygon): GeoIntersectsOptions = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoIntersectsOptions]
  }
  
  @scala.inline
  implicit class GeoIntersectsOptionsMutableBuilder[Self <: GeoIntersectsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: Point | LineString | MultiPoint | MultiLineString | Polygon | MultiPolygon): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
  }
}
