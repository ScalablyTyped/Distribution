package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGrid extends StObject {
  
  var chart: IChart
  
  var format: IFormat
  
  var lineDash: Boolean
  
  var visible: Boolean
}
object IGrid {
  
  inline def apply(chart: IChart, format: IFormat, lineDash: Boolean, visible: Boolean): IGrid = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGrid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGrid] (val x: Self) extends AnyVal {
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setLineDash(value: Boolean): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
