package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMarks extends IAnnotation {
  
  var arrow: IArrow = js.native
  
  var drawEvery: Double = js.native
  
  var series: ISeries = js.native
  
  var style: String = js.native
}
object IMarks {
  
  @scala.inline
  def apply(
    active: Boolean,
    add: String => IAnnotation,
    arrow: IArrow,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: () => Unit,
    drawEvery: Double,
    format: IFormat,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean,
    position: IPoint,
    resize: () => Unit,
    series: ISeries,
    style: String,
    text: String,
    transparent: Boolean,
    visible: Boolean
  ): IMarks = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), arrow = arrow.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), drawEvery = drawEvery.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), position = position.asInstanceOf[js.Any], resize = js.Any.fromFunction0(resize), series = series.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarks]
  }
  
  @scala.inline
  implicit class IMarksMutableBuilder[Self <: IMarks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrow(value: IArrow): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawEvery(value: Double): Self = StObject.set(x, "drawEvery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeries(value: ISeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
