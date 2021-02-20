package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnnotation extends ITool {
  
  def add(text: String): IAnnotation = js.native
  
  var bounds: IRectangle = js.native
  
  var format: IFormat = js.native
  
  var items: js.Array[IAnnotation] = js.native
  
  var margins: IMargins = js.native
  
  var position: IPoint = js.native
  
  def resize(): Unit = js.native
  
  var text: String = js.native
  
  var transparent: Boolean = js.native
  
  var visible: Boolean = js.native
}
object IAnnotation {
  
  @scala.inline
  def apply(
    active: Boolean,
    add: String => IAnnotation,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: () => Unit,
    format: IFormat,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean,
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
  implicit class IAnnotationMutableBuilder[Self <: IAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: String => IAnnotation): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBounds(value: IRectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[IAnnotation]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: IAnnotation*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMargins(value: IMargins): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: IPoint): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize(value: () => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
