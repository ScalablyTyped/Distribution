package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Barline.`type`
import typings.vexflow.Vex.Flow.StaveModifier.Position
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Glyphspacingpx
import typings.vexflow.anon.Justification
import typings.vexflow.anon.Name
import typings.vexflow.anon.Visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stave extends js.Object {
  
  def addClef(clef: String): Stave = js.native
  def addClef(
    clef: String,
    size: js.UndefOr[scala.Nothing],
    annotation: js.UndefOr[scala.Nothing],
    position: Position
  ): Stave = js.native
  def addClef(clef: String, size: js.UndefOr[scala.Nothing], annotation: String): Stave = js.native
  def addClef(clef: String, size: js.UndefOr[scala.Nothing], annotation: String, position: Position): Stave = js.native
  def addClef(clef: String, size: String): Stave = js.native
  def addClef(clef: String, size: String, annotation: js.UndefOr[scala.Nothing], position: Position): Stave = js.native
  def addClef(clef: String, size: String, annotation: String): Stave = js.native
  def addClef(clef: String, size: String, annotation: String, position: Position): Stave = js.native
  
  def addEndClef(clef: String): Stave = js.native
  def addEndClef(clef: String, size: js.UndefOr[scala.Nothing], annotation: String): Stave = js.native
  def addEndClef(clef: String, size: String): Stave = js.native
  def addEndClef(clef: String, size: String, annotation: String): Stave = js.native
  
  def addEndGlyph(glypg: Glyph): Stave = js.native
  
  def addEndModifier(modifier: StaveModifier): Stave = js.native
  
  def addGlyph(glypg: Glyph): Stave = js.native
  
  def addKeySignature(keySpec: String): Stave = js.native
  
  def addModifier(modifier: StaveModifier): Stave = js.native
  def addModifier(modifier: StaveModifier, position: Position): Stave = js.native
  
  def addTimeSignature(timeSpec: String): Unit = js.native
  def addTimeSignature(timeSpec: String, customPadding: Double): Unit = js.native
  
   //inconsistent type: void -> Stave
  def addTrebleGlyph(): Stave = js.native
  
  def draw(): Unit = js.native
  
  def drawVertical(x: Double, isDouble: Boolean): Unit = js.native
  
  def drawVerticalBar(x: Double): Unit = js.native
  
  def drawVerticalBarFixed(x: Double): Unit = js.native
  
  def drawVerticalFixed(x: Double, isDouble: Boolean): Unit = js.native
  
  def getBottomLineY(): Double = js.native
  
  def getBottomY(): Double = js.native
  
  def getBoundingBix(): BoundingBox = js.native
  
  def getConfigForLines(): js.Array[Visible] = js.native
  
  def getContext(): IRenderContext = js.native
  
  def getHeight(): Double = js.native
  
  def getModifierXShift(index: Double): Double = js.native
  
  def getModifiers(): js.Array[StaveModifier] = js.native
  def getModifiers(position: js.UndefOr[scala.Nothing], category: String): js.Array[StaveModifier] = js.native
  def getModifiers(position: Double): js.Array[StaveModifier] = js.native
  def getModifiers(position: Double, category: String): js.Array[StaveModifier] = js.native
  
  def getNoteEndX(): Double = js.native
  
  def getNoteStartX(): Double = js.native
  
  def getNumLines(): Double = js.native
  
  def getSpacingBetweenLines(): Double = js.native
  
  def getTieEndX(): Double = js.native
  
  def getTieStartX(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def getX(): Double = js.native
  
  def getYForBottomText(): Double = js.native
  def getYForBottomText(line: Double): Double = js.native
  
  def getYForGlyphs(): Double = js.native
  
  def getYForLine(line: Double): Double = js.native
  
  def getYForNote(): Double = js.native
  def getYForNote(line: Double): Double = js.native
  
  def getYForTopText(): Double = js.native
  def getYForTopText(line: Double): Double = js.native
  
  var options: Glyphspacingpx = js.native
  
  def resetLines(): Unit = js.native
  
  def setBegBarType(`type`: `type`): Stave = js.native
  
  def setConfigForLine(line_number: Double, line_config: Visible): Stave = js.native
  
  def setConfigForLines(lines_configuration: js.Array[Visible]): Stave = js.native
  
  def setContext(context: IRenderContext): Stave = js.native
  
  def setEndBarType(`type`: `type`): Stave = js.native
  
  def setEndClef(clef: String): Stave = js.native
  def setEndClef(clef: String, size: js.UndefOr[scala.Nothing], annotation: String): Stave = js.native
  def setEndClef(clef: String, size: String): Stave = js.native
  def setEndClef(clef: String, size: String, annotation: String): Stave = js.native
  
  def setKeySignature(keySpec: String, cancelKeySpec: String): Stave = js.native
  def setKeySignature(keySpec: String, cancelKeySpec: String, position: Position): Stave = js.native
  
  def setMeasure(measure: Double): Stave = js.native
  
  def setNoteStartX(x: Double): Stave = js.native
  
  def setRepetitionTypeLeft(`type`: typings.vexflow.Vex.Flow.Repetition.`type`, y: Double): Stave = js.native
  
  def setRepetitionTypeRight(`type`: typings.vexflow.Vex.Flow.Repetition.`type`, y: Double): Stave = js.native
  
  def setSection(section: String, y: Double): Stave = js.native
  
  def setTempo(tempo: Name, y: Double): Stave = js.native
  
  def setText(text: String, position: typings.vexflow.Vex.Flow.Modifier.Position): Stave = js.native
  def setText(text: String, position: typings.vexflow.Vex.Flow.Modifier.Position, options: Justification): Stave = js.native
  
  def setVoltaType(`type`: typings.vexflow.Vex.Flow.Volta.`type`, number_t: Double, y: Double): Stave = js.native
  
  def setWidth(width: Double): Stave = js.native
  
  def setX(x: Double): Stave = js.native
  
  def setY(y: Double): Stave = js.native
}
