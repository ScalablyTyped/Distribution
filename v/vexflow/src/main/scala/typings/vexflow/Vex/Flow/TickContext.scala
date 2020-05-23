package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.ExtraLeft
import typings.vexflow.anon.ExtraRightPx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TickContext extends js.Object {
  def addTickable(tickable: Tickable): TickContext
  def getCenterAlignedTickables(): js.Array[Tickable]
  def getContext(): IRenderContext
  def getCurrentTick(): Fraction
  def getExtraPx(): ExtraLeft
  def getMaxTicks(): Double
  def getMetrics(): ExtraRightPx
  def getMinTicks(): Double
  def getPixelsUsed(): Double
  def getTickables(): js.Array[Tickable]
  def getWidth(): Double
  def getX(): Double
  def getXBase(): Double
  def getXOffset(): Double
  def postFormat(): TickContext
  def preFormat(): TickContext
  def setContext(context: IRenderContext): Unit
  def setCurrentTick(tick: Fraction): Unit
  def setPadding(padding: Double): TickContext
  def setPixelsUsed(pixelsUsed: Double): TickContext
  def setX(x: Double): TickContext
  def setXBase(xBase: Double): Unit
  def setXOffset(xOffset: Double): Unit
  def shouldIgnoreTicks(): Boolean
}

object TickContext {
  @scala.inline
  def apply(
    addTickable: Tickable => TickContext,
    getCenterAlignedTickables: () => js.Array[Tickable],
    getContext: () => IRenderContext,
    getCurrentTick: () => Fraction,
    getExtraPx: () => ExtraLeft,
    getMaxTicks: () => Double,
    getMetrics: () => ExtraRightPx,
    getMinTicks: () => Double,
    getPixelsUsed: () => Double,
    getTickables: () => js.Array[Tickable],
    getWidth: () => Double,
    getX: () => Double,
    getXBase: () => Double,
    getXOffset: () => Double,
    postFormat: () => TickContext,
    preFormat: () => TickContext,
    setContext: IRenderContext => Unit,
    setCurrentTick: Fraction => Unit,
    setPadding: Double => TickContext,
    setPixelsUsed: Double => TickContext,
    setX: Double => TickContext,
    setXBase: Double => Unit,
    setXOffset: Double => Unit,
    shouldIgnoreTicks: () => Boolean
  ): TickContext = {
    val __obj = js.Dynamic.literal(addTickable = js.Any.fromFunction1(addTickable), getCenterAlignedTickables = js.Any.fromFunction0(getCenterAlignedTickables), getContext = js.Any.fromFunction0(getContext), getCurrentTick = js.Any.fromFunction0(getCurrentTick), getExtraPx = js.Any.fromFunction0(getExtraPx), getMaxTicks = js.Any.fromFunction0(getMaxTicks), getMetrics = js.Any.fromFunction0(getMetrics), getMinTicks = js.Any.fromFunction0(getMinTicks), getPixelsUsed = js.Any.fromFunction0(getPixelsUsed), getTickables = js.Any.fromFunction0(getTickables), getWidth = js.Any.fromFunction0(getWidth), getX = js.Any.fromFunction0(getX), getXBase = js.Any.fromFunction0(getXBase), getXOffset = js.Any.fromFunction0(getXOffset), postFormat = js.Any.fromFunction0(postFormat), preFormat = js.Any.fromFunction0(preFormat), setContext = js.Any.fromFunction1(setContext), setCurrentTick = js.Any.fromFunction1(setCurrentTick), setPadding = js.Any.fromFunction1(setPadding), setPixelsUsed = js.Any.fromFunction1(setPixelsUsed), setX = js.Any.fromFunction1(setX), setXBase = js.Any.fromFunction1(setXBase), setXOffset = js.Any.fromFunction1(setXOffset), shouldIgnoreTicks = js.Any.fromFunction0(shouldIgnoreTicks))
    __obj.asInstanceOf[TickContext]
  }
}

