package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.CanvasContext")
@js.native
class CanvasContext protected ()
  extends vexflowLib.VexNs.IRenderContext {
  def this(context: stdLib.CanvasRenderingContext2D) = this()
  @JSName("arc")
  def arc_CanvasContext(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double,
    antiClockwise: scala.Boolean
  ): CanvasContext = js.native
  @JSName("beginPath")
  def beginPath_CanvasContext(): CanvasContext = js.native
  @JSName("bezierCurveToTo")
  def bezierCurveToTo_CanvasContext(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): CanvasContext = js.native
  @JSName("clearRect")
  def clearRect_CanvasContext(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): CanvasContext = js.native
  @JSName("closePath")
  def closePath_CanvasContext(): CanvasContext = js.native
  @JSName("fillRect")
  def fillRect_CanvasContext(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): CanvasContext = js.native
  @JSName("fillText")
  def fillText_CanvasContext(text: java.lang.String, x: scala.Double, y: scala.Double): CanvasContext = js.native
  @JSName("fill")
  def fill_CanvasContext(): CanvasContext = js.native
  @JSName("glow")
  def glow_CanvasContext(): CanvasContext = js.native
  @JSName("lineTo")
  def lineTo_CanvasContext(x: scala.Double, y: scala.Double): CanvasContext = js.native
  @JSName("moveTo")
  def moveTo_CanvasContext(x: scala.Double, y: scala.Double): CanvasContext = js.native
  @JSName("quadraticCurveToTo")
  def quadraticCurveToTo_CanvasContext(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): CanvasContext = js.native
  @JSName("resize")
  def resize_CanvasContext(width: scala.Double, height: scala.Double): CanvasContext = js.native
  @JSName("restore")
  def restore_CanvasContext(): CanvasContext = js.native
  @JSName("save")
  def save_CanvasContext(): CanvasContext = js.native
  @JSName("scale")
  def scale_CanvasContext(x: scala.Double, y: scala.Double): CanvasContext = js.native
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes or type inconsistencies mentioned below are fixed
  @JSName("setLineDash")
  def setLineDash_CanvasContext(dash: java.lang.String): CanvasContext = js.native
  @JSName("stroke")
  def stroke_CanvasContext(): CanvasContext = js.native
}

@JSGlobal("Vex.Flow.CanvasContext")
@js.native
object CanvasContext extends js.Object {
  var HEIGHT: scala.Double = js.native
  var WIDTH: scala.Double = js.native
}

