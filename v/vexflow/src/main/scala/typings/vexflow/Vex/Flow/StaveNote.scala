package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.anon.FillStyle_
import typings.vexflow.anon.Highestline
import typings.vexflow.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaveNote
  extends StObject
     with StemmableNote {
  
  def addAccidental(index: Double, accidental: Accidental): StaveNote = js.native
  
  def addAnnotation(index: Double, annotation: Annotation): StaveNote = js.native
  
  def addArticulation(index: Double, articulation: Articulation): StaveNote = js.native
  
  def addDot(index: Double): StaveNote = js.native
  
  def addDotToAll(): StaveNote = js.native
  
  //TODO: vexflow actualy managed to have Note use modifier, index and stavenote index,modifier. To use the function in
  // Typescript we need to allow both. The name is the correct type :(
  def addModifier(index: Any): Note = js.native
  def addModifier(index: Any, modifier: Any): Note = js.native
  
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
  
  def getKeyProps(): js.Array[typings.vexflow.anon.Accidental] = js.native
  
  def getKeys(): js.Array[String] = js.native
  
  def getModifierStartXY(position: Position, index: Double): X = js.native
  
  def getNoteHeadBeginX(): Double = js.native
  
  def getNoteHeadBounds(): Highestline = js.native
  
  def getNoteHeadEndX(): Double = js.native
  
  def getTieLeftX(): Double = js.native
  
  def getTieRightX(): Double = js.native
  
  def getVoiceShiftWidth(): Double = js.native
  
  def isChord(): Boolean = js.native
  
  def isDisplaced(): Boolean = js.native
  
  def setKeyLine(index: Double, line: Double): StaveNote = js.native
  
  def setKeyStyle(index: Double, style: FillStyle_): StaveNote = js.native
  
  def setNoteDisplaced(displaced: Boolean): StaveNote = js.native
  
  @JSName("setStave")
  def setStave_Note(stave: Stave): Note = js.native
  
  // inconsistent type: void -> StaveNote
  def setStemStyle(style: FillStyle_): Unit = js.native
  
  def setStyle(style: FillStyle_): Unit = js.native
  
  var x_shift: Double = js.native
}
