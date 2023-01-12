package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionRoute extends StObject {
  
  var bounds: DirectionsBounds
  
  var legs: js.Array[DirectionLeg]
  
  /**
    * The decoded overview path.
    */
  var overview_path: js.UndefOr[js.Array[LatLng]] = js.undefined
  
  /**
    * The encoded overview polyline.
    */
  var overview_polyline: DirectionsOverviewPolyline
  
  /**
    * The description of the route.
    */
  var summary: String
}
object DirectionRoute {
  
  inline def apply(
    bounds: DirectionsBounds,
    legs: js.Array[DirectionLeg],
    overview_polyline: DirectionsOverviewPolyline,
    summary: String
  ): DirectionRoute = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], legs = legs.asInstanceOf[js.Any], overview_polyline = overview_polyline.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionRoute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionRoute] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: DirectionsBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setLegs(value: js.Array[DirectionLeg]): Self = StObject.set(x, "legs", value.asInstanceOf[js.Any])
    
    inline def setLegsVarargs(value: DirectionLeg*): Self = StObject.set(x, "legs", js.Array(value*))
    
    inline def setOverview_path(value: js.Array[LatLng]): Self = StObject.set(x, "overview_path", value.asInstanceOf[js.Any])
    
    inline def setOverview_pathUndefined: Self = StObject.set(x, "overview_path", js.undefined)
    
    inline def setOverview_pathVarargs(value: LatLng*): Self = StObject.set(x, "overview_path", js.Array(value*))
    
    inline def setOverview_polyline(value: DirectionsOverviewPolyline): Self = StObject.set(x, "overview_polyline", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
