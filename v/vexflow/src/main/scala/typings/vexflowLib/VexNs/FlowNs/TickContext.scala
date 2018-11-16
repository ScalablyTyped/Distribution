package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TickContext")
@js.native
class TickContext () extends js.Object {
  def addTickable(tickable: Tickable): TickContext = js.native
  def getCenterAlignedTickables(): js.Array[Tickable] = js.native
  def getContext(): vexflowLib.VexNs.IRenderContext = js.native
  def getCurrentTick(): Fraction = js.native
  def getExtraPx(): vexflowLib.Anon_ExtraLeft = js.native
  def getMaxTicks(): scala.Double = js.native
  def getMetrics(): vexflowLib.Anon_ExtraRightPx = js.native
  def getMinTicks(): scala.Double = js.native
  def getPixelsUsed(): scala.Double = js.native
  def getTickables(): js.Array[Tickable] = js.native
  def getWidth(): scala.Double = js.native
  def getX(): scala.Double = js.native
  def getXBase(): scala.Double = js.native
  def getXOffset(): scala.Double = js.native
  def postFormat(): TickContext = js.native
  def preFormat(): TickContext = js.native
  def setContext(context: vexflowLib.VexNs.IRenderContext): scala.Unit = js.native
  def setCurrentTick(tick: Fraction): scala.Unit = js.native
  def setPadding(padding: scala.Double): TickContext = js.native
  def setPixelsUsed(pixelsUsed: scala.Double): TickContext = js.native
  def setX(x: scala.Double): TickContext = js.native
  def setXBase(xBase: scala.Double): scala.Unit = js.native
  def setXOffset(xOffset: scala.Double): scala.Unit = js.native
  def shouldIgnoreTicks(): scala.Boolean = js.native
}

@JSGlobal("Vex.Flow.TickContext")
@js.native
object TickContext extends js.Object {
  def getNextContext(tContext: vexflowLib.VexNs.FlowNs.TickContext): vexflowLib.VexNs.FlowNs.TickContext = js.native
}

