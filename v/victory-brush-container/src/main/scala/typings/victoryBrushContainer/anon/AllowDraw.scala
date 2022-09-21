package typings.victoryBrushContainer.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowDraw extends StObject {
  
  var allowDrag: Boolean
  
  var allowDraw: Boolean
  
  var allowResize: Boolean
  
  var brushComponent: Element
  
  var brushStyle: Fill
  
  var className: String
  
  var handleComponent: Element
  
  var handleStyle: Stroke
  
  var handleWidth: Double
  
  var mouseMoveThreshold: Double
  
  var portalComponent: Element
  
  var portalZIndex: Double
  
  var responsive: Boolean
  
  var role: String
}
object AllowDraw {
  
  inline def apply(
    allowDrag: Boolean,
    allowDraw: Boolean,
    allowResize: Boolean,
    brushComponent: Element,
    brushStyle: Fill,
    className: String,
    handleComponent: Element,
    handleStyle: Stroke,
    handleWidth: Double,
    mouseMoveThreshold: Double,
    portalComponent: Element,
    portalZIndex: Double,
    responsive: Boolean,
    role: String
  ): AllowDraw = {
    val __obj = js.Dynamic.literal(allowDrag = allowDrag.asInstanceOf[js.Any], allowDraw = allowDraw.asInstanceOf[js.Any], allowResize = allowResize.asInstanceOf[js.Any], brushComponent = brushComponent.asInstanceOf[js.Any], brushStyle = brushStyle.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], handleComponent = handleComponent.asInstanceOf[js.Any], handleStyle = handleStyle.asInstanceOf[js.Any], handleWidth = handleWidth.asInstanceOf[js.Any], mouseMoveThreshold = mouseMoveThreshold.asInstanceOf[js.Any], portalComponent = portalComponent.asInstanceOf[js.Any], portalZIndex = portalZIndex.asInstanceOf[js.Any], responsive = responsive.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowDraw]
  }
  
  extension [Self <: AllowDraw](x: Self) {
    
    inline def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
    
    inline def setAllowDraw(value: Boolean): Self = StObject.set(x, "allowDraw", value.asInstanceOf[js.Any])
    
    inline def setAllowResize(value: Boolean): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
    
    inline def setBrushComponent(value: Element): Self = StObject.set(x, "brushComponent", value.asInstanceOf[js.Any])
    
    inline def setBrushStyle(value: Fill): Self = StObject.set(x, "brushStyle", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setHandleComponent(value: Element): Self = StObject.set(x, "handleComponent", value.asInstanceOf[js.Any])
    
    inline def setHandleStyle(value: Stroke): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
    
    inline def setHandleWidth(value: Double): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
    
    inline def setMouseMoveThreshold(value: Double): Self = StObject.set(x, "mouseMoveThreshold", value.asInstanceOf[js.Any])
    
    inline def setPortalComponent(value: Element): Self = StObject.set(x, "portalComponent", value.asInstanceOf[js.Any])
    
    inline def setPortalZIndex(value: Double): Self = StObject.set(x, "portalZIndex", value.asInstanceOf[js.Any])
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
