package typings.vexflow.Vex.Flow

import typings.vexflow.AnonDotsDurationType
import typings.vexflow.AnonX
import typings.vexflow.Anon_ExtraLeftPx
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Note")
@js.native
class Note protected () extends Tickable {
  def this(note_struct: AnonDotsDurationType) = this()
  var preFormatted: Boolean = js.native
  def addModifier(modifier: Modifier, index: Double): Note = js.native
  /* CompleteClass */
  override def addModifier(mod: Modifier): Tickable = js.native
  def addStroke(index: Double, stroke: Stroke): Note = js.native
  /* CompleteClass */
  override def addToModifierContext(mc: ModifierContext): Unit = js.native
  /* CompleteClass */
  override def applyTickMultiplier(numerator: Double, denominator: Double): Unit = js.native
  def getAbsoluteX(): Double = js.native
  /* CompleteClass */
  override def getBoundingBox(): BoundingBox = js.native
  def getCategory(): String = js.native
  /* CompleteClass */
  override def getCenterXShift(): Double = js.native
  def getDots(): Double = js.native
  def getDuration(): String = js.native
  def getExtraLeftPx(): Double = js.native
  def getExtraRightPx(): Double = js.native
  def getGlyph(): Glyph = js.native
  /* CompleteClass */
  override def getIntrinsicTicks(): Fraction = js.native
  def getLineForRest(): Double = js.native
  def getLineNumber(): Double = js.native
  def getMetrics(): Anon_ExtraLeftPx = js.native
  def getModifierStartXY(): AnonX = js.native
  def getNoteType(): String = js.native
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
  override def getWidth(): Double = js.native
  def getX(): Double = js.native
  def getYForTopText(text_line: Double): Double = js.native
  def getYs(): js.Array[Double] = js.native
  def hasStem(): Boolean = js.native
  /* CompleteClass */
  override def isCenterAligned(): Boolean = js.native
  def isDotted(): Boolean = js.native
  def isRest(): Boolean = js.native
  /* CompleteClass */
  override def postFormat(): Tickable = js.native
  /* CompleteClass */
  override def preFormat(): Unit = js.native
  def setBeam(): Note = js.native
  /* CompleteClass */
  override def setCenterAlignment(align_center: Boolean): Tickable = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): Unit = js.native
  /* CompleteClass */
  override def setDuration(duration: Fraction): Unit = js.native
  def setExtraLeftPx(x: Double): Note = js.native
  def setExtraRightPx(x: Double): Note = js.native
  /* CompleteClass */
  override def setIntrinsicTicks(intrinsicTicks: Fraction): Unit = js.native
  def setModifierContext(mc: ModifierContext): Note = js.native
  def setPlayNote(note: js.Any): Note = js.native
  def setPreFormatted(value: Boolean): Unit = js.native
  def setStave(stave: Stave): Note = js.native
  /* CompleteClass */
  override def setTickContext(tc: TickContext): Unit = js.native
  /* CompleteClass */
  override def setTuplet(tuplet: Tuplet): Tickable = js.native
  /* CompleteClass */
  override def setVoice(voice: Voice): Unit = js.native
  def setWidth(width: Double): Unit = js.native
  /* CompleteClass */
  override def setXShift(x: Double): Tickable = js.native
  def setYs(ys: js.Array[Double]): Note = js.native
  /* CompleteClass */
  override def shouldIgnoreTicks(): Boolean = js.native
}

@JSGlobal("Vex.Flow.Note")
@js.native
object Note extends js.Object {
  val CATEGORY: String = js.native
}

