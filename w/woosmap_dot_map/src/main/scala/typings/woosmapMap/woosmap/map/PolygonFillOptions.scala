package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonFillOptions
  extends StObject
     with GeometryOptions {
  
  var fillColor: js.UndefOr[String | Null] = js.undefined
  
  var fillOpacity: js.UndefOr[Double | Null] = js.undefined
}
object PolygonFillOptions {
  
  inline def apply(): PolygonFillOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonFillOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolygonFillOptions] (val x: Self) extends AnyVal {
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorNull: Self = StObject.set(x, "fillColor", null)
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityNull: Self = StObject.set(x, "fillOpacity", null)
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
  }
}
