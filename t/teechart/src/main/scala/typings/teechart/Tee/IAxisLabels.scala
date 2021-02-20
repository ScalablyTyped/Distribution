package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAxisLabels extends StObject {
  
  var alternate: Boolean = js.native
  
  var chart: IChart = js.native
  
  var dateFormat: String = js.native
  
  var decimals: Double = js.native
  
  var format: IFormat = js.native
  
  def getLabel(value: Double): String = js.native
  
  var labelStyle: String = js.native
  
  var maxWidth: Double = js.native
  
  var padding: Double = js.native
  
  var rotation: Double = js.native
  
  var separation: Double = js.native
  
  // %
  var visible: Boolean = js.native
  
  def width(value: Double): Double = js.native
}
object IAxisLabels {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IAxisLabelsMutableBuilder[Self <: IAxisLabels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate(value: Boolean): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLabel(value: Double => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelStyle(value: String): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparation(value: Double): Self = StObject.set(x, "separation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double => Double): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
  }
}
