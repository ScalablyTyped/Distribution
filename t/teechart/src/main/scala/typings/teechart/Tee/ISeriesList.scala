package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISeriesList extends StObject {
  
  def anyUsesAxes(): Boolean
  
  var chart: IChart
  
  def clicked(position: IPoint): Boolean
  
  //each(f: function): void;
  def firstVisible(): ISeries
  
  var items: js.Array[ISeries]
}
object ISeriesList {
  
  inline def apply(
    anyUsesAxes: () => Boolean,
    chart: IChart,
    clicked: IPoint => Boolean,
    firstVisible: () => ISeries,
    items: js.Array[ISeries]
  ): ISeriesList = {
    val __obj = js.Dynamic.literal(anyUsesAxes = js.Any.fromFunction0(anyUsesAxes), chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), firstVisible = js.Any.fromFunction0(firstVisible), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeriesList]
  }
  
  extension [Self <: ISeriesList](x: Self) {
    
    inline def setAnyUsesAxes(value: () => Boolean): Self = StObject.set(x, "anyUsesAxes", js.Any.fromFunction0(value))
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setClicked(value: IPoint => Boolean): Self = StObject.set(x, "clicked", js.Any.fromFunction1(value))
    
    inline def setFirstVisible(value: () => ISeries): Self = StObject.set(x, "firstVisible", js.Any.fromFunction0(value))
    
    inline def setItems(value: js.Array[ISeries]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ISeries*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
