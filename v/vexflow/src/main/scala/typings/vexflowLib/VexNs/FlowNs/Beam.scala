package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Beam")
@js.native
class Beam protected () extends js.Object {
  def this(notes: js.Array[StemmableNote]) = this()
  def this(notes: js.Array[StemmableNote], auto_stem: scala.Boolean) = this()
  def applyStemExtensions(): scala.Unit = js.native
  def breakSecondaryAt(indices: js.Array[scala.Double]): Beam = js.native
  def calculateSlope(): scala.Unit = js.native
  def calculateStemDirection(notes: Note): scala.Double = js.native
  def draw(): scala.Boolean = js.native
  def drawBeamLines(): scala.Unit = js.native
  def drawStems(): scala.Unit = js.native
  def getBeamCount(): scala.Double = js.native
  def getBeamLines(duration: java.lang.String): js.Array[vexflowLib.Anon_End] = js.native
  def getNotes(): js.Array[StemmableNote] = js.native
  def getSlopeY(): scala.Double = js.native
  def postFormat(): Beam = js.native
  def preFormat(): Beam = js.native
  def setContext(context: vexflowLib.VexNs.IRenderContext): Beam = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Beam")
@js.native
object Beam extends js.Object {
  def applyAndGetBeams(
    voice: vexflowLib.VexNs.FlowNs.Voice,
    stem_direction: scala.Double,
    groups: js.Array[vexflowLib.VexNs.FlowNs.Fraction]
  ): js.Array[vexflowLib.VexNs.FlowNs.Beam] = js.native
  def generateBeams(notes: js.Array[vexflowLib.VexNs.FlowNs.StemmableNote]): js.Array[vexflowLib.VexNs.FlowNs.Beam] = js.native
  def generateBeams(notes: js.Array[vexflowLib.VexNs.FlowNs.StemmableNote], config: vexflowLib.Anon_Beammiddleonly): js.Array[vexflowLib.VexNs.FlowNs.Beam] = js.native
  def getDefaultBeamGroups(time_sig: java.lang.String): js.Array[vexflowLib.VexNs.FlowNs.Fraction] = js.native
}

