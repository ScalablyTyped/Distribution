package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Tee.DragTool")
@js.native
class DragTool () extends IDragTool {
  def this(chart: Chart) = this()
  /* CompleteClass */
  override var active: scala.Boolean = js.native
  /* CompleteClass */
  override var chart: IChart = js.native
  /* CompleteClass */
  override var series: ISeries = js.native
  /* CompleteClass */
  override def clicked(p: IPoint): scala.Boolean = js.native
  /* CompleteClass */
  override def draw(): scala.Unit = js.native
  /* CompleteClass */
  override def mousedown(event: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def mousemove(event: js.Any): scala.Boolean = js.native
}

@JSGlobal("Tee.DragTool")
@js.native
object DragTool
  extends org.scalablytyped.runtime.Instantiable0[IDragTool]
     with org.scalablytyped.runtime.Instantiable1[/* chart */ Chart, IDragTool]

