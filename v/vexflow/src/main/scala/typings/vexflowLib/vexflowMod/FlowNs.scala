package typings
package vexflowLib.vexflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow")
@js.native
object FlowNs extends js.Object {
  @js.native
  class Accidental protected ()
    extends vexflowLib.VexNs.FlowNs.Accidental {
    def this(`type`: java.lang.String) = this()
  }
  
  @js.native
  class Annotation protected ()
    extends vexflowLib.VexNs.FlowNs.Annotation {
    def this(text: java.lang.String) = this()
  }
  
  @js.native
  class Articulation protected ()
    extends vexflowLib.VexNs.FlowNs.Articulation {
    def this(`type`: java.lang.String) = this()
  }
  
  @js.native
  class BarNote ()
    extends vexflowLib.VexNs.FlowNs.BarNote
  
  @js.native
  class Barline protected ()
    extends vexflowLib.VexNs.FlowNs.Barline {
    def this(`type`: vexflowLib.VexNs.FlowNs.BarlineNs.`type`, x: scala.Double) = this()
  }
  
  @js.native
  class Beam protected ()
    extends vexflowLib.VexNs.FlowNs.Beam {
    def this(notes: js.Array[vexflowLib.VexNs.FlowNs.StemmableNote]) = this()
    def this(notes: js.Array[vexflowLib.VexNs.FlowNs.StemmableNote], auto_stem: scala.Boolean) = this()
  }
  
  @js.native
  class Bend protected ()
    extends vexflowLib.VexNs.FlowNs.Bend {
    def this(text: java.lang.String) = this()
    def this(text: java.lang.String, release: scala.Boolean) = this()
    def this(text: java.lang.String, release: scala.Boolean, phrase: js.Array[vexflowLib.Anon_Text]) = this()
  }
  
  @js.native
  class BoundingBox protected ()
    extends vexflowLib.VexNs.FlowNs.BoundingBox {
    def this(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double) = this()
  }
  
  @js.native
  class CanvasContext protected ()
    extends vexflowLib.VexNs.FlowNs.CanvasContext {
    def this(context: stdLib.CanvasRenderingContext2D) = this()
  }
  
  @js.native
  class Clef protected ()
    extends vexflowLib.VexNs.FlowNs.Clef {
    def this(clef: java.lang.String) = this()
    def this(clef: java.lang.String, size: java.lang.String) = this()
    def this(clef: java.lang.String, size: java.lang.String, annotation: java.lang.String) = this()
  }
  
  @js.native
  class ClefNote protected ()
    extends vexflowLib.VexNs.FlowNs.ClefNote {
    def this(clef: java.lang.String) = this()
    def this(clef: java.lang.String, size: java.lang.String) = this()
    def this(clef: java.lang.String, size: java.lang.String, annotation: java.lang.String) = this()
  }
  
  @js.native
  class Crescendo protected ()
    extends vexflowLib.VexNs.FlowNs.Crescendo {
    def this(note_struct: vexflowLib.Anon_Duration) = this()
  }
  
  @js.native
  class Curve protected ()
    extends vexflowLib.VexNs.FlowNs.Curve {
    def this(from: vexflowLib.VexNs.FlowNs.Note, to: vexflowLib.VexNs.FlowNs.Note) = this()
    def this(from: vexflowLib.VexNs.FlowNs.Note, to: vexflowLib.VexNs.FlowNs.Note, options: vexflowLib.Anon_Cps) = this()
  }
  
  @js.native
  class Dot ()
    extends vexflowLib.VexNs.FlowNs.Dot
  
  @js.native
  class Formatter ()
    extends vexflowLib.VexNs.FlowNs.Formatter
  
  @js.native
  class Fraction protected ()
    extends vexflowLib.VexNs.FlowNs.Fraction {
    def this(numerator: scala.Double, denominator: scala.Double) = this()
  }
  
  @js.native
  class FretHandFinger protected ()
    extends vexflowLib.VexNs.FlowNs.FretHandFinger {
    def this(number: java.lang.String) = this()
    def this(number: scala.Double) = this()
  }
  
  @js.native
  class GhostNote protected ()
    extends vexflowLib.VexNs.FlowNs.GhostNote {
    def this(duration: java.lang.String) = this()
    def this(note_struct: vexflowLib.Anon_DotsDurationType) = this()
  }
  
  @js.native
  class Glyph protected ()
    extends vexflowLib.VexNs.FlowNs.Glyph {
    def this(code: java.lang.String, point: scala.Double) = this()
    def this(code: java.lang.String, point: scala.Double, options: vexflowLib.Anon_Cache) = this()
  }
  
  @js.native
  class GraceNote protected ()
    extends vexflowLib.VexNs.FlowNs.GraceNote {
    def this(note_struct: vexflowLib.Anon_Autostem) = this()
  }
  
  @js.native
  class GraceNoteGroup protected ()
    extends vexflowLib.VexNs.FlowNs.GraceNoteGroup {
    def this(grace_notes: js.Array[vexflowLib.VexNs.FlowNs.GraceNote]) = this()
    def this(grace_notes: js.Array[vexflowLib.VexNs.FlowNs.GraceNote], show_slur: scala.Boolean) = this()
  }
  
  @js.native
  class KeyManager protected ()
    extends vexflowLib.VexNs.FlowNs.KeyManager {
    def this(key: java.lang.String) = this()
  }
  
  @js.native
  class KeySignature protected ()
    extends vexflowLib.VexNs.FlowNs.KeySignature {
    def this(key_spec: java.lang.String) = this()
  }
  
  @js.native
  class Modifier ()
    extends vexflowLib.VexNs.FlowNs.Modifier
  
  @js.native
  class ModifierContext ()
    extends vexflowLib.VexNs.FlowNs.ModifierContext
  
  @js.native
  class Music ()
    extends vexflowLib.VexNs.FlowNs.Music
  
  @js.native
  class Note protected ()
    extends vexflowLib.VexNs.FlowNs.Note {
    def this(note_struct: vexflowLib.Anon_DotsDurationType) = this()
  }
  
  @js.native
  class NoteHead protected ()
    extends vexflowLib.VexNs.FlowNs.NoteHead {
    def this(head_options: vexflowLib.Anon_Customglyphcode) = this()
  }
  
  @js.native
  class NoteSubGroup protected ()
    extends vexflowLib.VexNs.FlowNs.NoteSubGroup {
    def this(subnotes: js.Array[vexflowLib.VexNs.FlowNs.Note]) = this()
  }
  
  @js.native
  class Ornament protected ()
    extends vexflowLib.VexNs.FlowNs.Ornament {
    def this(`type`: java.lang.String) = this()
  }
  
  @js.native
  class PedalMarking protected ()
    extends vexflowLib.VexNs.FlowNs.PedalMarking {
    def this(notes: js.Array[vexflowLib.VexNs.FlowNs.Note]) = this()
  }
  
  @js.native
  class RaphaelContext protected ()
    extends vexflowLib.VexNs.FlowNs.RaphaelContext {
    def this(element: stdLib.HTMLElement) = this()
  }
  
  @js.native
  class Renderer protected ()
    extends vexflowLib.VexNs.FlowNs.Renderer {
    def this(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends) = this()
  }
  
  @js.native
  class Repetition protected ()
    extends vexflowLib.VexNs.FlowNs.Repetition {
    def this(`type`: vexflowLib.VexNs.FlowNs.RepetitionNs.`type`, x: scala.Double, y_shift: scala.Double) = this()
  }
  
  @js.native
  class SVGContext protected ()
    extends vexflowLib.VexNs.FlowNs.SVGContext {
    def this(element: stdLib.HTMLElement) = this()
  }
  
  @js.native
  class Stave protected ()
    extends vexflowLib.VexNs.FlowNs.Stave {
    def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double, width: scala.Double, options: vexflowLib.Anon_Fillstyle) = this()
  }
  
  @js.native
  class StaveConnector protected ()
    extends vexflowLib.VexNs.FlowNs.StaveConnector {
    def this(top_stave: vexflowLib.VexNs.FlowNs.Stave, bottom_stave: vexflowLib.VexNs.FlowNs.Stave) = this()
  }
  
  @js.native
  class StaveHairpin protected ()
    extends vexflowLib.VexNs.FlowNs.StaveHairpin {
    def this(notes: vexflowLib.Anon_Firstnote, `type`: vexflowLib.VexNs.FlowNs.StaveHairpinNs.`type`) = this()
  }
  
  @js.native
  class StaveLine protected ()
    extends vexflowLib.VexNs.FlowNs.StaveLine {
    def this(notes: vexflowLib.Anon_Firstindices) = this()
  }
  
  @js.native
  class StaveModifier ()
    extends vexflowLib.VexNs.FlowNs.StaveModifier
  
  @js.native
  class StaveNote protected ()
    extends vexflowLib.VexNs.FlowNs.StaveNote {
    def this(note_struct: vexflowLib.Anon_AutostemClef) = this()
  }
  
  @js.native
  class StaveSection protected ()
    extends vexflowLib.VexNs.FlowNs.StaveSection {
    def this(section: java.lang.String, x: scala.Double, shift_y: scala.Double) = this()
  }
  
  @js.native
  class StaveTempo protected ()
    extends vexflowLib.VexNs.FlowNs.StaveTempo {
    def this(tempo: vexflowLib.Anon_BpmDots, x: scala.Double, shift_y: scala.Double) = this()
  }
  
  @js.native
  class StaveText protected ()
    extends vexflowLib.VexNs.FlowNs.StaveText {
    def this(text: java.lang.String, position: vexflowLib.VexNs.FlowNs.ModifierNs.Position) = this()
    def this(text: java.lang.String, position: vexflowLib.VexNs.FlowNs.ModifierNs.Position, options: vexflowLib.Anon_Justification) = this()
  }
  
  @js.native
  class StaveTie protected ()
    extends vexflowLib.VexNs.FlowNs.StaveTie {
    /**
      * @see https://github.com/0xfe/vexflow/blob/master/src/stavetie.js#L12
      *
      * Notes is a struct that has:
      *
      *  {
      *    first_note: Note,
      *    last_note: Note,
      *    first_indices: [n1, n2, n3],
      *    last_indices: [n1, n2, n3]
      *  }
      * All properties are optional, since ties can span line breaks in which case
      * two ties can be used, each with either "first_note" or "last_note" missing.
      *
      **/
    def this(notes: vexflowLib.Anon_FirstindicesFirstnoteLastindices) = this()
    def this(notes: vexflowLib.Anon_FirstindicesFirstnoteLastindices, text: java.lang.String) = this()
  }
  
  @js.native
  class Stem protected ()
    extends vexflowLib.VexNs.FlowNs.Stem {
    def this(options: vexflowLib.Anon_Stemdirection) = this()
  }
  
  @js.native
  class StemmableNote protected ()
    extends vexflowLib.VexNs.FlowNs.StemmableNote {
    def this(note_struct: vexflowLib.Anon_DotsDurationType) = this()
  }
  
  @js.native
  class StringNumber protected ()
    extends vexflowLib.VexNs.FlowNs.StringNumber {
    def this(number: java.lang.String) = this()
    // actually this is not really consistent in the vexflow code "ctx.measureText(this.string_number).width" looks
    // like it is a string. But from the use of it it might be a number ?!
    def this(number: scala.Double) = this()
  }
  
  @js.native
  class Stroke protected ()
    extends vexflowLib.VexNs.FlowNs.Stroke {
    def this(`type`: vexflowLib.VexNs.FlowNs.StrokeNs.Type) = this()
    def this(`type`: vexflowLib.VexNs.FlowNs.StrokeNs.Type, options: vexflowLib.Anon_Allvoices) = this()
  }
  
  @js.native
  class TabNote protected ()
    extends vexflowLib.VexNs.FlowNs.TabNote {
    def this(tab_struct: vexflowLib.Anon_DotsDurationPositions) = this()
    def this(tab_struct: vexflowLib.Anon_DotsDurationPositions, draw_stem: scala.Boolean) = this()
  }
  
  @js.native
  class TabSlide protected ()
    extends vexflowLib.VexNs.FlowNs.TabSlide {
    def this(notes: vexflowLib.Anon_Firstindices) = this()
    def this(notes: vexflowLib.Anon_Firstindices, direction: scala.Double) = this()
  }
  
  @js.native
  class TabStave protected ()
    extends vexflowLib.VexNs.FlowNs.TabStave {
    def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double, width: scala.Double, options: vexflowLib.Anon_Fillstyle) = this()
  }
  
  @js.native
  class TabTie protected ()
    extends vexflowLib.VexNs.FlowNs.TabTie {
    def this(notes: vexflowLib.Anon_Firstindices) = this()
    def this(notes: vexflowLib.Anon_Firstindices, text: java.lang.String) = this()
  }
  
  @js.native
  class TextBracket protected ()
    extends vexflowLib.VexNs.FlowNs.TextBracket {
    def this(bracket_data: vexflowLib.Anon_Position) = this()
  }
  
  @js.native
  class TextDynamics protected ()
    extends vexflowLib.VexNs.FlowNs.TextDynamics {
    def this(text_struct: vexflowLib.Anon_DurationLine) = this()
  }
  
  @js.native
  class TextNote protected ()
    extends vexflowLib.VexNs.FlowNs.TextNote {
    def this(text_struct: vexflowLib.Anon_DurationFont) = this()
  }
  
  @js.native
  class TickContext ()
    extends vexflowLib.VexNs.FlowNs.TickContext
  
  @js.native
  class TimeSigNote protected ()
    extends vexflowLib.VexNs.FlowNs.TimeSigNote {
    def this(timeSpec: java.lang.String, customPadding: scala.Double) = this()
  }
  
  @js.native
  class TimeSignature protected ()
    extends vexflowLib.VexNs.FlowNs.TimeSignature {
    def this(timeSpec: java.lang.String) = this()
    def this(timeSpec: java.lang.String, customPadding: scala.Double) = this()
  }
  
  @js.native
  class Tremolo protected ()
    extends vexflowLib.VexNs.FlowNs.Tremolo {
    def this(num: scala.Double) = this()
  }
  
  @js.native
  class Tuning ()
    extends vexflowLib.VexNs.FlowNs.Tuning {
    def this(tuningString: java.lang.String) = this()
  }
  
  @js.native
  class Tuplet protected ()
    extends vexflowLib.VexNs.FlowNs.Tuplet {
    def this(notes: js.Array[vexflowLib.VexNs.FlowNs.StaveNote]) = this()
    def this(notes: js.Array[vexflowLib.VexNs.FlowNs.StaveNote], options: vexflowLib.Anon_Bracketed) = this()
  }
  
  @js.native
  class Vibrato ()
    extends vexflowLib.VexNs.FlowNs.Vibrato
  
  @js.native
  class Voice protected ()
    extends vexflowLib.VexNs.FlowNs.Voice {
    def this(time: vexflowLib.Anon_Beatvalue) = this()
  }
  
  @js.native
  class VoiceGroup ()
    extends vexflowLib.VexNs.FlowNs.VoiceGroup
  
  @js.native
  class Volta protected ()
    extends vexflowLib.VexNs.FlowNs.Volta {
    def this(`type`: vexflowLib.VexNs.FlowNs.VoltaNs.`type`, number: scala.Double, x: scala.Double, y_shift: scala.Double) = this()
  }
  
  val DEFAULT_NOTATION_FONT_SCALE: scala.Double = js.native
  val RESOLUTION: scala.Double = js.native
  val STAVE_LINE_THICKNESS: scala.Double = js.native
  val STEM_HEIGHT: scala.Double = js.native
  // from tables.js:
  val STEM_WIDTH: scala.Double = js.native
  def accidentalCodes(acc: java.lang.String): vexflowLib.Anon_CodeGracenotewidth = js.native
  def articulationCodes(artic: java.lang.String): vexflowLib.Anon_Betweenlines = js.native
  def clefProperties(clef: java.lang.String): vexflowLib.Anon_Lineshift = js.native
  def durationToFraction(duration: java.lang.String): vexflowLib.VexNs.FlowNs.Fraction = js.native
  def durationToGlyph(duration: java.lang.String, `type`: java.lang.String): vexflowLib.Anon_Codehead = js.native
  def durationToNumber(duration: java.lang.String): scala.Double = js.native
  def durationToTicks(duration: java.lang.String): scala.Double = js.native
  def integerToNote(integer: scala.Double): java.lang.String = js.native
  def keyProperties(key: java.lang.String, clef: java.lang.String, params: vexflowLib.Anon_Octaveshift): vexflowLib.Anon_Accidental = js.native
  def keySignature(spec: java.lang.String): js.Array[vexflowLib.Anon_Line] = js.native
  def ornamentCodes(acc: java.lang.String): vexflowLib.Anon_CodeShiftdown = js.native
  def parseNoteData(noteData: vexflowLib.Anon_Dots): vexflowLib.Anon_DotsDuration = js.native
  def parseNoteDurationString(durationString: java.lang.String): vexflowLib.Anon_Dots = js.native
  // from glyph.js:
  def renderGlyph(
    ctx: vexflowLib.VexNs.IRenderContext,
    x_pos: scala.Double,
    y_pos: scala.Double,
    point: scala.Double,
    `val`: java.lang.String,
    nocache: scala.Boolean
  ): scala.Unit = js.native
  def tabToGlyph(fret: java.lang.String): vexflowLib.Anon_Code = js.native
  def textWidth(text: java.lang.String): scala.Double = js.native
  /* static members */
  @js.native
  object Accidental extends js.Object {
    var DEBUG: scala.Boolean = js.native
    def applyAccidentals(voices: js.Array[vexflowLib.VexNs.FlowNs.Voice]): scala.Unit = js.native
    def applyAccidentals(voices: js.Array[vexflowLib.VexNs.FlowNs.Voice], keySignature: java.lang.String): scala.Unit = js.native
    def format(accidentals: js.Array[vexflowLib.VexNs.FlowNs.Accidental], state: vexflowLib.Anon_Leftshift): scala.Unit = js.native
  }
  
  @JSName("Accidental")
  @js.native
  object AccidentalNs extends js.Object {
    val CATEGORY: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object Annotation extends js.Object {
    var DEBUG: scala.Boolean = js.native
    def format(annotations: js.Array[vexflowLib.VexNs.FlowNs.Annotation], state: vexflowLib.Anon_Leftshift): scala.Boolean = js.native
  }
  
  @JSName("Annotation")
  @js.native
  object AnnotationNs extends js.Object {
    val CATEGORY: java.lang.String = js.native
    type Justify = vexflowLib.VexNs.FlowNs.AnnotationNs.Justify
    type VerticalJustify = vexflowLib.VexNs.FlowNs.AnnotationNs.VerticalJustify
  }
  
  /* static members */
  @js.native
  object Articulation extends js.Object {
    var DEBUG: scala.Boolean = js.native
    def format(articulations: js.Array[vexflowLib.VexNs.FlowNs.Articulation], state: vexflowLib.Anon_Leftshift): scala.Boolean = js.native
  }
  
  @JSName("Articulation")
  @js.native
  object ArticulationNs extends js.Object {
    val CATEGORY: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object BarNote extends js.Object {
    var DEBUG: scala.Boolean = js.native
  }
  
  @JSName("Barline")
  @js.native
  object BarlineNs extends js.Object {
    type `type` = vexflowLib.VexNs.FlowNs.BarlineNs.`type`
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object Bend extends js.Object {
    var DOWN: scala.Double = js.native
    var UP: scala.Double = js.native
    def format(bends: js.Array[vexflowLib.VexNs.FlowNs.Bend], state: vexflowLib.Anon_Leftshift): scala.Boolean = js.native
  }
  
  @JSName("Bend")
  @js.native
  object BendNs extends js.Object {
    val CATEGORY: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object BoundingBox extends js.Object {
    def copy(that: vexflowLib.VexNs.FlowNs.BoundingBox): vexflowLib.VexNs.FlowNs.BoundingBox = js.native
  }
  
  /* static members */
  @js.native
  object CanvasContext extends js.Object {
    var HEIGHT: scala.Double = js.native
    var WIDTH: scala.Double = js.native
  }
  
  /* static members */
  @js.native
  object Clef extends js.Object {
    var DEBUG: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Crescendo extends js.Object {
    var DEBUG: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Curve extends js.Object {
    var DEBUG: scala.Boolean = js.native
  }
  
  @JSName("Curve")
  @js.native
  object CurveNs extends js.Object {
    type Position = vexflowLib.VexNs.FlowNs.CurveNs.Position
  }
  
  /* static members */
  @js.native
  object Dot extends js.Object {
    def format(dots: scala.Double, state: vexflowLib.Anon_Leftshift): scala.Unit = js.native
  }
  
  @JSName("Dot")
  @js.native
  object DotNs extends js.Object {
    val CATEGORY: java.lang.String = js.native
  }
  
  // from vexflow_font.js / gonville_original.js / gonville_all.js
  @js.native
  object Font extends js.Object {
    var ascender: scala.Double = js.native
    var boundingBox: vexflowLib.Anon_XMax = js.native
    var cssFontStyle: java.lang.String = js.native
    var cssFontWeight: java.lang.String = js.native
    var descender: scala.Double = js.native
    var familyName: java.lang.String = js.native
    var glyphs: js.Array[vexflowLib.Anon_Ha] = js.native
    var lineHeight: scala.Double = js.native
    //inconsistent member : this is missing in vexflow_font.js, but present in gonville_original.js and gonville_all.js
    var original_font_information: vexflowLib.Anon_Copyright = js.native
    var resolution: scala.Double = js.native
    var underlinePosition: scala.Double = js.native
    var underlineThickness: scala.Double = js.native
  }
  
  /* static members */
  @js.native
  object Formatter extends js.Object {
    var DEBUG: scala.Boolean = js.native
    def AlignRestsToNotes(notes: js.Array[vexflowLib.VexNs.FlowNs.Note]): vexflowLib.VexNs.FlowNs.Formatter = js.native
    def AlignRestsToNotes(notes: js.Array[vexflowLib.VexNs.FlowNs.Note], align_all_notes: scala.Boolean): vexflowLib.VexNs.FlowNs.Formatter = js.native
    def AlignRestsToNotes(
      notes: js.Array[vexflowLib.VexNs.FlowNs.Note],
      align_all_notes: scala.Boolean,
      align_tuplets: scala.Boolean
    ): vexflowLib.VexNs.FlowNs.Formatter = js.native
    def FormatAndDraw(
      ctx: vexflowLib.VexNs.IRenderContext,
      stave: vexflowLib.VexNs.FlowNs.Stave,
      notes: js.Array[vexflowLib.VexNs.FlowNs.Note]
    ): vexflowLib.VexNs.FlowNs.BoundingBox = js.native
    def FormatAndDraw(
      ctx: vexflowLib.VexNs.IRenderContext,
      stave: vexflowLib.VexNs.FlowNs.Stave,
      notes: js.Array[vexflowLib.VexNs.FlowNs.Note],
      params: scala.Boolean
    ): vexflowLib.VexNs.FlowNs.BoundingBox = js.native
    def FormatAndDraw(
      ctx: vexflowLib.VexNs.IRenderContext,
      stave: vexflowLib.VexNs.FlowNs.Stave,
      notes: js.Array[vexflowLib.VexNs.FlowNs.Note],
      params: vexflowLib.Anon_Alignrests
    ): vexflowLib.VexNs.FlowNs.BoundingBox = js.native
    def FormatAndDrawTab(
      ctx: vexflowLib.VexNs.IRenderContext,
      tabstave: vexflowLib.VexNs.FlowNs.TabStave,
      stave: vexflowLib.VexNs.FlowNs.Stave,
      tabnotes: js.Array[vexflowLib.VexNs.FlowNs.TabNote],
      notes: js.Array[vexflowLib.VexNs.FlowNs.Note]
    ): scala.Unit = js.native
    def FormatAndDrawTab(
      ctx: vexflowLib.VexNs.IRenderContext,
      tabstave: vexflowLib.VexNs.FlowNs.TabStave,
      stave: vexflowLib.VexNs.FlowNs.Stave,
      tabnotes: js.Array[vexflowLib.VexNs.FlowNs.TabNote],
      notes: js.Array[vexflowLib.VexNs.FlowNs.Note],
      autobeam: scala.Boolean
    ): scala.Unit = js.native
    def FormatAndDrawTab(
      ctx: vexflowLib.VexNs.IRenderContext,
      tabstave: vexflowLib.VexNs.FlowNs.TabStave,
      stave: vexflowLib.VexNs.FlowNs.Stave,
      tabnotes: js.Array[vexflowLib.VexNs.FlowNs.TabNote],
      notes: js.Array[vexflowLib.VexNs.FlowNs.Note],
      autobeam: scala.Boolean,
      params: scala.Boolean
    ): scala.Unit = js.native
    def FormatAndDrawTab(
      ctx: vexflowLib.VexNs.IRenderContext,
      tabstave: vexflowLib.VexNs.FlowNs.TabStave,
      stave: vexflowLib.VexNs.FlowNs.Stave,
      tabnotes: js.Array[vexflowLib.VexNs.FlowNs.TabNote],
      notes: js.Array[vexflowLib.VexNs.FlowNs.Note],
      autobeam: scala.Boolean,
      params: vexflowLib.Anon_Alignrests
    ): scala.Unit = js.native
  }
  
  /* static members */
  @js.native
  object Fraction extends js.Object {
    def GCD(a: scala.Double, b: scala.Double): scala.Double = js.native
    def LCM(a: scala.Double, b: scala.Double): scala.Double = js.native
    def LCMM(a: scala.Double, b: scala.Double): scala.Double = js.native
  }
  
  /* static members */
  @js.native
  object FretHandFinger extends js.Object {
    def format(nums: js.Array[vexflowLib.VexNs.FlowNs.FretHandFinger], state: vexflowLib.Anon_Leftshift): scala.Unit = js.native
  }
  
  @JSName("FretHandFinger")
  @js.native
  object FretHandFingerNs extends js.Object {
    val CATEGORY: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object Glyph extends js.Object {
    def loadMetrics(font: vexflowLib.VexNs.IFont, code: java.lang.String, cache: scala.Boolean): vexflowLib.Anon_HaOutline = js.native
    def renderOutline(
      ctx: vexflowLib.VexNs.IRenderContext,
      outline: js.Array[scala.Double],
      scale: scala.Double,
      x_pos: scala.Double,
      y_pos: scala.Double
    ): scala.Unit = js.native
  }
  
  /* static members */
  @js.native
  object GraceNote extends js.Object {
    var LEDGER_LINE_OFFSET: scala.Double = js.native
  }
  
  /* static members */
  @js.native
  object GraceNoteGroup extends js.Object {
     //inconsistent name: 'show_slur' is called 'config', suggesting object (is boolean)
    var DEBUG: scala.Boolean = js.native
    def format(
      gracenote_groups: js.Array[vexflowLib.VexNs.FlowNs.GraceNoteGroup],
      state: vexflowLib.Anon_Leftshift
    ): scala.Boolean = js.native
  }
  
  @JSName("GraceNoteGroup")
  @js.native
  object GraceNoteGroupNs extends js.Object {
    val CATEGORY: java.lang.String = js.native
  }
  
  @JSName("GraceNote")
  @js.native
  object GraceNoteNs extends js.Object {
    val SCALE: scala.Double = js.native
  }
  
  /* static members */
  @js.native
  object Modifier extends js.Object {
    var DEBUG: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ModifierContext extends js.Object {
    var DEBUG: scala.Boolean = js.native
  }
  
  @JSName("Modifier")
  @js.native
  object ModifierNs extends js.Object {
    val CATEGORY: java.lang.String = js.native
    type Position = vexflowLib.VexNs.FlowNs.ModifierNs.Position
  }
  
  @JSName("Music")
  @js.native
  object MusicNs extends js.Object {
    val NUM_TONES: scala.Double = js.native
    val accidentals: js.Array[java.lang.String] = js.native
    val canonical_notes: js.Array[java.lang.String] = js.native
    val diatonic_intervals: js.Array[java.lang.String] = js.native
    val root_values: js.Array[scala.Double] = js.native
    val roots: js.Array[java.lang.String] = js.native
    @js.native
    object diatonic_accidentals
      extends /* diatonic_interval */ org.scalablytyped.runtime.StringDictionary[vexflowLib.Anon_AccidentalNoteNumber]
    
    @js.native
    object intervals
      extends /* interval */ org.scalablytyped.runtime.StringDictionary[scala.Double]
    
    @js.native
    object noteValues
      extends /* value */ org.scalablytyped.runtime.StringDictionary[vexflowLib.Anon_Intval]
    
    @js.native
    object root_indices
      extends /* root */ org.scalablytyped.runtime.StringDictionary[scala.Double]
    
    @js.native
    object scales
      extends /* scale */ org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]]
    
  }
  
  /* static members */
  @js.native
  object NoteHead extends js.Object {
    var DEBUG: scala.Boolean = js.native
  }
  
  @JSName("Note")
  @js.native
  object NoteNs extends js.Object {
    val CATEGORY: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object Ornament extends js.Object {
    var DEBUG: scala.Boolean = js.native
    def format(ornaments: js.Array[vexflowLib.VexNs.FlowNs.Ornament], state: vexflowLib.Anon_Leftshift): scala.Boolean = js.native
  }
  
  @JSName("Ornament")
  @js.native
  object OrnamentNs extends js.Object {
    val CATEGORY: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object PedalMarking extends js.Object {
     //inconsistent name: 'notes' is called 'type', suggesting string (is Note[])
    var DEBUG: scala.Boolean = js.native
    def createSostenuto(notes: js.Array[vexflowLib.VexNs.FlowNs.Note]): vexflowLib.VexNs.FlowNs.PedalMarking = js.native
    def createSustain(notes: js.Array[vexflowLib.VexNs.FlowNs.Note]): vexflowLib.VexNs.FlowNs.PedalMarking = js.native
    def createUnaCorda(notes: js.Array[vexflowLib.VexNs.FlowNs.Note]): vexflowLib.VexNs.FlowNs.PedalMarking = js.native
  }
  
  @JSName("PedalMarking")
  @js.native
  object PedalMarkingNs extends js.Object {
    @js.native
    object GLYPHS
      extends /* name */ org.scalablytyped.runtime.StringDictionary[vexflowLib.Anon_CodeXshift]
    
    type Styles = vexflowLib.VexNs.FlowNs.PedalMarkingNs.Styles
  }
  
  /* static members */
  @js.native
  object Renderer extends js.Object {
    var USE_CANVAS_PROXY: scala.Boolean = js.native
    def bolsterCanvasContext(ctx: stdLib.CanvasRenderingContext2D): vexflowLib.VexNs.FlowNs.CanvasContext = js.native
    def buildContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends): vexflowLib.VexNs.IRenderContext = js.native
    def buildContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends, width: scala.Double): vexflowLib.VexNs.IRenderContext = js.native
    def buildContext(
      sel: stdLib.HTMLElement,
      backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
      width: scala.Double,
      height: scala.Double
    ): vexflowLib.VexNs.IRenderContext = js.native
    def buildContext(
      sel: stdLib.HTMLElement,
      backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
      width: scala.Double,
      height: scala.Double,
      background: java.lang.String
    ): vexflowLib.VexNs.IRenderContext = js.native
    def drawDashedLine(
      context: vexflowLib.VexNs.IRenderContext,
      fromX: scala.Double,
      fromY: scala.Double,
      toX: scala.Double,
      toY: scala.Double,
      dashPattern: js.Array[scala.Double]
    ): scala.Unit = js.native
    def getCanvasContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends): vexflowLib.VexNs.FlowNs.CanvasContext = js.native
    def getCanvasContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends, width: scala.Double): vexflowLib.VexNs.FlowNs.CanvasContext = js.native
    def getCanvasContext(
      sel: stdLib.HTMLElement,
      backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
      width: scala.Double,
      height: scala.Double
    ): vexflowLib.VexNs.FlowNs.CanvasContext = js.native
    def getCanvasContext(
      sel: stdLib.HTMLElement,
      backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
      width: scala.Double,
      height: scala.Double,
      background: java.lang.String
    ): vexflowLib.VexNs.FlowNs.CanvasContext = js.native
    def getRaphaelContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends): vexflowLib.VexNs.FlowNs.RaphaelContext = js.native
    def getRaphaelContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends, width: scala.Double): vexflowLib.VexNs.FlowNs.RaphaelContext = js.native
    def getRaphaelContext(
      sel: stdLib.HTMLElement,
      backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
      width: scala.Double,
      height: scala.Double
    ): vexflowLib.VexNs.FlowNs.RaphaelContext = js.native
    def getRaphaelContext(
      sel: stdLib.HTMLElement,
      backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
      width: scala.Double,
      height: scala.Double,
      background: java.lang.String
    ): vexflowLib.VexNs.FlowNs.RaphaelContext = js.native
    def getSVGContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends): vexflowLib.VexNs.FlowNs.SVGContext = js.native
    def getSVGContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends, width: scala.Double): vexflowLib.VexNs.FlowNs.SVGContext = js.native
    def getSVGContext(
      sel: stdLib.HTMLElement,
      backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
      width: scala.Double,
      height: scala.Double
    ): vexflowLib.VexNs.FlowNs.SVGContext = js.native
    def getSVGContext(
      sel: stdLib.HTMLElement,
      backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
      width: scala.Double,
      height: scala.Double,
      background: java.lang.String
    ): vexflowLib.VexNs.FlowNs.SVGContext = js.native
  }
  
  @JSName("Renderer")
  @js.native
  object RendererNs extends js.Object {
    type Backends = vexflowLib.VexNs.FlowNs.RendererNs.Backends
    type LineEndType = vexflowLib.VexNs.FlowNs.RendererNs.LineEndType
  }
  
  @JSName("Repetition")
  @js.native
  object RepetitionNs extends js.Object {
    type `type` = vexflowLib.VexNs.FlowNs.RepetitionNs.`type`
  }
  
  @JSName("StaveConnector")
  @js.native
  object StaveConnectorNs extends js.Object {
    type `type` = vexflowLib.VexNs.FlowNs.StaveConnectorNs.`type`
  }
  
  /* static members */
  @js.native
  object StaveHairpin extends js.Object {
    def FormatByTicksAndDraw(
      ctx: vexflowLib.VexNs.IRenderContext,
      formatter: vexflowLib.VexNs.FlowNs.Formatter,
      notes: vexflowLib.Anon_Firstnote,
      `type`: vexflowLib.VexNs.FlowNs.StaveHairpinNs.`type`,
      position: vexflowLib.VexNs.FlowNs.ModifierNs.Position
    ): scala.Unit = js.native
    def FormatByTicksAndDraw(
      ctx: vexflowLib.VexNs.IRenderContext,
      formatter: vexflowLib.VexNs.FlowNs.Formatter,
      notes: vexflowLib.Anon_Firstnote,
      `type`: vexflowLib.VexNs.FlowNs.StaveHairpinNs.`type`,
      position: vexflowLib.VexNs.FlowNs.ModifierNs.Position,
      options: vexflowLib.Anon_HeightLeftshiftticks
    ): scala.Unit = js.native
  }
  
  @JSName("StaveHairpin")
  @js.native
  object StaveHairpinNs extends js.Object {
    type `type` = vexflowLib.VexNs.FlowNs.StaveHairpinNs.`type`
  }
  
  @JSName("StaveLine")
  @js.native
  object StaveLineNs extends js.Object {
    type TextJustification = vexflowLib.VexNs.FlowNs.StaveLineNs.TextJustification
    type TextVerticalPosition = vexflowLib.VexNs.FlowNs.StaveLineNs.TextVerticalPosition
  }
  
  @JSName("StaveModifier")
  @js.native
  object StaveModifierNs extends js.Object {
    // @see https://github.com/0xfe/vexflow/blob/master/src/stavemodifier.js#L9
    type Position = vexflowLib.VexNs.FlowNs.StaveModifierNs.Position
  }
  
  /* static members */
  @js.native
  object StaveNote extends js.Object {
    var DEBUG: scala.Boolean = js.native
    def format(notes: js.Array[vexflowLib.VexNs.FlowNs.StaveNote], state: vexflowLib.Anon_Leftshift): scala.Boolean = js.native
    def formatByY(notes: js.Array[vexflowLib.VexNs.FlowNs.StaveNote], state: vexflowLib.Anon_Leftshift): scala.Unit = js.native
    def postFormat(notes: js.Array[vexflowLib.VexNs.FlowNs.StaveNote]): scala.Boolean = js.native
  }
  
  @JSName("StaveNote")
  @js.native
  object StaveNoteNs extends js.Object {
    val CATEGORY: java.lang.String = js.native
    val STEM_DOWN: scala.Double = js.native
    val STEM_UP: scala.Double = js.native
  }
  
  /* static members */
  @js.native
  object Stem extends js.Object {
    var DEBUG: scala.Boolean = js.native
  }
  
  @JSName("Stem")
  @js.native
  object StemNs extends js.Object {
    val DOWN: scala.Double = js.native
    val UP: scala.Double = js.native
  }
  
  /* static members */
  @js.native
  object StemmableNote extends js.Object {
    var DEBUG: scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StringNumber extends js.Object {
    def format(nums: js.Array[vexflowLib.VexNs.FlowNs.StringNumber], state: vexflowLib.Anon_Leftshift): scala.Boolean = js.native
  }
  
  @JSName("StringNumber")
  @js.native
  object StringNumberNs extends js.Object {
    val CATEGORY: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object Stroke extends js.Object {
    def format(strokes: js.Array[vexflowLib.VexNs.FlowNs.Stroke], state: vexflowLib.Anon_Leftshift): scala.Boolean = js.native
  }
  
  @JSName("Stroke")
  @js.native
  object StrokeNs extends js.Object {
    val CATEGORY: java.lang.String = js.native
    type Type = vexflowLib.VexNs.FlowNs.StrokeNs.Type
  }
  
  @js.native
  object TIME4_4 extends js.Object {
    var beat_value: scala.Double = js.native
    var num_beats: scala.Double = js.native
    var resolution: scala.Double = js.native
  }
  
  /* static members */
  @js.native
  object TabSlide extends js.Object {
    def createSlideDown(notes: vexflowLib.Anon_Firstindices): vexflowLib.VexNs.FlowNs.TabSlide = js.native
    def createSlideUp(notes: vexflowLib.Anon_Firstindices): vexflowLib.VexNs.FlowNs.TabSlide = js.native
  }
  
  @JSName("TabSlide")
  @js.native
  object TabSlideNs extends js.Object {
    val SLIDE_DOWN: scala.Double = js.native
    val SLIDE_UP: scala.Double = js.native
  }
  
  /* static members */
  @js.native
  object TextBracket extends js.Object {
    var DEBUG: scala.Boolean = js.native
  }
  
  @JSName("TextBracket")
  @js.native
  object TextBracketNs extends js.Object {
    type Positions = vexflowLib.VexNs.FlowNs.TextBracketNs.Positions
  }
  
  /* static members */
  @js.native
  object TextDynamics extends js.Object {
    var DEBUG: scala.Boolean = js.native
  }
  
  @JSName("TextNote")
  @js.native
  object TextNoteNs extends js.Object {
    @js.native
    object GLYPHS
      extends /* name */ org.scalablytyped.runtime.StringDictionary[vexflowLib.Anon_CodePoint]
    
    type Justification = vexflowLib.VexNs.FlowNs.TextNoteNs.Justification
  }
  
  /* static members */
  @js.native
  object TickContext extends js.Object {
    def getNextContext(tContext: vexflowLib.VexNs.FlowNs.TickContext): vexflowLib.VexNs.FlowNs.TickContext = js.native
  }
  
  @JSName("TimeSignature")
  @js.native
  object TimeSignatureNs extends js.Object {
    @js.native
    object glyphs
      extends /* name */ org.scalablytyped.runtime.StringDictionary[vexflowLib.Anon_CodeLine]
    
  }
  
  @JSName("Tuning")
  @js.native
  object TuningNs extends js.Object {
    @js.native
    object names
      extends /* name */ org.scalablytyped.runtime.StringDictionary[java.lang.String]
    
  }
  
  @JSName("Tuplet")
  @js.native
  object TupletNs extends js.Object {
    val LOCATION_BOTTOM: scala.Double = js.native
    val LOCATION_TOP: scala.Double = js.native
  }
  
  /* static members */
  @js.native
  object Vibrato extends js.Object {
    def format(
      vibratos: js.Array[vexflowLib.VexNs.FlowNs.Vibrato],
      state: vexflowLib.Anon_Leftshift,
      context: vexflowLib.VexNs.FlowNs.ModifierContext
    ): scala.Boolean = js.native
  }
  
  @JSName("Vibrato")
  @js.native
  object VibratoNs extends js.Object {
    val CATEGORY: java.lang.String = js.native
  }
  
  @JSName("Voice")
  @js.native
  object VoiceNs extends js.Object {
    type Mode = vexflowLib.VexNs.FlowNs.VoiceNs.Mode
  }
  
  @JSName("Volta")
  @js.native
  object VoltaNs extends js.Object {
    type `type` = vexflowLib.VexNs.FlowNs.VoltaNs.`type`
  }
  
  @js.native
  object unicode
    extends /* name */ org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
}

