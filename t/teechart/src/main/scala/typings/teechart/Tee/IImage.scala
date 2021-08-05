package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IImage extends StObject {
  
  var chart: IChart
  
  var url: String
  
  var visible: Boolean
}
object IImage {
  
  inline def apply(chart: IChart, url: String, visible: Boolean): IImage = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImage]
  }
  
  extension [Self <: IImage](x: Self) {
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
