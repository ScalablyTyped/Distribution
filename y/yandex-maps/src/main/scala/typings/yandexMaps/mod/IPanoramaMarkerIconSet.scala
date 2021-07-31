package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaMarkerIconSet extends StObject {
  
  var default: IPanoramaMarkerIcon | Null
  
  var expanded: IPanoramaMarkerIcon | Null
  
  var expandedHovered: IPanoramaMarkerIcon | Null
  
  var hovered: IPanoramaMarkerIcon | Null
}
object IPanoramaMarkerIconSet {
  
  @scala.inline
  def apply(): IPanoramaMarkerIconSet = {
    val __obj = js.Dynamic.literal(default = null, expanded = null, expandedHovered = null, hovered = null)
    __obj.asInstanceOf[IPanoramaMarkerIconSet]
  }
  
  @scala.inline
  implicit class IPanoramaMarkerIconSetMutableBuilder[Self <: IPanoramaMarkerIconSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: IPanoramaMarkerIcon): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNull: Self = StObject.set(x, "default", null)
    
    @scala.inline
    def setExpanded(value: IPanoramaMarkerIcon): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedHovered(value: IPanoramaMarkerIcon): Self = StObject.set(x, "expandedHovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedHoveredNull: Self = StObject.set(x, "expandedHovered", null)
    
    @scala.inline
    def setExpandedNull: Self = StObject.set(x, "expanded", null)
    
    @scala.inline
    def setHovered(value: IPanoramaMarkerIcon): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoveredNull: Self = StObject.set(x, "hovered", null)
  }
}
