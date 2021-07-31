package typings.vexflow.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Factory extends StObject {
  
  def Accidental(params: js.Any): typings.vexflow.Vex.Flow.Accidental = js.native
  
  def Annotation(params: js.Any): typings.vexflow.Vex.Flow.Annotation = js.native
  
  def Articulation(params: js.Any): typings.vexflow.Vex.Flow.Articulation = js.native
  
  def BarNote(params: js.Any): typings.vexflow.Vex.Flow.BarNote = js.native
  
  def Beam(params: js.Any): typings.vexflow.Vex.Flow.Beam = js.native
  
  def ClefNote(params: js.Any): typings.vexflow.Vex.Flow.ClefNote = js.native
  
  def Curve(params: js.Any): typings.vexflow.Vex.Flow.Curve = js.native
  
  def EasyScore(): typings.vexflow.Vex.Flow.EasyScore = js.native
  def EasyScore(params: js.Object): typings.vexflow.Vex.Flow.EasyScore = js.native
  
  def Fingering(params: js.Any): FretHandFinger = js.native
  
  def Formatter(): typings.vexflow.Vex.Flow.Formatter = js.native
  
  def GhostNote(noteStruct: js.Any): typings.vexflow.Vex.Flow.GhostNote = js.native
  
  def GlyphNote(glyph: js.Any, noteStruct: js.Any, options: js.Any): typings.vexflow.Vex.Flow.GlyphNote = js.native
  
  def GraceNote(noteStruct: js.Any): typings.vexflow.Vex.Flow.GraceNote = js.native
  
  def GraceNoteGroup(params: js.Any): typings.vexflow.Vex.Flow.GraceNoteGroup = js.native
  
  def KeySigNote(params: js.Any): typings.vexflow.Vex.Flow.KeySigNote = js.native
  
  def ModifierContext(): typings.vexflow.Vex.Flow.ModifierContext = js.native
  
  def MultiMeasureRest(params: js.Any): typings.vexflow.Vex.Flow.MultiMeasureRest = js.native
  
  def NoteSubGroup(): typings.vexflow.Vex.Flow.NoteSubGroup = js.native
  def NoteSubGroup(params: js.Object): typings.vexflow.Vex.Flow.NoteSubGroup = js.native
  
  def PedalMarking(): typings.vexflow.Vex.Flow.PedalMarking = js.native
  def PedalMarking(params: js.Object): typings.vexflow.Vex.Flow.PedalMarking = js.native
  
  def RepeatNote(`type`: js.Any, noteStruct: js.Any, options: js.Any): typings.vexflow.Vex.Flow.RepeatNote = js.native
  
  def Stave(params: js.Any): typings.vexflow.Vex.Flow.Stave = js.native
  
  def StaveConnector(params: js.Any): typings.vexflow.Vex.Flow.StaveConnector = js.native
  
  def StaveLine(params: js.Any): typings.vexflow.Vex.Flow.StaveLine = js.native
  
  def StaveNote(noteStruct: js.Any): typings.vexflow.Vex.Flow.StaveNote = js.native
  
  def StaveTie(params: js.Any): typings.vexflow.Vex.Flow.StaveTie = js.native
  
  def StringNumber(params: js.Any): typings.vexflow.Vex.Flow.StringNumber = js.native
  
  def System(): typings.vexflow.Vex.Flow.System = js.native
  def System(params: js.Object): typings.vexflow.Vex.Flow.System = js.native
  
  def TabNote(noteStruct: js.Any): typings.vexflow.Vex.Flow.TabNote = js.native
  
  def TabStave(params: js.Any): typings.vexflow.Vex.Flow.TabStave = js.native
  
  def TextBracket(params: js.Any): typings.vexflow.Vex.Flow.TextBracket = js.native
  
  def TextDynamics(params: js.Any): typings.vexflow.Vex.Flow.TextDynamics = js.native
  
  def TextNote(textNoteStruct: js.Any): typings.vexflow.Vex.Flow.TextNote = js.native
  
  def TickContext(): typings.vexflow.Vex.Flow.TickContext = js.native
  
  def TimeSigNote(params: js.Any): typings.vexflow.Vex.Flow.TimeSigNote = js.native
  
  def Tuplet(params: js.Any): typings.vexflow.Vex.Flow.Tuplet = js.native
  
  def VibratoBracket(params: js.Any): typings.vexflow.Vex.Flow.VibratoBracket = js.native
  
  def Voice(params: js.Any): typings.vexflow.Vex.Flow.Voice = js.native
  
  var context: js.Any = js.native
  
  def draw(): Unit = js.native
  
  def getContext(): js.Any = js.native
  
  def getOptions(): typings.vexflow.anon.Renderer = js.native
  
  def getStave(): Stave = js.native
  
  def getVoices(): js.Array[js.Any] = js.native
  
  def initRenderer(): Unit = js.native
  
  var options: typings.vexflow.anon.Renderer = js.native
  
  var renderQ: js.Array[js.Any] = js.native
  
  def reset(): Unit = js.native
  
  def setContext(context: js.Any): Factory = js.native
  
  def setOptions(options: js.Any): Unit = js.native
  
  def space(spacing: js.Any): Double = js.native
  
  var stave: Stave = js.native
  
  var staves: js.Array[js.Any] = js.native
  
  var systems: js.Array[js.Any] = js.native
  
  var voices: js.Array[js.Any] = js.native
}
