package typings.vextab.mod

import typings.vexflow.Vex.Flow.Barline.`type`
import typings.vexflow.mod.Flow.Annotation
import typings.vexflow.mod.Flow.Renderer
import typings.vexflow.mod.Flow.Stroke
import typings.vexflow.mod.Flow.TabNote
import typings.vextab.anon.Bottomspacing
import typings.vextab.anon.Context
import typings.vextab.anon.Fret
import typings.vextab.anon.Modifier
import typings.vextab.anon.Position
import typings.vextab.vextabStrings.center
import typings.vextab.vextabStrings.left
import typings.vextab.vextabStrings.right
import typings.vextab.vextabStrings.stave
import typings.vextab.vextabStrings.tabstave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Artist")
@js.native
open class Artist protected () extends StObject {
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Double, width: Double, options: Bottomspacing) = this()
  
  def addAnnotations(annotations: js.Array[VexTabNote]): Unit = js.native
  
  def addArticulations(articulations: js.Array[Articulation]): Unit = js.native
  
  def addBar(`type`: `type`): Unit = js.native
  
  def addChord(chord: js.Array[VexTabNote]): Unit = js.native
  def addChord(chord: js.Array[VexTabNote], chord_articulation: Unit, chord_decorator: Decorator): Unit = js.native
  def addChord(chord: js.Array[VexTabNote], chord_articulation: Articulation): Unit = js.native
  def addChord(chord: js.Array[VexTabNote], chord_articulation: Articulation, chord_decorator: Decorator): Unit = js.native
  
  def addDecorator(): Unit = js.native
  def addDecorator(decorator: Decorator): Unit = js.native
  
  def addNote(note: VexTabNote): Unit = js.native
  
  def addRest(params: Position): Unit = js.native
  
  def addStave(element: tabstave | stave): Unit = js.native
  def addStave(element: tabstave | stave, options: StaveOptions): Unit = js.native
  
  def addStaveArticulation(
    `type`: Articulation,
    first_note: TabNote,
    last_note: TabNote,
    first_indices: js.Array[Double],
    last_indices: js.Array[Double]
  ): Unit = js.native
  
  def addStaveNote(note_params: ArtistStaveNoteParams): Unit = js.native
  
  def addTabArticulation(
    `type`: Articulation,
    first_note: TabNote,
    last_note: TabNote,
    first_indices: js.Array[Double],
    last_indices: js.Array[Double]
  ): Unit = js.native
  
  def addTabNote(spec: js.Array[Fret]): Unit = js.native
  def addTabNote(spec: js.Array[Fret], play_note: TabNote): Unit = js.native
  
  def addTextNote(
    text: String,
    position: Double,
    justification: center | left | right,
    smooth: Boolean,
    ignore_ticks: Boolean
  ): Unit = js.native
  
  def addTextVoice(): Unit = js.native
  
  def addVoice(options: tabstave | stave): Unit = js.native
  
  def attachPlayer(player: Any): Unit = js.native
  
  def closeBends(offset: Double): Unit = js.native
  
  var customizations: ArtistCustomizations = js.native
  
  def draw(renderer: Renderer): Unit = js.native
  
  def getNoteForABC(abc: ABC, string: String): js.Tuple3[Any, String, Any] = js.native
  
  def getNoteForFret(fret: String, string: String): js.Tuple3[String, Double, String | Null] = js.native
  
  def getPlayerData(): Context = js.native
  
  def getPreviousNoteIndex(): Double = js.native
  
  def isRendered(): Boolean = js.native
  
  def makeAnnotation(text: String): Annotation | Null = js.native
  
  def makeFingering(text: String): Null | js.Array[Modifier] = js.native
  
  def makeScoreArticulation(text: String): typings.vexflow.mod.Flow.Articulation | Null = js.native
  
  def makeStroke(text: String): Stroke | Null = js.native
  
  def makeTuplets(tuplets: Double): Unit = js.native
  def makeTuplets(tuplets: Double, notes: Any): Unit = js.native
  
  def openBends(
    first_note: TabNote,
    last_note: TabNote,
    first_indices: js.Array[Double],
    last_indices: js.Array[Double]
  ): Unit = js.native
  
  def render(renderer: Renderer): Unit = js.native
  
  def reset(): Unit = js.native
  
  def runCommand(line: String, _l: Double, _c: Double): Unit = js.native
  
  def setDuration(time: String, dot: Boolean): Unit = js.native
  
  def setOptions(options: ArtistCustomizations): Unit = js.native
  
  def setTextFont(font: String): Unit = js.native
}
