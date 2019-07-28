package typings.vexflow.VexNs.FlowNs

import typings.vexflow.VexNs.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tickable extends js.Object {
  def addModifier(mod: Modifier): Tickable
  def addToModifierContext(mc: ModifierContext): Unit
  def applyTickMultiplier(numerator: Double, denominator: Double): Unit
  def getBoundingBox(): BoundingBox
  def getCenterXShift(): Double
  def getIntrinsicTicks(): Fraction
  def getTickMultiplier(): Fraction
  def getTicks(): Fraction
  def getTuplet(): Tuplet
  def getVoice(): Voice
  def getWidth(): Double
  def isCenterAligned(): Boolean
  def postFormat(): Tickable
  def preFormat(): Unit
  def setCenterAlignment(align_center: Boolean): Tickable
  def setContext(context: IRenderContext): Unit
  def setDuration(duration: Fraction): Unit
  def setIntrinsicTicks(intrinsicTicks: Fraction): Unit
  def setTickContext(tc: TickContext): Unit
  def setTuplet(tuplet: Tuplet): Tickable
  def setVoice(voice: Voice): Unit
  def setXShift(x: Double): Tickable
  def shouldIgnoreTicks(): Boolean
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
}

