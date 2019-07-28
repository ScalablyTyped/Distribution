package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_BaseY
import typings.vexflow.Anon_DotsDurationType
import typings.vexflow.Anon_FillStyle
import typings.vexflow.Anon_Stemdirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StemmableNote")
@js.native
class StemmableNote protected () extends Note {
  def this(note_struct: Anon_DotsDurationType) = this()
  var flag: Glyph = js.native
  def buildStem(): StemmableNote = js.native
  def drawStem(stem_struct: Anon_Stemdirection): Unit = js.native
  def getAttribute(attr: String): js.Any = js.native
  def getBeamCount(): Double = js.native
  def getCenterGlyphX(): Double = js.native
  def getStem(): Stem = js.native
   //inconsistent name: getStemMinumumLength -> getStemMinimumLength
  def getStemDirection(): Double = js.native
  def getStemExtension(): Double = js.native
  def getStemExtents(): Anon_BaseY = js.native
  def getStemLength(): Double = js.native
  def getStemMinumumLength(): Double = js.native
  def getStemX(): Double = js.native
  def getYForBottomText(text_line: Double): Double = js.native
  def setBeam(beam: Beam): StemmableNote = js.native
  def setFlagStyle(style_struct: Anon_FillStyle): Unit = js.native
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

