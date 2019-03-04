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
    val __obj = js.Dynamic.literal(add = add, chart = chart, items = items)
  
    __obj.asInstanceOf[ITools]
  }
}

