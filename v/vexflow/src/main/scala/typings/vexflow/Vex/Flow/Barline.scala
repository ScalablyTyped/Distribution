package typings.vexflow.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Barline
  extends StObject
     with StaveModifier {
  
  def draw(stave: Stave): Unit = js.native
  def draw(stave: Stave, x_shift: Double): Unit = js.native
  
  def drawRepeatBar(stave: Stave, x: Double, begin: Boolean): Unit = js.native
  
  def drawVerticalBar(stave: Stave, x: Double): Unit = js.native
  def drawVerticalBar(stave: Stave, x: Double, double_bar: Boolean): Unit = js.native
  
  def drawVerticalEndBar(stave: Stave, x: Double): Unit = js.native
  
  def setX(x: Double): Barline = js.native
}
object Barline {
  
  @js.native
  sealed trait `type` extends StObject
  @JSGlobal("Vex.Flow.Barline.type")
  @js.native
  object `type` extends StObject {
    
    @js.native
    sealed trait DOUBLE
      extends StObject
         with `type`
    
    @js.native
    sealed trait END
      extends StObject
         with `type`
    
    @js.native
    sealed trait NONE
      extends StObject
         with `type`
    
    @js.native
    sealed trait REPEAT_BEGIN
      extends StObject
         with `type`
    
    @js.native
    sealed trait REPEAT_BOTH
      extends StObject
         with `type`
    
    @js.native
    sealed trait REPEAT_END
      extends StObject
         with `type`
    
    @js.native
    sealed trait SINGLE
      extends StObject
         with `type`
  }
}
