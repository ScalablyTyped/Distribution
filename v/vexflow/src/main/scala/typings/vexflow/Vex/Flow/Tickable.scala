package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tickable extends StObject {
  
  def addModifier(mod: Modifier): Tickable = js.native
  
  def addToModifierContext(mc: ModifierContext): Unit = js.native
  
  def applyTickMultiplier(numerator: Double, denominator: Double): Unit = js.native
  
  def getBoundingBox(): BoundingBox = js.native
  
  def getCenterXShift(): Double = js.native
  
  def getIntrinsicTicks(): Fraction = js.native
  
  def getTickMultiplier(): Fraction = js.native
  
  def getTicks(): Fraction = js.native
  
  def getTuplet(): Tuplet = js.native
  
  def getVoice(): Voice = js.native
  
  def getWidth(): Double = js.native
  
  def isCenterAligned(): Boolean = js.native
  
  def postFormat(): Tickable = js.native
  
  def preFormat(): Unit = js.native
  
  def setCenterAlignment(align_center: Boolean): Tickable = js.native
  
  def setContext(context: IRenderContext): Unit = js.native
  
  def setDuration(duration: Fraction): Unit = js.native
  
  def setIntrinsicTicks(intrinsicTicks: Fraction): Unit = js.native
  
  def setTickContext(tc: TickContext): Unit = js.native
  
  def setTuplet(tuplet: Tuplet): Tickable = js.native
  
  def setVoice(voice: Voice): Unit = js.native
  
  def setXShift(x: Double): Tickable = js.native
  
  def shouldIgnoreTicks(): Boolean = js.native
}
object Tickable {
  
  @scala.inline
  def apply(
    addModifier: Modifier => Tickable,
    addToModifierContext: ModifierContext => Unit,
    applyTickMultiplier: (Double, Double) => Unit,
    getBoundingBox: () => BoundingBox,
    getCenterXShift: () => Double,
    getIntrinsicTicks: () => Fraction,
    getTickMultiplier: () => Fraction,
    getTicks: () => Fraction,
    getTuplet: () => Tuplet,
    getVoice: () => Voice,
    getWidth: () => Double,
    isCenterAligned: () => Boolean,
    postFormat: () => Tickable,
    preFormat: () => Unit,
    setCenterAlignment: Boolean => Tickable,
    setContext: IRenderContext => Unit,
    setDuration: Fraction => Unit,
    setIntrinsicTicks: Fraction => Unit,
    setTickContext: TickContext => Unit,
    setTuplet: Tuplet => Tickable,
    setVoice: Voice => Unit,
    setXShift: Double => Tickable,
    shouldIgnoreTicks: () => Boolean
  ): Tickable = {
    val __obj = js.Dynamic.literal(addModifier = js.Any.fromFunction1(addModifier), addToModifierContext = js.Any.fromFunction1(addToModifierContext), applyTickMultiplier = js.Any.fromFunction2(applyTickMultiplier), getBoundingBox = js.Any.fromFunction0(getBoundingBox), getCenterXShift = js.Any.fromFunction0(getCenterXShift), getIntrinsicTicks = js.Any.fromFunction0(getIntrinsicTicks), getTickMultiplier = js.Any.fromFunction0(getTickMultiplier), getTicks = js.Any.fromFunction0(getTicks), getTuplet = js.Any.fromFunction0(getTuplet), getVoice = js.Any.fromFunction0(getVoice), getWidth = js.Any.fromFunction0(getWidth), isCenterAligned = js.Any.fromFunction0(isCenterAligned), postFormat = js.Any.fromFunction0(postFormat), preFormat = js.Any.fromFunction0(preFormat), setCenterAlignment = js.Any.fromFunction1(setCenterAlignment), setContext = js.Any.fromFunction1(setContext), setDuration = js.Any.fromFunction1(setDuration), setIntrinsicTicks = js.Any.fromFunction1(setIntrinsicTicks), setTickContext = js.Any.fromFunction1(setTickContext), setTuplet = js.Any.fromFunction1(setTuplet), setVoice = js.Any.fromFunction1(setVoice), setXShift = js.Any.fromFunction1(setXShift), shouldIgnoreTicks = js.Any.fromFunction0(shouldIgnoreTicks))
    __obj.asInstanceOf[Tickable]
  }
  
  @scala.inline
  implicit class TickableMutableBuilder[Self <: Tickable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddModifier(value: Modifier => Tickable): Self = StObject.set(x, "addModifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddToModifierContext(value: ModifierContext => Unit): Self = StObject.set(x, "addToModifierContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplyTickMultiplier(value: (Double, Double) => Unit): Self = StObject.set(x, "applyTickMultiplier", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBoundingBox(value: () => BoundingBox): Self = StObject.set(x, "getBoundingBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCenterXShift(value: () => Double): Self = StObject.set(x, "getCenterXShift", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIntrinsicTicks(value: () => Fraction): Self = StObject.set(x, "getIntrinsicTicks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTickMultiplier(value: () => Fraction): Self = StObject.set(x, "getTickMultiplier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTicks(value: () => Fraction): Self = StObject.set(x, "getTicks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTuplet(value: () => Tuplet): Self = StObject.set(x, "getTuplet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVoice(value: () => Voice): Self = StObject.set(x, "getVoice", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCenterAligned(value: () => Boolean): Self = StObject.set(x, "isCenterAligned", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPostFormat(value: () => Tickable): Self = StObject.set(x, "postFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreFormat(value: () => Unit): Self = StObject.set(x, "preFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCenterAlignment(value: Boolean => Tickable): Self = StObject.set(x, "setCenterAlignment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetContext(value: IRenderContext => Unit): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDuration(value: Fraction => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIntrinsicTicks(value: Fraction => Unit): Self = StObject.set(x, "setIntrinsicTicks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTickContext(value: TickContext => Unit): Self = StObject.set(x, "setTickContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTuplet(value: Tuplet => Tickable): Self = StObject.set(x, "setTuplet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVoice(value: Voice => Unit): Self = StObject.set(x, "setVoice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetXShift(value: Double => Tickable): Self = StObject.set(x, "setXShift", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldIgnoreTicks(value: () => Boolean): Self = StObject.set(x, "shouldIgnoreTicks", js.Any.fromFunction0(value))
  }
}
