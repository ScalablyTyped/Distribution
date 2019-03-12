package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tickable extends js.Object {
  def addModifier(mod: Modifier): Tickable
  def addToModifierContext(mc: ModifierContext): scala.Unit
  def applyTickMultiplier(numerator: scala.Double, denominator: scala.Double): scala.Unit
  def getBoundingBox(): BoundingBox
  def getCenterXShift(): scala.Double
  def getIntrinsicTicks(): Fraction
  def getTickMultiplier(): Fraction
  def getTicks(): Fraction
  def getTuplet(): Tuplet
  def getVoice(): Voice
  def getWidth(): scala.Double
  def isCenterAligned(): scala.Boolean
  def postFormat(): Tickable
  def preFormat(): scala.Unit
  def setCenterAlignment(align_center: scala.Boolean): Tickable
  def setContext(context: vexflowLib.VexNs.IRenderContext): scala.Unit
  def setDuration(duration: Fraction): scala.Unit
  def setIntrinsicTicks(intrinsicTicks: Fraction): scala.Unit
  def setTickContext(tc: TickContext): scala.Unit
  def setTuplet(tuplet: Tuplet): Tickable
  def setVoice(voice: Voice): scala.Unit
  def setXShift(x: scala.Double): Tickable
  def shouldIgnoreTicks(): scala.Boolean
}

object Tickable {
  @scala.inline
  def apply(
    addModifier: Modifier => Tickable,
    addToModifierContext: ModifierContext => scala.Unit,
    applyTickMultiplier: (scala.Double, scala.Double) => scala.Unit,
    getBoundingBox: () => BoundingBox,
    getCenterXShift: () => scala.Double,
    getIntrinsicTicks: () => Fraction,
    getTickMultiplier: () => Fraction,
    getTicks: () => Fraction,
    getTuplet: () => Tuplet,
    getVoice: () => Voice,
    getWidth: () => scala.Double,
    isCenterAligned: () => scala.Boolean,
    postFormat: () => Tickable,
    preFormat: () => scala.Unit,
    setCenterAlignment: scala.Boolean => Tickable,
    setContext: vexflowLib.VexNs.IRenderContext => scala.Unit,
    setDuration: Fraction => scala.Unit,
    setIntrinsicTicks: Fraction => scala.Unit,
    setTickContext: TickContext => scala.Unit,
    setTuplet: Tuplet => Tickable,
    setVoice: Voice => scala.Unit,
    setXShift: scala.Double => Tickable,
    shouldIgnoreTicks: () => scala.Boolean
  ): Tickable = {
    val __obj = js.Dynamic.literal(addModifier = js.Any.fromFunction1(addModifier), addToModifierContext = js.Any.fromFunction1(addToModifierContext), applyTickMultiplier = js.Any.fromFunction2(applyTickMultiplier), getBoundingBox = js.Any.fromFunction0(getBoundingBox), getCenterXShift = js.Any.fromFunction0(getCenterXShift), getIntrinsicTicks = js.Any.fromFunction0(getIntrinsicTicks), getTickMultiplier = js.Any.fromFunction0(getTickMultiplier), getTicks = js.Any.fromFunction0(getTicks), getTuplet = js.Any.fromFunction0(getTuplet), getVoice = js.Any.fromFunction0(getVoice), getWidth = js.Any.fromFunction0(getWidth), isCenterAligned = js.Any.fromFunction0(isCenterAligned), postFormat = js.Any.fromFunction0(postFormat), preFormat = js.Any.fromFunction0(preFormat), setCenterAlignment = js.Any.fromFunction1(setCenterAlignment), setContext = js.Any.fromFunction1(setContext), setDuration = js.Any.fromFunction1(setDuration), setIntrinsicTicks = js.Any.fromFunction1(setIntrinsicTicks), setTickContext = js.Any.fromFunction1(setTickContext), setTuplet = js.Any.fromFunction1(setTuplet), setVoice = js.Any.fromFunction1(setVoice), setXShift = js.Any.fromFunction1(setXShift), shouldIgnoreTicks = js.Any.fromFunction0(shouldIgnoreTicks))
  
    __obj.asInstanceOf[Tickable]
  }
}

