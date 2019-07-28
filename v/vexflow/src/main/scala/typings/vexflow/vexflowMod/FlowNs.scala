package typings.vexflow.vexflowMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import typings.vexflow.Anon_Accidental
import typings.vexflow.Anon_AccidentalNoteNumber
import typings.vexflow.Anon_Alignrests
import typings.vexflow.Anon_Allvoices
import typings.vexflow.Anon_Autostem
import typings.vexflow.Anon_AutostemClef
import typings.vexflow.Anon_Beammiddleonly
import typings.vexflow.Anon_Beatvalue
import typings.vexflow.Anon_Betweenlines
import typings.vexflow.Anon_BpmDots
import typings.vexflow.Anon_Bracketed
import typings.vexflow.Anon_Cache
import typings.vexflow.Anon_Code
import typings.vexflow.Anon_CodeGracenotewidth
import typings.vexflow.Anon_CodeLine
import typings.vexflow.Anon_CodePoint
import typings.vexflow.Anon_CodeShiftdown
import typings.vexflow.Anon_CodeXshift
import typings.vexflow.Anon_Codehead
import typings.vexflow.Anon_Copyright
import typings.vexflow.Anon_Cps
import typings.vexflow.Anon_Customglyphcode
import typings.vexflow.Anon_Dots
import typings.vexflow.Anon_DotsDuration
import typings.vexflow.Anon_DotsDurationPositions
import typings.vexflow.Anon_DotsDurationType
import typings.vexflow.Anon_Duration
import typings.vexflow.Anon_DurationFont
import typings.vexflow.Anon_DurationLine
import typings.vexflow.Anon_Fillstyle
import typings.vexflow.Anon_Firstindices
import typings.vexflow.Anon_FirstindicesFirstnoteLastindices
import typings.vexflow.Anon_Firstnote
import typings.vexflow.Anon_Ha
import typings.vexflow.Anon_HaOutline
import typings.vexflow.Anon_HeightLeftshiftticks
import typings.vexflow.Anon_Intval
import typings.vexflow.Anon_Justification
import typings.vexflow.Anon_Leftshift
import typings.vexflow.Anon_Line
import typings.vexflow.Anon_Lineshift
import typings.vexflow.Anon_Octaveshift
import typings.vexflow.Anon_Position
import typings.vexflow.Anon_Stemdirection
import typings.vexflow.Anon_Text
import typings.vexflow.Anon_XMax
import typings.vexflow.VexNs.FlowNs.BarlineNs.`type`
import typings.vexflow.VexNs.FlowNs.ModifierNs.Position
import typings.vexflow.VexNs.FlowNs.RendererNs.Backends
import typings.vexflow.VexNs.FlowNs.StrokeNs.Type
import typings.vexflow.VexNs.IFont
import typings.vexflow.VexNs.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow")
@js.native
object FlowNs extends js.Object {
  @js.native
  class Accidental protected ()
    extends typings.vexflow.VexNs.FlowNs.Accidental {
    def this(`type`: String) = this()
  }
  
  @js.native
  class Annotation protected ()
    extends typings.vexflow.VexNs.FlowNs.Annotation {
    def this(text: String) = this()
  }
  
  @js.native
  class Articulation protected ()
    extends typings.vexflow.VexNs.FlowNs.Articulation {
    def this(`type`: String) = this()
  }
  
  @js.native
  class BarNote ()
    extends typings.vexflow.VexNs.FlowNs.BarNote
  
  @js.native
  class Barline protected ()
    extends typings.vexflow.VexNs.FlowNs.Barline {
    def this(`type`: `type`, x: Double) = this()
  }
  
  @js.native
  class Beam protected ()
    extends typings.vexflow.VexNs.FlowNs.Beam {
    def this(notes: js.Array[typings.vexflow.VexNs.FlowNs.StemmableNote]) = this()
    def this(notes: js.Array[typings.vexflow.VexNs.FlowNs.StemmableNote], auto_stem: Boolean) = this()
  }
  
  @js.native
  class Bend protected ()
    extends typings.vexflow.VexNs.FlowNs.Bend {
    def this(text: String) = this()
    def this(text: String, release: Boolean) = this()
    def this(text: String, release: Boolean, phrase: js.Array[Anon_Text]) = this()
  }
  
  @js.native
  class BoundingBox protected ()
    extends typings.vexflow.VexNs.FlowNs.BoundingBox {
    def this(x: Double, y: Double, w: Double, h: Double) = this()
  }
  
  @js.native
  class CanvasContext protected ()
    extends typings.vexflow.VexNs.FlowNs.CanvasContext {
    def this(context: CanvasRenderingContext2D) = this()
  }
  
  @js.native
  class Clef protected ()
    extends typings.vexflow.VexNs.FlowNs.Clef {
    def this(clef: String) = this()
    def this(clef: String, size: String) = this()
    def this(clef: String, size: String, annotation: String) = this()
  }
  
  @js.native
  class ClefNote protected ()
    extends typings.vexflow.VexNs.FlowNs.ClefNote {
    def this(clef: String) = this()
    def this(clef: String, size: String) = this()
    def this(clef: String, size: String, annotation: String) = this()
  }
  
  @js.native
  class Crescendo protected ()
    extends typings.vexflow.VexNs.FlowNs.Crescendo {
    def this(note_struct: Anon_Duration) = this()
  }
  
  @js.native
  class Curve protected ()
    extends typings.vexflow.VexNs.FlowNs.Curve {
    def this(from: typings.vexflow.VexNs.FlowNs.Note, to: typings.vexflow.VexNs.FlowNs.Note) = this()
    def this(from: typings.vexflow.VexNs.FlowNs.Note, to: typings.vexflow.VexNs.FlowNs.Note, options: Anon_Cps) = this()
  }
  
  @js.native
  class Dot ()
    extends typings.vexflow.VexNs.FlowNs.Dot
  
  @js.native
  class Formatter ()
    extends typings.vexflow.VexNs.FlowNs.Formatter
  
  @js.native
  class Fraction protected ()
    extends typings.vexflow.VexNs.FlowNs.Fraction {
    def this(numerator: Double, denominator: Double) = this()
  }
  
  @js.native
  class FretHandFinger protected ()
    extends typings.vexflow.VexNs.FlowNs.FretHandFinger {
    def this(number: String) = this()
    def this(number: Double) = this()
  }
  
  @js.native
  class GhostNote protected ()
    extends typings.vexflow.VexNs.FlowNs.GhostNote {
    def this(duration: String) = this()
    def this(note_struct: Anon_DotsDurationType) = this()
  }
  
  @js.native
  class Glyph protected ()
    extends typings.vexflow.VexNs.FlowNs.Glyph {
    def this(code: String, point: Double) = this()
    def this(code: String, point: Double, options: Anon_Cache) = this()
  }
  
  @js.native
  class GraceNote protected ()
    extends typings.vexflow.VexNs.FlowNs.GraceNote {
    def this(note_struct: Anon_Autostem) = this()
  }
  
  @js.native
  class GraceNoteGroup protected ()
    extends typings.vexflow.VexNs.FlowNs.GraceNoteGroup {
    def this(grace_notes: js.Array[typings.vexflow.VexNs.FlowNs.GraceNote]) = this()
    def this(grace_notes: js.Array[typings.vexflow.VexNs.FlowNs.GraceNote], show_slur: Boolean) = this()
  }
  
  @js.native
  class KeyManager protected ()
    extends typings.vexflow.VexNs.FlowNs.KeyManager {
    def this(key: String) = this()
  }
  
  @js.native
  class KeySignature protected ()
    extends typings.vexflow.VexNs.FlowNs.KeySignature {
    def this(key_spec: String) = this()
  }
  
  @js.native
  class Modifier ()
    extends typings.vexflow.VexNs.FlowNs.Modifier
  
  @js.native
  class ModifierContext ()
    extends typings.vexflow.VexNs.FlowNs.ModifierContext
  
  @js.native
  class Music ()
    extends typings.vexflow.VexNs.FlowNs.Music
  
  @js.native
  class Note protected ()
    extends typings.vexflow.VexNs.FlowNs.Note {
    def this(note_struct: Anon_DotsDurationType) = this()
  }
  
  @js.native
  class NoteHead protected ()
    extends typings.vexflow.VexNs.FlowNs.NoteHead {
    def this(head_options: Anon_Customglyphcode) = this()
  }
  
  @js.native
  class NoteSubGroup protected ()
    extends typings.vexflow.VexNs.FlowNs.NoteSubGroup {
    def this(subnotes: js.Array[typings.vexflow.VexNs.FlowNs.Note]) = this()
  }
  
  @js.native
  class Ornament protected ()
    extends typings.vexflow.VexNs.FlowNs.Ornament {
    def this(`type`: String) = this()
  }
  
  @js.native
  class PedalMarking protected ()
    extends typings.vexflow.VexNs.FlowNs.PedalMarking {
    def this(notes: js.Array[typings.vexflow.VexNs.FlowNs.Note]) = this()
  }
  
  @js.native
  class RaphaelContext protected ()
    extends typings.vexflow.VexNs.FlowNs.RaphaelContext {
    def this(element: HTMLElement) = this()
  }
  
  @js.native
  class Renderer protected ()
    extends typings.vexflow.VexNs.FlowNs.Renderer {
    def this(sel: HTMLElement, backend: Backends) = this()
  }
  
  @js.native
  class Repetition protected ()
    extends typings.vexflow.VexNs.FlowNs.Repetition {
    def this(`type`: typings.vexflow.VexNs.FlowNs.RepetitionNs.`type`, x: Double, y_shift: Double) = this()
  }
  
  @js.native
  class SVGContext protected ()
    extends typings.vexflow.VexNs.FlowNs.SVGContext {
    def this(element: HTMLElement) = this()
  }
  
  @js.native
  class Stave protected ()
    extends typings.vexflow.VexNs.FlowNs.Stave {
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Double, width: Double, options: Anon_Fillstyle) = this()
  }
  
  @js.native
  class StaveConnector protected ()
    extends typings.vexflow.VexNs.FlowNs.StaveConnector {
    def this(top_stave: typings.vexflow.VexNs.FlowNs.Stave, bottom_stave: typings.vexflow.VexNs.FlowNs.Stave) = this()
  }
  
  @js.native
  class StaveHairpin protected ()
    extends typings.vexflow.VexNs.FlowNs.StaveHairpin {
    def this(notes: Anon_Firstnote, `type`: typings.vexflow.VexNs.FlowNs.StaveHairpinNs.`type`) = this()
  }
  
  @js.native
  class StaveLine protected ()
    extends typings.vexflow.VexNs.FlowNs.StaveLine {
    def this(notes: Anon_Firstindices) = this()
  }
  
  @js.native
  class StaveModifier ()
    extends typings.vexflow.VexNs.FlowNs.StaveModifier
  
  @js.native
  class StaveNote protected ()
    extends typings.vexflow.VexNs.FlowNs.StaveNote {
    def this(note_struct: Anon_AutostemClef) = this()
  }
  
  @js.native
  class StaveSection protected ()
    extends typings.vexflow.VexNs.FlowNs.StaveSection {
    def this(section: String, x: Double, shift_y: Double) = this()
  }
  
  @js.native
  class StaveTempo protected ()
    extends typings.vexflow.VexNs.FlowNs.StaveTempo {
    def this(tempo: Anon_BpmDots, x: Double, shift_y: Double) = this()
  }
  
  @js.native
  class StaveText protected ()
    extends typings.vexflow.VexNs.FlowNs.StaveText {
    def this(text: String, position: Position) = this()
    def this(text: String, position: Position, options: Anon_Justification) = this()
  }
  
  @js.native
  class StaveTie protected ()
    extends typings.vexflow.VexNs.FlowNs.StaveTie {
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
    def this(notes: Anon_FirstindicesFirstnoteLastindices) = this()
    def this(notes: Anon_FirstindicesFirstnoteLastindices, text: String) = this()
  }
  
  @js.native
  class Stem protected ()
    extends typings.vexflow.VexNs.FlowNs.Stem {
    def this(options: Anon_Stemdirection) = this()
  }
  
  @js.native
  class StemmableNote protected ()
    extends typings.vexflow.VexNs.FlowNs.StemmableNote {
    def this(note_struct: Anon_DotsDurationType) = this()
  }
  
  @js.native
  class StringNumber protected ()
    extends typings.vexflow.VexNs.FlowNs.StringNumber {
    def this(number: String) = this()
    // actually this is not really consistent in the vexflow code "ctx.measureText(this.string_number).width" looks
    // like it is a string. But from the use of it it might be a number ?!
    def this(number: Double) = this()
  }
  
  @js.native
  class Stroke protected ()
    extends typings.vexflow.VexNs.FlowNs.Stroke {
    def this(`type`: Type) = this()
    def this(`type`: Type, options: Anon_Allvoices) = this()
  }
  
  @js.native
  class TabNote protected ()
    extends typings.vexflow.VexNs.FlowNs.TabNote {
    def this(tab_struct: Anon_DotsDurationPositions) = this()
    def this(tab_struct: Anon_DotsDurationPositions, draw_stem: Boolean) = this()
  }
  
  @js.native
  class TabSlide protected ()
    extends typings.vexflow.VexNs.FlowNs.TabSlide {
    def this(notes: Anon_Firstindices) = this()
    def this(notes: Anon_Firstindices, direction: Double) = this()
  }
  
  @js.native
  class TabStave protected ()
    extends typings.vexflow.VexNs.FlowNs.TabStave {
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Double, width: Double, options: Anon_Fillstyle) = this()
  }
  
  @js.native
  class TabTie protected ()
    extends typings.vexflow.VexNs.FlowNs.TabTie {
    def this(notes: Anon_Firstindices) = this()
    def this(notes: Anon_Firstindices, text: String) = this()
  }
  
  @js.native
  class TextBracket protected ()
    extends typings.vexflow.VexNs.FlowNs.TextBracket {
    def this(bracket_data: Anon_Position) = this()
  }
  
  @js.native
  class TextDynamics protected ()
    extends typings.vexflow.VexNs.FlowNs.TextDynamics {
    def this(text_struct: Anon_DurationLine) = this()
  }
  
  @js.native
  class TextNote protected ()
    extends typings.vexflow.VexNs.FlowNs.TextNote {
    def this(text_struct: Anon_DurationFont) = this()
  }
  
  @js.native
  class TickContext ()
    extends typings.vexflow.VexNs.FlowNs.TickContext
  
  @js.native
  class TimeSigNote protected ()
    extends typings.vexflow.VexNs.FlowNs.TimeSigNote {
    def this(timeSpec: String, customPadding: Double) = this()
  }
  
  @js.native
  class TimeSignature protected ()
    extends typings.vexflow.VexNs.FlowNs.TimeSignature {
    def this(timeSpec: String) = this()
    def this(timeSpec: String, customPadding: Double) = this()
  }
  
  @js.native
  class Tremolo protected ()
    extends typings.vexflow.VexNs.FlowNs.Tremolo {
    def this(num: Double) = this()
  }
  
  @js.native
  class Tuning ()
    extends typings.vexflow.VexNs.FlowNs.Tuning {
    def this(tuningString: String) = this()
  }
  
  @js.native
  class Tuplet protected ()
    extends typings.vexflow.VexNs.FlowNs.Tuplet {
    def this(notes: js.Array[typings.vexflow.VexNs.FlowNs.StaveNote]) = this()
    def this(notes: js.Array[typings.vexflow.VexNs.FlowNs.StaveNote], options: Anon_Bracketed) = this()
  }
  
  @js.native
  class Vibrato ()
    extends typings.vexflow.VexNs.FlowNs.Vibrato
  
  @js.native
  class Voice protected ()
    extends typings.vexflow.VexNs.FlowNs.Voice {
    def this(time: Anon_Beatvalue) = this()
  }
  
  @js.native
  class VoiceGroup ()
    extends typings.vexflow.VexNs.FlowNs.VoiceGroup
  
  @js.native
  class Volta protected ()
    extends typings.vexflow.VexNs.FlowNs.Volta {
    def this(`type`: typings.vexflow.VexNs.FlowNs.VoltaNs.`type`, number: Double, x: Double, y_shift: Double) = this()
  }
  
  val DEFAULT_NOTATION_FONT_SCALE: Double = js.native
  val RESOLUTION: Double = js.native
  val STAVE_LINE_THICKNESS: Double = js.native
  val STEM_HEIGHT: Double = js.native
  // from tables.js:
  val STEM_WIDTH: Double = js.native
  def accidentalCodes(acc: String): Anon_CodeGracenotewidth = js.native
  def articulationCodes(artic: String): Anon_Betweenlines = js.native
  def clefProperties(clef: String): Anon_Lineshift = js.native
  def durationToFraction(duration: String): typings.vexflow.VexNs.FlowNs.Fraction = js.native
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
  /* static members */
  @js.native
  object Accidental extends js.Object {
    var DEBUG: Boolean = js.native
    def applyAccidentals(voices: js.Array[typings.vexflow.VexNs.FlowNs.Voice]): Unit = js.native
    def applyAccidentals(voices: js.Array[typings.vexflow.VexNs.FlowNs.Voice], keySignature: String): Unit = js.native
    def format(accidentals: js.Array[typings.vexflow.VexNs.FlowNs.Accidental], state: Anon_Leftshift): Unit = js.native
  }
  
  @JSName("Accidental")
  @js.native
  object AccidentalNs extends js.Object {
    val CATEGORY: String = js.native
  }
  
  /* static members */
  @js.native
  object Annotation extends js.Object {
    var DEBUG: Boolean = js.native
    def format(annotations: js.Array[typings.vexflow.VexNs.FlowNs.Annotation], state: Anon_Leftshift): Boolean = js.native
  }
  
  @JSName("Annotation")
  @js.native
  object AnnotationNs extends js.Object {
    val CATEGORY: String = js.native
    type Justify = typings.vexflow.VexNs.FlowNs.AnnotationNs.Justify
    type VerticalJustify = typings.vexflow.VexNs.FlowNs.AnnotationNs.VerticalJustify
  }
  
  /* static members */
  @js.native
  object Articulation extends js.Object {
    var DEBUG: Boolean = js.native
    def format(articulations: js.Array[typings.vexflow.VexNs.FlowNs.Articulation], state: Anon_Leftshift): Boolean = js.native
  }
  
  @JSName("Articulation")
  @js.native
  object ArticulationNs extends js.Object {
    val CATEGORY: String = js.native
  }
  
  /* static members */
  @js.native
  object BarNote extends js.Object {
    var DEBUG: Boolean = js.native
  }
  
  @JSName("Barline")
  @js.native
  object BarlineNs extends js.Object {
    type `type` = typings.vexflow.VexNs.FlowNs.BarlineNs.`type`
  }
  
  /* static members */
  @js.native
  object Beam extends js.Object {
    def applyAndGetBeams(
      voice: typings.vexflow.VexNs.FlowNs.Voice,
      stem_direction: Double,
      groups: js.Array[typings.vexflow.VexNs.FlowNs.Fraction]
    ): js.Array[typings.vexflow.VexNs.FlowNs.Beam] = js.native
    def generateBeams(notes: js.Array[typings.vexflow.VexNs.FlowNs.StemmableNote]): js.Array[typings.vexflow.VexNs.FlowNs.Beam] = js.native
    def generateBeams(notes: js.Array[typings.vexflow.VexNs.FlowNs.StemmableNote], config: Anon_Beammiddleonly): js.Array[typings.vexflow.VexNs.FlowNs.Beam] = js.native
    def getDefaultBeamGroups(time_sig: String): js.Array[typings.vexflow.VexNs.FlowNs.Fraction] = js.native
  }
  
  /* static members */
  @js.native
  object Bend extends js.Object {
    var DOWN: Double = js.native
    var UP: Double = js.native
    def format(bends: js.Array[typings.vexflow.VexNs.FlowNs.Bend], state: Anon_Leftshift): Boolean = js.native
  }
  
  @JSName("Bend")
  @js.native
  object BendNs extends js.Object {
    val CATEGORY: String = js.native
  }
  
  /* static members */
  @js.native
  object BoundingBox extends js.Object {
    def copy(that: typings.vexflow.VexNs.FlowNs.BoundingBox): typings.vexflow.VexNs.FlowNs.BoundingBox = js.native
  }
  
  /* static members */
  @js.native
  object CanvasContext extends js.Object {
    var HEIGHT: Double = js.native
    var WIDTH: Double = js.native
  }
  
  /* static members */
  @js.native
  object Clef extends js.Object {
    var DEBUG: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Crescendo extends js.Object {
    var DEBUG: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Curve extends js.Object {
    var DEBUG: Boolean = js.native
  }
  
  @JSName("Curve")
  @js.native
  object CurveNs extends js.Object {
    type Position = typings.vexflow.VexNs.FlowNs.CurveNs.Position
  }
  
  /* static members */
  @js.native
  object Dot extends js.Object {
    def format(dots: Double, state: Anon_Leftshift): Unit = js.native
  }
  
  @JSName("Dot")
  @js.native
  object DotNs extends js.Object {
    val CATEGORY: String = js.native
  }
  
  // from vexflow_font.js / gonville_original.js / gonville_all.js
  @js.native
  object Font extends js.Object {
    var ascender: Double = js.native
    var boundingBox: Anon_XMax = js.native
    var cssFontStyle: String = js.native
    var cssFontWeight: String = js.native
    var descender: Double = js.native
    var familyName: String = js.native
    var glyphs: js.Array[Anon_Ha] = js.native
    var lineHeight: Double = js.native
    //inconsistent member : this is missing in vexflow_font.js, but present in gonville_original.js and gonville_all.js
    var original_font_information: Anon_Copyright = js.native
    var resolution: Double = js.native
    var underlinePosition: Double = js.native
    var underlineThickness: Double = js.native
  }
  
  /* static members */
  @js.native
  object Formatter extends js.Object {
    var DEBUG: Boolean = js.native
    def AlignRestsToNotes(notes: js.Array[typings.vexflow.VexNs.FlowNs.Note]): typings.vexflow.VexNs.FlowNs.Formatter = js.native
    def AlignRestsToNotes(notes: js.Array[typings.vexflow.VexNs.FlowNs.Note], align_all_notes: Boolean): typings.vexflow.VexNs.FlowNs.Formatter = js.native
    def AlignRestsToNotes(
      notes: js.Array[typings.vexflow.VexNs.FlowNs.Note],
      align_all_notes: Boolean,
      align_tuplets: Boolean
    ): typings.vexflow.VexNs.FlowNs.Formatter = js.native
    def FormatAndDraw(
      ctx: IRenderContext,
      stave: typings.vexflow.VexNs.FlowNs.Stave,
      notes: js.Array[typings.vexflow.VexNs.FlowNs.Note]
    ): typings.vexflow.VexNs.FlowNs.BoundingBox = js.native
    def FormatAndDraw(
      ctx: IRenderContext,
      stave: typings.vexflow.VexNs.FlowNs.Stave,
      notes: js.Array[typings.vexflow.VexNs.FlowNs.Note],
      params: Boolean
    ): typings.vexflow.VexNs.FlowNs.BoundingBox = js.native
    def FormatAndDraw(
      ctx: IRenderContext,
      stave: typings.vexflow.VexNs.FlowNs.Stave,
      notes: js.Array[typings.vexflow.VexNs.FlowNs.Note],
      params: Anon_Alignrests
    ): typings.vexflow.VexNs.FlowNs.BoundingBox = js.native
    def FormatAndDrawTab(
      ctx: IRenderContext,
      tabstave: typings.vexflow.VexNs.FlowNs.TabStave,
      stave: typings.vexflow.VexNs.FlowNs.Stave,
      tabnotes: js.Array[typings.vexflow.VexNs.FlowNs.TabNote],
      notes: js.Array[typings.vexflow.VexNs.FlowNs.Note]
    ): Unit = js.native
    def FormatAndDrawTab(
      ctx: IRenderContext,
      tabstave: typings.vexflow.VexNs.FlowNs.TabStave,
      stave: typings.vexflow.VexNs.FlowNs.Stave,
      tabnotes: js.Array[typings.vexflow.VexNs.FlowNs.TabNote],
      notes: js.Array[typings.vexflow.VexNs.FlowNs.Note],
      autobeam: Boolean
    ): Unit = js.native
    def FormatAndDrawTab(
      ctx: IRenderContext,
      tabstave: typings.vexflow.VexNs.FlowNs.TabStave,
      stave: typings.vexflow.VexNs.FlowNs.Stave,
      tabnotes: js.Array[typings.vexflow.VexNs.FlowNs.TabNote],
      notes: js.Array[typings.vexflow.VexNs.FlowNs.Note],
      autobeam: Boolean,
      params: Boolean
    ): Unit = js.native
    def FormatAndDrawTab(
      ctx: IRenderContext,
      tabstave: typings.vexflow.VexNs.FlowNs.TabStave,
      stave: typings.vexflow.VexNs.FlowNs.Stave,
      tabnotes: js.Array[typings.vexflow.VexNs.FlowNs.TabNote],
      notes: js.Array[typings.vexflow.VexNs.FlowNs.Note],
      autobeam: Boolean,
      params: Anon_Alignrests
    ): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Fraction extends js.Object {
    def GCD(a: Double, b: Double): Double = js.native
    def LCM(a: Double, b: Double): Double = js.native
    def LCMM(a: Double, b: Double): Double = js.native
  }
  
  /* static members */
  @js.native
  object FretHandFinger extends js.Object {
    def format(nums: js.Array[typings.vexflow.VexNs.FlowNs.FretHandFinger], state: Anon_Leftshift): Unit = js.native
  }
  
  @JSName("FretHandFinger")
  @js.native
  object FretHandFingerNs extends js.Object {
    val CATEGORY: String = js.native
  }
  
  /* static members */
  @js.native
  object Glyph extends js.Object {
    def loadMetrics(font: IFont, code: String, cache: Boolean): Anon_HaOutline = js.native
    def renderOutline(ctx: IRenderContext, outline: js.Array[Double], scale: Double, x_pos: Double, y_pos: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object GraceNote extends js.Object {
    var LEDGER_LINE_OFFSET: Double = js.native
  }
  
  /* static members */
  @js.native
  object GraceNoteGroup extends js.Object {
     //inconsistent name: 'show_slur' is called 'config', suggesting object (is boolean)
    var DEBUG: Boolean = js.native
    def format(gracenote_groups: js.Array[typings.vexflow.VexNs.FlowNs.GraceNoteGroup], state: Anon_Leftshift): Boolean = js.native
  }
  
  @JSName("GraceNoteGroup")
  @js.native
  object GraceNoteGroupNs extends js.Object {
    val CATEGORY: String = js.native
  }
  
  @JSName("GraceNote")
  @js.native
  object GraceNoteNs extends js.Object {
    val SCALE: Double = js.native
  }
  
  /* static members */
  @js.native
  object Modifier extends js.Object {
    var DEBUG: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ModifierContext extends js.Object {
    var DEBUG: Boolean = js.native
  }
  
  @JSName("Modifier")
  @js.native
  object ModifierNs extends js.Object {
    val CATEGORY: String = js.native
    type Position = typings.vexflow.VexNs.FlowNs.ModifierNs.Position
  }
  
  @JSName("Music")
  @js.native
  object MusicNs extends js.Object {
    val NUM_TONES: Double = js.native
    val accidentals: js.Array[String] = js.native
    val canonical_notes: js.Array[String] = js.native
    val diatonic_intervals: js.Array[String] = js.native
    val root_values: js.Array[Double] = js.native
    val roots: js.Array[String] = js.native
    @js.native
    object diatonic_accidentals extends /* diatonic_interval */ StringDictionary[Anon_AccidentalNoteNumber]
    
    @js.native
    object intervals extends /* interval */ StringDictionary[Double]
    
    @js.native
    object noteValues extends /* value */ StringDictionary[Anon_Intval]
    
    @js.native
    object root_indices extends /* root */ StringDictionary[Double]
    
    @js.native
    object scales
      extends /* scale */ StringDictionary[js.Array[Double]]
    
  }
  
  /* static members */
  @js.native
  object NoteHead extends js.Object {
    var DEBUG: Boolean = js.native
  }
  
  @JSName("Note")
  @js.native
  object NoteNs extends js.Object {
    val CATEGORY: String = js.native
  }
  
  /* static members */
  @js.native
  object Ornament extends js.Object {
    var DEBUG: Boolean = js.native
    def format(ornaments: js.Array[typings.vexflow.VexNs.FlowNs.Ornament], state: Anon_Leftshift): Boolean = js.native
  }
  
  @JSName("Ornament")
  @js.native
  object OrnamentNs extends js.Object {
    val CATEGORY: String = js.native
  }
  
  /* static members */
  @js.native
  object PedalMarking extends js.Object {
     //inconsistent name: 'notes' is called 'type', suggesting string (is Note[])
    var DEBUG: Boolean = js.native
    def createSostenuto(notes: js.Array[typings.vexflow.VexNs.FlowNs.Note]): typings.vexflow.VexNs.FlowNs.PedalMarking = js.native
    def createSustain(notes: js.Array[typings.vexflow.VexNs.FlowNs.Note]): typings.vexflow.VexNs.FlowNs.PedalMarking = js.native
    def createUnaCorda(notes: js.Array[typings.vexflow.VexNs.FlowNs.Note]): typings.vexflow.VexNs.FlowNs.PedalMarking = js.native
  }
  
  @JSName("PedalMarking")
  @js.native
  object PedalMarkingNs extends js.Object {
    @js.native
    object GLYPHS extends /* name */ StringDictionary[Anon_CodeXshift]
    
    type Styles = typings.vexflow.VexNs.FlowNs.PedalMarkingNs.Styles
  }
  
  /* static members */
  @js.native
  object Renderer extends js.Object {
    var USE_CANVAS_PROXY: Boolean = js.native
    def bolsterCanvasContext(ctx: CanvasRenderingContext2D): typings.vexflow.VexNs.FlowNs.CanvasContext = js.native
    def buildContext(sel: HTMLElement, backend: Backends): IRenderContext = js.native
    def buildContext(sel: HTMLElement, backend: Backends, width: Double): IRenderContext = js.native
    def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): IRenderContext = js.native
    def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): IRenderContext = js.native
    def drawDashedLine(
      context: IRenderContext,
      fromX: Double,
      fromY: Double,
      toX: Double,
      toY: Double,
      dashPattern: js.Array[Double]
    ): Unit = js.native
    def getCanvasContext(sel: HTMLElement, backend: Backends): typings.vexflow.VexNs.FlowNs.CanvasContext = js.native
    def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double): typings.vexflow.VexNs.FlowNs.CanvasContext = js.native
    def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typings.vexflow.VexNs.FlowNs.CanvasContext = js.native
    def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typings.vexflow.VexNs.FlowNs.CanvasContext = js.native
    def getRaphaelContext(sel: HTMLElement, backend: Backends): typings.vexflow.VexNs.FlowNs.RaphaelContext = js.native
    def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double): typings.vexflow.VexNs.FlowNs.RaphaelContext = js.native
    def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typings.vexflow.VexNs.FlowNs.RaphaelContext = js.native
    def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typings.vexflow.VexNs.FlowNs.RaphaelContext = js.native
    def getSVGContext(sel: HTMLElement, backend: Backends): typings.vexflow.VexNs.FlowNs.SVGContext = js.native
    def getSVGContext(sel: HTMLElement, backend: Backends, width: Double): typings.vexflow.VexNs.FlowNs.SVGContext = js.native
    def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typings.vexflow.VexNs.FlowNs.SVGContext = js.native
    def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typings.vexflow.VexNs.FlowNs.SVGContext = js.native
  }
  
  @JSName("Renderer")
  @js.native
  object RendererNs extends js.Object {
    type Backends = typings.vexflow.VexNs.FlowNs.RendererNs.Backends
    type LineEndType = typings.vexflow.VexNs.FlowNs.RendererNs.LineEndType
  }
  
  @JSName("Repetition")
  @js.native
  object RepetitionNs extends js.Object {
    type `type` = typings.vexflow.VexNs.FlowNs.RepetitionNs.`type`
  }
  
  @JSName("StaveConnector")
  @js.native
  object StaveConnectorNs extends js.Object {
    type `type` = typings.vexflow.VexNs.FlowNs.StaveConnectorNs.`type`
  }
  
  /* static members */
  @js.native
  object StaveHairpin extends js.Object {
    def FormatByTicksAndDraw(
      ctx: IRenderContext,
      formatter: typings.vexflow.VexNs.FlowNs.Formatter,
      notes: Anon_Firstnote,
      `type`: typings.vexflow.VexNs.FlowNs.StaveHairpinNs.`type`,
      position: Position
    ): Unit = js.native
    def FormatByTicksAndDraw(
      ctx: IRenderContext,
      formatter: typings.vexflow.VexNs.FlowNs.Formatter,
      notes: Anon_Firstnote,
      `type`: typings.vexflow.VexNs.FlowNs.StaveHairpinNs.`type`,
      position: Position,
      options: Anon_HeightLeftshiftticks
    ): Unit = js.native
  }
  
  @JSName("StaveHairpin")
  @js.native
  object StaveHairpinNs extends js.Object {
    type `type` = typings.vexflow.VexNs.FlowNs.StaveHairpinNs.`type`
  }
  
  @JSName("StaveLine")
  @js.native
  object StaveLineNs extends js.Object {
    type TextJustification = typings.vexflow.VexNs.FlowNs.StaveLineNs.TextJustification
    type TextVerticalPosition = typings.vexflow.VexNs.FlowNs.StaveLineNs.TextVerticalPosition
  }
  
  @JSName("StaveModifier")
  @js.native
  object StaveModifierNs extends js.Object {
    // @see https://github.com/0xfe/vexflow/blob/master/src/stavemodifier.js#L9
    type Position = typings.vexflow.VexNs.FlowNs.StaveModifierNs.Position
  }
  
  /* static members */
  @js.native
  object StaveNote extends js.Object {
    var DEBUG: Boolean = js.native
    def format(notes: js.Array[typings.vexflow.VexNs.FlowNs.StaveNote], state: Anon_Leftshift): Boolean = js.native
    def formatByY(notes: js.Array[typings.vexflow.VexNs.FlowNs.StaveNote], state: Anon_Leftshift): Unit = js.native
    def postFormat(notes: js.Array[typings.vexflow.VexNs.FlowNs.StaveNote]): Boolean = js.native
  }
  
  @JSName("StaveNote")
  @js.native
  object StaveNoteNs extends js.Object {
    val CATEGORY: String = js.native
    val STEM_DOWN: Double = js.native
    val STEM_UP: Double = js.native
  }
  
  /* static members */
  @js.native
  object Stem extends js.Object {
    var DEBUG: Boolean = js.native
  }
  
  @JSName("Stem")
  @js.native
  object StemNs extends js.Object {
    val DOWN: Double = js.native
    val UP: Double = js.native
  }
  
  /* static members */
  @js.native
  object StemmableNote extends js.Object {
    var DEBUG: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StringNumber extends js.Object {
    def format(nums: js.Array[typings.vexflow.VexNs.FlowNs.StringNumber], state: Anon_Leftshift): Boolean = js.native
  }
  
  @JSName("StringNumber")
  @js.native
  object StringNumberNs extends js.Object {
    val CATEGORY: String = js.native
  }
  
  /* static members */
  @js.native
  object Stroke extends js.Object {
    def format(strokes: js.Array[typings.vexflow.VexNs.FlowNs.Stroke], state: Anon_Leftshift): Boolean = js.native
  }
  
  @JSName("Stroke")
  @js.native
  object StrokeNs extends js.Object {
    val CATEGORY: String = js.native
    type Type = typings.vexflow.VexNs.FlowNs.StrokeNs.Type
  }
  
  @js.native
  object TIME4_4 extends js.Object {
    var beat_value: Double = js.native
    var num_beats: Double = js.native
    var resolution: Double = js.native
  }
  
  /* static members */
  @js.native
  object TabSlide extends js.Object {
    def createSlideDown(notes: Anon_Firstindices): typings.vexflow.VexNs.FlowNs.TabSlide = js.native
    def createSlideUp(notes: Anon_Firstindices): typings.vexflow.VexNs.FlowNs.TabSlide = js.native
  }
  
  @JSName("TabSlide")
  @js.native
  object TabSlideNs extends js.Object {
    val SLIDE_DOWN: Double = js.native
    val SLIDE_UP: Double = js.native
  }
  
  /* static members */
  @js.native
  object TextBracket extends js.Object {
    var DEBUG: Boolean = js.native
  }
  
  @JSName("TextBracket")
  @js.native
  object TextBracketNs extends js.Object {
    type Positions = typings.vexflow.VexNs.FlowNs.TextBracketNs.Positions
  }
  
  /* static members */
  @js.native
  object TextDynamics extends js.Object {
    var DEBUG: Boolean = js.native
  }
  
  @JSName("TextNote")
  @js.native
  object TextNoteNs extends js.Object {
    @js.native
    object GLYPHS extends /* name */ StringDictionary[Anon_CodePoint]
    
    type Justification = typings.vexflow.VexNs.FlowNs.TextNoteNs.Justification
  }
  
  /* static members */
  @js.native
  object TickContext extends js.Object {
    def getNextContext(tContext: typings.vexflow.VexNs.FlowNs.TickContext): typings.vexflow.VexNs.FlowNs.TickContext = js.native
  }
  
  @JSName("TimeSignature")
  @js.native
  object TimeSignatureNs extends js.Object {
    @js.native
    object glyphs extends /* name */ StringDictionary[Anon_CodeLine]
    
  }
  
  @JSName("Tuning")
  @js.native
  object TuningNs extends js.Object {
    @js.native
    object names extends /* name */ StringDictionary[String]
    
  }
  
  @JSName("Tuplet")
  @js.native
  object TupletNs extends js.Object {
    val LOCATION_BOTTOM: Double = js.native
    val LOCATION_TOP: Double = js.native
  }
  
  /* static members */
  @js.native
  object Vibrato extends js.Object {
    def format(
      vibratos: js.Array[typings.vexflow.VexNs.FlowNs.Vibrato],
      state: Anon_Leftshift,
      context: typings.vexflow.VexNs.FlowNs.ModifierContext
    ): Boolean = js.native
  }
  
  @JSName("Vibrato")
  @js.native
  object VibratoNs extends js.Object {
    val CATEGORY: String = js.native
  }
  
  @JSName("Voice")
  @js.native
  object VoiceNs extends js.Object {
    type Mode = typings.vexflow.VexNs.FlowNs.VoiceNs.Mode
  }
  
  @JSName("Volta")
  @js.native
  object VoltaNs extends js.Object {
    type `type` = typings.vexflow.VexNs.FlowNs.VoltaNs.`type`
  }
  
  @js.native
  object unicode extends /* name */ StringDictionary[String]
  
}

