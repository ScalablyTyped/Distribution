package typings
package vexflowLib.VexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper interface for handling the different rendering contexts (i.e. CanvasContext, RaphaelContext, SVGContext). Not part of VexFlow!
  */
@js.native
trait IRenderContext extends js.Object {
  def arc(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double,
    antiClockwise: scala.Boolean
  ): IRenderContext = js.native
  def beginPath(): IRenderContext = js.native
  def bezierCurveTo(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): IRenderContext = js.native
  def clear(): scala.Unit = js.native
  def clearRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): IRenderContext = js.native
  def closePath(): IRenderContext = js.native
  def fill(): IRenderContext = js.native
  def fillRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): IRenderContext = js.native
  def fillText(text: java.lang.String, x: scala.Double, y: scala.Double): IRenderContext = js.native
  def glow(): IRenderContext = js.native
  def lineTo(x: scala.Double, y: scala.Double): IRenderContext = js.native
  /**
    * canvas returns TextMetrics, SVG returns SVGRect, Raphael returns {width : number, height : number}. Only width is used throughout VexFlow.
    */
  def measureText(text: java.lang.String): vexflowLib.Anon_Width = js.native
  def moveTo(x: scala.Double, y: scala.Double): IRenderContext = js.native
  def quadraticCurveTo(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): IRenderContext = js.native
  def resize(width: scala.Double, height: scala.Double): IRenderContext = js.native
  def restore(): IRenderContext = js.native
  def save(): IRenderContext = js.native
  def scale(x: scala.Double, y: scala.Double): IRenderContext = js.native
  def setBackgroundFillStyle(style: java.lang.String): IRenderContext = js.native
  def setFillStyle(style: java.lang.String): IRenderContext = js.native
  def setFont(family: java.lang.String, size: scala.Double): IRenderContext = js.native
  def setFont(family: java.lang.String, size: scala.Double, weight: scala.Double): IRenderContext = js.native
  def setLineCap(cap_type: java.lang.String): IRenderContext = js.native
  def setLineDash(dash: java.lang.String): IRenderContext = js.native
  def setLineWidth(width: scala.Double): IRenderContext = js.native
  def setRawFont(font: java.lang.String): IRenderContext = js.native
  def setShadowBlur(blur: java.lang.String): IRenderContext = js.native
  def setShadowColor(color: java.lang.String): IRenderContext = js.native
  def setStrokeStyle(style: java.lang.String): IRenderContext = js.native
  def stroke(): IRenderContext = js.native
}

