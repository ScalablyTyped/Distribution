package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasContext extends IRenderContext {
  
   //inconsistent name: x -> x2, y -> y2
  @JSName("arc")
  def arc_Unit(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, antiClockwise: Boolean): Unit = js.native
  
  @JSName("beginPath")
  def beginPath_Unit(): Unit = js.native
  
  def bezierCurveToTo(x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double): Unit = js.native
  
  @JSName("clearRect")
  def clearRect_Unit(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  @JSName("closePath")
  def closePath_Unit(): Unit = js.native
  
  @JSName("fillRect")
  def fillRect_Unit(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  @JSName("fillText")
  def fillText_Unit(text: String, x: Double, y: Double): Unit = js.native
  
  @JSName("fill")
  def fill_Unit(): Unit = js.native
  
  @JSName("glow")
  def glow_Unit(): Unit = js.native
  
  @JSName("lineTo")
  def lineTo_Unit(x: Double, y: Double): Unit = js.native
  
  @JSName("moveTo")
  def moveTo_Unit(x: Double, y: Double): Unit = js.native
  
  def quadraticCurveToTo(x1: Double, y1: Double, x: Double, y: Double): Unit = js.native
  
  @JSName("resize")
  def resize_Unit(width: Double, height: Double): Unit = js.native
  
  @JSName("restore")
  def restore_Unit(): Unit = js.native
  
  @JSName("save")
  def save_Unit(): Unit = js.native
  
  @JSName("scale")
  def scale_Unit(x: Double, y: Double): Unit = js.native
  
  //inconsistent type: void -> CanvasContext
  @JSName("setLineDash")
  def setLineDash_Unit(dash: String): Unit = js.native
  
  @JSName("stroke")
  def stroke_Unit(): Unit = js.native
}
