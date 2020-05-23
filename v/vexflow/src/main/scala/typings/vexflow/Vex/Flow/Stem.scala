package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.BaseY
import typings.vexflow.anon.FillStyle_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stem extends js.Object {
  //inconsistent API: this should be set via the options object in the constructor
  var hide: Boolean
  def applyStyle(context: IRenderContext): Stem
  def draw(): Unit
  def getBoundingBox(): BoundingBox
  def getCategory(): String
  def getExtents(): BaseY
  def getHeight(): Double
  def getStyle(): FillStyle_
  def setContext(context: IRenderContext): Stem
  def setDirection(direction: Double): Unit
  def setExtension(extension: Double): Unit
  def setNoteHeadXBounds(x_begin: Double, x_end: Double): Stem
  def setStyle(style: FillStyle_): Unit
  def setYBounds(y_top: Double, y_bottom: Double): Unit
}

object Stem {
  @scala.inline
  def apply(
    applyStyle: IRenderContext => Stem,
    draw: () => Unit,
    getBoundingBox: () => BoundingBox,
    getCategory: () => String,
    getExtents: () => BaseY,
    getHeight: () => Double,
    getStyle: () => FillStyle_,
    hide: Boolean,
    setContext: IRenderContext => Stem,
    setDirection: Double => Unit,
    setExtension: Double => Unit,
    setNoteHeadXBounds: (Double, Double) => Stem,
    setStyle: FillStyle_ => Unit,
    setYBounds: (Double, Double) => Unit
  ): Stem = {
    val __obj = js.Dynamic.literal(applyStyle = js.Any.fromFunction1(applyStyle), draw = js.Any.fromFunction0(draw), getBoundingBox = js.Any.fromFunction0(getBoundingBox), getCategory = js.Any.fromFunction0(getCategory), getExtents = js.Any.fromFunction0(getExtents), getHeight = js.Any.fromFunction0(getHeight), getStyle = js.Any.fromFunction0(getStyle), hide = hide.asInstanceOf[js.Any], setContext = js.Any.fromFunction1(setContext), setDirection = js.Any.fromFunction1(setDirection), setExtension = js.Any.fromFunction1(setExtension), setNoteHeadXBounds = js.Any.fromFunction2(setNoteHeadXBounds), setStyle = js.Any.fromFunction1(setStyle), setYBounds = js.Any.fromFunction2(setYBounds))
    __obj.asInstanceOf[Stem]
  }
}

