package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGradient extends StObject {
  
  var chart: IChart
  
  var colors: js.Array[String]
  
  var direction: String
  
  var offset: IPoint
  
  var stops: js.Array[Double]
  
  var visible: Boolean
}
object IGradient {
  
  @scala.inline
  def apply(
    chart: IChart,
    colors: js.Array[String],
    direction: String,
    offset: IPoint,
    stops: js.Array[Double],
    visible: Boolean
  ): IGradient = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGradient]
  }
  
  @scala.inline
  implicit class IGradientMutableBuilder[Self <: IGradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: IPoint): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStops(value: js.Array[Double]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsVarargs(value: Double*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
