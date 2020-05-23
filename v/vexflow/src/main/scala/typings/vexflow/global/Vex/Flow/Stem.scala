package typings.vexflow.global.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.BaseY
import typings.vexflow.anon.FillStyle_
import typings.vexflow.anon.Stemdirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Stem")
@js.native
class Stem protected ()
  extends typings.vexflow.Vex.Flow.Stem {
  def this(options: Stemdirection) = this()
  //inconsistent API: this should be set via the options object in the constructor
  /* CompleteClass */
  override var hide: Boolean = js.native
  /* CompleteClass */
  override def applyStyle(context: IRenderContext): typings.vexflow.Vex.Flow.Stem = js.native
  /* CompleteClass */
  override def draw(): Unit = js.native
  /* CompleteClass */
  override def getBoundingBox(): typings.vexflow.Vex.Flow.BoundingBox = js.native
  /* CompleteClass */
  override def getCategory(): String = js.native
  /* CompleteClass */
  override def getExtents(): BaseY = js.native
  /* CompleteClass */
  override def getHeight(): Double = js.native
  /* CompleteClass */
  override def getStyle(): FillStyle_ = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): typings.vexflow.Vex.Flow.Stem = js.native
  /* CompleteClass */
  override def setDirection(direction: Double): Unit = js.native
  /* CompleteClass */
  override def setExtension(extension: Double): Unit = js.native
  /* CompleteClass */
  override def setNoteHeadXBounds(x_begin: Double, x_end: Double): typings.vexflow.Vex.Flow.Stem = js.native
  /* CompleteClass */
  override def setStyle(style: FillStyle_): Unit = js.native
  /* CompleteClass */
  override def setYBounds(y_top: Double, y_bottom: Double): Unit = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Stem")
@js.native
object Stem extends js.Object {
  var DEBUG: Boolean = js.native
  val DOWN: Double = js.native
  val UP: Double = js.native
}

