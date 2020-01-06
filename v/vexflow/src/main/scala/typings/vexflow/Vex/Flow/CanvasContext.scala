package typings.vexflow.Vex.Flow

import typings.std.CanvasRenderingContext2D
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.CanvasContext")
@js.native
class CanvasContext protected () extends IRenderContext {
  def this(context: CanvasRenderingContext2D) = this()
  @JSName("arc")
  def arc_CanvasContext(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, antiClockwise: Boolean): CanvasContext = js.native
  @JSName("beginPath")
  def beginPath_CanvasContext(): CanvasContext = js.native
  def bezierCurveToTo(x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double): Unit = js.native
  @JSName("clearRect")
  def clearRect_CanvasContext(x: Double, y: Double, width: Double, height: Double): CanvasContext = js.native
  @JSName("closePath")
  def closePath_CanvasContext(): CanvasContext = js.native
  @JSName("fillRect")
  def fillRect_CanvasContext(x: Double, y: Double, width: Double, height: Double): CanvasContext = js.native
  @JSName("fillText")
  def fillText_CanvasContext(text: String, x: Double, y: Double): CanvasContext = js.native
  @JSName("fill")
  def fill_CanvasContext(): CanvasContext = js.native
  @JSName("glow")
  def glow_CanvasContext(): CanvasContext = js.native
  @JSName("lineTo")
  def lineTo_CanvasContext(x: Double, y: Double): CanvasContext = js.native
  @JSName("moveTo")
  def moveTo_CanvasContext(x: Double, y: Double): CanvasContext = js.native
  def quadraticCurveToTo(x1: Double, y1: Double, x: Double, y: Double): Unit = js.native
  @JSName("resize")
  def resize_CanvasContext(width: Double, height: Double): CanvasContext = js.native
  @JSName("restore")
  def restore_CanvasContext(): CanvasContext = js.native
  @JSName("save")
  def save_CanvasContext(): CanvasContext = js.native
  @JSName("scale")
  def scale_CanvasContext(x: Double, y: Double): CanvasContext = js.native
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes or type inconsistencies mentioned below are fixed
  @JSName("setLineDash")
  def setLineDash_CanvasContext(dash: String): CanvasContext = js.native
  @JSName("stroke")
  def stroke_CanvasContext(): CanvasContext = js.native
}

/* static members */
@JSGlobal("Vex.Flow.CanvasContext")
@js.native
object CanvasContext extends js.Object {
  var HEIGHT: Double = js.native
  var WIDTH: Double = js.native
}

