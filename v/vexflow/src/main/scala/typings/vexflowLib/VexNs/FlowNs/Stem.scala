package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Stem")
@js.native
class Stem protected () extends js.Object {
  def this(options: vexflowLib.Anon_Xend) = this()
  //inconsistent API: this should be set via the options object in the constructor
  var hide: scala.Boolean = js.native
  def applyStyle(context: vexflowLib.VexNs.IRenderContext): Stem = js.native
  def draw(): scala.Unit = js.native
  def getBoundingBox(): BoundingBox = js.native
  def getCategory(): java.lang.String = js.native
  def getExtents(): vexflowLib.Anon_TopY = js.native
  def getHeight(): scala.Double = js.native
  def getStyle(): vexflowLib.Anon_ShadowBlur = js.native
  def setContext(context: vexflowLib.VexNs.IRenderContext): Stem = js.native
  def setDirection(direction: scala.Double): scala.Unit = js.native
  def setExtension(extension: scala.Double): scala.Unit = js.native
  def setNoteHeadXBounds(x_begin: scala.Double, x_end: scala.Double): Stem = js.native
  def setStyle(style: vexflowLib.Anon_ShadowBlur): scala.Unit = js.native
  def setYBounds(y_top: scala.Double, y_bottom: scala.Double): scala.Unit = js.native
}

@JSGlobal("Vex.Flow.Stem")
@js.native
object Stem extends js.Object {
  var DEBUG: scala.Boolean = js.native
}

