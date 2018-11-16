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

