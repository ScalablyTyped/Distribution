package typings.vexflow.Vex

import typings.std.Node
import typings.vexflow.anon.Width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper interface for handling the different rendering contexts (i.e. CanvasContext, RaphaelContext, SVGContext). Not part of VexFlow!
  */
@js.native
trait IRenderContext extends js.Object {
  
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, antiClockwise: Boolean): IRenderContext = js.native
  
  def beginPath(): IRenderContext = js.native
  
  def bezierCurveTo(x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double): IRenderContext = js.native
  
  def clear(): Unit = js.native
  
  def clearRect(x: Double, y: Double, width: Double, height: Double): IRenderContext = js.native
  
  def closeGroup(): Unit = js.native
  
  def closePath(): IRenderContext = js.native
  
  def fill(): IRenderContext = js.native
  
  def fillRect(x: Double, y: Double, width: Double, height: Double): IRenderContext = js.native
  
  def fillText(text: String, x: Double, y: Double): IRenderContext = js.native
  
  def glow(): IRenderContext = js.native
  
  def lineTo(x: Double, y: Double): IRenderContext = js.native
  
  /**
    * canvas returns TextMetrics, SVG returns SVGRect, Raphael returns {width : number, height : number}. Only width is used throughout VexFlow.
    */
  def measureText(text: String): Width = js.native
  
  def moveTo(x: Double, y: Double): IRenderContext = js.native
  
  def openGroup(): js.UndefOr[Node] = js.native
  
  def quadraticCurveTo(x1: Double, y1: Double, x2: Double, y2: Double): IRenderContext = js.native
  
  def resize(width: Double, height: Double): IRenderContext = js.native
  
  def restore(): IRenderContext = js.native
  
  def save(): IRenderContext = js.native
  
  def scale(x: Double, y: Double): IRenderContext = js.native
  
  def setBackgroundFillStyle(style: String): IRenderContext = js.native
  
  def setFillStyle(style: String): IRenderContext = js.native
  
  def setFont(family: String, size: Double): IRenderContext = js.native
  def setFont(family: String, size: Double, weight: Double): IRenderContext = js.native
  
  def setLineCap(cap_type: String): IRenderContext = js.native
  
  def setLineDash(dash: String): IRenderContext = js.native
  
  def setLineWidth(width: Double): IRenderContext = js.native
  
  def setRawFont(font: String): IRenderContext = js.native
  
  def setShadowBlur(blur: String): IRenderContext = js.native
  
  def setShadowColor(color: String): IRenderContext = js.native
  
  def setStrokeStyle(style: String): IRenderContext = js.native
  
  def stroke(): IRenderContext = js.native
}
