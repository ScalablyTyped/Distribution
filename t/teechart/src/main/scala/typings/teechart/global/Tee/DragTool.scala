package typings.teechart.global.Tee

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.teechart.Tee.IChart
import typings.teechart.Tee.IDragTool
import typings.teechart.Tee.IPoint
import typings.teechart.Tee.ISeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Tee.DragTool")
@js.native
class DragTool () extends IDragTool {
  def this(chart: typings.teechart.Tee.Chart) = this()
  /* CompleteClass */
  override var active: Boolean = js.native
  /* CompleteClass */
  override var chart: IChart = js.native
  /* CompleteClass */
  override var series: ISeries = js.native
  /* CompleteClass */
  override def clicked(p: IPoint): Boolean = js.native
  /* CompleteClass */
  override def draw(): Unit = js.native
  /* CompleteClass */
  override def mousedown(event: js.Any): Boolean = js.native
  /* CompleteClass */
  override def mousemove(event: js.Any): Boolean = js.native
}

@JSGlobal("Tee.DragTool")
@js.native
object DragTool
  extends Instantiable0[IDragTool]
     with Instantiable1[/* chart */ typings.teechart.Tee.Chart, IDragTool]

