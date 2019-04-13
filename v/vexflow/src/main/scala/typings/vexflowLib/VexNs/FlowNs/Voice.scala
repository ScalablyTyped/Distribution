package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Voice")
@js.native
class Voice protected () extends js.Object {
  def this(time: vexflowLib.Anon_Beatvalue) = this()
  def addTickable(tickable: Tickable): Voice = js.native
  def addTickables(tickables: js.Array[Tickable]): Voice = js.native
  def draw(context: vexflowLib.VexNs.IRenderContext): scala.Unit = js.native
  def draw(context: vexflowLib.VexNs.IRenderContext, stave: Stave): scala.Unit = js.native
  def getActualResolution(): scala.Double = js.native
  def getBoundingBox(): BoundingBox = js.native
  def getLargestTickWidth(): scala.Double = js.native
  def getMode(): scala.Double = js.native
  def getResolutionMultiplier(): scala.Double = js.native
  def getSmallestTickCount(): Fraction = js.native
  def getTickables(): js.Array[Tickable] = js.native
  def getTicksUsed(): Fraction = js.native
  def getTotalTicks(): Fraction = js.native
  def getVoiceGroup(): VoiceGroup = js.native
  def isComplete(): scala.Boolean = js.native
  def preFormat(): Voice = js.native
  def setMode(mode: scala.Double): Voice = js.native
  def setStave(stave: Stave): Voice = js.native
  def setStrict(strict: scala.Boolean): Voice = js.native
  def setVoiceGroup(g: VoiceGroup): Voice = js.native
}

