package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISeriesList extends js.Object {
  
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
  implicit class ISeriesListOps[Self <: ISeriesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnyUsesAxes(value: () => Boolean): Self = this.set("anyUsesAxes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChart(value: IChart): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClicked(value: IPoint => Boolean): Self = this.set("clicked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirstVisible(value: () => ISeries): Self = this.set("firstVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItemsVarargs(value: ISeries*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ISeries]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
}
