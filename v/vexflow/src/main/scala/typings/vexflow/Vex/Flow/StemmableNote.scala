package typings.vexflow.Vex.Flow

import typings.vexflow.AnonBaseY
import typings.vexflow.AnonFillStyle_
import typings.vexflow.AnonStemdirection
import typings.vexflow.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StemmableNote")
@js.native
class StemmableNote protected () extends Note {
  def this(note_struct: AnonType) = this()
  var flag: Glyph = js.native
  def buildStem(): StemmableNote = js.native
  def drawStem(stem_struct: AnonStemdirection): Unit = js.native
  def getAttribute(attr: String): js.Any = js.native
  def getBeamCount(): Double = js.native
  def getCenterGlyphX(): Double = js.native
  def getStem(): Stem = js.native
   //inconsistent name: getStemMinumumLength -> getStemMinimumLength
  def getStemDirection(): Double = js.native
  def getStemExtension(): Double = js.native
  def getStemExtents(): AnonBaseY = js.native
  def getStemLength(): Double = js.native
  def getStemMinumumLength(): Double = js.native
  def getStemX(): Double = js.native
  def getYForBottomText(text_line: Double): Double = js.native
  def setBeam(beam: Beam): StemmableNote = js.native
  def setFlagStyle(style_struct: AnonFillStyle_): Unit = js.native
  def setStem(stem: Stem): StemmableNote = js.native
  def setStemDirection(direction: Double): StemmableNote = js.native
  def setStemLength(): Double = js.native
}

/* static members */
@JSGlobal("Vex.Flow.StemmableNote")
@js.native
object StemmableNote extends js.Object {
  var DEBUG: Boolean = js.native
}

