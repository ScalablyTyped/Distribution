package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.BoundingBox")
@js.native
class BoundingBox protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double) = this()
  def draw(ctx: vexflowLib.VexNs.IRenderContext, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def getH(): scala.Double = js.native
  def getW(): scala.Double = js.native
  def getX(): scala.Double = js.native
  def getY(): scala.Double = js.native
  def mergeWith(boundingBox: BoundingBox): BoundingBox = js.native
  def mergeWith(boundingBox: BoundingBox, ctx: vexflowLib.VexNs.IRenderContext): BoundingBox = js.native
  def move(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setH(h: scala.Double): BoundingBox = js.native
  def setW(w: scala.Double): BoundingBox = js.native
  def setX(x: scala.Double): BoundingBox = js.native
  def setY(y: scala.Double): BoundingBox = js.native
}

/* static members */
@JSGlobal("Vex.Flow.BoundingBox")
@js.native
object BoundingBox extends js.Object {
  def copy(that: vexflowLib.VexNs.FlowNs.BoundingBox): vexflowLib.VexNs.FlowNs.BoundingBox = js.native
}

