package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectangleOptions
  extends StObject
     with PolygonFillOptions {
  
  /**
    * The bounds of the Rectangle.
    */
  var bounds: LatLngBounds | Null | LatLngBoundsLiteral
}
object RectangleOptions {
  
  inline def apply(): RectangleOptions = {
    val __obj = js.Dynamic.literal(bounds = null)
    __obj.asInstanceOf[RectangleOptions]
  }
  
  extension [Self <: RectangleOptions](x: Self) {
    
    inline def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsNull: Self = StObject.set(x, "bounds", null)
  }
}
