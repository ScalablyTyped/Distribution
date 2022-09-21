package typings.vexflow.mod.Flow

import typings.vexflow.anon.Bpm
import typings.vexflow.anon.FillStyle_
import typings.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.StaveTempo")
@js.native
open class StaveTempo protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.StaveTempo {
  def this(tempo: Bpm, x: Double, shift_y: Double) = this()
  
  /* CompleteClass */
  override def addEndModifier(): Unit = js.native
  
  /* CompleteClass */
  override def addModifier(): Unit = js.native
  
  /* CompleteClass */
  override def addToStave(stave: typings.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typings.vexflow.Vex.Flow.StaveModifier = js.native
  
  /* CompleteClass */
  override def addToStaveEnd(stave: typings.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typings.vexflow.Vex.Flow.StaveModifier = js.native
  
  /* CompleteClass */
  override def draw(stave: typings.vexflow.Vex.Flow.Stave, shift_x: Double): typings.vexflow.Vex.Flow.StaveTempo = js.native
  
  /* CompleteClass */
  override def getCategory(): String = js.native
  
  /* CompleteClass */
  override def getPadding(index: Double): Double = js.native
  
  /* CompleteClass */
  override def getPosition(): Double = js.native
  
  /* CompleteClass */
  override def getStyle(): FillStyle_ = js.native
  
  /* CompleteClass */
  override def getWidth(): Double = js.native
  
  /* CompleteClass */
  override def makeSpacer(padding: Double): GetContext = js.native
  
  /* CompleteClass */
  override def placeGlyphOnLine(glyph: typings.vexflow.Vex.Flow.Glyph, stave: typings.vexflow.Vex.Flow.Stave, line: Double): Unit = js.native
  
  /* CompleteClass */
  override def setPadding(padding: Double): Unit = js.native
  
  /* CompleteClass */
  override def setShiftX(x: Double): typings.vexflow.Vex.Flow.StaveTempo = js.native
  
  /* CompleteClass */
  override def setShiftY(y: Double): typings.vexflow.Vex.Flow.StaveTempo = js.native
  
  // (StaveModifier extends Element in vexflow, but not in these definitions, probably because of a typing problem)
  /* CompleteClass */
  override def setStyle(style: FillStyle_): typings.vexflow.Vex.Flow.StaveModifier = js.native
  
  /* CompleteClass */
  override def setTempo(tempo: Bpm): typings.vexflow.Vex.Flow.StaveTempo = js.native
}
