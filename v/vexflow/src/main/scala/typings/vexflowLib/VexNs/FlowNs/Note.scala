package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Note")
@js.native
class Note protected () extends Tickable {
  def this(note_struct: vexflowLib.Anon_Type) = this()
  def addModifier(modifier: Modifier, index: scala.Double): Note = js.native
  /* CompleteClass */
  override def addModifier(mod: Modifier): Tickable = js.native
  def addStroke(index: scala.Double, stroke: Stroke): Note = js.native
  /* CompleteClass */
  override def addToModifierContext(mc: ModifierContext): scala.Unit = js.native
  /* CompleteClass */
  override def applyTickMultiplier(numerator: scala.Double, denominator: scala.Double): scala.Unit = js.native
  def getAbsoluteX(): scala.Double = js.native
  /* CompleteClass */
  override def getBoundingBox(): BoundingBox = js.native
  def getCategory(): java.lang.String = js.native
  /* CompleteClass */
  override def getCenterXShift(): scala.Double = js.native
  def getDots(): scala.Double = js.native
  def getDuration(): java.lang.String = js.native
  def getExtraLeftPx(): scala.Double = js.native
  def getExtraRightPx(): scala.Double = js.native
  def getGlyph(): Glyph = js.native
  /* CompleteClass */
  override def getIntrinsicTicks(): Fraction = js.native
  def getLineForRest(): scala.Double = js.native
  def getLineNumber(): scala.Double = js.native
  def getMetrics(): vexflowLib.Anon_NoteWidth = js.native
  def getModifierStartXY(): vexflowLib.Anon_Y = js.native
  def getNoteType(): java.lang.String = js.native
  def getPlayNote(): js.Any = js.native
  def getStave(): Stave = js.native
  def getTickContext(): TickContext = js.native
  /* CompleteClass */
  override def getTickMultiplier(): Fraction = js.native
  /* CompleteClass */
  override def getTicks(): Fraction = js.native
  /* CompleteClass */
  override def getTuplet(): Tuplet = js.native
  /* CompleteClass */
  override def getVoice(): Voice = js.native
  /* CompleteClass */
  override def getWidth(): scala.Double = js.native
  def getX(): scala.Double = js.native
  def getYForTopText(text_line: scala.Double): scala.Double = js.native
  def getYs(): js.Array[scala.Double] = js.native
  def hasStem(): scala.Boolean = js.native
  /* CompleteClass */
  override def isCenterAligned(): scala.Boolean = js.native
  def isDotted(): scala.Boolean = js.native
  def isRest(): scala.Boolean = js.native
  /* CompleteClass */
  override def postFormat(): Tickable = js.native
  /* CompleteClass */
  override def preFormat(): scala.Unit = js.native
  def setBeam(): Note = js.native
  /* CompleteClass */
  override def setCenterAlignment(align_center: scala.Boolean): Tickable = js.native
  /* CompleteClass */
  override def setContext(context: vexflowLib.VexNs.IRenderContext): scala.Unit = js.native
  /* CompleteClass */
  override def setDuration(duration: Fraction): scala.Unit = js.native
  def setExtraLeftPx(x: scala.Double): Note = js.native
  def setExtraRightPx(x: scala.Double): Note = js.native
  /* CompleteClass */
  override def setIntrinsicTicks(intrinsicTicks: Fraction): scala.Unit = js.native
  def setModifierContext(mc: ModifierContext): Note = js.native
  def setPlayNote(note: js.Any): Note = js.native
  def setPreFormatted(value: scala.Boolean): scala.Unit = js.native
  def setStave(stave: Stave): Note = js.native
  /* CompleteClass */
  override def setTickContext(tc: TickContext): scala.Unit = js.native
  /* CompleteClass */
  override def setTuplet(tuplet: Tuplet): Tickable = js.native
  /* CompleteClass */
  override def setVoice(voice: Voice): scala.Unit = js.native
  def setWidth(width: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setXShift(x: scala.Double): Tickable = js.native
  def setYs(ys: js.Array[scala.Double]): Note = js.native
  /* CompleteClass */
  override def shouldIgnoreTicks(): scala.Boolean = js.native
}

