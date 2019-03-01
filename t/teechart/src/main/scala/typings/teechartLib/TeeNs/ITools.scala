package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITools extends js.Object {
  var chart: IChart
  var items: js.Array[ITool]
  def add(tool: ITool): ITool
}

object ITools {
  @scala.inline
  def apply(add: js.Function1[ITool, ITool], chart: IChart, items: js.Array[ITool]): ITools = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ITools]
  }
}

