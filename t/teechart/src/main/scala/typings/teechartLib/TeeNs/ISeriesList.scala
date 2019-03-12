package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeriesList extends js.Object {
  var chart: IChart
  var items: js.Array[ISeries]
  def anyUsesAxes(): scala.Boolean
  def clicked(position: IPoint): scala.Boolean
  //each(f: function): void;
  def firstVisible(): ISeries
}

object ISeriesList {
  @scala.inline
  def apply(
    anyUsesAxes: () => scala.Boolean,
    chart: IChart,
    clicked: IPoint => scala.Boolean,
    firstVisible: () => ISeries,
    items: js.Array[ISeries]
  ): ISeriesList = {
    val __obj = js.Dynamic.literal(anyUsesAxes = js.Any.fromFunction0(anyUsesAxes), chart = chart, clicked = js.Any.fromFunction1(clicked), firstVisible = js.Any.fromFunction0(firstVisible), items = items)
  
    __obj.asInstanceOf[ISeriesList]
  }
}

