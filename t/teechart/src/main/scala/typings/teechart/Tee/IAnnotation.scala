package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnnotation
  extends StObject
     with ITool {
  
  def add(text: String): IAnnotation
  
  var bounds: IRectangle
  
  var format: IFormat
  
  var items: js.Array[IAnnotation]
  
  var margins: IMargins
  
  var position: IPoint
  
  def resize(): Unit
  
  var text: String
  
  var transparent: Boolean
  
  var visible: Boolean
}
object IAnnotation {
  
  inline def apply(
    active: Boolean,
    add: String => IAnnotation,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: () => Unit,
    format: IFormat,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: Any => Boolean,
    mousemove: Any => Boolean,
    position: IPoint,
    resize: () => Unit,
    text: String,
    transparent: Boolean,
    visible: Boolean
  ): IAnnotation = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), bounds = bounds.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), format = format.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), position = position.asInstanceOf[js.Any], resize = js.Any.fromFunction0(resize), text = text.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAnnotation] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: String => IAnnotation): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setBounds(value: IRectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[IAnnotation]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: IAnnotation*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMargins(value: IMargins): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: IPoint): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setResize(value: () => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
