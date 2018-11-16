package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.RaphaelContext")
@js.native
class RaphaelContext protected ()
  extends vexflowLib.VexNs.IRenderContext {
  def this(element: stdLib.HTMLElement) = this()
  @JSName("glow")
  def glow_RaphaelContext(): RaphaelContext = js.native
  def rect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  @JSName("setLineWidth")
  def setLineWidth_Unit(width: scala.Double): scala.Unit = js.native
  def setViewBox(viewBox: java.lang.String): scala.Unit = js.native
}

