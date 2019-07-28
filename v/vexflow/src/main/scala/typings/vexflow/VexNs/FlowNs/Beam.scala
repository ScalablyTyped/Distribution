package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Beammiddleonly
import typings.vexflow.Anon_End
import typings.vexflow.Anon_FillStyle
import typings.vexflow.VexNs.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Beam")
@js.native
class Beam protected () extends js.Object {
  def this(notes: js.Array[StemmableNote]) = this()
  def this(notes: js.Array[StemmableNote], auto_stem: Boolean) = this()
  def applyStemExtensions(): Unit = js.native
  def breakSecondaryAt(indices: js.Array[Double]): Beam = js.native
  def calculateSlope(): Unit = js.native
  def calculateStemDirection(notes: Note): Double = js.native
  def draw(): Boolean = js.native
  def drawBeamLines(): Unit = js.native
  def drawStems(): Unit = js.native
  def getBeamCount(): Double = js.native
  def getBeamLines(duration: String): js.Array[Anon_End] = js.native
  def getNotes(): js.Array[StemmableNote] = js.native
  def getSlopeY(): Double = js.native
  def postFormat(): Beam = js.native
  def preFormat(): Beam = js.native
  def setContext(context: IRenderContext): Beam = js.native
  def setStyle(style: Anon_FillStyle): Beam = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Beam")
@js.native
object Beam extends js.Object {
  def applyAndGetBeams(voice: Voice, stem_direction: Double, groups: js.Array[Fraction]): js.Array[Beam] = js.native
  def generateBeams(notes: js.Array[StemmableNote]): js.Array[Beam] = js.native
  def generateBeams(notes: js.Array[StemmableNote], config: Anon_Beammiddleonly): js.Array[Beam] = js.native
  def getDefaultBeamGroups(time_sig: String): js.Array[Fraction] = js.native
}

