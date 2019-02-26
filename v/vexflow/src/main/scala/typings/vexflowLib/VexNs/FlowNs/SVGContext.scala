package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.SVGContext")
@js.native
class SVGContext protected ()
  extends vexflowLib.VexNs.IRenderContext {
  def this(element: stdLib.HTMLElement) = this()
  var attributes: js.Any = js.native
  var lineWidth: scala.Double = js.native
  var state: js.Any = js.native
  var svg: stdLib.SVGElement = js.native
  def ieMeasureTextFix(bbox: stdLib.SVGRect, text: java.lang.String): vexflowLib.Anon_HeightWidthX = js.native
  def iePolyfill(): scala.Boolean = js.native
  def rect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): SVGContext = js.native
  def setFont(family: java.lang.String, size: scala.Double, weight: java.lang.String): SVGContext = js.native
  def setViewBox(xMin: scala.Double, yMin: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
}

