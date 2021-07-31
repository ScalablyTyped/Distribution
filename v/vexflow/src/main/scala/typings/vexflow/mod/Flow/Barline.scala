package typings.vexflow.mod.Flow

import typings.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Barline")
@js.native
class Barline protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.Barline {
  def this(`type`: typings.vexflow.Vex.Flow.Barline.`type`, x: Double) = this()
  
  /* CompleteClass */
  override def addEndModifier(): Unit = js.native
  
  /* CompleteClass */
  override def addModifier(): Unit = js.native
  
  /* CompleteClass */
  override def addToStave(stave: typings.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typings.vexflow.Vex.Flow.StaveModifier = js.native
  
  /* CompleteClass */
  override def addToStaveEnd(stave: typings.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typings.vexflow.Vex.Flow.StaveModifier = js.native
  
  /* CompleteClass */
  override def getCategory(): String = js.native
  
  /* CompleteClass */
  override def getPadding(index: Double): Double = js.native
  
  /* CompleteClass */
  override def getPosition(): Double = js.native
  
  /* CompleteClass */
  override def getWidth(): Double = js.native
  
  /* CompleteClass */
  override def makeSpacer(padding: Double): GetContext = js.native
  
  /* CompleteClass */
  override def placeGlyphOnLine(glyph: typings.vexflow.Vex.Flow.Glyph, stave: typings.vexflow.Vex.Flow.Stave, line: Double): Unit = js.native
  
  /* CompleteClass */
  override def setPadding(padding: Double): Unit = js.native
}
object Barline {
  
  @JSImport("vexflow", "Flow.Barline.type")
  @js.native
  object `type` extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Barline.`type` & Double] = js.native
    
    /* 0 */ val DOUBLE: typings.vexflow.Vex.Flow.Barline.`type`.DOUBLE & Double = js.native
    
    /* 1 */ val END: typings.vexflow.Vex.Flow.Barline.`type`.END & Double = js.native
    
    /* 5 */ val NONE: typings.vexflow.Vex.Flow.Barline.`type`.NONE & Double = js.native
    
    /* 2 */ val REPEAT_BEGIN: typings.vexflow.Vex.Flow.Barline.`type`.REPEAT_BEGIN & Double = js.native
    
    /* 4 */ val REPEAT_BOTH: typings.vexflow.Vex.Flow.Barline.`type`.REPEAT_BOTH & Double = js.native
    
    /* 3 */ val REPEAT_END: typings.vexflow.Vex.Flow.Barline.`type`.REPEAT_END & Double = js.native
    
    /* 1 */ val SINGLE: typings.vexflow.Vex.Flow.Barline.`type`.SINGLE & Double = js.native
  }
}
