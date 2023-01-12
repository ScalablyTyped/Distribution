package typings.victoryBrushLine.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowDrag extends StObject {
  
  var allowDrag: Requireable[Boolean]
  
  var allowDraw: Requireable[Boolean]
  
  var allowResize: Requireable[Boolean]
  
  var brushAreaComponent: Requireable[ReactElementLike]
  
  var brushAreaStyle: Requireable[js.Object]
  
  var brushAreaWidth: Requireable[Double]
  
  var brushComponent: Requireable[ReactElementLike]
  
  var brushDimension: Requireable[String]
  
  var brushDomain: Requireable[js.Array[Any]]
  
  var brushStyle: Requireable[js.Object]
  
  var brushWidth: Requireable[Double]
  
  var className: Requireable[String]
  
  var dimension: Requireable[String]
  
  var disable: Requireable[Boolean]
  
  var events: Requireable[js.Object]
  
  var groupComponent: Requireable[ReactElementLike]
  
  var handleComponent: Requireable[ReactElementLike]
  
  var handleStyle: Requireable[js.Object]
  
  var handleWidth: Requireable[Double]
  
  var id: Requireable[String | Double]
  
  var lineComponent: Requireable[ReactElementLike]
  
  var name: Requireable[String]
  
  var onBrushDomainChange: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var scale: Requireable[js.Object]
  
  var style: Requireable[js.Object]
  
  var `type`: Requireable[String]
  
  var width: Requireable[Double]
}
object AllowDrag {
  
  inline def apply(
    allowDrag: Requireable[Boolean],
    allowDraw: Requireable[Boolean],
    allowResize: Requireable[Boolean],
    brushAreaComponent: Requireable[ReactElementLike],
    brushAreaStyle: Requireable[js.Object],
    brushAreaWidth: Requireable[Double],
    brushComponent: Requireable[ReactElementLike],
    brushDimension: Requireable[String],
    brushDomain: Requireable[js.Array[Any]],
    brushStyle: Requireable[js.Object],
    brushWidth: Requireable[Double],
    className: Requireable[String],
    dimension: Requireable[String],
    disable: Requireable[Boolean],
    events: Requireable[js.Object],
    groupComponent: Requireable[ReactElementLike],
    handleComponent: Requireable[ReactElementLike],
    handleStyle: Requireable[js.Object],
    handleWidth: Requireable[Double],
    id: Requireable[String | Double],
    lineComponent: Requireable[ReactElementLike],
    name: Requireable[String],
    onBrushDomainChange: Requireable[js.Function1[/* repeated */ Any, Any]],
    scale: Requireable[js.Object],
    style: Requireable[js.Object],
    `type`: Requireable[String],
    width: Requireable[Double]
  ): AllowDrag = {
    val __obj = js.Dynamic.literal(allowDrag = allowDrag.asInstanceOf[js.Any], allowDraw = allowDraw.asInstanceOf[js.Any], allowResize = allowResize.asInstanceOf[js.Any], brushAreaComponent = brushAreaComponent.asInstanceOf[js.Any], brushAreaStyle = brushAreaStyle.asInstanceOf[js.Any], brushAreaWidth = brushAreaWidth.asInstanceOf[js.Any], brushComponent = brushComponent.asInstanceOf[js.Any], brushDimension = brushDimension.asInstanceOf[js.Any], brushDomain = brushDomain.asInstanceOf[js.Any], brushStyle = brushStyle.asInstanceOf[js.Any], brushWidth = brushWidth.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], groupComponent = groupComponent.asInstanceOf[js.Any], handleComponent = handleComponent.asInstanceOf[js.Any], handleStyle = handleStyle.asInstanceOf[js.Any], handleWidth = handleWidth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lineComponent = lineComponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onBrushDomainChange = onBrushDomainChange.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowDrag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowDrag] (val x: Self) extends AnyVal {
    
    inline def setAllowDrag(value: Requireable[Boolean]): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
    
    inline def setAllowDraw(value: Requireable[Boolean]): Self = StObject.set(x, "allowDraw", value.asInstanceOf[js.Any])
    
    inline def setAllowResize(value: Requireable[Boolean]): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
    
    inline def setBrushAreaComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "brushAreaComponent", value.asInstanceOf[js.Any])
    
    inline def setBrushAreaStyle(value: Requireable[js.Object]): Self = StObject.set(x, "brushAreaStyle", value.asInstanceOf[js.Any])
    
    inline def setBrushAreaWidth(value: Requireable[Double]): Self = StObject.set(x, "brushAreaWidth", value.asInstanceOf[js.Any])
    
    inline def setBrushComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "brushComponent", value.asInstanceOf[js.Any])
    
    inline def setBrushDimension(value: Requireable[String]): Self = StObject.set(x, "brushDimension", value.asInstanceOf[js.Any])
    
    inline def setBrushDomain(value: Requireable[js.Array[Any]]): Self = StObject.set(x, "brushDomain", value.asInstanceOf[js.Any])
    
    inline def setBrushStyle(value: Requireable[js.Object]): Self = StObject.set(x, "brushStyle", value.asInstanceOf[js.Any])
    
    inline def setBrushWidth(value: Requireable[Double]): Self = StObject.set(x, "brushWidth", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Requireable[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDimension(value: Requireable[String]): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDisable(value: Requireable[Boolean]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: Requireable[js.Object]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setGroupComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    inline def setHandleComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "handleComponent", value.asInstanceOf[js.Any])
    
    inline def setHandleStyle(value: Requireable[js.Object]): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
    
    inline def setHandleWidth(value: Requireable[Double]): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
    
    inline def setId(value: Requireable[String | Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLineComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "lineComponent", value.asInstanceOf[js.Any])
    
    inline def setName(value: Requireable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnBrushDomainChange(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onBrushDomainChange", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Requireable[js.Object]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Requireable[js.Object]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setType(value: Requireable[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Requireable[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
