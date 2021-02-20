package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITools extends StObject {
  
  def add(tool: ITool): ITool = js.native
  
  var chart: IChart = js.native
  
  var items: js.Array[ITool] = js.native
}
object ITools {
  
  @scala.inline
  def apply(add: ITool => ITool, chart: IChart, items: js.Array[ITool]): ITools = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), chart = chart.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITools]
  }
  
  @scala.inline
  implicit class IToolsMutableBuilder[Self <: ITools] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: ITool => ITool): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[ITool]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ITool*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
