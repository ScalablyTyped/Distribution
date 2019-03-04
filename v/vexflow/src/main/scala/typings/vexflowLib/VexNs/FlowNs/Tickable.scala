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
    addModifier: js.Function1[Modifier, Tickable],
    addToModifierContext: js.Function1[ModifierContext, scala.Unit],
    applyTickMultiplier: js.Function2[scala.Double, scala.Double, scala.Unit],
    getBoundingBox: js.Function0[BoundingBox],
    getCenterXShift: js.Function0[scala.Double],
    getIntrinsicTicks: js.Function0[Fraction],
    getTickMultiplier: js.Function0[Fraction],
    getTicks: js.Function0[Fraction],
    getTuplet: js.Function0[Tuplet],
    getVoice: js.Function0[Voice],
    getWidth: js.Function0[scala.Double],
    isCenterAligned: js.Function0[scala.Boolean],
    postFormat: js.Function0[Tickable],
    preFormat: js.Function0[scala.Unit],
    setCenterAlignment: js.Function1[scala.Boolean, Tickable],
    setContext: js.Function1[vexflowLib.VexNs.IRenderContext, scala.Unit],
    setDuration: js.Function1[Fraction, scala.Unit],
    setIntrinsicTicks: js.Function1[Fraction, scala.Unit],
    setTickContext: js.Function1[TickContext, scala.Unit],
    setTuplet: js.Function1[Tuplet, Tickable],
    setVoice: js.Function1[Voice, scala.Unit],
    setXShift: js.Function1[scala.Double, Tickable],
    shouldIgnoreTicks: js.Function0[scala.Boolean]
  ): Tickable = {
    val __obj = js.Dynamic.literal(addModifier = addModifier, addToModifierContext = addToModifierContext, applyTickMultiplier = applyTickMultiplier, getBoundingBox = getBoundingBox, getCenterXShift = getCenterXShift, getIntrinsicTicks = getIntrinsicTicks, getTickMultiplier = getTickMultiplier, getTicks = getTicks, getTuplet = getTuplet, getVoice = getVoice, getWidth = getWidth, isCenterAligned = isCenterAligned, postFormat = postFormat, preFormat = preFormat, setCenterAlignment = setCenterAlignment, setContext = setContext, setDuration = setDuration, setIntrinsicTicks = setIntrinsicTicks, setTickContext = setTickContext, setTuplet = setTuplet, setVoice = setVoice, setXShift = setXShift, shouldIgnoreTicks = shouldIgnoreTicks)
  
    __obj.asInstanceOf[Tickable]
  }
}

