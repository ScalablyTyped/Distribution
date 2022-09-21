package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryOptions extends StObject {
  
  var clickable: js.UndefOr[Boolean | Null] = js.undefined
  
  var draggable: js.UndefOr[Boolean | Null] = js.undefined
  
  var editable: js.UndefOr[Boolean | Null] = js.undefined
  
  var geodesic: js.UndefOr[Boolean | Null] = js.undefined
  
  var map: js.UndefOr[Map | Null] = js.undefined
  
  var strokeColor: js.UndefOr[String | Null] = js.undefined
  
  var strokeOpacity: js.UndefOr[Double | Null] = js.undefined
  
  var strokePosition: js.UndefOr[String] = js.undefined
  
  var strokeWeight: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether the Geometry is visible or not.
    */
  var visible: js.UndefOr[Boolean | Null] = js.undefined
  
  var zIndex: js.UndefOr[Double | Null] = js.undefined
}
object GeometryOptions {
  
  inline def apply(): GeometryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeometryOptions]
  }
  
  extension [Self <: GeometryOptions](x: Self) {
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableNull: Self = StObject.set(x, "clickable", null)
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableNull: Self = StObject.set(x, "draggable", null)
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableNull: Self = StObject.set(x, "editable", null)
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setGeodesic(value: Boolean): Self = StObject.set(x, "geodesic", value.asInstanceOf[js.Any])
    
    inline def setGeodesicNull: Self = StObject.set(x, "geodesic", null)
    
    inline def setGeodesicUndefined: Self = StObject.set(x, "geodesic", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorNull: Self = StObject.set(x, "strokeColor", null)
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityNull: Self = StObject.set(x, "strokeOpacity", null)
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokePosition(value: String): Self = StObject.set(x, "strokePosition", value.asInstanceOf[js.Any])
    
    inline def setStrokePositionUndefined: Self = StObject.set(x, "strokePosition", js.undefined)
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeightNull: Self = StObject.set(x, "strokeWeight", null)
    
    inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleNull: Self = StObject.set(x, "visible", null)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexNull: Self = StObject.set(x, "zIndex", null)
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
