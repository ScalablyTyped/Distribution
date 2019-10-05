package typings.vexflow.Vex.Flow

import typings.vexflow.Anon_BaseY
import typings.vexflow.Anon_FillStyle
import typings.vexflow.Anon_Stemdirection
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Stem")
@js.native
class Stem protected () extends js.Object {
  def this(options: Anon_Stemdirection) = this()
  //inconsistent API: this should be set via the options object in the constructor
  var hide: Boolean = js.native
  def applyStyle(context: IRenderContext): Stem = js.native
  def draw(): Unit = js.native
  def getBoundingBox(): BoundingBox = js.native
  def getCategory(): String = js.native
  def getExtents(): Anon_BaseY = js.native
  def getHeight(): Double = js.native
  def getStyle(): Anon_FillStyle = js.native
  def setContext(context: IRenderContext): Stem = js.native
  def setDirection(direction: Double): Unit = js.native
  def setExtension(extension: Double): Unit = js.native
  def setNoteHeadXBounds(x_begin: Double, x_end: Double): Stem = js.native
  def setStyle(style: Anon_FillStyle): Unit = js.native
  def setYBounds(y_top: Double, y_bottom: Double): Unit = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Stem")
@js.native
object Stem extends js.Object {
  var DEBUG: Boolean = js.native
  val DOWN: Double = js.native
  val UP: Double = js.native
}

