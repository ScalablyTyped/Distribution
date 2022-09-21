package typings.vexflow.global.Vex.Flow

import typings.vexflow.anon.FillStyle_
import typings.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Volta")
@js.native
open class Volta protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.Volta {
  def this(`type`: typings.vexflow.Vex.Flow.Volta.`type`, number: Double, x: Double, y_shift: Double) = this()
  
  /* CompleteClass */
  override def addEndModifier(): Unit = js.native
  
  /* CompleteClass */
  override def addModifier(): Unit = js.native
  
  /* CompleteClass */
  override def addToStave(stave: typings.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typings.vexflow.Vex.Flow.StaveModifier = js.native
  
  /* CompleteClass */
  override def addToStaveEnd(stave: typings.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typings.vexflow.Vex.Flow.StaveModifier = js.native
  
  /* CompleteClass */
  override def draw(stave: typings.vexflow.Vex.Flow.Stave, x: Double): typings.vexflow.Vex.Flow.Volta = js.native
  
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
  override def setShiftY(y: Double): typings.vexflow.Vex.Flow.Volta = js.native
  
  // (StaveModifier extends Element in vexflow, but not in these definitions, probably because of a typing problem)
  /* CompleteClass */
  override def setStyle(style: FillStyle_): typings.vexflow.Vex.Flow.StaveModifier = js.native
}
object Volta {
  
  @JSGlobal("Vex.Flow.Volta.type")
  @js.native
  object `type` extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Volta.`type` & Double] = js.native
    
    /* 0 */ val BEGIN: typings.vexflow.Vex.Flow.Volta.`type`.BEGIN & Double = js.native
    
    /* 3 */ val BEGIN_END: typings.vexflow.Vex.Flow.Volta.`type`.BEGIN_END & Double = js.native
    
    /* 2 */ val END: typings.vexflow.Vex.Flow.Volta.`type`.END & Double = js.native
    
    /* 1 */ val MID: typings.vexflow.Vex.Flow.Volta.`type`.MID & Double = js.native
    
    /* 1 */ val NONE: typings.vexflow.Vex.Flow.Volta.`type`.NONE & Double = js.native
  }
}
