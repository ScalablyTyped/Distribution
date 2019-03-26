package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Tee.CursorTool")
@js.native
class CursorTool () extends ICursorTool {
  def this(chart: Chart) = this()
  /* CompleteClass */
  override var active: scala.Boolean = js.native
  /* CompleteClass */
  override var chart: IChart = js.native
  /* CompleteClass */
  override var direction: java.lang.String = js.native
  /* CompleteClass */
  override var dragging: scala.Double = js.native
  /* CompleteClass */
  override var followMouse: scala.Boolean = js.native
  /* CompleteClass */
  override var format: IFormat = js.native
  /* CompleteClass */
  override var horizAxis: IAxis = js.native
  /* CompleteClass */
  override var render: java.lang.String = js.native
  /* CompleteClass */
  override var size: IPoint = js.native
  /* CompleteClass */
  override var vertAxis: IAxis = js.native
  /* CompleteClass */
  override def clicked(p: IPoint): scala.Boolean = js.native
  /* CompleteClass */
  override def draw(): scala.Unit = js.native
  /* CompleteClass */
  override def mousedown(event: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def mousemove(event: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def over(point: IPoint): scala.Boolean = js.native
  /* CompleteClass */
  override def setRender(render: java.lang.String): scala.Unit = js.native
}

