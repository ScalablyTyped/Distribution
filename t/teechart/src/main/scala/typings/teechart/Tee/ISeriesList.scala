package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISeriesList extends StObject {
  
  def anyUsesAxes(): Boolean = js.native
  
  var chart: IChart = js.native
  
  def clicked(position: IPoint): Boolean = js.native
  
  //each(f: function): void;
  def firstVisible(): ISeries = js.native
  
  var items: js.Array[ISeries] = js.native
}
object ISeriesList {
  
  @scala.inline
  def apply(
    anyUsesAxes: () => Boolean,
    chart: IChart,
    clicked: IPoint => Boolean,
    firstVisible: () => ISeries,
    items: js.Array[ISeries]
  ): ISeriesList = {
    val __obj = js.Dynamic.literal(anyUsesAxes = js.Any.fromFunction0(anyUsesAxes), chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), firstVisible = js.Any.fromFunction0(firstVisible), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeriesList]
  }
  
  @scala.inline
  implicit class ISeriesListMutableBuilder[Self <: ISeriesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnyUsesAxes(value: () => Boolean): Self = StObject.set(x, "anyUsesAxes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClicked(value: IPoint => Boolean): Self = StObject.set(x, "clicked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirstVisible(value: () => ISeries): Self = StObject.set(x, "firstVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItems(value: js.Array[ISeries]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ISeries*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
