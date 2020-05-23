package typings.teechart.global.Tee

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.teechart.Tee.IAxis
import typings.teechart.Tee.IChart
import typings.teechart.Tee.ICursorTool
import typings.teechart.Tee.IFormat
import typings.teechart.Tee.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Tee.CursorTool")
@js.native
class CursorTool () extends ICursorTool {
  def this(chart: typings.teechart.Tee.Chart) = this()
  /* CompleteClass */
  override var active: Boolean = js.native
  /* CompleteClass */
  override var chart: IChart = js.native
  /* CompleteClass */
  override var direction: String = js.native
  /* CompleteClass */
  override var dragging: Double = js.native
  /* CompleteClass */
  override var followMouse: Boolean = js.native
  /* CompleteClass */
  override var format: IFormat = js.native
  /* CompleteClass */
  override var horizAxis: IAxis = js.native
  /* CompleteClass */
  override var render: String = js.native
  /* CompleteClass */
  override var size: IPoint = js.native
  /* CompleteClass */
  override var vertAxis: IAxis = js.native
  /* CompleteClass */
  override def clicked(p: IPoint): Boolean = js.native
  /* CompleteClass */
  override def draw(): Unit = js.native
  /* CompleteClass */
  override def mousedown(event: js.Any): Boolean = js.native
  /* CompleteClass */
  override def mousemove(event: js.Any): Boolean = js.native
  /* CompleteClass */
  override def over(point: IPoint): Boolean = js.native
  /* CompleteClass */
  override def setRender(render: String): Unit = js.native
}

// TOOLS
@JSGlobal("Tee.CursorTool")
@js.native
object CursorTool
  extends Instantiable0[ICursorTool]
     with Instantiable1[/* chart */ typings.teechart.Tee.Chart, ICursorTool]

