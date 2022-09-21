package typings.vexflow.Vex.Flow

import typings.vexflow.anon.ExtraLeftPx_
import typings.vexflow.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Note
  extends StObject
     with Tickable {
  
  def addModifier(modifier: Modifier, index: Double): Note = js.native
  
  def addStroke(index: Double, stroke: Stroke): Note = js.native
  
  def getAbsoluteX(): Double = js.native
  
  def getCategory(): String = js.native
  
  def getDots(): Double = js.native
  
  def getDuration(): String = js.native
  
  def getExtraLeftPx(): Double = js.native
  
  def getExtraRightPx(): Double = js.native
  
  def getGlyph(): Glyph = js.native
  
  def getLineForRest(): Double = js.native
  
  def getLineNumber(): Double = js.native
  
  def getMetrics(): ExtraLeftPx_ = js.native
  
  def getModifierStartXY(): X = js.native
  
  def getNoteType(): String = js.native
  
  def getPlayNote(): Any = js.native
  
  def getStave(): Stave = js.native
  
  def getTickContext(): TickContext = js.native
  
  def getX(): Double = js.native
  
  def getYForTopText(text_line: Double): Double = js.native
  
  def getYs(): js.Array[Double] = js.native
  
  def hasStem(): Boolean = js.native
  
  def isDotted(): Boolean = js.native
  
  def isRest(): Boolean = js.native
  
  var preFormatted: Boolean = js.native
  
  def setBeam(): Note = js.native
  
  def setExtraLeftPx(x: Double): Note = js.native
  
  def setExtraRightPx(x: Double): Note = js.native
  
  def setModifierContext(mc: ModifierContext): Note = js.native
  
  def setPlayNote(note: Any): Note = js.native
  
  def setPreFormatted(value: Boolean): Unit = js.native
  
  def setStave(stave: Stave): Note = js.native
  
  def setWidth(width: Double): Unit = js.native
  
  def setYs(ys: js.Array[Double]): Note = js.native
}
