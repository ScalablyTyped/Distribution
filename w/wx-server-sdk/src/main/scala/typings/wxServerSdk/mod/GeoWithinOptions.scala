package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoWithinOptions extends StObject {
  
  var geometry: Polygon | MultiPolygon = js.native
}
object GeoWithinOptions {
  
  @scala.inline
  def apply(geometry: Polygon | MultiPolygon): GeoWithinOptions = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoWithinOptions]
  }
  
  @scala.inline
  implicit class GeoWithinOptionsMutableBuilder[Self <: GeoWithinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: Polygon | MultiPolygon): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
  }
}
