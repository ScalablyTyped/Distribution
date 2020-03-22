package typings.vexflow.Vex.Flow

import typings.vexflow.AnonExtraLeft
import typings.vexflow.AnonExtraRightPx
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TickContext")
@js.native
class TickContext () extends js.Object {
  def addTickable(tickable: Tickable): TickContext = js.native
  def getCenterAlignedTickables(): js.Array[Tickable] = js.native
  def getContext(): IRenderContext = js.native
  def getCurrentTick(): Fraction = js.native
  def getExtraPx(): AnonExtraLeft = js.native
  def getMaxTicks(): Double = js.native
  def getMetrics(): AnonExtraRightPx = js.native
  def getMinTicks(): Double = js.native
  def getPixelsUsed(): Double = js.native
  def getTickables(): js.Array[Tickable] = js.native
  def getWidth(): Double = js.native
  def getX(): Double = js.native
  def getXBase(): Double = js.native
  def getXOffset(): Double = js.native
  def postFormat(): TickContext = js.native
  def preFormat(): TickContext = js.native
  def setContext(context: IRenderContext): Unit = js.native
  def setCurrentTick(tick: Fraction): Unit = js.native
  def setPadding(padding: Double): TickContext = js.native
  def setPixelsUsed(pixelsUsed: Double): TickContext = js.native
  def setX(x: Double): TickContext = js.native
  def setXBase(xBase: Double): Unit = js.native
  def setXOffset(xOffset: Double): Unit = js.native
  def shouldIgnoreTicks(): Boolean = js.native
}

/* static members */
@JSGlobal("Vex.Flow.TickContext")
@js.native
object TickContext extends js.Object {
  def getNextContext(tContext: TickContext): TickContext = js.native
}

