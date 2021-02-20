package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.ExtraLeft
import typings.vexflow.anon.ExtraRightPx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TickContext extends StObject {
  
  def addTickable(tickable: Tickable): TickContext = js.native
  
  def getCenterAlignedTickables(): js.Array[Tickable] = js.native
  
  def getContext(): IRenderContext = js.native
  
  def getCurrentTick(): Fraction = js.native
  
  def getExtraPx(): ExtraLeft = js.native
  
  def getMaxTicks(): Double = js.native
  
  def getMetrics(): ExtraRightPx = js.native
  
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
  
  @scala.inline
  implicit class TickContextMutableBuilder[Self <: TickContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTickable(value: Tickable => TickContext): Self = StObject.set(x, "addTickable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCenterAlignedTickables(value: () => js.Array[Tickable]): Self = StObject.set(x, "getCenterAlignedTickables", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContext(value: () => IRenderContext): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentTick(value: () => Fraction): Self = StObject.set(x, "getCurrentTick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExtraPx(value: () => ExtraLeft): Self = StObject.set(x, "getExtraPx", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxTicks(value: () => Double): Self = StObject.set(x, "getMaxTicks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMetrics(value: () => ExtraRightPx): Self = StObject.set(x, "getMetrics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinTicks(value: () => Double): Self = StObject.set(x, "getMinTicks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPixelsUsed(value: () => Double): Self = StObject.set(x, "getPixelsUsed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTickables(value: () => js.Array[Tickable]): Self = StObject.set(x, "getTickables", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetX(value: () => Double): Self = StObject.set(x, "getX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetXBase(value: () => Double): Self = StObject.set(x, "getXBase", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetXOffset(value: () => Double): Self = StObject.set(x, "getXOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPostFormat(value: () => TickContext): Self = StObject.set(x, "postFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreFormat(value: () => TickContext): Self = StObject.set(x, "preFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetContext(value: IRenderContext => Unit): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCurrentTick(value: Fraction => Unit): Self = StObject.set(x, "setCurrentTick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPadding(value: Double => TickContext): Self = StObject.set(x, "setPadding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPixelsUsed(value: Double => TickContext): Self = StObject.set(x, "setPixelsUsed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetX(value: Double => TickContext): Self = StObject.set(x, "setX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetXBase(value: Double => Unit): Self = StObject.set(x, "setXBase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetXOffset(value: Double => Unit): Self = StObject.set(x, "setXOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldIgnoreTicks(value: () => Boolean): Self = StObject.set(x, "shouldIgnoreTicks", js.Any.fromFunction0(value))
  }
}
