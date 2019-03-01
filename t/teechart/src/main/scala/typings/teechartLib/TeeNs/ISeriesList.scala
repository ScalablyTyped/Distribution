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
    anyUsesAxes: js.Function0[scala.Boolean],
    chart: IChart,
    clicked: js.Function1[IPoint, scala.Boolean],
    firstVisible: js.Function0[ISeries],
    items: js.Array[ISeries]
  ): ISeriesList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("anyUsesAxes")(anyUsesAxes)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("clicked")(clicked)
    __obj.updateDynamic("firstVisible")(firstVisible)
    __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ISeriesList]
  }
}

