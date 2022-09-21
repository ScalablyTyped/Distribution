package typings.victoryBrushLine.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowDraw extends StObject {
  
  var allowDrag: Boolean
  
  var allowDraw: Boolean
  
  var allowResize: Boolean
  
  var brushAreaComponent: Element
  
  var brushComponent: Element
  
  var groupComponent: Element
  
  var handleComponent: Element
  
  var handleWidth: Double
  
  var lineComponent: Element
  
  var width: Double
}
object AllowDraw {
  
  inline def apply(
    allowDrag: Boolean,
    allowDraw: Boolean,
    allowResize: Boolean,
    brushAreaComponent: Element,
    brushComponent: Element,
    groupComponent: Element,
    handleComponent: Element,
    handleWidth: Double,
    lineComponent: Element,
    width: Double
  ): AllowDraw = {
    val __obj = js.Dynamic.literal(allowDrag = allowDrag.asInstanceOf[js.Any], allowDraw = allowDraw.asInstanceOf[js.Any], allowResize = allowResize.asInstanceOf[js.Any], brushAreaComponent = brushAreaComponent.asInstanceOf[js.Any], brushComponent = brushComponent.asInstanceOf[js.Any], groupComponent = groupComponent.asInstanceOf[js.Any], handleComponent = handleComponent.asInstanceOf[js.Any], handleWidth = handleWidth.asInstanceOf[js.Any], lineComponent = lineComponent.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowDraw]
  }
  
  extension [Self <: AllowDraw](x: Self) {
    
    inline def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
    
    inline def setAllowDraw(value: Boolean): Self = StObject.set(x, "allowDraw", value.asInstanceOf[js.Any])
    
    inline def setAllowResize(value: Boolean): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
    
    inline def setBrushAreaComponent(value: Element): Self = StObject.set(x, "brushAreaComponent", value.asInstanceOf[js.Any])
    
    inline def setBrushComponent(value: Element): Self = StObject.set(x, "brushComponent", value.asInstanceOf[js.Any])
    
    inline def setGroupComponent(value: Element): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    inline def setHandleComponent(value: Element): Self = StObject.set(x, "handleComponent", value.asInstanceOf[js.Any])
    
    inline def setHandleWidth(value: Double): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
    
    inline def setLineComponent(value: Element): Self = StObject.set(x, "lineComponent", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
