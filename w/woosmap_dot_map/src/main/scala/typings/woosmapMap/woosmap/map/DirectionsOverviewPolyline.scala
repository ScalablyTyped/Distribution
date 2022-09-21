package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsOverviewPolyline extends StObject {
  
  /**
    * Contains encoded polyline.
    */
  var points: String
}
object DirectionsOverviewPolyline {
  
  inline def apply(points: String): DirectionsOverviewPolyline = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsOverviewPolyline]
  }
  
  extension [Self <: DirectionsOverviewPolyline](x: Self) {
    
    inline def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
  }
}
