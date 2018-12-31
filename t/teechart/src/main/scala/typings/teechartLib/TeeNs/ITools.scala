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

