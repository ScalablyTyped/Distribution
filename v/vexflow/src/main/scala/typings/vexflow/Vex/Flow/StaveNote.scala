package typings.vexflow.Vex.Flow

import typings.vexflow.AnonAccidental
import typings.vexflow.AnonClef
import typings.vexflow.AnonFillStyle_
import typings.vexflow.AnonHighestline
import typings.vexflow.AnonLeftshift
import typings.vexflow.AnonX
import typings.vexflow.Vex.Flow.Modifier.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveNote")
@js.native
class StaveNote protected () extends StemmableNote {
  def this(note_struct: AnonClef) = this()
  var x_shift: Double = js.native
  def addAccidental(index: Double, accidental: Accidental): StaveNote = js.native
  def addAnnotation(index: Double, annotation: Annotation): StaveNote = js.native
  def addArticulation(index: Double, articulation: Articulation): StaveNote = js.native
  def addDot(index: Double): StaveNote = js.native
  def addDotToAll(): StaveNote = js.native
  //TODO: vexflow actualy managed to have Note use modifier, index and stavenote index,modifier. To use the function in
  // Typescript we need to allow both. The name is the correct type :(
  def addModifier(index: js.Any): Note = js.native
  def addModifier(index: js.Any, modifier: js.Any): Note = js.native
  def autoStem(): Unit = js.native
   //inconsistent type: void -> StaveNote
  def buildNoteHeads(): Unit = js.native
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes and/or inconsistencies mentioned below are fixed
  @JSName("buildStem")
  def buildStem_StemmableNote(): StemmableNote = js.native
  def calcExtraPx(): Unit = js.native
  def calculateKeyProps(): Unit = js.native
  def draw(): Unit = js.native
  def drawFlag(): Unit = js.native
  def drawLedgerLines(): Unit = js.native
  def drawModifiers(): Unit = js.native
  def drawNoteHeads(): Unit = js.native
  def getAccidentals(): js.Array[Accidental] = js.native
  @JSName("getDots")
  def getDots_Array(): js.Array[Dot] = js.native
  def getKeyLine(index: Double): Double = js.native
  def getKeyProps(): js.Array[AnonAccidental] = js.native
  def getKeys(): js.Array[String] = js.native
  def getModifierStartXY(position: Position, index: Double): AnonX = js.native
  def getNoteHeadBeginX(): Double = js.native
  def getNoteHeadBounds(): AnonHighestline = js.native
  def getNoteHeadEndX(): Double = js.native
  def getTieLeftX(): Double = js.native
  def getTieRightX(): Double = js.native
  def getVoiceShiftWidth(): Double = js.native
  def isChord(): Boolean = js.native
  def isDisplaced(): Boolean = js.native
  def setKeyLine(index: Double, line: Double): StaveNote = js.native
  def setKeyStyle(index: Double, style: AnonFillStyle_): StaveNote = js.native
  def setNoteDisplaced(displaced: Boolean): StaveNote = js.native
  @JSName("setStave")
  def setStave_Note(stave: Stave): Note = js.native
   // inconsistent type: void -> StaveNote
  def setStemStyle(style: AnonFillStyle_): Unit = js.native
  def setStyle(style: AnonFillStyle_): Unit = js.native
}

/* static members */
@JSGlobal("Vex.Flow.StaveNote")
@js.native
object StaveNote extends js.Object {
  val CATEGORY: String = js.native
  var DEBUG: Boolean = js.native
  val STEM_DOWN: Double = js.native
  val STEM_UP: Double = js.native
  def format(notes: js.Array[StaveNote], state: AnonLeftshift): Boolean = js.native
  def formatByY(notes: js.Array[StaveNote], state: AnonLeftshift): Unit = js.native
  def postFormat(notes: js.Array[StaveNote]): Boolean = js.native
}

