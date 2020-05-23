package typings.vexflow.Vex.Flow

import typings.vexflow.anon.BaseY
import typings.vexflow.anon.FillStyle_
import typings.vexflow.anon.Stemdirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StemmableNote extends Note {
  var flag: Glyph = js.native
  def buildStem(): StemmableNote = js.native
  def drawStem(stem_struct: Stemdirection): Unit = js.native
  def getAttribute(attr: String): js.Any = js.native
  def getBeamCount(): Double = js.native
  def getCenterGlyphX(): Double = js.native
  def getStem(): Stem = js.native
   //inconsistent name: getStemMinumumLength -> getStemMinimumLength
  def getStemDirection(): Double = js.native
  def getStemExtension(): Double = js.native
  def getStemExtents(): BaseY = js.native
  def getStemLength(): Double = js.native
  def getStemMinumumLength(): Double = js.native
  def getStemX(): Double = js.native
  def getYForBottomText(text_line: Double): Double = js.native
  def setBeam(beam: Beam): StemmableNote = js.native
  def setFlagStyle(style_struct: FillStyle_): Unit = js.native
  def setStem(stem: Stem): StemmableNote = js.native
  def setStemDirection(direction: Double): StemmableNote = js.native
  def setStemLength(): Double = js.native
}

