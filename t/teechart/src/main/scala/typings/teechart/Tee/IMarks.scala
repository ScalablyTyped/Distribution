package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMarks
  extends StObject
     with IAnnotation {
  
  var arrow: IArrow
  
  var drawEvery: Double
  
  var series: ISeries
  
  var style: String
}
object IMarks {
  
  inline def apply(
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
    mousedown: Any => Boolean,
    mousemove: Any => Boolean,
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
  
  extension [Self <: IMarks](x: Self) {
    
    inline def setArrow(value: IArrow): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setDrawEvery(value: Double): Self = StObject.set(x, "drawEvery", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: ISeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
