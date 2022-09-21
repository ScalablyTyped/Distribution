package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerOptions extends StObject {
  
  /**
    * The offset from the marker's position to the tip of an InfoWindow that has been opened with the marker as anchor.
    */
  var anchorPoint: js.UndefOr[Point] = js.undefined
  
  /**
    * If true the marker receive the click events. Default value is true.
    */
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The icon to display.
    * When icon is a string it is treated as Icon with the string as `url` property.
    */
  var icon: js.UndefOr[String | Icon] = js.undefined
  
  /**
    * Adds a letter or number label inside a marker.
    */
  var label: js.UndefOr[String | MarkerLabelOptions] = js.undefined
  
  /**
    * The Map where the marker should be displayed.
    */
  var map: js.UndefOr[Map] = js.undefined
  
  /**
    * The marker's opacity (min: 0, max: 1)
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The markers's position.
    */
  var position: LatLng | LatLngLiteral
  
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true the marker will be visible. Default value is true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object MarkerOptions {
  
  inline def apply(position: LatLng | LatLngLiteral): MarkerOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
  
  extension [Self <: MarkerOptions](x: Self) {
    
    inline def setAnchorPoint(value: Point): Self = StObject.set(x, "anchorPoint", value.asInstanceOf[js.Any])
    
    inline def setAnchorPointUndefined: Self = StObject.set(x, "anchorPoint", js.undefined)
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setIcon(value: String | Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String | MarkerLabelOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
