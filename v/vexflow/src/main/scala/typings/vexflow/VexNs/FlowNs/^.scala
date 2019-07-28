package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Accidental
import typings.vexflow.Anon_Betweenlines
import typings.vexflow.Anon_Code
import typings.vexflow.Anon_CodeGracenotewidth
import typings.vexflow.Anon_CodeShiftdown
import typings.vexflow.Anon_Codehead
import typings.vexflow.Anon_Dots
import typings.vexflow.Anon_DotsDuration
import typings.vexflow.Anon_Line
import typings.vexflow.Anon_Lineshift
import typings.vexflow.Anon_Octaveshift
import typings.vexflow.VexNs.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow")
@js.native
object ^ extends js.Object {
  val DEFAULT_NOTATION_FONT_SCALE: Double = js.native
  val RESOLUTION: Double = js.native
  val STAVE_LINE_THICKNESS: Double = js.native
  val STEM_HEIGHT: Double = js.native
  // from tables.js:
  val STEM_WIDTH: Double = js.native
  def accidentalCodes(acc: String): Anon_CodeGracenotewidth = js.native
  def articulationCodes(artic: String): Anon_Betweenlines = js.native
  def clefProperties(clef: String): Anon_Lineshift = js.native
  def durationToFraction(duration: String): Fraction = js.native
  def durationToGlyph(duration: String, `type`: String): Anon_Codehead = js.native
  def durationToNumber(duration: String): Double = js.native
  def durationToTicks(duration: String): Double = js.native
  def integerToNote(integer: Double): String = js.native
  def keyProperties(key: String, clef: String, params: Anon_Octaveshift): Anon_Accidental = js.native
  def keySignature(spec: String): js.Array[Anon_Line] = js.native
  def ornamentCodes(acc: String): Anon_CodeShiftdown = js.native
  def parseNoteData(noteData: Anon_Dots): Anon_DotsDuration = js.native
  def parseNoteDurationString(durationString: String): Anon_Dots = js.native
  // from glyph.js:
  def renderGlyph(ctx: IRenderContext, x_pos: Double, y_pos: Double, point: Double, `val`: String, nocache: Boolean): Unit = js.native
  def tabToGlyph(fret: String): Anon_Code = js.native
  def textWidth(text: String): Double = js.native
}

