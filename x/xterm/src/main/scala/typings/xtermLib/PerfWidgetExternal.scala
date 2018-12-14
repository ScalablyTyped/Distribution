package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerfWidgetExternal extends js.Object {
  val activeNetworkRequestCount: scala.Double = js.native
  val averageFrameTime: scala.Double = js.native
  val averagePaintTime: scala.Double = js.native
  val extraInformationEnabled: scala.Boolean = js.native
  val independentRenderingEnabled: scala.Boolean = js.native
  val irDisablingContentString: java.lang.String = js.native
  val irStatusAvailable: scala.Boolean = js.native
  val maxCpuSpeed: scala.Double = js.native
  val paintRequestsPerSecond: scala.Double = js.native
  val performanceCounter: scala.Double = js.native
  val performanceCounterFrequency: scala.Double = js.native
  def addEventListener(eventType: java.lang.String, callback: js.Function): scala.Unit = js.native
  def getMemoryUsage(): scala.Double = js.native
  def getProcessCpuUsage(): scala.Double = js.native
  def getRecentCpuUsage(): js.Any = js.native
  def getRecentCpuUsage(last: scala.Double): js.Any = js.native
  def getRecentFrames(): js.Any = js.native
  def getRecentFrames(last: scala.Double): js.Any = js.native
  def getRecentMemoryUsage(): js.Any = js.native
  def getRecentMemoryUsage(last: scala.Double): js.Any = js.native
  def getRecentPaintRequests(): js.Any = js.native
  def getRecentPaintRequests(last: scala.Double): js.Any = js.native
  def removeEventListener(eventType: java.lang.String, callback: js.Function): scala.Unit = js.native
  def repositionWindow(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def resizeWindow(width: scala.Double, height: scala.Double): scala.Unit = js.native
}

@JSGlobal("PerfWidgetExternal")
@js.native
object PerfWidgetExternal
  extends org.scalablytyped.runtime.Instantiable0[PerfWidgetExternal]

