package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISymbol extends StObject {
  
  var chart: IChart
  
  var format: IFormat
  
  var height: Double
  
  var padding: Double
  
  var visible: Boolean
  
  var width: Double
}
object ISymbol {
  
  @scala.inline
  def apply(chart: IChart, format: IFormat, height: Double, padding: Double, visible: Boolean, width: Double): ISymbol = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISymbol]
  }
  
  @scala.inline
  implicit class ISymbolMutableBuilder[Self <: ISymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
