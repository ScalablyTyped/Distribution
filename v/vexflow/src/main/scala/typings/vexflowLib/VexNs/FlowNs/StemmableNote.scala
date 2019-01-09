package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StemmableNote")
@js.native
class StemmableNote protected () extends Note {
  def this(note_struct: vexflowLib.Anon_DotsDurationType) = this()
  def buildStem(): StemmableNote = js.native
  def drawStem(stem_struct: vexflowLib.Anon_Stemdirection): scala.Unit = js.native
  def getBeamCount(): scala.Double = js.native
  def getCenterGlyphX(): scala.Double = js.native
  def getStem(): Stem = js.native
   //inconsistent name: getStemMinumumLength -> getStemMinimumLength
  def getStemDirection(): scala.Double = js.native
  def getStemExtension(): scala.Double = js.native
  def getStemExtents(): vexflowLib.Anon_BaseY = js.native
  def getStemLength(): scala.Double = js.native
  def getStemMinumumLength(): scala.Double = js.native
  def getStemX(): scala.Double = js.native
  def getYForBottomText(text_line: scala.Double): scala.Double = js.native
  def setBeam(beam: Beam): StemmableNote = js.native
  def setStem(stem: Stem): StemmableNote = js.native
  def setStemDirection(direction: scala.Double): StemmableNote = js.native
  def setStemLength(): scala.Double = js.native
}

@JSGlobal("Vex.Flow.StemmableNote")
@js.native
object StemmableNote extends js.Object {
  var DEBUG: scala.Boolean = js.native
}

