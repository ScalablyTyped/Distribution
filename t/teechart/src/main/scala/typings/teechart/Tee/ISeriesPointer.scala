package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISeriesPointer extends StObject {
  
  var chart: IChart
  
  var colorEach: Boolean
  
  var format: IFormat
  
  var height: Double
  
  var style: String
  
  var visible: Boolean
  
  var width: Double
}
object ISeriesPointer {
  
  inline def apply(
    chart: IChart,
    colorEach: Boolean,
    format: IFormat,
    height: Double,
    style: String,
    visible: Boolean,
    width: Double
  ): ISeriesPointer = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], colorEach = colorEach.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeriesPointer]
  }
  
  extension [Self <: ISeriesPointer](x: Self) {
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setColorEach(value: Boolean): Self = StObject.set(x, "colorEach", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
