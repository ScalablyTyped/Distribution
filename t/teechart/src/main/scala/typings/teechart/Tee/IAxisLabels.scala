package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAxisLabels extends StObject {
  
  var alternate: Boolean
  
  var chart: IChart
  
  var dateFormat: String
  
  var decimals: Double
  
  var format: IFormat
  
  def getLabel(value: Double): String
  
  var labelStyle: String
  
  var maxWidth: Double
  
  var padding: Double
  
  var rotation: Double
  
  var separation: Double
  
  // %
  var visible: Boolean
  
  def width(value: Double): Double
}
object IAxisLabels {
  
  inline def apply(
    alternate: Boolean,
    chart: IChart,
    dateFormat: String,
    decimals: Double,
    format: IFormat,
    getLabel: Double => String,
    labelStyle: String,
    maxWidth: Double,
    padding: Double,
    rotation: Double,
    separation: Double,
    visible: Boolean,
    width: Double => Double
  ): IAxisLabels = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), labelStyle = labelStyle.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = js.Any.fromFunction1(width))
    __obj.asInstanceOf[IAxisLabels]
  }
  
  extension [Self <: IAxisLabels](x: Self) {
    
    inline def setAlternate(value: Boolean): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setGetLabel(value: Double => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
    
    inline def setLabelStyle(value: String): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setSeparation(value: Double): Self = StObject.set(x, "separation", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double => Double): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
  }
}
