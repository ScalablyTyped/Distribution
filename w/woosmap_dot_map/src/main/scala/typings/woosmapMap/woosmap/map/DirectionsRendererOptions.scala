package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsRendererOptions extends StObject {
  
  var directions: js.UndefOr[DirectionResult] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var map: js.UndefOr[Map] = js.undefined
  
  var markerOption: js.UndefOr[js.Object] = js.undefined
  
  var preserveViewport: js.UndefOr[Boolean] = js.undefined
  
  var routeIndex: js.UndefOr[Double] = js.undefined
  
  var suppressBicyclingLayer: js.UndefOr[Boolean] = js.undefined
  
  var suppressInfoWindows: js.UndefOr[Boolean] = js.undefined
  
  var suppressMarkers: js.UndefOr[Boolean] = js.undefined
  
  var suppressPolylines: js.UndefOr[Boolean] = js.undefined
}
object DirectionsRendererOptions {
  
  inline def apply(): DirectionsRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsRendererOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsRendererOptions] (val x: Self) extends AnyVal {
    
    inline def setDirections(value: DirectionResult): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
    
    inline def setDirectionsUndefined: Self = StObject.set(x, "directions", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMarkerOption(value: js.Object): Self = StObject.set(x, "markerOption", value.asInstanceOf[js.Any])
    
    inline def setMarkerOptionUndefined: Self = StObject.set(x, "markerOption", js.undefined)
    
    inline def setPreserveViewport(value: Boolean): Self = StObject.set(x, "preserveViewport", value.asInstanceOf[js.Any])
    
    inline def setPreserveViewportUndefined: Self = StObject.set(x, "preserveViewport", js.undefined)
    
    inline def setRouteIndex(value: Double): Self = StObject.set(x, "routeIndex", value.asInstanceOf[js.Any])
    
    inline def setRouteIndexUndefined: Self = StObject.set(x, "routeIndex", js.undefined)
    
    inline def setSuppressBicyclingLayer(value: Boolean): Self = StObject.set(x, "suppressBicyclingLayer", value.asInstanceOf[js.Any])
    
    inline def setSuppressBicyclingLayerUndefined: Self = StObject.set(x, "suppressBicyclingLayer", js.undefined)
    
    inline def setSuppressInfoWindows(value: Boolean): Self = StObject.set(x, "suppressInfoWindows", value.asInstanceOf[js.Any])
    
    inline def setSuppressInfoWindowsUndefined: Self = StObject.set(x, "suppressInfoWindows", js.undefined)
    
    inline def setSuppressMarkers(value: Boolean): Self = StObject.set(x, "suppressMarkers", value.asInstanceOf[js.Any])
    
    inline def setSuppressMarkersUndefined: Self = StObject.set(x, "suppressMarkers", js.undefined)
    
    inline def setSuppressPolylines(value: Boolean): Self = StObject.set(x, "suppressPolylines", value.asInstanceOf[js.Any])
    
    inline def setSuppressPolylinesUndefined: Self = StObject.set(x, "suppressPolylines", js.undefined)
  }
}
