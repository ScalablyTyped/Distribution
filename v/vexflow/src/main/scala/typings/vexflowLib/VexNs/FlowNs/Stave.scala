package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Stave")
@js.native
class Stave protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double, options: vexflowLib.Anon_Numlines) = this()
  def addClef(clef: java.lang.String): Stave = js.native
  def addClef(clef: java.lang.String, size: java.lang.String): Stave = js.native
  def addClef(clef: java.lang.String, size: java.lang.String, annotation: java.lang.String): Stave = js.native
  def addClef(
    clef: java.lang.String,
    size: java.lang.String,
    annotation: java.lang.String,
    position: vexflowLib.VexNs.FlowNs.StaveModifierNs.Position
  ): Stave = js.native
  def addEndClef(clef: java.lang.String): Stave = js.native
  def addEndClef(clef: java.lang.String, size: java.lang.String): Stave = js.native
  def addEndClef(clef: java.lang.String, size: java.lang.String, annotation: java.lang.String): Stave = js.native
  def addEndGlyph(glypg: Glyph): Stave = js.native
  def addEndModifier(modifier: StaveModifier): Stave = js.native
  def addGlyph(glypg: Glyph): Stave = js.native
  def addKeySignature(keySpec: java.lang.String): Stave = js.native
  def addModifier(modifier: StaveModifier): Stave = js.native
  def addModifier(modifier: StaveModifier, position: vexflowLib.VexNs.FlowNs.StaveModifierNs.Position): Stave = js.native
  def addTimeSignature(timeSpec: java.lang.String): scala.Unit = js.native
  def addTimeSignature(timeSpec: java.lang.String, customPadding: scala.Double): scala.Unit = js.native
   //inconsistent type: void -> Stave
  def addTrebleGlyph(): Stave = js.native
  def draw(): scala.Unit = js.native
  def drawVertical(x: scala.Double, isDouble: scala.Boolean): scala.Unit = js.native
  def drawVerticalBar(x: scala.Double): scala.Unit = js.native
  def drawVerticalBarFixed(x: scala.Double): scala.Unit = js.native
  def drawVerticalFixed(x: scala.Double, isDouble: scala.Boolean): scala.Unit = js.native
  def getBottomLineY(): scala.Double = js.native
  def getBottomY(): scala.Double = js.native
  def getBoundingBix(): BoundingBox = js.native
  def getConfigForLines(): js.Array[vexflowLib.Anon_Visible] = js.native
  def getContext(): vexflowLib.VexNs.IRenderContext = js.native
  def getHeight(): scala.Double = js.native
  def getModifierXShift(index: scala.Double): scala.Double = js.native
  def getNoteEndX(): scala.Double = js.native
  def getNoteStartX(): scala.Double = js.native
  def getNumLines(): scala.Double = js.native
  def getSpacingBetweenLines(): scala.Double = js.native
  def getTieEndX(): scala.Double = js.native
  def getTieStartX(): scala.Double = js.native
  def getWidth(): scala.Double = js.native
  def getX(): scala.Double = js.native
  def getYForBottomText(): scala.Double = js.native
  def getYForBottomText(line: scala.Double): scala.Double = js.native
  def getYForGlyphs(): scala.Double = js.native
  def getYForLine(line: scala.Double): scala.Double = js.native
  def getYForNote(): scala.Double = js.native
  def getYForNote(line: scala.Double): scala.Double = js.native
  def getYForTopText(): scala.Double = js.native
  def getYForTopText(line: scala.Double): scala.Double = js.native
  def resetLines(): scala.Unit = js.native
  def setBegBarType(`type`: vexflowLib.VexNs.FlowNs.BarlineNs.`type`): Stave = js.native
  def setConfigForLine(line_number: scala.Double, line_config: vexflowLib.Anon_Visible): Stave = js.native
  def setConfigForLines(lines_configuration: js.Array[vexflowLib.Anon_Visible]): Stave = js.native
  def setContext(context: vexflowLib.VexNs.IRenderContext): Stave = js.native
  def setEndBarType(`type`: vexflowLib.VexNs.FlowNs.BarlineNs.`type`): Stave = js.native
  def setEndClef(clef: java.lang.String): Stave = js.native
  def setEndClef(clef: java.lang.String, size: java.lang.String): Stave = js.native
  def setEndClef(clef: java.lang.String, size: java.lang.String, annotation: java.lang.String): Stave = js.native
  def setKeySignature(keySpec: java.lang.String, cancelKeySpec: java.lang.String): Stave = js.native
  def setKeySignature(
    keySpec: java.lang.String,
    cancelKeySpec: java.lang.String,
    position: vexflowLib.VexNs.FlowNs.StaveModifierNs.Position
  ): Stave = js.native
  def setMeasure(measure: scala.Double): Stave = js.native
  def setNoteStartX(x: scala.Double): Stave = js.native
  def setRepetitionTypeLeft(`type`: vexflowLib.VexNs.FlowNs.RepetitionNs.`type`, y: scala.Double): Stave = js.native
  def setRepetitionTypeRight(`type`: vexflowLib.VexNs.FlowNs.RepetitionNs.`type`, y: scala.Double): Stave = js.native
  def setSection(section: java.lang.String, y: scala.Double): Stave = js.native
  def setTempo(tempo: vexflowLib.Anon_Bpm, y: scala.Double): Stave = js.native
  def setText(text: java.lang.String, position: vexflowLib.VexNs.FlowNs.ModifierNs.Position): Stave = js.native
  def setText(
    text: java.lang.String,
    position: vexflowLib.VexNs.FlowNs.ModifierNs.Position,
    options: vexflowLib.Anon_Justification
  ): Stave = js.native
  def setVoltaType(`type`: vexflowLib.VexNs.FlowNs.VoltaNs.`type`, number_t: scala.Double, y: scala.Double): Stave = js.native
  def setWidth(width: scala.Double): Stave = js.native
  def setX(x: scala.Double): Stave = js.native
  def setY(y: scala.Double): Stave = js.native
}

