package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow")
@js.native
object FlowNsMembers extends js.Object {
  // from vexflow_font.js / gonville_original.js / gonville_all.js
  var Font: vexflowLib.Anon_FamilyName = js.native
  val RESOLUTION: scala.Double = js.native
  val STAVE_LINE_THICKNESS: scala.Double = js.native
  val STEM_HEIGHT: scala.Double = js.native
  // from tables.js:
  val STEM_WIDTH: scala.Double = js.native
  val TIME4_4: vexflowLib.Anon_Resolution = js.native
  def accidentalCodes(acc: java.lang.String): vexflowLib.Anon_ShiftdownShiftrightCode = js.native
  def articulationCodes(artic: java.lang.String): vexflowLib.Anon_Shiftdown = js.native
  def clefProperties(clef: java.lang.String): vexflowLib.Anon_Lineshift = js.native
  def durationToFraction(duration: java.lang.String): Fraction = js.native
  def durationToGlyph(duration: java.lang.String, `type`: java.lang.String): vexflowLib.Anon_Headwidth = js.native
  def durationToNumber(duration: java.lang.String): scala.Double = js.native
  def durationToTicks(duration: java.lang.String): scala.Double = js.native
  def integerToNote(integer: scala.Double): java.lang.String = js.native
  def keyProperties(key: java.lang.String, clef: java.lang.String, params: vexflowLib.Anon_Octaveshift): vexflowLib.Anon_Line = js.native
  def keySignature(spec: java.lang.String): js.Array[vexflowLib.Anon_TypeLine] = js.native
  def ornamentCodes(acc: java.lang.String): vexflowLib.Anon_ShiftdownShiftright = js.native
  def parseNoteData(noteData: vexflowLib.Anon_TypeDots): vexflowLib.Anon_Ticks = js.native
  def parseNoteDurationString(durationString: java.lang.String): vexflowLib.Anon_TypeDots = js.native
  // from glyph.js:
  def renderGlyph(
    ctx: vexflowLib.VexNs.IRenderContext,
    x_pos: scala.Double,
    y_pos: scala.Double,
    point: scala.Double,
    `val`: java.lang.String,
    nocache: scala.Boolean
  ): scala.Unit = js.native
  def tabToGlyph(fret: java.lang.String): vexflowLib.Anon_Text = js.native
  def textWidth(text: java.lang.String): scala.Double = js.native
}

