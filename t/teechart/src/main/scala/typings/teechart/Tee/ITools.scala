package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITools extends StObject {
  
  def add(tool: ITool): ITool
  
  var chart: IChart
  
  var items: js.Array[ITool]
}
object ITools {
  
  inline def apply(add: ITool => ITool, chart: IChart, items: js.Array[ITool]): ITools = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), chart = chart.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITools]
  }
  
  extension [Self <: ITools](x: Self) {
    
    inline def setAdd(value: ITool => ITool): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[ITool]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ITool*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
