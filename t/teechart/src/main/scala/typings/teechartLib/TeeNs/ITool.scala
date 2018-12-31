package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITool extends js.Object {
  var active: scala.Boolean
  var chart: IChart
  def clicked(p: IPoint): scala.Boolean
  def draw(): scala.Unit
  def mousedown(event: js.Any): scala.Boolean
  def mousemove(event: js.Any): scala.Boolean
}

