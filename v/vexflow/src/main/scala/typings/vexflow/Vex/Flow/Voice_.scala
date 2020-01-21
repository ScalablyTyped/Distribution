package typings.vexflow.Vex.Flow

import typings.vexflow.AnonBeatvalue
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Voice")
@js.native
class Voice_ protected () extends js.Object {
  def this(time: AnonBeatvalue) = this()
  def addTickable(tickable: Tickable): Voice = js.native
  def addTickables(tickables: js.Array[Tickable]): Voice = js.native
  def draw(context: IRenderContext): Unit = js.native
  def draw(context: IRenderContext, stave: Stave): Unit = js.native
  def getActualResolution(): Double = js.native
  def getBoundingBox(): BoundingBox = js.native
  def getLargestTickWidth(): Double = js.native
  def getMode(): Double = js.native
  def getResolutionMultiplier(): Double = js.native
  def getSmallestTickCount(): Fraction = js.native
  def getTickables(): js.Array[Tickable] = js.native
  def getTicksUsed(): Fraction = js.native
  def getTotalTicks(): Fraction = js.native
  def getVoiceGroup(): VoiceGroup = js.native
  def isComplete(): Boolean = js.native
  def preFormat(): Voice = js.native
  def setMode(mode: Double): Voice = js.native
  def setStave(stave: Stave): Voice = js.native
  def setStrict(strict: Boolean): Voice = js.native
  def setVoiceGroup(g: VoiceGroup): Voice = js.native
}

