package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChart extends js.Object {
  def addSeries(series: ISeries): ISeries = js.native
  def draw(): js.Any = js.native
  def draw(context: stdLib.CanvasRenderingContext2D): js.Any = js.native
}

