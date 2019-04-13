package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Tee.ToolTip")
@js.native
class ToolTip () extends IToolTip {
  def this(chart: Chart) = this()
  /* CompleteClass */
  override var active: scala.Boolean = js.native
  /* CompleteClass */
  override var animated: scala.Double = js.native
  /* CompleteClass */
  override var autoHide: scala.Boolean = js.native
  /* CompleteClass */
  override var autoRedraw: scala.Boolean = js.native
  /* CompleteClass */
  override var bounds: IRectangle = js.native
  /* CompleteClass */
  override var chart: IChart = js.native
  /* CompleteClass */
  override var currentIndex: scala.Double = js.native
  /* CompleteClass */
  override var currentSeries: ISeries = js.native
  /* CompleteClass */
  override var delay: scala.Double = js.native
  /* CompleteClass */
  override var format: IFormat = js.native
  /* CompleteClass */
  override var items: js.Array[IAnnotation] = js.native
  /* CompleteClass */
  override var margins: IMargins = js.native
  /* CompleteClass */
  override var position: IPoint = js.native
  /* CompleteClass */
  override var text: java.lang.String = js.native
  /* CompleteClass */
  override var transparent: scala.Boolean = js.native
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
  /* CompleteClass */
  override def add(text: java.lang.String): IAnnotation = js.native
  /* CompleteClass */
  override def clicked(p: IPoint): scala.Boolean = js.native
  /* CompleteClass */
  override def draw(): scala.Unit = js.native
  /* CompleteClass */
  override def hide(): scala.Unit = js.native
  /* CompleteClass */
  override def mousedown(event: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def mousemove(event: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def refresh(series: ISeries, index: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def resize(): scala.Unit = js.native
}

@JSGlobal("Tee.ToolTip")
@js.native
object ToolTip
  extends org.scalablytyped.runtime.Instantiable0[IToolTip]
     with org.scalablytyped.runtime.Instantiable1[/* chart */ Chart, IToolTip]

